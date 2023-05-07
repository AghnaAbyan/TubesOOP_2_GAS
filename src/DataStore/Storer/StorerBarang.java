package DataStore.Storer;


import java.io.IOException;
import java.util.HashMap;

public class StorerBarang implements Storer{
    private final String path = "Storer.json";
    private final HashMap<String, Barang> gudang;

    public StorerBarang(){
        gudang = new HashMap<>();
        try{
            this.restore();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public void dump() throws IOException{

    }
    public void restore() throws IOException{

    }
}


class Barang {
    private int idBarang;
    private String namaBarang;
    private Double hargaBarang;
    private Double hargaBeli;
    private String kategori;
    private String gambar;


    public int GetIDBarang(){
        return this.idBarang;
    }
    public String GetNamaBarang(){
        return this.namaBarang;
    }
    public Double GetHargaBarang(){
        return this.hargaBarang;
    }
    public Double GetHargaBeli(){
        return this.hargaBeli;
    }
    public String GetKategori(){
        return this.kategori;
    }
    public String GetGambar(){
        return this.gambar;
    }
}
