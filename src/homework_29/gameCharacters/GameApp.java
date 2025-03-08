package homework_29.gameCharacters;
/*
Task 2
Создайте абстрактный класс GameCharacter, который представляет базовый класс для игровых персонажей.
Определите абстрактный метод attack(), который будет различаться для разных типов персонажей (например, воин атакует мечом, а маг использует магические заклинания).
Создайте несколько конкретных подклассов, представляющих разные типы персонажей, такие как Warrior, Mage, Archer, и т. д.
Переопределите метод attack() для каждого класса.
Создайте массив из игровых персонажей разных типов. Вызовите у каждого метод attack() в цикле.
 */
public class GameApp {
    public static void main(String[] args) {

        GameCharacter[] characters = new GameCharacter[4];
        characters[0] = new Warrior();
        characters[1] = new Mage();
        characters[2] = new Gnome();
        characters[3] = new Archer();

        for (int i = 0; i < characters.length; i++) {
            characters[i].attack();
        }

    }
}
