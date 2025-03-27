package hw.hw_42.sport;

import java.util.Comparator;

public class SportsmanScoreComparator implements Comparator<Sportsman> {

    @Override
    public int compare(Sportsman sm1, Sportsman sm2) {
        // Такая реализация работает неверно, при разнице очков меньше 1
        // 90,75 - 90,50 = 0,25 -> 0
        //return  (int) (sm1.getScore() - sm2.getScore());

        return Double.compare(sm1.getScore(),sm2.getScore());
    }


}
