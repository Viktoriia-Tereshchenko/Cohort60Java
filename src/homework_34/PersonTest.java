package homework_34;

/*
Task1
 Написать тестовый метод для проверки работы с "не валидными" email в классе Person.
 Тестовые данные должны содержать максимально полный набор не валидных email-ов (с двумя собаками, без точки после собаки и т.д.)

Task2
 Написать тесты установки пароля в классе Person. Валидные / не валидные пароли.
*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class PersonTest {

    Person person;
    String startEmail = "lohn@test.com";
    String startPassword = "qwerty1Q%S";

    @BeforeEach
    void setUp() {
        person = new Person(startEmail, startPassword);
    }

    @ParameterizedTest
    @ValueSource(strings = {"valid@test.com", "test111@test.com.de"})
    void testValidEmailSet(String validEmail) {
        person.setEmail(validEmail);
        Assertions.assertEquals(validEmail, person.getEmail());
    }

    @ParameterizedTest
    @MethodSource("testDataNotValidEmails")
    void testNotValidEmailSet(String notValidEmail) {
        person.setEmail(notValidEmail);
        Assertions.assertNotEquals(notValidEmail, person.getEmail());
        Assertions.assertEquals(startEmail, person.getEmail());
    }

    static Stream<String> testDataNotValidEmails() {
        return Stream.of(null, "test.gmail.com", "test@@gmail.com",
                "tes.t@gmailcom", "test@.gmail.c", "test@.", "ters@g  mail.com",
                "AAvcvc6,78_##@gmail.com", "omck%55$Lo@ukr.net", "Aer@dot.net  ",
                "@gmail.com", "  @gmail.com", "43Sjf@test.com", "_Evf23@gmail.com");
    }


    @ParameterizedTest
    @ValueSource(strings = {"QAZwsx3355$super%", "Test (1990)", "Pass-987654321", "@testPass123"})
    void testValidPasswordSet(String validPassword) {
        person.setPassword(validPassword);
        Assertions.assertEquals(validPassword, person.getPassword());
    }

    @ParameterizedTest
    @MethodSource("testDataNotValidPasswords")
    void testNotValidPasswordSet(String notValidPassword) {
        person.setPassword(notValidPassword);
        Assertions.assertNotEquals(notValidPassword, person.getPassword());
        Assertions.assertEquals(startPassword, person.getPassword());
    }

    static Stream<String> testDataNotValidPasswords() {
        return Stream.of(null, "short", "Ye3$  ", "uyubbvfvfvnb", "WRTHVasass",
                "1232132112", "assssss1223123", "2345WPIOH", "erew555eeQRWETY",
                "ruetyr  iy%GGGGGG", "123546WWWWWW{}@*", "!!!AAAAAA", "2244RTY ##XX");
    }
}
