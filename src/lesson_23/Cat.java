package lesson_23;

public class Cat {

    // Все поля делаем приватными для контроля, что туда записывается!
    // Всегда закрываем наши поля класса, а потом решаем давать ли геттеры и сеттеры
    private String name;
    private int age;
    private int weight;
    protected boolean isProtected;
    boolean isDefault;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Геттеры и сеттеры - специальные ПУБЛИЧНЫЕ методы, дающие возможность
    // получать или изменять значения поля

    // Правило именования getИмяПеременной

    // Геттер для поля age
    public int getAge() {
        return age;
    }

    // Геттер для поля weight
    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }


    // Сеттеры всегда void (ничего не возвращают)
    // Правило именования setИмяПеременной
    // с их помощью можно контролировать, какое изменение хочет внести пользователь

    public void setAge(int age) {

        // классический способ  - инверсия !

        // !(age < 0 || age > 30) => !(age < 0) И !(age > 30)
        if (!(age < 0 || age > 30)) {   // 20 (20 < 0 || 2 > 30 -> false -> !false -> true
            // Изначальное условие выдает !false, которое мы инвертируем оператором ! в true
            // Если age подходит
            this.age = age;
        }

        /*
        if (age < 0 || age > 30) {
            //  Возраст не подходит - ничего не делаю (условие выдает true)
        } else {
            // age подходит (условие выдает false)
            this.age = age;
        }
         */
    }

    public  void setWeight(int weight) {
        // Имеем возможность проверить входящее значение
        if (weight < 0) {
            // Если входящее не устраивает - я могу установить "значение по умолчанию"
            this.weight = 0;
            System.out.println("Текущий вес кота: " + this.weight);
            return; // работа метода прекращается. Дальнейшие проверки не проводятся
        }
        // В эту строку кода мы попадем со значение weight 0 и больше
        // Если вес НЕ больше 50 кг - то делай блок кода 1. // Иначе, делай блок 2
        // -5 > 50 ! false = true
        if (! (weight > 50)) {
            // код 1
            this.weight = weight;
        }
        // Иначе ничего не делай = оставляем старое значение
    }

    // Я не хочу давать возможность изменять имя коту после создания объекта -
    // поэтому в классе не пишу сеттер на имя
    /*
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
    */

    public void sayMeow() {
        System.out.println("Meow! " + name);
        testMethod(); // внутри кода класса у меня есть доступ к приватным членам (в.т.ч. методам)
    }

    public String toString() {
        //System.out.printf("Cat %s, age: %d, weight: %d\n", name, age, weight);
        //String resConcat = "Cat" + name + ", age: " + age + " weight: " + weight; // создаться много строк в памяти!
        String result = String.format("Cat %s, age: %d, weight: %d", name, age, weight);
        return result;
    }

    private void testMethod() {
        System.out.println("Test!");
    }

}
