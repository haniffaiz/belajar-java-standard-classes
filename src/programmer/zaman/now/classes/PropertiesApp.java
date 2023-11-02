package programmer.zaman.now.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);

        }catch (FileNotFoundException exception){
            System.out.println("File tidak ketemu");
        } catch (IOException exception){
            System.out.println("Gagal load data dr file");
        }

        try{
            Properties properties = new Properties();
            properties.put("name.first", "Hanif Faiz");
            properties.put("name.last", "Hidayat");

            properties.store(new FileOutputStream("name.properties"), "Konfigurasi nama");
        } catch (FileNotFoundException exception){
            System.out.println("Error membuat file properties");
        } catch (IOException exception){
            System.out.println("error menyimpan properties");
        }

    }
}
