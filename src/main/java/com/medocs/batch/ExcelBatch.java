package com.medocs.batch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.medocs.batch.models.Medicament;


/**
 * 
 * @author Ch.Mustapha
 * @version 1.0
 * @since 03/04/2016 16:11
 */
public class ExcelBatch {

    private static String FILE_PATH = "data/ref-des-medicaments-cnops-2014.xlsx";
    private XSSFWorkbook workbook;
    private static Logger LOGGER = LoggerFactory.getLogger(ExcelBatch.class);

    public static void main(String[] args) {
        new ExcelBatch();
    }

    public ExcelBatch() {
        readExcelFile();
    }

    /**
     * read excel file and remove reondonte
     */
    private void readExcelFile() {
        Map<Medicament, Medicament> medicamentDb = new HashMap<Medicament, Medicament>();
        int duplicateRows = 0;
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(FILE_PATH).getFile());
        try {
            /// set the name of the file
            FileInputStream inputStream = new FileInputStream(file);
            workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheetAt(0);
            /// get the rows
            Iterator<Row> rows = sheet.rowIterator();
            rows.next();
            XSSFRow row;
            while (rows.hasNext()) {
                row = (XSSFRow) rows.next();
                Medicament medicament = buildMediacament(row);
                if (!medicamentDb.containsKey(medicament)) {
                    medicamentDb.put(medicament, medicament);
                }
                else {
                    duplicateRows++;
                }
            }

            /// print the size of map and duplicate rows
            LOGGER.info("Medicament Db size is :" + medicamentDb.size() + " and the number of  duplicate rows is : " + duplicateRows);

        } catch (FileNotFoundException e) {
            LOGGER.error(e.getMessage());
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }

    }

    /**
     * 
     * @param row
     * @return medicament from excel row
     */
    private Medicament buildMediacament(XSSFRow row) {
        Medicament medicament = new Medicament();
        medicament.setNom(row.getCell(1).getStringCellValue());
        medicament.setDci(row.getCell(2).getStringCellValue());
        medicament.setDosage(row.getCell(3).getStringCellValue());
        medicament.setUniteDosage(row.getCell(4).getStringCellValue());
        medicament.setForm(row.getCell(5).getStringCellValue());
        medicament.setPresentation(row.getCell(6).getStringCellValue());
        medicament.setPpv(row.getCell(7).getNumericCellValue());
        medicament.setPh(row.getCell(8).getNumericCellValue());
        medicament.setPrixBr(row.getCell(9).getNumericCellValue());
        medicament.setPrinceGenerique(row.getCell(10).getStringCellValue());
        medicament.setTauxRembourssement(row.getCell(11).getStringCellValue());
        return medicament;
    }

}
