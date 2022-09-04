import java.math.BigDecimal;

public class VariablesTheme {
	public static void main(String[] arg) {
		System.out.println("Задание №1:Создание переменных и вывод их значений на консоль.");
		byte numOfCPU = 2;
		short numOfCores = 8;
		int bitDepth = 64;
		long RAM = 8000;
		float HDD = 10.240f;
		double screenSize = 281088.456;
		boolean wiFi = true;
		char litOfCPU = 'i';

		System.out.println(
			" byte: " + numOfCPU + 
			"\n int: " + bitDepth + 
			"\n long: " + RAM + 
			"\n float: " + HDD + 
		        "\n double: " + screenSize + 
			"\n boolean: " + wiFi + 
			"\n char: "+ litOfCPU);

		System.out.println("\nЗадание №2:Расчет стоимости товара со скидкой.");
		int penPrice = 100;
		int bookPrice = 200;
		double sum = (penPrice+bookPrice);
		double discount = sum*0.11;

		sum -= discount;

		System.out.println(" сумма скидки: " + discount + "\n общая стоимость товаров со скидкой: "+sum);

		System.out.println("\nЗадание №3:Вывод на консоль слова JAVA.");	
		System.out.println("    j    a  v     v  a    ");
		System.out.println("    j   a a  v   v  a a   ");
		System.out.println(" j  j  aaaaa  V V  aaaaa  ");
		System.out.println("  jj  a     a  V  a     a ");
		
		System.out.println("\nЗадание №4:Отображение min и max значений числовых типов данных.");

		numOfCPU = 127;
		numOfCores = 32767;
		bitDepth = 2147483647;
		RAM = 9223372036854775807l;
		
		System.out.println("Первоначальное значение данных:");
		System.out.println(
			" Byte: " + numOfCPU +
			"\n Short: " + numOfCores + 
			"\n Int: " + bitDepth +
			"\n Long: "+ RAM);

		System.out.println("Значение после инкремента:");
		System.out.println(
			" Byte: " + (++numOfCPU) +
			"\n Short: " + (++numOfCores) + 
			"\n Int: " + (++bitDepth) +
			"\n Long: "+ (++RAM));

		System.out.println("Значение после декремента:");
		System.out.println(
			" Byte: " + (--numOfCPU) +
			"\n Short: " + (--numOfCores) + 
			"\n Int: " + (--bitDepth) +
			"\n Long: "+ (--RAM));

		System.out.println("\nЗадание №5:Перестановка значений переменных.");
		int num1 = 2;
		int num2 = 5;
		int tNum;

		System.out.println("Перестановка через 3ю переменную: " + "\n Исходное положение переменных: ");
		System.out.println(" num1: " + num1 + "\n num2: " + num2);
		
		tNum = num1;
		num1 = num2;
		num2 = tNum;

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
		System.out.printf("byte num1: %4s \nbyte num2: %4s",Integer.toBinaryString(num1),
			   Integer.toBinaryString(num2));

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
	       		" " + ((int) codeF ) + " = " + codeF );

		
		System.out.println("Задание №7: Отображение сотен,десятков и единиц числа.");
	        int wholeNum = 123;
	        int hundred = 0;
	        int ten = 0;
	        int one = 0;

		one = wholeNum % 10;
		hundred = wholeNum / 10;
		ten = hundred % 10;
		hundred /= 10;

		System.out.printf("Число %3d содержит:\n%3d сотен \n%3d десятков \n%3d единиц",
			wholeNum,hundred,ten,one);

		System.out.println("\nЗадание №9: Произведение и сумма цифр числа.");
		
		int mainNum = 345;
		int sumDigits = 0;//счетчик суммы
		int prodDigits = 1;//счетчик произведения
				   
		sumDigits += (mainNum % 10);
		prodDigits *= (mainNum % 10);
		mainNum /= 10;

		sumDigits += (mainNum % 10);
		prodDigits *= (mainNum % 10);
		mainNum /= 10;
		
		sumDigits += mainNum;
		prodDigits *= mainNum;

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
