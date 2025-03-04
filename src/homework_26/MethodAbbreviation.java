package homework_26;

/*
Task 3 * Опционально
Написать метод, который запрашивает у пользователя строку, состоящую из несколько слов
и возвращающий аббревиатуру этой фразы (первые буквы каждого слова, записанные в верхнем регистре)

Например:
научно исследовательский институт -> НИИ
 */

public class MethodAbbreviation {

    public static StringBuilder stringAbbreviation(String string) {

        String[] words = string.toUpperCase().split(" ");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            char ch = words[i].charAt(0);
            result.append(ch);
        }
        return result;
    }
}
