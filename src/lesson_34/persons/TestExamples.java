package lesson_34.persons;

import hw_25.Calculator25S;
import lesson_27.Autobus;
import lesson_27.BusDriver;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TestExamples {

    // @BeforeEach- метод, который будет выполняться перед КАЖДЫМ тестовым методом
    @BeforeEach
    void setUp() {
        System.out.println("Method @BeforeEach");
    }
    /*
    @BeforeEach - метод, который будет выполняться перед КАЖДЫМ тестовым методом
    @BeforeAll - метод выполняется один раз, перед выполнением первого тестового метода

    @AfterEach - метод, который будет выполняться после КАЖДОГО тестового метода
    @AfterAll - метод выполняется один раз, после выполнения всех тестовых методов

    -- такие методы должны быть СТАТИЧЕСКИМИ (помеченные @BeforeEach, @BeforeAll, @AfterEach, @AfterAll)

    @disabled - указываем, что тест отключен и выполняться не будет (возможность отключить тестирование метода)
     */


    // @Test - аннотация указывает, что метод является тестовым
    // Таким образом JUnit знает, что метод нужно запустить во время выполнения тестов
    @Test
    public void testAddition() {
        // протестировать, правильно ли работает метод add класса Calculator25S
        int result = Calculator25S.add(2, 3);

        // Реальное / фактическое значение в переменной result
        // Ожидаемое значение - 5

        // Методы проверки утверждений

        // 1. Assertions.assertEquals(expected, real) - проверяет равны ли два значения.
        // Тест пройден, если два значения равны
        Assertions.assertEquals(5, result);

        // 2. Assertions.assertNotEquals(unexpected, real);
        // Тест будет пройден, если фактический результат НЕ совпадет с "неожидаемым результатом"
        Assertions.assertNotEquals(0, result);

        // 3. Assertions.assertTrue(); - метод проверяет, что условие верно (возвращает true)
        Assertions.assertTrue(result >= 4);

        // статический импорт позволяет использовать методы без обращения к классу
        assertEquals(10, 5 + 5);


        // 4. Assertions.assertFalse() - проверяет, что условие ложно (возвращает false)
        assertFalse(result > 10);


        // 5. Assertions.assertNull() - проверяет, что объект null. Тест будет пройден, если объект равен null
        assertNull(null);

        // 6. Assertions.assertNotNull() - проверяет, что объект не null. Тест будет пройден, если объект не равен null
        assertNotNull("String");

        System.out.println("TestAddition");
    }

    @Disabled
    public void emptyTest() {
        System.out.println("Test Empty");
        // Если в методе нет ложного утверждения - он считается пройденным
        // В том числе пустой (вообще без утверждений) считается пройденным
    }


    // Параметризованные тесты
    // (позволяют выполнить тест несколько раз с разными параметрами)

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "kiwi", "cherry"}) // источник, поставляющий значения
    public void testFruits(String fruit) {
        System.out.println("current value: " + fruit);
        assertNotNull(fruit);
        assertTrue(fruit.length() > 4);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    public void testBuStatic(int value) {
        System.out.println("static value ren: " + value);
        Autobus bus = new Autobus(new BusDriver("Test", "1111"), 10);
        System.out.println(bus);
    }

    // Источник данных в формате CSV - табличный способ (можно передать РАЗЛИЧНЫЕ типы данных)
    // Источник данных файл в формате CSV

    // Источник данных - метод
    @ParameterizedTest
    @MethodSource("testDataFruits")
    void testMethodSourceFruits(String fruit) {
        System.out.println("Current value: " + fruit);
        assertNotNull(fruit);
    }

    // Stream - поток данных
    // можно передать null
    static Stream<String> testDataFruits() {
        return Stream.of("apple", /*null,*/ "banana", "kiwi", "cherry");
    }

    @ParameterizedTest
    @MethodSource("testDataInt")
    void testMethodSourceInt(int value) {
        System.out.println("Current value: " + value);
        assertNotEquals(100, value);
    }

    static Stream<Integer> testDataInt() {
        return Stream.of(1, 2, -10, 0, 15);
    }

    @ParameterizedTest
    @MethodSource("testDataArguments")
    void testMethodSourceArguments(int value, int expected, boolean isEquals) {
        System.out.println(value + " | " + expected + " | " + isEquals);
        int result = value * value;
        assertEquals(expected, result);
    }

    // интерфейс Arguments - позволяет создать набор разных типов

    static Stream<Arguments> testDataArguments() {
        return Stream.of(
                Arguments.of(2, 4 , true),
                Arguments.of(3, 9 , true),
                Arguments.of(4, 15 , false)
        );
    }

    @ParameterizedTest
    @MethodSource("testPersonData")
    void testMethodSourcePerson(Person person, String newEmail) {
        System.out.println("Current value: " + person);
        System.out.println("New email: " + newEmail);

    }

    static Stream<Arguments> testPersonData() {
        Person person = new Person("test@amail.com", "passssqW1%");
        return Stream.of(
                Arguments.of(person, "new1234#mail.com"),
                Arguments.of(new Person("invalid.mail.com", "passwoed"), "pass.com")
        );
    }

















}