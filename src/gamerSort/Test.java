package gamerSort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        PointComparator pointComparator = new PointComparator();
        ListCreator listCreator = new ListCreator();
        List<Player>list = listCreator.getList();

        for (Player player : list) {
            System.out.println(player);
        }
        System.out.println();
        list.sort((p1, p2) -> Integer.compare(p2.getPoints(), p1.getPoints()));
        for (Player player : list) {
            System.out.println(player);
        }
        System.out.println();
        list.sort(Comparator.comparing(Player::getPoints));
        for (Player player : list) {
            System.out.println(player);
        }
    }
}
