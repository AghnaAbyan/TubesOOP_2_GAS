package PDFPrint;
import Entitas.Barang;
public class PDFPrinter {
    private Barang[] data;
    

    public PDFPrinter(Barang[] data){
        this.data = data;
    }
    public void print(String filaName){
        try{
        Document doc = new Document();
        FileOutputStream fos = new FileOutputStream(filaName);
        PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(filaName));
        doc.open();
        float[] pointColumnWidths = {150F, 150F,150F, 150F,150F};
        Table table = new Table(pointColumnWidths);
        table.addCell("ID");
        table.addCell("Nama");
        table.addCell("Harga Barang");
        table.addCell("Harga Beli");
        table.addCell("Kategori");
        //table.addCell("Gambar");
        for(Barang temp : data){
            table.addCell(temp.GetIDBarang());
            table.addCell(temp.GetNamaBarang());
            table.addCell(temp.GetHargaBarang());
            table.addCell(temp.GetHargaBeli());
            table.addCell(temp.GetKategori());
        }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
