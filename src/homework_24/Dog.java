package homework_24;

/*
Task 2 * (Опционально)
Написать класс Собака (Dog).
Каждая Собака обязательно должна иметь имя и высоту прыжка
Должна уметь прыгать и должна уметь тренироваться.
За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров
Максимальная высота прыжка, которую может натренировать собака, не может быть больше,
чем двукратная высота первоначального прыжка.

Также должен быть метод взять jumpBarrier. В параметрах метод принимает высоту барьера.
 Если собака в состоянии преодолеть этот барьер - прыгает. Если не в состоянии,
 нужно проверить помогут ли тренировки (будет ли данная собака в принципе в состоянии взять барьер).

Если да -> идем тренироваться -> берет барьер
 */

public class Dog {

    private String name;
    private int firstJumpHeight;
    private int currentJumpHeight;

    public Dog(String name, int firstJumpHeight) {
        this.name = name;
        // при создании указываем высоту первого прыжка
        this.firstJumpHeight = firstJumpHeight;
        this.currentJumpHeight = firstJumpHeight;
    }

    public void jump() {
        System.out.println("Я прыгаю!");
    }

    public void train() {

        if (currentJumpHeight < firstJumpHeight * 2) {
            currentJumpHeight += 10;
            System.out.println("Тренеруюсь!");
        } else {
            System.out.println("Выше я уже не прыгну!");
        }

        if (currentJumpHeight > firstJumpHeight * 2) currentJumpHeight = firstJumpHeight * 2;

        System.out.println("Высота прыжка: " + currentJumpHeight);
    }

    public void jumpBarrier(int barrierHeight) {

        if (barrierHeight < 0) return;

        if (currentJumpHeight >= barrierHeight) {
            jump();

        } else {

            if (firstJumpHeight * 2 >= barrierHeight) {
                while (currentJumpHeight < barrierHeight) {
                    train();
                }
                jump();
            } else {
                System.out.println("Я не в состоянии взять барьер");
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getFirstJumpHeight() {
        return firstJumpHeight;
    }

    public int getCurrentJumpHeight() {
        return currentJumpHeight;
    }

    // Сеттеры не нужны
}
