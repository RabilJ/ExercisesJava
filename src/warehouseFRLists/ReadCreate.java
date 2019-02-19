package warehouseFRLists;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCreate {


    private List<Product> readFileGetList() throws IOException {
        List<Product> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Jakub\\IdeaProjects\\Testy\\src\\warehouseFRLists\\products.csv"));
            String line = "";
            String[] products = new String[0];
            while ((line = reader.readLine()) != null) {
                products = line.split(";");
                Integer quantityToInt = Integer.valueOf(products[1]);
                Product product = new Product(products[0],quantityToInt);
                list.add(product);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
    public void displayNicely() throws IOException {
        System.out.println("Ładowanie pliku:");
        System.out.println("products.csv");
        List<Product> list = readFileGetList();
        for (Product product : list) {
            StringBuilder builder = new StringBuilder();
            for(int i=0;i<(product.getQuantity()+5)/10;i++){
                builder.append("*");
            }
            System.out.printf("%-30s(%d) %s\n",product.getName(),product.getQuantity(),builder.toString());
        }
    }

}
