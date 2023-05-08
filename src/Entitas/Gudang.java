package  Entitas;
import java.util.ArrayList;import javafx.util.Pair;
public class Gudang {
    //stok, idBarang
    private ArrayList<Pair<Integer,Integer>> listStok;
    //idBarang,idUser
    private ArrayList<Pair<Integer, Integer>> listBeli;

    Gudang(ArrayList<Pair<Integer, Integer>>listStok, ArrayList<Pair<Integer, Integer>>listBeli){
        this.listStok = listStok;
        this.listBeli =listBeli;
    }

    void getStok(Integer idBarang){
        for(Pair<Integer, Integer> pasangan : this.listStok){
            if(pasangan.getValue() == idBarang){
                return pasangan.getKey();
            }
        }
    }

    void addStok(Integer stok, Integer idBarang){
    bool found = false;
    int i = 0;
    while(i<this.listStok.length && !found){
        if(this.listStok.get(i).getValue() == idBarang){
            found = true;
        }else{
            i++;
        }
    }    
    
    if(found){
        this.listStok.set(i, new Pair<Integer, Integer>(stok + this.listStok.get(i).getKey(),idBarang));
    }else{
        this.listStok.add(new Pair<Integer, Integer>(stok, idBarang));
    }
    }

    void userBeli(Integer idBarang, Integer idUser){
        this.listBeli.add(new Pair<Integer, Integer>(idBarang, idUser));
    }
}


