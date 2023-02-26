package guru.qa;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    // Целочисленные типы данных
    byte aByte = 100; // -128...127 (8 bit)
    short aShort = -32768; // -32768...32767 (16 bit)
    //Используем
    int aInt = -2147483648; // -2147483648...2147483647 (32 bit)/Для расчетов: 2^(bit-1)
    long aLong = -2147463; // 64 bit

    //Типы данных с плавающей точкой
    float aFloat = 1.0F; //32 bit
    //Используем*
    double aDouble = 1.0; // 64 bit
    char aChar = 'a';

    // Операторы

    // 1. Присвоение
    char bChar = 'a';
    int b = 10;
    int c = 20;
    double d = 4.5;

// 2. Математические  + - / %
    int sum = b + c;
    System.out.println("### result " + sum);
    int diff = c - b;
    System.out.println("### result " + diff);
    int mult = b * c;
    System.out.println("### result " + mult);
    int div = c / b;
    System.out.println("### result " + div);
    int rem = c % b;
    System.out.println("### result " + rem);


// 3. Сравнения >, <, >=, <=, !=, ==
    System.out.println("### boolean result " + (b < c));
    System.out.println("### boolean result " + (b > c));
    System.out.println("### boolean result " + (b == c));
    System.out.println("### boolean result " + (b != c));

// 4. Логические &(И), && (сокращенное И), | (ИЛИ), || (сокращенное ИЛИ), ! (отрицание)
    if (b > c && b != 0) {
      System.out.println("Fail");
    } else {
      System.out.println("Success");
    }

    // Переполнение + Комбинация разных типов данных (String + byte)
    byte bByte = 100;
    System.out.println("Превышен максимальный размер! result = " + (aByte + bByte)); // Превышен максимальный размер! result = 200

    System.out.println("Превышен максимальный размер! result = " + aByte + bByte); // вывод без скобок будет выглядеть так: Превышен максимальный размер! result = 100100

    // Комбинация integer and double
    System.out.println("result = " + (c + d));




    // 5. Тернарный
    int value = (methodOne())
            ? 10
            : 20;
    System.out.println("### Value: " + value);

    int value1;
    if (methodOne()) {
      value = 10;
    } else {
      value = 20;
    }


    // 6. instanceof
    String s = "This is String";

    if (s instanceof String) {
      System.out.println("### Value: " + value);
    }

    // 7. Wrapper types
    Integer aIntegerWrapper;
    Double aDoubleWrapper;
    Character aCharWrapper;

    switch (s) {
      case "dima": {
        System.out.println("That`s Dima");
      }
      case "vasya": {
        System.out.println("That`s Vasya");
      }
      default: {
        System.out.println("Default");
      }
    }


    if (s.equals("dima")) {
      System.out.println("That`s Dima");
    } else if (s.equals("vasya")) {
      System.out.println("That`s Vasya");
    } else {
      System.out.println("Default");
    }
  }

    public static boolean methodOne() {
      System.out.println("methodOne");
      return false;
    }

  public static boolean methodAnother() {
    System.out.println("methodAnother");
    return true;
  }

  public static void printInt(int arg) {
    System.out.println("### printInt: " + arg);
  }

  String c = "this is a String";
  List<String> aList = new ArrayList<>();


}