package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Задачи:
 *  Для всех 8 приватных полей класса Task1 и методов работающих с ними нужно будет написать такие тесты.
 *  Все методы тестов помечены аннотацией @Test. Эти методы не должны принимать параметров и возвращать значений.
 *  Внутри каждого из методов должны быть методы проверки на корректность. Если условие будет не выполнено, то они приведут к исключениям.
 *  Каждый кейс должен оформляться как отдельный метод с одним ассертом. Это лучшая практика по написанию тестов.
 *
 *      1. Тест проверки на допустимые значения диапозона. Нужно проверить, что при передачи значения в допустимом диапозоне не возникнет ошибки. У каждого примитивного типа есть аналогичный класс. Для получения границ диапозона можно использовать его. Детали в примере.
 *
 *      2. Написать тест для проверки, что метод суммирования вернет корректное значение. Входные значения соответственно 5 и 10. Перед вызовом метода суммирования нужно задать значение  15 полю varB используя метод setVarB. Результат должен быть равен 30.
 *
 *      3. Написать тест для проверки, что метод суммирования вернет значение отличное от ожидаемого 0. Входные значения соответственно 5 и 10. Перед вызовом метода суммирования нужно задать значение  15 полю varB используя метод setVarB.
 *
 *      4. Написать тест для проверки, что метод суммирования вернет значение отличное от ожидаемого 40. По факту аналог задачи 3, но с другим значением. Входные значения соответственно 5 и 10. Перед вызовом метода суммирования нужно задать значение  15 полю varB используя метод setVarB.
 *
 *      5. По аналогии с задачей сделать тест для метода суммирования с входными параметрами типов int и long. Вы такой метод должны будете реализовать в рамках задачи 5, описанной в классе Task1
 *
 *      6. Написать тест на негативный кейс по аналогии с задачей 4, но для функции из задачи 5
 *
 *      7. написать тест, который подставляет в метод установки приватного поля типа int литеральную константу типа byte. Не явное приведение типа
 *
 *
 */

class Task11Test {

    // Объявляем поле типа нашего класса
    // На этапе объявления поля типа нашего класса фактически выделения памяти для хранения объекта нашего класса не происходит
    Task1  task1;

    /**
     * Данный метод показывает возможность подготовки тестируемого класса перед каждым тестом
     */

    @BeforeEach
    void setUp() {
        // Инициализируем приватное поле task1 объектом класса перед каждым тестом
        // В этот момент происходит выделение памяти для хранения объекта класса
        // Если старое значение в поле task1 мы не сохраним в другом месте, то виртуальная машина новое значение присвоит
        // этой перменной, а старое по настпулению ряда событий будет удалено виртуальной машиной Java из памяти. Детали будем разбирать на следующих уроках
        // Пока достаточно знать что объекты классов инициализируется так
        task1 = new Task1();

        System.out.println("Поле task1 инициализированно новым объектом класса Task1");
    }

    /**
     * Данный метод показывает возможность выполнения необходимого кода после каждого теста
     */

    @AfterEach
    void tearDown() {
        // После каждого теста сделаем так чтобы поле task1 больше не ссылалось на область памяти с объектом класса Task
        // Для этого используем ключевое слово null. Оно говорит виртуальной машине Java, что  это поле больше не ссылается на объект класса Task
        // На самом деле в этом примере нет необходимости в этом. Пример приведен для показа концепции
        // В промышленном коде вам иногда нужно будет явно так делать, но случаев таких будет не много.

        task1 = null;
        System.out.println("Полю task1 присвоено значение null");
    }

    @Test
    void getVarB() {
    }

    /**
     * Пример теста для задачи 1
     * Данный тест показывает пример работы с классом оберткой Byte
     * В этом классе объевлены публичные не изменяемые поля MAX_VALUE и MIN_VALUE
     * Такие поля есть у всех классов оберток. Поэтому вам не обзятельно помнить диапозоны типов.
     * Вы всегда можете получить их значения.
     * Если вы попробуете передать значение выходящее за границы типа, то редактор вам подсветит это как ошибку,
     * а компилятор не откомпилирует.
     */

    @Test
    void setVarBValueInCorrectRange() {

        task1.setVarB(Byte.MAX_VALUE);

        assertEquals(127, task1.getVarB());
    }

    /**
     * Показан эффект отсекания "лишних" данных при даункасте
     * Для других типов такой тест делать не нужно
     * Показан для примера
     */

    @Test
    void downCustOfBigValueEffect() {

        // сравниваем с -128, что является начальным значением диапозона равным Byte.MIN_VALUE
        // это связанно со способом хранения значений в памяти и их интерпретацией программой
        // результатом Byte.MAX_VALUE + 1 будет число 128 котороя будет иметь тип int и выходить за пределы диапозона
        // после применения даункаста к типу меньшего размера byte мы потеряем часть значения
        // объяснение причин будет приведено в качестве факультатива

        assertEquals(-128, (byte)(Byte.MAX_VALUE + 1));
    }

    /**
     * Пример для задачи 2
     */

    @Test
    void getCorrectSum() {

        // пример объявления и использования переменной param внутри метода
        // их можно объявлять в любом месте метода, но до того как вы будете их использовать
        // хорошей практикой является объявление переменных в месте где они будут в первый раз использованы

        byte param = 15;
        task1.setVarB(param);

        // данный пример также демонстрирует особенность приведения типов (каст) при передачи литералов 5 и 10
        // эти литералы при таком объявлении имеют тип int, а метод принимает значения byte и short соответственно
        // поэтому нам нужно выполнить даункаст к типу меньшего размера

        assertEquals(30, task1.getSum((byte) 5, (short) 10));
    }

    /**
     * Пример для задачи 3
     */

    @Test
    void getNotExpectedValueFromSum() {

        // пример объявления и использования переменной param внутри метода
        // их можно объявлять в любом месте метода, но до того как вы будете их использовать
        // хорошей практикой является объявление переменных в месте где они будут в первый раз использованы

        byte param = 15;
        task1.setVarB(param);

        // данный пример также демонстрирует особенность приведения типов (каст) при передачи литералов 5 и 10
        // эти литералы при таком объявлении имеют тип int, а метод принимает значения byte и short соответственно
        // поэтому нам нужно выполнить даункаст к типу меньшего размера

        assertNotEquals(0, task1.getSum((byte) 5, (short) 10));
    }
}