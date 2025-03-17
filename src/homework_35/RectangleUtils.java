package homework_35;

import java.util.Iterator;
import java.util.Objects;

public class RectangleUtils {

    public static boolean removeDuplicates(MyList<Rectangle> list, Rectangle rectangle) {

        if (list == null || list.isEmpty() || rectangle == null) return false;

        Iterator<Rectangle> iterator = list.iterator();
        int removeCount = 0;

        while (iterator.hasNext()) {
            Rectangle currentRec = iterator.next();
            if (Objects.equals(currentRec, rectangle)) {
                iterator.remove();
                removeCount++;
            }
        }

        return removeCount > 0;
    }


}
