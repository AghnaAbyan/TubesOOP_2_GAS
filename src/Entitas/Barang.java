package Entitas;

import java.io.ObjectInputStream.GetField;

public class Barang {
    private int idBarang;
    private String namaBarang;
    private Double hargaBarang;
    private Double hargaBeli;
    private String kategori;
    private String gambar;

    public void setIdBarang(int idBarang){this.idBarang = idBarang;}
    public int getIdBarang(){
        return this.idBarang;
    }
    public String getNamaBarang(){
        return this.namaBarang;
    }
    public Double getHargaBarang(){
        return this.hargaBarang;
    }
    public Double getHargaBeli(){
        return this.hargaBeli;
    }
    public String getKategori(){
        return this.kategori;
    }
    public String getGambar(){
        return this.gambar;
    }
}