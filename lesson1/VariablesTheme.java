import java.math.BigDecimal;

public class VariablesTheme {
	public static void main(String[] arg) {

		System.out.println("Задание №1:Создание переменных и вывод их значений на консоль.");
		byte numByte = 7;
		short numShort = 16;
		int numInt = 21;
		long numLong = 42;
		float numFloat = 37.62f;
		double numDouble = 58.295;
		boolean numBoolean = true;
		char numChar = 'r';

		System.out.println(
		" byte: " + numByte + 
		"\n int: " + numInt + 
		"\n long: " + numLong + 
		"\n float: " + numFloat + 
		"\n double: " + numDouble + 
		"\n boolean: " + numBoolean + 
		"\n char: "+ numChar);

		System.out.println("\nЗадание №2:Расчет стоимости товара со скидкой.");
		int productX=100;
		int productY=200;
		double sum;
		double discount;

		sum=(productX+productY);
		discount=sum*0.11;
		sum-=discount;

		System.out.println(" сумма скидки: " + discount + "\n общая стоимость товаров со скидкой: "+sum);

		System.out.println("\nЗадание №3:Вывод на консоль слова JAVA.");	
		System.out.println("    j    a  v     v  a    ");
		System.out.println("    j   a a  v   v  a a   ");
		System.out.println(" j  j  aaaaa  V V  aaaaa  ");
		System.out.println("  jj  a     a  V  a     a ");
		
		numByte = 127;
		numShort = 32767;
		numInt = 2147483647;
		numLong = 9223372036854775807l;
		
		System.out.println("\nЗадвние №4:Отображение min и max значений числвых типов данных.");
		System.out.println("Первоначальное значение данных:");
		System.out.println(
		" Byte: " + numByte +
		"\n Short: " + numShort + 
		"\n Int: " + numInt +
		"\n Long: "+ numLong);

		System.out.println("Значение после инкремента:");
		System.out.println(
		" Byte: " + (++numByte) +
		"\n Short: " + (++numShort) + 
		"\n Int: " + (++numInt) +
		"\n Long: "+ (++numLong));

		System.out.println("Значение после декремента:");
		System.out.println(
		" Byte: " + (--numByte) +
		"\n Short: " + (--numShort) + 
		"\n Int: " + (--numInt) +
		"\n Long: "+ (--numLong));

		System.out.println("\nЗадание №5:Перестановка значений переменных.");
		double oneNum = 1.1;
		double twoNum = 2.2;
		double threeNum;

		System.out.println("Перестановка через 3ю переменную: " + "\n Исходное положение переменных: ");
		System.out.println(" oneNum: " + oneNum + "\n twoNum: " + twoNum);
		
		threeNum = oneNum;
		oneNum = twoNum;
		twoNum = threeNum;

		System.out.println(" После перестановки: ");
		System.out.println(" oneNum: " + oneNum + "\n twoNum: " + twoNum);
		
		System.out.println("Перестановка арифметическим методом: " + "\n Исходное положение переменных: ");
		System.out.println(" oneNum: " + oneNum + "\n twoNum: " + twoNum);
		
		oneNum -= 1.1;
		twoNum += 1.1;

		System.out.println(" После перестановки: ");
		System.out.println(" oneNum: " + oneNum + "\n twoNum: " + twoNum);

		System.out.println("Перестановка переменных с помощью побитовых операций: " + "\n Исходное положение переменных: ");
		System.out.println(" oneNum: " + oneNum + "\n twoNum: " + twoNum);
		
		double remOne;//Объявляем переменные для хранения десятичной части
		double remTwo;

		remOne =  oneNum % 1;//Отделяем десятичную часть
		remTwo =  twoNum % 2;

		oneNum = (int)oneNum<<1;//Меняем местами переменные через операцию по битового сдвига
		twoNum = (int)twoNum>>1;

		oneNum = oneNum + remTwo;
		twoNum = twoNum + remOne;

		System.out.println(" После перестановки: ");
		System.out.println(" oneNum: " + oneNum + "\n twoNum: " + twoNum);

		int a = 35;
		int b = 38;
		int c = 64;
		int d = 94;
		int f = 95;


		System.out.println("\nЗадание №6: Вывод символов и их кодов.");
		System.out.println(
		" " + a + " = " + ((char)a) + "\n" +
	       	" " + b + " = " + ((char)b) + "\n" +
	       	" " + c + " = " + ((char)c) + "\n" +
	       	" " + d + " = " + ((char)d) + "\n" +
	       	" " + f + " = " + ((char)f)
		);

		System.out.println("\nЗадание №7: Произведение и сумма цифр числа.");
		
		int mainNum = 345;
		int sumNum = 0;//счетчик суммы
		int multNum = 1;//счетчик произведения
		double rem;
		double bum;
		int intNum;

		intNum = mainNum;
		bum = (double) intNum / 10;//выделяем десятичную часть числа 
		intNum = (int)bum;//выделяем целую часть
		rem = (bum % intNum) * 10;//отделяем десятичную часть
		rem = Math.round(rem);//принудительно округляем потому что без этого происходит хуйня
		sumNum += rem;//добавляем полученное число к сумме чисел
		multNum *= rem;//добавляем полученное число к произведению чисел
			       
		//повторяем операцию для получения след числа
		
		bum = (double) intNum / 10;//выделяем десятичную часть числа 
		intNum = (int)bum;//выделяем целую часть
		rem = (bum % intNum) * 10;//отделяем десятичную часть
		rem = Math.round(rem);//принудительно округляем потому что без этого происходит хуйня
		sumNum += rem;
		multNum *= rem;

		//добавляем оставшиеся числа к счетчику
		sumNum += intNum;
		multNum *= intNum;

		System.out.println(
		" Сумма цифр числа 345 = " + sumNum + "\n" +
		" Произведение цифр числа 345 = " + multNum + "\n"
		);
		
		System.out.println("Задание №9: Отображение сотен,десятков и едениц числа.");
	       int wholeNum = 123;
	       int hundred = 0;
	       int ten = 0;
	       int one = 0;
	       double bufer;
	       double test;

	       bufer = (double) wholeNum / 10;
	       ten = (int) bufer;
	       one = (int)((bufer % ten) * 10);

	       bufer = (double) ten / 10;
	       hundred = (int) bufer;
	       //принудительно округляем потому что без этого происходит хуйня
	       ten = (int) Math.round((bufer % hundred) * 10);
	       System.out.println(
	       " Число " + wholeNum + "содержит:\n" +
               " Сотен: " + hundred + "\n" +
	       " Десятков: " + ten + "\n" +
	       " Едениц: " + one + "\n"
		);	       

	       	System.out.println("Задание №10: Преобразование секунд.");
	       	int sec = 86399;
	       	int min = 0;
	       	int hour = 0;

		min = sec / 60;//считаем общее количество минут
		sec = sec % 60;//считаем количество секунд

		hour = min / 60;//считаем общее количество часов
		min = min % 60;//считаем количество минут

	       	System.out.println(
		" sec= " + sec + "\n" +
		" min= " + min + "\n" +
		" hour= " + hour + "\n"
		);
	}
}
