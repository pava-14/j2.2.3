# Задача № 3 "Кредитный Калькулятор"

## Краткое описание

1. Создано базовое приложение. 
3. Создан класс CreditPaymentService
4. Создан метод calculate, рассчитывающий и возвращающий значение аннуитентного платежа.
5. В методе используется три переменные:
    * double amount - сумма кредита (рублей) 
    * int years - срок кредита (лет)
    * double perc - процентная ставка 
5. Для вывода результата используется форматированный вывод.
6. Вывод в консоль:
    
    87911
    
    46140
    
    32262

## Код

```java
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        // Вариант 1: 1 000 000 на 1 год под 9.99%
        System.out.printf("%.0f\n", service.calculate(1_000_000,1,9.99));
        // Вариант 2: 1 000 000 на 2 года под 9.99%
        System.out.printf("%.0f\n", service.calculate(1_000_000,2,9.99));
        // Вариант 3: 1 000 000 на 3 года под 9.99%
        System.out.printf("%.0f\n", service.calculate(1_000_000,3,9.99));
    }
}

public class CreditPaymentService {
    public double calculate (double amount, int years, double perc) {
        double yearPerc = perc / 12 / 100;
        return amount * (yearPerc * Math.pow(1 + yearPerc, years * 12)) /
                ((Math.pow(1 + yearPerc, years * 12)) - 1);
    }
}
```