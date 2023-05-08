package DataStore.Storer;

import Entitas.Barang;
import Membership.Customer;
import Membership.Member;
import Membership.VIP;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

class Gudang{

}

public class StorerBarang implements Storer{
    private final String path = "Gudang.json";
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

    public void addBarang(Barang barang){
        barang.setIdBarang(gudang.size()+1);
        gudang.put(String.valueOf(barang.getIdBarang()), barang);

        try{
            this.dump();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public void updateBarang(Barang barang){addBarang(barang);}
    public Barang getBarang(int idBarang){
        return this.gudang.get(String.valueOf(idBarang));
    }

    public HashMap<String, Barang> getGudang(){return gudang;}


    public void dump() throws IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(gudang);
        System.out.println(json);

        try(FileWriter fw = new FileWriter(path)){
            System.out.println(fw);
            fw.write(json);

            System.out.println("Successfully dumped Gudang");
            fw.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public void restore() throws IOException{
        Gson gson = new Gson();
        StringBuilder json_builder = new StringBuilder();

        try(FileReader fr = new FileReader(path)){
            int i;
            while((i=fr.read())!=-1){
                json_builder.append((char)i);
            }
            JsonObject jsonobject = gson.fromJson(json_builder.toString(), JsonObject.class);
            if(jsonobject!=null){
                for(String key : jsonobject.keySet()){
                    gudang.put(key, gson.fromJson(jsonobject.get(key), Barang.class));
                }
            }

            System.out.println("Successfully restored Customer");

            fr.close();
        }catch(FileNotFoundException e){
            FileWriter fw = new FileWriter(path);
            fw.write("{}");
        }
    }
}

