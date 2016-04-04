package com.medocs.batch;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author Ch.Mustapha
 * @version 1.0
 * @since 03/04/2016 19:56
 */
public class FournisseurExtractor {

	/** The logger. */
	private static Logger LOGGER = LoggerFactory.getLogger(FournisseurExtractor.class);
	private static String URL = "http://medicament.ma/laboratoires/";
	private Map<String, String> fournisseurFields = new HashMap<>();

	public static void main(String[] args) {
		new FournisseurExtractor();
	}

	public FournisseurExtractor() {
		fournisseurFields = new HashMap<>();
		extractListFournisseurs();
	}

	/**
	 * extract list of fournisseurs
	 */
	private void extractListFournisseurs() {
		try {
			Document doc = Jsoup.connect(URL).timeout(10 * 10000000).get();
			Element divLaboratoires = doc.select(".laboratoires").first();
			Element ul = divLaboratoires.getElementsByTag("ul").first();
			Elements listeLi = ul.getElementsByTag("li");
			for (Element li : listeLi) {
				Element link = li.getElementsByTag("a").first();
				String href = link.attr("href");
				Document laboInfos = Jsoup.connect(href).timeout(10 * 10000000).get();
				buildLabosInfos(laboInfos);
			}
			for (Entry<String, String> entry : fournisseurFields.entrySet()) {
				LOGGER.info(entry.getKey());

			}
		} catch (IOException e) {
			LOGGER.error(e.getMessage());
		}
	}

	/**
	 * build labos infos
	 * 
	 * @param laboInfos
	 */
	private void buildLabosInfos(Document laboInfos) {

		Element fieldSet = laboInfos.getElementsByTag("fieldset").first();
		Element table = fieldSet.getElementsByTag("table").first();
		Elements rows = table.getElementsByTag("tr");
		/// iterate each row
		for (Element row : rows) {
			String fieldName = row.getElementsByTag("td").first().text();
			String fieldValue = row.select(".value").text();
			fournisseurFields.put(fieldName, fieldName);
			///
			LOGGER.info(fieldName + " : " + fieldValue);
		}
	}

}
