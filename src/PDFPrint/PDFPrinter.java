package PDFPrint;
import Entitas.Barang;
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
        doc.add(table);
        doc.close();
        System.out.println("PDF creation is a success"); 
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
