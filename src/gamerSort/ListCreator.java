package gamerSort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCreator {
    public List<Player> getList() {
        {
            try {
                FileReader fr = new FileReader("C:\\Users\\Jakub\\IdeaProjects\\Testy\\src\\gamerSort\\playerDatabase.csv");
                BufferedReader bfr = new BufferedReader(fr);
                String line = "";
                List<Player> list = new ArrayList<>();
                while ((line = bfr.readLine()) != null) {
                    List<String> elements = Arrays.asList(line.split(";"));
                    int scoreAsInt = Integer.valueOf(elements.get(1));
                    list.add(new Player(elements.get(0), scoreAsInt));
                }
                return list;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}