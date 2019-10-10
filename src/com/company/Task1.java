package com.company;

import java.sql.SQLOutput;
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
 *             4. Написать публичный метод принимающий 2 параметра: первый типа byte и второй типа short.
 *             Метод должен возвращать сумму значений параметров и поля класса типа byte.Тип возвращаемого значения short
 *
 *             5. Написать публичный метод принимающий 2 параметра: первый типа int и второй типа long.
 *             Метод должен возвращать произведение значений параметров и поля класса типа short. Тип возвращаемого значения long
 *
 *             6. Ознакомиться с рекомендациями по форматированию кода:
 *                 6.1 Первоисточник http://www.oracle.com/technetwork/java/codeconventions-150003.pdf
 *                 6.2 Перевод https://www.magnumblog.space/java/131-translating-java-code-conventions
 *
 */

public class Task1 {

    // Пример объявления поля для задачи 1.
    // Так как перемнные в данном случаи не несут бизнес смысла в качестве суффикса имени используется первая буква типа.
    // В промышленном коде имя перемнной не должно ссылаться на тип переменной и должно четко отражать бизнес смысл храняшегося значения.
    // Имена состоящие из нескольких слов должны следовать camelСase нотации. Эта нотация не жесткое требования, а скорее пизнак хорошего тона в мире Java.
    // Для переменных булева типа (boolean) обычно используют префикс is. Пример: isWritable, isReady.
    //Пример хороших имен: balance, account, car. Примеры плохих имен: varB, g, qwerty

    private byte varB;
//    byte, short, int, long, char, float, double и boolean?
    private byte bvar;
    private  short swar;
    private  int ivar;
    private  long lvar;
    private  char cvar;
    private  float fvar;
    private  double dvar;
    private  boolean isvar;

    /**
     *      Пример реализации метода для задачи 2.
     *      Публичный метод возвращает значение типа byte для приватного поля varB.
     *      Даже если метод не принимает параметров за именем метода должны идти пустые скобки.
     */

    public byte getVarB(){
        return varB;
    }
    public byte getBvar(){return bvar;}
    public short getSwar(){return swar;}
    public int getIvar(){return ivar;}
    public long getLvar(){return lvar;}
    public char getCvar(){return cvar;}
    public float getFvar(){return fvar;}
    public double getDvar(){return dvar;}
    public boolean getIsvar(){return isvar;}

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
    public void setBvar(byte bvar) {this.bvar = bvar;}
    public void setSwar(short swar) {this.swar = swar;}
    public void setIvar(int ivar) {this.ivar = ivar;}
    public void setLvar(long lvar) {this.lvar =lvar;}
    public void setCvar(char cvar) {this.cvar = cvar;}
    public void setFvar(float fvar){this.fvar = fvar;}
    public void setDvar(double dvar){this.dvar = dvar;}
    public void  setIsvar(boolean isvar){this.isvar = isvar;}
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

    public short getSum(byte param1, short param2){return (short)(param1 + param2 + varB);}
    public short getSum2(byte bvar, short swar) {
        this.bvar = bvar;
        this.swar = swar;
        short summ = (short) (bvar+swar);
        return summ;
    }
    public int getMaxNumber(int param1, int param2){
        if (param1 > param2) {
            return  param1;
        }
        else {
            return  param2;
        }

    }

    public boolean isCharA(char a){
        if(a == 'A') {
            return  true;
        }else{
            return false;
        }
    }

    public boolean isCharNumber (char a){
        if(Character.isDigit(a)){
            return true;
        }else{
            return false;
        }
    }

    public void checkZeroDivision (int i){
        double result = i/0;
    }

    public void getBinaryString(){
        Stream.of(1,2,3,4,5,6,7)
                .forEach( i -> {
                    System.out.println(Integer.toBinaryString(i));});
    }
 public  void getBinatyMaxString(){
     Integer a=5;
     a=a.MAX_VALUE;
     System.out.println(Integer.toBinaryString(a));
     a=a+1;
     System.out.println(Integer.toBinaryString(a));
 }
public  int CharNumber(char param1){
        return Character.getNumericValue(param1);
}

    public  String NumberChar(int param1){
        return Integer.toString(param1);
    }



//       14. Написать метод принимающий 1 параметр типа int и возвращающий его представление в виде печатного символа


}
