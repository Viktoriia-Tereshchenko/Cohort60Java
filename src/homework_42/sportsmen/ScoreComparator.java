package homework_42.sportsmen;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Sportsman> {

    @Override
    public int compare(Sportsman sm1, Sportsman sm2) {
        return Double.compare(sm2.getScore(),sm1.getScore());
    }
}
