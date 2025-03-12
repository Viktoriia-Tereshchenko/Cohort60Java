package homework_31.lists;

public class MyListApp {
    public static void main(String[] args) {

        MyArrayList<String> strList = new MyArrayList<>();

        strList.add("Str1");
        strList.add("Str2");
        strList.add("Str3");
        System.out.println(strList.size());
        strList.test();
        System.out.println(strList.indexOf("Str2"));
        strList.remove("Str1");
        strList.test();
        System.out.println(strList.toString());
        strList.addAll("Str4", "Str5", "Str6", "Str7");
        System.out.println(strList.toString());

        System.out.println("\n======================");

        // новые методы contains, isEmpty, set
        System.out.println(strList.contains("Str4"));
        System.out.println(strList.isEmpty());
        System.out.println(strList.toString());
        strList.set(2, "Str1");
        System.out.println(strList.toString());


        System.out.println("\n======================");

        MyArrayList<Double> doubleList = new MyArrayList<>();

        System.out.println(doubleList.remove(4.1));
        doubleList.add(4.0);
        doubleList.add(5.3);
        doubleList.add(8.1);
        doubleList.add(-9.7);
        System.out.println(doubleList.toString());

        doubleList.remove(0);
        doubleList.test();
        doubleList.remove(8.1);
        System.out.println(doubleList.toString());

        System.out.println(doubleList.indexOf(1.1));

        doubleList.addAll(3.3, 5.1, 7.0);
        System.out.println(doubleList.toString());

        System.out.println("\n======================");

        // новые методы contains, isEmpty, set
        System.out.println(doubleList.contains(5.3));
        System.out.println(doubleList.isEmpty());
        System.out.println(doubleList.toString());
        doubleList.set(0, -2.4);
        System.out.println(doubleList.toString());

        doubleList.set(-9, 7.2);
        doubleList.contains(null);

        doubleList.toArray();
    }
}
