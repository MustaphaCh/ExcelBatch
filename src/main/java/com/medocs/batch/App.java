package com.medocs.batch;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class App {

	private static final int TIME_OUT = 10 * 1000;
	private static final String FIELD_VALUE = "td:nth-child(3)";
	private static final String FIELD_NAME = "td:nth-child(1)";
	private static final String ROWS = "fieldset>table tr";
	private static final String NOM = "fieldset>legend>h2";

	public static void main(String[] args) throws IOException {

		String[] letters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "9" };
		List<String> links = new ArrayList<String>();

		// links recuperation
		for (String l : letters) {
			Document listWithLetter = Jsoup.connect("http://medicament.ma/listing-des-medicaments/?lettre=" + l).timeout(TIME_OUT).get();
			Elements masthead = listWithLetter.select(".letters+ul>li>a");
			for (Element element : masthead) {
				links.add(element.attr("href"));
			}
		}

		List<Medicament> medicaments = new ArrayList<Medicament>();

		for (String link : links) {
			Document medicamentDoc = Jsoup.connect(link).timeout(TIME_OUT).get();
			Medicament medicament = new Medicament();
			Element nom = medicamentDoc.select(NOM).first();
			medicament.setNom(nom.text());
			Elements rows = medicamentDoc.select(ROWS);
			for (Element row : rows) {
				Element colonneName = row.select(FIELD_NAME).first();
				Element colonneValue = row.select(FIELD_VALUE).first();
				String field = colonneName.text();
				String value = getValue(colonneValue, colonneName);
				medicament.setFieldValue(field, value);
			}
			System.out.println(medicament);
			medicaments.add(medicament);

		}
	}

	public static void downloadFile(String url, String fileName) throws IOException {

		URL link = new URL(url);

		InputStream in = new BufferedInputStream(link.openStream());
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		byte[] buf = new byte[1024];
		int n = 0;
		while (-1 != (n = in.read(buf))) {
			out.write(buf, 0, n);
		}
		out.close();
		in.close();
		byte[] response = out.toByteArray();

		FileOutputStream fos = new FileOutputStream(fileName);
		fos.write(response);
		fos.close();
	}

	public static String getValue(Element e, Element column) throws IOException {
		Elements liens = e.getElementsByTag("a");
		if (!liens.isEmpty() && !FIELDS.FABRIQUANT.equals(column.text())) {
			String lien = liens.first().attr("href");
			String fileUrl = "D:\\files\\" + UUID.randomUUID() + ".pdf";
			downloadFile(lien, fileUrl);
			return fileUrl;
		} else {
			return e.text();
		}
	}
}
