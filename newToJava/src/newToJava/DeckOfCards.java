package newToJava;

import java.io.FileOutputStream;
import java.util.Date;

//import com.itextpdf.text.Rectangle;
//import com.itextpdf.text.Anchor;
//import com.itextpdf.text.BadElementException;
//import com.itextpdf.text.BaseColor;
//import com.itextpdf.text.Chapter;
//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.Element;
//import com.itextpdf.text.Font;
//import com.itextpdf.text.List;
//import com.itextpdf.text.ListItem;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.Phrase;
//import com.itextpdf.text.Section;
//import com.itextpdf.text.pdf.PdfPCell;
//import com.itextpdf.text.pdf.PdfPTable;
//import com.itextpdf.text.pdf.PdfWriter;

public class DeckOfCards {
//	private static String FILE = "g:/FirstPdf.pdf";
//	private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
//	      Font.BOLD);
//	private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
//			Font.NORMAL, BaseColor.RED);
//	private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
//	      Font.BOLD);
//	private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
//	      Font.BOLD);
//	
//	
//	public static void main(String[] args) {
//		char spade = '\u2660';
//		char hearth = '\u2665';
//		char diamond = '\u2666';
//		char club = '\u2663';
//		
//		for ( int i = 2; i <= 10; i++) {
//			System.out.printf("%5d %s %5d %s %5d %s %5d %s", i, spade, i, club, i, 
//					diamond, i, hearth);
//			System.out.println();
//		}
//		char i = 'J';
//		System.out.printf("%5c %s %5c %s %5c %s %5c %s %n", i, spade, i, club,
//				i, diamond, i, hearth);
//		i = 'Q';
//		System.out.printf("%5c %s %5c %s %5c %s %5c %s %n", i, spade, i, club,
//				i, diamond, i, hearth);
//		i = 'K';
//		System.out.printf("%5c %s %5c %s %5c %s %5c %s %n", i, spade, i, club,
//				i, diamond, i, hearth);
//		i = 'A';
//		System.out.printf("%5c %s %5c %s %5c %s %5c %s", i, spade, i, club,
//				i, diamond, i, hearth);
//		
//		try {
//		      Document document = new Document();
//		      PdfWriter.getInstance(document, new FileOutputStream(FILE));
//		      document.open();
//		      addContent(document);
//		      document.close();
//		    } catch (Exception e) {
//		      e.printStackTrace();
//		    }
//		
//	}
//	
//
//	
//	 private static void addEmptyLine(Paragraph paragraph, int number) {
//		    for (int i = 0; i < number; i++) {
//		      paragraph.add(new Paragraph(" "));
//		    }
//	 }
//	 
//	 private static void addContent(Document document) throws DocumentException {
//		    Paragraph catPart = new Paragraph("");
//		    // add a table
//		    createTable(catPart);
//		    // now add all this to the document
//		    document.add(catPart);
//
//		  }
//	 
//
//	 
//	 private static void createTable(Paragraph subCatPart)
//		      throws DocumentException {
//		    Rectangle rect = new Rectangle(750, 750);
//		    PdfPTable table = new PdfPTable(4);
//		    table.setWidthPercentage(new float[]{ 50, 50, 50, 50 }, rect);
//		    // t.setBorderColor(BaseColor.GRAY);
//		    // t.setPadding(4);
//		    // t.setSpacing(4);
//		    // t.setBorderWidth(1);
//		    char spade = '\u2660';
//			char hearth = '\u2665';
//			char diamond = '\u2666';
//			char club = '\u2663';
//			
//			for ( int i = 2; i <= 10; i++) {
//				System.out.printf("%5d %s %5d %s %5d %s %5d %s", i, spade, i, club, i, 
//						diamond, i, hearth);
//				System.out.println();
//			}
//			char i = 'J';
//			System.out.printf("%5c %s %5c %s %5c %s %5c %s %n", i, spade, i, club,
//					i, diamond, i, hearth);
//			i = 'Q';
//			System.out.printf("%5c %s %5c %s %5c %s %5c %s %n", i, spade, i, club,
//					i, diamond, i, hearth);
//			i = 'K';
//			System.out.printf("%5c %s %5c %s %5c %s %5c %s %n", i, spade, i, club,
//					i, diamond, i, hearth);
//			i = 'A';
//			System.out.printf("%5c %s %5c %s %5c %s %5c %s", i, spade, i, club,
//					i, diamond, i, hearth);
//			
//		    PdfPCell c1 = new PdfPCell(new Phrase("\u2660", redFont));
//		    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
//		    table.addCell(c1);
//		    Paragraph newKur = new Paragraph("kure", redFont);
//		    
//		    c1.setColspan(4);
////	        c1.setRowspan(5);
//
//
//		    table.addCell("5");
//		    table.addCell("6");
//		    table.addCell("7");
//		    table.addCell("8");
//		    table.addCell("9");
//		    table.addCell("10");
//		    table.addCell("11");
//		    table.addCell("8");
//		    table.addCell("9");
//		    table.addCell("10");
//		    
//
//		    subCatPart.add(table);
//
//		  }
//	 
}