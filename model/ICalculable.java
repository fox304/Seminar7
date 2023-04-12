package Seminar7.model;

public interface ICalculable {
    void sum(int x);      //   сумма
    void multiplier(int x);  // умножение
    void subtruction(int x);   // вычитание
    void division(int x);   //   деление
    void setFirstArg(double firstArg);  // установка 1 аргумента
    void getResult();     // результат
}
