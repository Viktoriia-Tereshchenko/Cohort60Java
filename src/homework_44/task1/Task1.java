package homework_44.task1;
/*
Task 1
Напишите метод, принимающий строку и возвращающий Список ее слов
без повторений, отсортированный в порядке увеличения длин слов.

Если строки имеют одинаковую длину - сортировать в естественном порядке

public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }


// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]
 */
public class Task1 {
    public static void main(String[] args) {

        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }
}
