package DataStore.Storer;

import Membership.Customer;
import Membership.Member;
import Membership.RegisteredCustomer;
import Membership.VIP;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.*;
import java.util.HashMap;

public class StorerCustomer implements Storer {
    private final HashMap<String, Customer> customers;
    private final String path = "Customer.json";

    public StorerCustomer(){
        customers = new HashMap<>();
        try{
            this.restore();
            System.out.println("Restored db:");
            System.out.println(this.customers);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public int addCustomer(Customer customer){
        int id = customers.size()+1;
        customer.setIdUser(id);
        customers.put(String.valueOf(customer.getIdUser()), customer);

        try{
            this.dump();
        }catch(IOException e){
            e.printStackTrace();
        }
        return id;
    }

    public void updateCustomer(Customer customer){
        addCustomer(customer);
    }

    public Customer getCustomer(int idUser){return customers.get(String.valueOf(idUser));}

    public void dump() throws IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(customers);
        System.out.println(json);

        try(FileWriter fw = new FileWriter(path)){
            System.out.println(fw);
            fw.write(json);

            System.out.println("Successfully dumped Customer");
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
            for(String key : jsonobject.keySet()){
                JsonElement status = jsonobject.get(key).getAsJsonObject().get("status");
                String statusStr = "";
                if(status!=null) statusStr = status.getAsString();

                if(statusStr.equals("VIP")){
                    customers.put(key, gson.fromJson(jsonobject.get(key), VIP.class));}
                else if(statusStr.equals("Member")){
                    customers.put(key, gson.fromJson(jsonobject.get(key), Member.class));}
                else
                    customers.put(key, gson.fromJson(jsonobject.get(key), Customer.class));
            }

            System.out.println("Successfully restored Customer");

            fr.close();
        }catch(FileNotFoundException e){
            FileWriter fw = new FileWriter(path);
            fw.write("{}");
        }
    }
}