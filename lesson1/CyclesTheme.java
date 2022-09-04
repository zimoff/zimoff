public class CyclesTheme { 
	public static void main (String args[]) {
		System.out.println("\n Задание №1:Подсчет четных и не четных чисел.");

		int count = -10;
		int even = 0;
		int notEven = 0;

		do {
			if (count % 2 == 0) {
				//System.out.println(count + " is even");
				even += count;
				//System.out.println("even count = " + even);
			} else {
				//System.out.println(count + " is NOT even");
				notEven += count;
				//System.out.println("NOT even count = " + notEven);
			}
			count++;
		} while (count <= 21);

		System.out.println("В промежутке [-10,21] сумма четных чисел = " + even +
			" ,а нечетных = " + notEven);
		
		
		System.out.println("\n Задание №2:Вывод чсел в интервале (min и max) в порядке убывания.");

		int var1 = 10;
		int var2 = 5;
		int var3 = -1;

		int max = 0;
		int min = 0;

		if (var1 > var2 & var1 > var3) {
			max = var1;
		} else if (var2 > var1 & var2 > var3) {
			max = var2;
		} else {
			max = var3;
		}

		
		if (var1 < var2 & var1 < var3) {
			min = var1;
		} else if (var2 < var1 & var2 < var3) {
			min = var2;
		} else {
			min = var3;
		}
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);

		System.out.print("numbers: ");

		min++;

		for (int i = min; i < max; i++) {
			System.out.print(" |" + i + "|");
		}
		
		
		System.out.println("\n Задание №3:Вывод реверсивного числа и суммы его цифр.");

		int dirNum = 1234;
		int sum = 0;

		System.out.print("исходное число в обратоном порядке: ");

		while (dirNum > 0) {
			sum += (dirNum % 10);
			System.out.print(dirNum % 10);
			dirNum = dirNum / 10;
			//System.out.println("i = " + i);
			//i++;
		}
		System.out.println("\nсумма цифр: " + sum);
		
		System.out.println("\n Задание №4:Вывод чисел на консоль в несколько строк.");

		count = 1;

		for (int i = 1; i < 24; ) {
			for (int x = 0; x < 5;) {
				if (i%2 == 0) {	
					if (i > 24) System.out.printf("%3d",0);
					if (i <= 24) System.out.printf("%3s", i);
					x++;
				} 
				i++;
				}
			System.out.println();
		}
		
		System.out.println("\n Задание №5:Провернка количества едениц на чётность.");

		int evenNumber = 3141591;
		int firstNumber = evenNumber;
		int evenOne = 0;

		while (evenNumber > 0) {
			if (evenNumber % 10 == 1) {
				evenOne++;
			}
			evenNumber = evenNumber / 10;
		}

		if (evenOne % 2 == 0) {
			System.out.println("Число " + firstNumber + " содержит " + 
					   evenOne + "(чётное) количество единиц");
		} else {
			System.out.println("Число " + firstNumber + " содержит " + 
					   evenOne + " (НЕ чётное) количество единиц");
		}
		
		
		System.out.println("\n Задание №6:Отображение фигур в консоли.");

		for (int i = 1; i <=5; i++) {
			System.out.println("**********");
		}

		System.out.println();

		int lineCount = 5;
		int strCount =5;

		while (lineCount > 0) {
			while (strCount > 0) {
				System.out.print("#");
				strCount--;
			}
			lineCount--;
			strCount = lineCount;
			System.out.println();
		}
		
		System.out.println();

		lineCount = 1;
		strCount = 0;
		count = 0;

		do {
			strCount = 0;
			if (lineCount <=3) {
				do {
					System.out.print("$");
					//System.out.print("str:" + strCount);
					strCount++;
					} while (strCount < lineCount);
			} else { 
				do {
					System.out.print("$");
					strCount++;
					} while (strCount <= (5-lineCount));
			}


			lineCount++;
			System.out.println();

		} while (lineCount <= 5);
		
		System.out.println("\n Задание №7:Отображение  ASCII-символов.");


		for (int i = 33; i <= 47; i++) {
			if ((i % 2) != 0) {
				System.out.println(i + "= " + (char)i);
			}
		}
		
		for (int i = 97; i <= 122; i++) {
			if ((i % 2) == 0) {
				System.out.println(i + "= " + (char)i);
			}
		}
		
		
		System.out.println("\n Задание №8:Проверка, является ли число палиндромом.");

		int num = 1234321;
		count = num;
		int collect = 0;
		
		while (count > 10) {
			collect = (collect + (count%10))*10;
			count /=10;
		}

		System.out.println();
		collect += count;
		
		if (collect == num) System.out.println("число " + num + " - полиндром");
		else System.out.println("число " + num + " - НЕ полиндром");
		
		System.out.println("\n Задание №9:Определение, является ли число счастливым.");
		
		num = 123321;
		int sum1, sum2;
		sum1 = sum2 = 0;
		
		for (int i = 1; num >10; i++) {
			//System.out.print(num%10);
			if (i <= 3) sum1 += num%10;
			else sum2 += num%10;
			num /= 10;
		}
		//System.out.println(num);
		sum2 += num;
		
		System.out.println("Сумма первых 3х чисел: " + sum1);
		System.out.println("Сумма вторых 3х чисел: " + sum2);
		
		if (sum1 == sum2) System.out.println("luckystrike!");
		else System.out.println("keep calm");
		
		System.out.println("\n Задание №10:Вывод таблицы умножения Пифагора.");
		
		for (int a=1;a<=9;a++){
			for (int b=1;b<=9;b++){
				if (a==1&b==1)System.out.print("   ");
				else System.out.printf("%3d",(a*b));
				if (b==1)System.out.print("|");
			}
			if (a==1){
				System.out.println();
				for(int i =0;i<=9;i++)System.out.print("---");
			}
			System.out.println();
		}

	}
}
