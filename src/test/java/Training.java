public class Training {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        double e = 3.0;
        double f = 1.5;
        //Арифместические операторы
           // Сложение
        int sum = a + b;
        System.out.println("Addition result: " + sum);
             // Сложение, чтоб в ответе было число с плавающей точкой
        double sum1 = e + f;
        System.out.println("Addition result1: " + sum1);


           // Вычитание
        int sub = a - b;
        System.out.println("Subtraction result: " + sub);
              // Вычитание, чтоб в ответе было число с плавающей точкой
        double sub1 = e - f;
        System.out.println("Subtraction result1: " + sub1);


           // Целочисленное деление
        int div = a / b;
        System.out.println("Division result: " + div);
              // Деление, чтоб в ответе было число с плавающей точкой
        double div1 = (double) a / b;
        System.out.println("Division result1: " + div1);
              // Деление левого операнда на правый операнд и возврат остатка
        int remOfDiv = a % b;
        System.out.println("remainderOfDivision: " + remOfDiv);


           // Умножение
        int mult = a * b;
        System.out.println("Multiplication: " + mult);
              // Умножение, чтоб в ответе было число с плавающей точкой
        double mult1 = (double) e * f;
        System.out.println("Multiplication result1: " + mult1);


        // инкремент
                     // Вернет старое значение a и после увеличит его на +1
        System.out.println("Increment a++ = " +  (a++));
        System.out.println("a = " +  (a));
                     // Вернет новое значение a увеличенное на 1 (=а+1)
        System.out.println("Increment ++a = " +  (++a));
        System.out.println("a = " +  (a));


           // Декремент
                       // Вернет старое значение a и после уменьшит его на -1
        System.out.println("Decrement a-- = " +  (a--));
        System.out.println("a = " +  (a));
                      // Вернет новое значение a уменьшенное на 1 (=а-1)
        System.out.println("Decrement --a = " +  (--a));
        System.out.println("a = " +  (a));


        // Операторы сравнения
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("a >= b = " + (a >= b) );
        System.out.println("a <= b = " + (a <= b) );


        // Логические операторы
        boolean c = true;
        boolean d = false;
        System.out.println("a && b = " + (c&&d));
        System.out.println("!(a && b) = " + !(c && d));
        System.out.println("a || b = " + (c||d) );
        System.out.println("!(a || b) = " + !(c||d) );


        // Операторы присвоения
        int g = 0;
        // = оператор присваивания, присваивает значения из правой стороны операндов к левому операнду
        g = a + b;
        System.out.println("g = a + b = " + g );
        // += оператор присваивания «Добавления», он присваивает левому операнду значения правого (эквивалентно g=g+a)
        g += a ;
        System.out.println("g += a  = " + g );
        // -= оператор присваивания «Вычитания», он вычитает из правого операнда левый операнд (эквивалентно g=g-a)
        g -= a ;
        System.out.println("g -= a = " + g );
        // *= оператор присваивания «Умножение», он умножает правый операнд на левый операнд (эквивалентно g=g*a)
        g *= a ;
        System.out.println("g *= a = " + g );
        // /= оператор присваивания «Деление», он делит левый операнд на правый операнд (эквивалентно g=g/a)
        g /= a ;
        System.out.println("g /= a = " + g );
        // %= оператор присваивания «Модуль», он принимает модуль, с помощью двух операндов и присваивает его результат левому операнду (эквивалентно g=g % a)
        g %= a ;
        System.out.println("g %= a  = " + g );
        // 	<<= оператор присваивания «Сдвиг влево» (эквивалентно g<<2)
        g <<= 2 ;
        System.out.println("g <<= 2 = " + g );
        // >>= оператор присваивания «Сдвиг вправо» (эквивалентно g>>2)
        g >>= 2 ;
        System.out.println("g >>= 2 = " + g );
        // 	&= оператор присваивания побитового «и» («AND») (это как g&2)
        g &= a ;
        System.out.println("g &= 2  = " + g );
        // ^= оператор присваивания побитового исключающего «или» («XOR») (это как g^2)
        g ^= a ;
        System.out.println("g ^= a   = " + g );
        // |= оператор присваивания побитового «или» («OR») (это как g|2)
        g |= a ;
        System.out.println("g |= a   = " + g );


        // Тонарный(условный) оператор
        int h , i;
        h = 10;
        i = (h == 1) ? 20 : 30;
        System.out.println( "Значение i: " +  i );

        i = (h == 10) ? 20 : 30;
        System.out.println( "Значение i: " + i );


        //Оператор instanceof
        String name = "Машка";
        boolean result = name instanceof String;
        System.out.println( "name is String" + (result));


        // Переполнение
        byte j = 126;
        byte k = (byte) (j + 3);
        System.out.println("k="+(k));
            // без переполнения
        short l = (short) (j + 3);
        System.out.println("l="+(l));

            // максимальное значение integer 2147483647
        int m = Integer.MAX_VALUE;
        System.out.println("m="+(m));
        int n = m+5;
        System.out.println("n="+(n));
        long o = (long) m+5;
        System.out.println("o="+(o));

    }
}
