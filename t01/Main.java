package javase03.t01;
import java.util.*;

/* Задание 1. Строковые классы
Необходимо создать класс CrazyLogger, ведущий журнал лога, используя как накопитель
объект типа StringBuilder. Логгер должен содержать методы поиска определенной информации
в таком логе [с возможностью вывода ее в поток ввода вывода].
Информацию логгер хранит в форматированном виде: dd-mm-YYYY : hh-mm – message;. */


class Other {
	static String hello = "Hello";
}

class CrazyLogger {
	 StringBuilder log = new StringBuilder();
	 
}


public class StringLiteralPool {
    public static void main(String[] args) {
        String s1 = "Hello";
		String s2 = new StringBuffer("He").append("llo").toString();
		String s3 = s2.intern();
		System.out.println("s1 == s2? " + (s1 == s2) );
		System.out.println("s1 == s3? " + (s1 == s3) );
		
		String hello = "Hello", lo = "lo";
		System.out.println(hello == "Hello");
		System.out.println(Other.hello == "Hello");
		System.out.println(hello == ("Hel" + "lo"));
		System.out.println(hello == ("Hel" + lo));
		System.out.println(hello == ("Hel" + lo).intern());		
		
		Formatter formatter = new Formatter();
		boolean b1 = true;
		Boolean b2 = null;
		formatter.format("1. - %b, %b\n", b1, b2);
		System.out.println(formatter);
		Timer t = new Timer();
		formatter.format("2. - %h", t);
		System.out.println(formatter);
		
    }
}