

import java.io.ObjectInputStream.GetField;

public class Barang {
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
