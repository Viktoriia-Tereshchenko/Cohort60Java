package homework_25;

public class Dog {

    private String name;
//    private int firstJumpHeight;
//    private int currentJumpHeight;

    // поля изменены
    private int jumpHeight;
    private int maxJump;

    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        // определяем максимальную высоту прыжка
        this.maxJump = jumpHeight * 2;
    }

    // Без вывода сообщений в методах для выполнения homework_25.Task05

    public void jump() {
        //System.out.println("Я прыгаю!");
    }

    public void train() {

        if (jumpHeight < maxJump) {
            jumpHeight += 10;
            //System.out.println("Тренеруюсь!");
        } else {
            //System.out.println("Выше я уже не прыгну!");
        }

        if (jumpHeight > maxJump) jumpHeight = maxJump;

        //System.out.println("Высота прыжка: " + jumpHeight);
    }

    // метод переделан -> возвращает true / false
    public boolean jumpBarrier(int barrierHeight) {

        if (barrierHeight < 0) return false;

        if (jumpHeight >= barrierHeight) {
            jump();
            return true;

        } else {

            if (maxJump >= barrierHeight) {
                while (jumpHeight < barrierHeight) {
                    train();
                }
                jump();
                return true;
            } else {
                //System.out.println("Я не в состоянии взять барьер");
                return false;
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getMaxJump() {
        return maxJump;
    }

    // Сеттеры не нужны

}
