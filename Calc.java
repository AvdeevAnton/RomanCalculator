
public class Calc {
    public Integer addition (Integer x , Integer y){
        return x+y; //возвращает результат сложения перменной х и у
    }
    public Integer substraction (Integer x, Integer y) {
        return x-y;//возвращает результат вычитания перменной х и у
    }
    public  Integer division (Integer x, Integer y){
        return x/y;//возвращает результат деления перменной х на у
    }
    public Integer multiplication (Integer x, Integer y)
    {
        return x*y;//возвращает результат умножения перменной х на у
    }
    public Integer action (Integer x , Integer y , String operator){ // передает переменные х, у и знак
        switch (operator) { //принимает знак + - / *
            case "+":
                return  this.addition(x, y); //выполнить сложение
            case "-":
                return  this.substraction(x, y); //выполнить вычитания
            case "/":
                return this.division(x, y); //выполнить деление
            case "*":
                return this.multiplication(x, y);//выполнить умножение


            default: //если ни одно из значений не выполняется, выполнить 0
                return 0;

        }

    }
}