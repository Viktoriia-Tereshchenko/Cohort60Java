package lesson_32.methods;

import lists.MyList;

public class Utils {

    // Параметризированные методы

    // Поменять местами два элемента массива с любым ссылочным типом данных
    public static <T> void  swap(T[] array, int idx1, int idx2) {
        T temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }

    // Метод, который возвращает первый элемент в списке
    public static <T> T getFirstElement(MyList<T> list) {
        if (list.isEmpty()) return  null;

        return list.get(0);
    }

    // Ограничение сверху Upper Bound
    // Ограничиваем диапазон принимаемых типов данных
    // <T extends SomeClass>  - что Т должен быть либо классом SomeClass,
    // либо его потомком (подклассом)
    public static <T extends Number> int sumElements(T...elements) {
        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum += elements[i].intValue();
        }
        return sum;
    }

    // ? - Wildcard "неизвестный / любой тип"
    // ? extends Number - любой тип, являющийся наследником Number
    public static double listSum(MyList<? extends Number> listNumbers) {
        double sum = 0;
        for (int i = 0; i < listNumbers.size(); i++) {
            //System.out.println(listNumbers.get(i));
            sum += listNumbers.get(i).doubleValue();
        }
        return sum;
    }


    // Ограничение снизу Lower Bound
    // ? super Integer - мы работаем с неизвестным типом, который является
    // классом Integer или его родителем (суперклассом)
    public  static void  addNumbers(MyList<? super Integer> list) {
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.println(list);
    }

}
