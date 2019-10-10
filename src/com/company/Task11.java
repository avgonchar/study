package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Задачи:
 *
 *             1. Добавить в этот класс 8 приватных полей. Приватное поле начинается с ключевого слова private за которым следует тип и имя переменной.
 *     Приватное поле защищено от прямого обращения к нему из других классов. Модификаторы доступа будут изучаться в следующих уроках.
 *     Пока важно выработать хорошую привычку все переменные по возможности объявлять приватными. Как это сделать смотрите пример.
 *     Каждое поле должно соответствовать одному из 8 примитивных типов: byte, short, int, long, char, float, double и boolean.
 *
 *             2. Добавить по одному публичному методу для каждого поля, который будет возвращать значение этого поле. Название метода должно начинаться с префикса get.
 *     Публичный метод начинается с ключевого слова public за которым следует тип возвращаемого значения и имя метода с параметрами.
 *     Даже если метод не принимает ни одного параметра после имени метода должны идти пустые скобки. Публичный метод доступен из всех классов.
 *     Модификаторы доступа будут изучаться в следующих уроках. Входных параметров у метода быть не должно. Тип, возвращаемого значения, должен совпадать с типом соответствующего поля
 *
 *             3. Добавить по одному публичному методу для каждого поля, который будет устанавливать значение для этого поле. Название метода должно начинаться с префикса set.
 *     Метод не возвращающий результатов помечается ключевым словом void перед именем метода. Входные параметры с их типами перечисляются через запятую в скобках после имени метода
 *
 *             4. Написать публичный метод принимающий 2 параметра: первый типа byte и второй типа short. Метод должен возвращать сумму значений параметров и поля класса типа byte.Тип возвращаемого значения short
 *
 *             5. Написать публичный метод принимающий 2 параметра: первый типа int и второй типа long. Метод должен возвращать произведение значений параметров и поля класса типа short. Тип возвращаемого значения long
 *
 *             6. Ознакомиться с рекомендациями по форматированию кода:
 *                 6.1 Первоисточник http://www.oracle.com/technetwork/java/codeconventions-150003.pdf
 *                 6.2 Перевод https://www.magnumblog.space/java/131-translating-java-code-conventions
 *
 *             7. Написать метод getMaxNumber принимающий 2 параметра: int и int. Метод должен сравнить переданные параметры между собой и вернуть максимальный. Для решения необходимо использовать IF или тернарный оператор ?:
 *
 *             8. Написать метод isCharA принимающий 1 параметр типа char. Если передана буква "А", то возвращать true, а в остальных случаях false
 *
 *             9. Написать метод isCharNumber принимающий 1 параметр типа char. Если передано число, то вернуть true, а в остальных случаях false
 *
 *             10. Написать метод checkZeroDivision принимающий 1 параметр типа int. В теле метода должна быть попытка деления этого параметра на 0. Метод не должен возвращать результат.
 *
 *             11. Написать метод выводящий в цикле бинарное представление чисел от 0 до 30. Для вывода бинарного представления использовать Integer.toBinaryString(). Без входных параметров и не возвращающая ничего.
 *
 *             12. Написать метод выводящий бинарное представление Integer.MAX_VALUE и Integer.MAX_VALUE + 1. Для вывода бинарного представления использовать Integer.toBinaryString(). Без входных параметров и не возвращающая ничего. Покажет, что переполнение не вызывает ошибку и как это выглядет в памяти
 *
 *             13. Написать метод принимающий 1 параметр типа char и возвращающий его числовое представление.
 *
 *             14. Написать метод принимающий 1 параметр типа int и возвращающий его представление в виде печатного символа
 *
 *
 *
 *
 */

public class Task11 {

    // Пример объявления поля для задачи 1.
    // Так как перемнные в данном случаи не несут бизнес смысла в качестве суффикса имени используется первая буква типа.
    // В промышленном коде имя перемнной не должно ссылаться на тип переменной и должно четко отражать бизнес смысл храняшегося значения.
    // Имена состоящие из нескольких слов должны следовать camelСase нотации. Эта нотация не жесткое требования, а скорее пизнак хорошего тона в мире Java.
    // Для переменных булева типа (boolean) обычно используют префикс is. Пример: isWritable, isReady.
    //Пример хороших имен: balance, account, car. Примеры плохих имен: varB, g, qwerty

    private byte varB;

    /**
     *      Пример реализации метода для задачи 2.
     *      Публичный метод возвращает значение типа byte для приватного поля varB.
     *      Даже если метод не принимает параметров за именем метода должны идти пустые скобки.
     */

    public byte getVarB(){
        return varB;
    }

    /**
     *      Пример реализации метода для задачи 3.
     *      Публичный метод устанавливает значение типа byte для приватного поля varB.
     *      В промышленном коде хорошей практикой считается называть входные параметры так же как и имена полей класса т.е. varB
     *      Для решения коллизии с именами (имя поля класса совпадает с именем параметра метода и Java думает, что вы работаете с параметром метода) используется ключевое слово this.
     *      Используя ключевое слово this можно сослаться на поля и методы текущего объекта. Его использовать следует только в тех случаях где нет однозначного понимания к чему вы обращаетесь.
     *      Альтернативный способ дать параметру метода уникальное имя. Тогда не будет необходимости в использовании ключевого слова this.
     *      В современном промышленном коде вы будете редко встречать альтернативный вариант именования
     *
     * @param varB параметр для установки значения приватного поля varB;
     */

    public void setVarB(byte varB){
        this.varB = varB;
    }

    /**
     *      Пример реализации метода для задачи 4.
     *      Публичный метод принимает 2 параметра и возвращает значение типа short
     *      В данном примере делается приведение типа.
     *      Так как все поля типом ниже int перед вычислениями приводятся к более большому типу int, то результатом суммирования будет значение типа int.
     *      Так как мы ожидаем что функция вернет значение размера short нам нужно будет привести результат к типу short
     *      Такая функция в промышленном коде будет очень опасна так как вызывающий код может передать значения сумма которых окажется больше размера short.
     *      Негативные кейсы мы проверим в тестах.
     *      В промышленном коде без явной необходимости лучше не использовать типы меньше int.
     *      Для очень больших результатов лучше использовать тип long.
     *      Если ваши вычисления потенциально могут привести к переполнению, то нужно реализовать алгоритм учитывающий возможное переполнение.
     *      В промышленном коде это будет скорее исключением чем правилом.
     *      Попробуйте убрать приведение типа и посмотрите на ошибку.
     *
     * @param param1    первый параметр для суммирования
     * @param param2    второй параметр для суммирования
     * @return  результат суммирования входных параметров и приватного поля varB
     */

    public short getSum(byte param1, short param2){
        return (short)(param1 + param2 + varB);
    }

    public int getMaxNumber(int par1, int par2){

//        if(par1 > par2){
//            return par1;
//        }else{
//            return par2;
//        }

        return par1 > par2 ? par1 : par2;

    }

    public boolean isCharA(char a) {
        if(a == 'A'){
            return true;
        }else{
            return false;
        }

    }

    public boolean isCharNumber(char a){
        return Character.isDigit(a);
//        boolean result = false;
//        if(Character.isDigit(a)){
//            result = true;
//        }
////        else{
////            result = false;
////        }
//        return result;
    }

    public void checkZeroDivision(int i){
        double result = i/0;
    }

    public void getBinaryString(){
        for(int i=1; i<8; i++){
            System.out.println(Integer.toBinaryString(i));
        }

    }
}
