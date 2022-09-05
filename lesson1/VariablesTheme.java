import java.math.BigDecimal;

public class VariablesTheme {
	public static void main(String[] arg) {
		System.out.println("Задание №1:Создание переменных и вывод их значений на консоль.");
		byte numOfCPU = 2;
		short numOfCores = 8;
		int bitDepth = 64;
		long ram = 8000;
		float hdd = 10.240f;
		double screenSize = 281088.456;
		boolean wiFi = true;
		char litOfCPU = 'i';

		System.out.println(
		        " byte: " + numOfCPU + 
			"\n int: " + bitDepth + 
			"\n long: " + ram + 
			"\n float: " + hdd + 
		        "\n double: " + screenSize + 
			"\n boolean: " + wiFi + 
			"\n char: "+ litOfCPU);

		System.out.println("\nЗадание №2:Расчет стоимости товара со скидкой.");
		int penPrice = 100;
		int bookPrice = 200;
		double sum = (penPrice + bookPrice);
		double discount = sum * 0.11;

		sum -= discount;

		System.out.println(" сумма скидки: " + discount + "\n общая стоимость товаров со скидкой: "+sum);

		System.out.println("\nЗадание №3:Вывод на консоль слова JAVA.");	
		System.out.println("    j    a  v     v  a    ");
		System.out.println("    j   a a  v   v  a a   ");
		System.out.println(" j  j  aaaaa  V V  aaaaa  ");
		System.out.println("  jj  a     a  V  a     a ");
		
		System.out.println("\nЗадание №4:Отображение min и max значений числовых типов данных.");

		byte byteNum = 127;
		short shortNum = 32767;
		int intNum = 2147483647;
		long longNum = 9223372036854775807l;
		
		System.out.println("Первоначальное значение данных:");
		System.out.println(
			" Byte: " + byteNum +
			"\n Short: " + shortNum + 
			"\n Int: " + intNum +
			"\n Long: "+ longNum);

		System.out.println("Значение после инкремента:");
		System.out.println(
			" Byte: " + (++byteNum) +
			"\n Short: " + (++shortNum) + 
			"\n Int: " + (++intNum) +
			"\n Long: "+ (++longNum));

		System.out.println("Значение после декремента:");
		System.out.println(
			" Byte: " + (--byteNum) +
			"\n Short: " + (--shortNum) + 
			"\n Int: " + (--intNum) +
			"\n Long: "+ (--longNum));

		System.out.println("\nЗадание №5:Перестановка значений переменных.");
		int num1 = 2;
		int num2 = 5;
		int tmp;

		System.out.println("Перестановка через 3ю переменную: " + "\n Исходное положение переменных: ");
		System.out.println(" num1: " + num1 + "\n num2: " + num2);
		
		tmp = num1;
		num1 = num2;
		num2 = tmp;

		System.out.println(" После перестановки: ");
		System.out.println(" num1: " + num1 + "\n num2: " + num2);
		
		System.out.println("Перестановка арифметическим методом: " + "\n Исходное положение переменных: ");
		System.out.println(" num1: " + num1 + "\n num2: " + num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println(" После перестановки: ");
		System.out.println(" num1: " + num1 + "\n num2: " + num2);

		System.out.println(
			"Перестановка переменных с помощью побитовых операций: " + 
			"\n Исходное положение переменных: ");

		System.out.println(" num1: " + num1 + "\n num2: " + num2);

		num1 ^= num2;
		num2 ^= num1;
		num1 ^= num2;

		System.out.println("\n После перестановки: ");
		System.out.println(" num1: " + num1 + "\n num2: " + num2);

		System.out.println("\nЗадание №6: Вывод символов и их кодов.");

		char codeA = 35;
		char codeB = 38;
		char codeC = 64;
		char codeD = 94;
		char codeF = 95;

		System.out.println(
			" " + ((int) codeA ) + " = " + codeA  + "\n" +
	       		" " + ((int) codeB ) + " = " + codeB  + "\n" +
	       		" " + ((int) codeC ) + " = " + codeC  + "\n" +
	       		" " + ((int) codeD ) + " = " + codeD  + "\n" +
	       		" " + ((int) codeF ) + " = " + codeF);

		
		System.out.println("Задание №7: Отображение сотен,десятков и единиц числа.");
	        int srcNum = 123;
	        int hundred = srcNum / 100;
	        int ten = srcNum / 10 % 10;
	        int one = srcNum % 10;

		System.out.printf("Число %3d содержит:\n%3d сотен \n%3d десятков \n%3d единиц",
			srcNum,hundred,ten,one);

		System.out.println("\nЗадание №9: Произведение и сумма цифр числа.");
		
		int mainNum = 345;
	        hundred = mainNum / 100;
	        ten = mainNum / 10 % 10;
	        one = mainNum % 10;
		int sumDigits = hundred + ten + one;//счетчик суммы
		int prodDigits = hundred * ten * one;//счетчик произведения
				   
		System.out.println(
			" Сумма цифр числа 345 = " + sumDigits  + "\n" +
			" Произведение цифр числа 345 = " + prodDigits  + "\n");

	       	System.out.println("Задание №10: Преобразование секунд.");
	       	int sec = 86399;
	       	int min = sec / 60;//считаем общее количество минут
	       	int hour = min / 60;//считаем общее количество часов

		sec = sec % 60;//считаем количество секунд
		min = min % 60;//считаем количество минут

	       	System.out.println(hour + ":" +  min + ":" + sec);   
	}
}
