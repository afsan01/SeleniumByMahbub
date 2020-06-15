package seleniumSession;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ImportPDFFile {

	public static void main(String[] args) throws IOException {

		FileInputStream obj = new FileInputStream ("C:\\Abul Bashar Molla\\IV Confirmation (Zia).pdf");
		PDDocument objDoc = PDDocument.load(obj);
		PDFTextStripper objPDSrp = new PDFTextStripper();
		String pdfContent = objPDSrp.getText(objDoc);
		System.out.println(pdfContent);
	}

}
