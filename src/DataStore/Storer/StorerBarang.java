package DataStore.Storer;

import Entitas.Barang;
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

