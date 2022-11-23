package Collections.MapExe.HashTable.Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class PropertiesTest {
    public static void main(String[] args){
        FileInputStream fileInputStream = null;
        try {
            Properties properties = new Properties();

            fileInputStream = new FileInputStream("jdbc.properties");

            properties.load(fileInputStream);

            String name = properties.getProperty("name");
            String password = properties.getProperty("password");

            System.out.println("name= " + name + ", password" + password);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }


    }
}
