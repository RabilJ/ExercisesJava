package gamerSort;

import java.util.Comparator;

public class PointComparator implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        return Integer.compare(o2.getPoints(), o1.getPoints());
    }
}
