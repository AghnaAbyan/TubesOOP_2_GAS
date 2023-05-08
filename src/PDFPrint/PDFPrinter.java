package PDFPrint;
import Entitas.Barang;
import java.io.IOException;  
import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  
import com.itextpdf.text.Document;  
import com.itextpdf.text.DocumentException;  
import com.itextpdf.text.Paragraph;  
import com.itextpdf.text.pdf.PdfWriter;   
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Paragraph;
public class PDFPrinter implements Runnable{
    private List<Barang> data;
    private string filaName;

    public PDFPrinter(List<Barang> data, String filaName){
        this.data = data;
        this.filaName = filaName;
    }

    public void run(){
        try{
        Document doc = new Document();
        FileOutputStream fos = new FileOutputStream(filaName);
        PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(filaName));
        doc.open();
        float[] pointColumnWidths = {150F, 150F,150F, 150F,150F};
        Table table = new Table(pointColumnWidths);
        table.addCell(new Cell().add(new Paragraph("ID")));
        table.addCell(new Cell().add(new Paragraph("Nama")));
        table.addCell(new Cell().add(new Paragraph("Harga Barang")));
        table.addCell(new Cell().add(new Paragraph("Harga Beli")));
        table.addCell(new Cell().add(new Paragraph("Kategori")));
        //table.addCell(new Cell().add(new Paragraph("Gambar");
        for(Barang temp : data){
            table.addCell(new Cell().add(new Paragraph(temp.GetIDBarang())));
            table.addCell(new Cell().add(new Paragraph(temp.GetNamaBarang())));
            table.addCell(new Cell().add(new Paragraph(temp.GetHargaBarang())));
            table.addCell(new Cell().add(new Paragraph(temp.GetHargaBeli())));
            table.addCell(new Cell().add(new Paragraph(temp.GetKategori())));
        }
        doc.add(table);
        doc.close();
        Thread.sleep(10000);
        System.out.println("PDF creation is a success"); 
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
