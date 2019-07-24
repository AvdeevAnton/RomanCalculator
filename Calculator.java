import java.util.Scanner;

public class Calculator  {

    static RomanNumeral Numeral = new RomanNumeral();

    public static void main(String[] arg) {
        Calc myCalc = new Calc();   //создаем новй файл с вычеслениями
        Integer result = 0; //объявляем переменную Integer во избежание ошибок
        String res = "";

        do { //выполнение цикла
            Scanner calcScan = new Scanner(System.in);  // Создаем объект для чтения
            System.out.println("Введите пример. Например 2+2 или I+I");

            try {

                if (calcScan.findInLine("(-?\\d+\\.?\\d*)?\\s*(\\S)\\s*(-?\\d+\\.?\\d*)") != null) { // Проверить, нужного ли формата строка

                    Integer nOne = Integer.parseInt(calcScan.match().group(1)); //первое число из калькулятора
                    Integer nTwo = Integer.parseInt(calcScan.match().group(3)); //второе число из калькулятора
                    result = myCalc.action(nOne, nTwo, calcScan.match().group(2)); //символ между числами

                    System.out.println(result); //вывод результата

                } else if (calcScan.findInLine("(-?IX|IV|V?I{0,3})?\\s*(\\S)\\s*(-?IX|IV|V?I{0,3})") != null) {
                    Integer nOne = RomanNumeral.convertRomanToInt(calcScan.match().group(1)); //записывает в переменную значение второго числа
                    Integer nTwo = RomanNumeral.convertRomanToInt(calcScan.match().group(3)); //записывает в переменную значение второго числа
                    result = myCalc.action(nOne, nTwo, calcScan.match().group(2));//выводит результат со знаком и вторым числом

                    res = RomanNumeral.convertIntegerToRoman(result);

                    System.out.println(res);
                } else {
                    System.out.println("Line error");   //вывод ошибки
                }

            } catch (NumberFormatException e) {
                System.out.println("Problem: Invalid format");
            }
        } while (true); //выполнение цикла

    }

}