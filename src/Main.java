public class Main {
    public static void main(String[] args) {
        // Оголошення змінних
        long l;           // Змінна l цілого типу розміром 8 байтів
        boolean b=true;    // Змінна b логічного типу
        float f;          // Змінна f дійсного типу розміром 4 байти
        short s = 1200;   // Змінна s цілого типу довжиною 2 байти з початковим значенням 1200
        // Виконання дій
        f = s;            // Змінній f привласнено значення змінної s
        l = (long) (Math.random() * 201 - 100); // Змінній l привласнено випадкове значення в діапазоні від -100 до 100
        s = (short) l;    // Змінній s привласнено значення змінної l
        l = (long) f;     // Змінній l привласнено значення змінної f

        // Виведення значень змінних для перевірки
        System.out.println("l = " + l);
        System.out.println("b = " + b);
        System.out.println("f = " + f);
        System.out.println("s = " + s);

        double s1 = 10.0;
        double f1 = 5.0;
        double l1 = 0.5;

        double y = Math.log(s1) + Math.log(f1) - Math.asin(l1);

        System.out.println("Значення y = " + y);
    }
}