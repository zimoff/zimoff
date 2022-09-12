public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("Задание №1:Перевод псевдокода на язык java.");
        int age = 27;
        double height = 1.63;
        boolean male = false;
        String name = "alex";
                
        if(age >= 25) {
            System.out.println("you are old");
        } else {
            System.out.println("you are young!");
        }
        if(!male) {
            System.out.println("you is a male");
        } else {
            System.out.println("you is a female");
        }
        if(height >= 1.80) {
            System.out.println("you are tall");
        } else {
            System.out.println("you are short");
        }
        if(name.charAt(0) == 'a') {
            System.out.println("first letter is A!");
        } else if(name.charAt(0) == 'm') {
            System.out.println("first letter is M!");
        } else {
            System.out.println("first letter is unknown");
        }

        System.out.println("\nЗадание №2:Поиск max и min числа");
        int var1 = 23;
        int var2 = 51;

        if(var1 == var2) {
            System.out.println(var1 + " and " + var2 + " are equal");
        } else if(var1 > var2){
            System.out.println(var1 + " is max\n" + var2 + " is min");
        } else {
            System.out.println(var2 + " is max\n" + var1 + " is min");
        }

        System.out.println("\nЗадание №3:работа с числом");
        int workNum = 5;
                
        if (workNum == 0) {
            System.out.println("number is zero!");
        } else {
            if(workNum%2 == 0) {
                System.out.println("number " + workNum + " is even");
            } else {
                System.out.println("number " + workNum + " is NOT even");
            }
            if(workNum > 0) {
                System.out.println("number " + workNum + " is positive");
            } else {
                System.out.println("number " + workNum + " is negative");
            }
        }

        System.out.println("\nЗадание №4:поиск одинаковых цифр");
        var1 = 371;
        var2 = 274;

        int hundred1 = var1 / 100;
        int ten1 = var1 / 10 % 10;
        int one1 = var1 % 10;

        int hundred2 = var2 / 100;
        int ten2 = var2 /10 % 10;
        int one2 = var2 % 10;

        System.out.println("Первое число: " + var1 +
                "\nВторое число: " + var2);

        if (one1 == one2) {
            System.out.println("Цифры первого разряда обоих чисел равны.\nЦифра первого числа: " +
                    one1 + "\nЦифра второго числа: " + one2);
        } else if (ten1 == ten2) {
            System.out.println("Цифры второго разряда обоих чисел равны.\nЦифра первого числа: " +
                    ten1 + "\nЦифра второго числа: " + ten2);
        } else if (hundred1 == hundred2) {
            System.out.println("Цифры третьего разряда обоих чисел равны.\nЦифра первого числа: " +
                    hundred1 + "\nЦифра второго числа: " + hundred2);
        }

        System.out.println("\nЗадание №5:определение буквы,числа или символа по их коду");
        char symbol = '\u0057';

        if ((int) symbol >= 48 & (int) symbol <= 57) {
            System.out.println("symbol is digit: " + symbol);
        } else if ((int) symbol >= 65 & (int) symbol <= 90) {
            System.out.println("symbol is letter: " + symbol +
                    "\nletter is in upper register");
        } else if ((int) symbol >= 97 & (int) symbol <= 122) {
            System.out.println("symbol is letter: " + symbol +
                    "\nletter is in lower register");
        } else {
           System.out.println("symbol is not a digit or a letter");
        }

        System.out.println("\nЗадание №6:определение суммы вклада и начисленных банком %");
        int deposit = 300_000;
        int percent = 5;
        int sumOfDeposit = (deposit * percent)/100;

        System.out.println("начальная сумма вклада: " + deposit);
        
        if (deposit <= 100_000) {
            System.out.println("начисляемый процент годовых: " + sumOfDeposit +
                    "\nитоговая сумма вклада: " + (deposit + sumOfDeposit));
            } else if (deposit > 100_000 & deposit <= 300_000) {
                percent = 7;
                System.out.println("начисляемый процент годовых: " + sumOfDeposit +
                        "\nитоговая сумма вклада: " + (deposit + sumOfDeposit));
            } else if (deposit > 300_000) {
                percent = 10;
                System.out.println("начисляемый процент годовых: " + sumOfDeposit +
                        "\nитоговая сумма вклада: " + (deposit + sumOfDeposit));
            }

        System.out.println("\nЗадание №7:определение оценки по предметам");
        int history = 59;
        int programming =91;
        int hisGrade = 0;
        int proGrade = 0;

        if (history <= 60) {
            hisGrade = 2;
            System.out.println(hisGrade + "-history");
        } else if (history > 60 & history <= 72) {
            hisGrade = 3;
            System.out.println(hisGrade + "-history");
        } else if (history > 72 & history <= 91) {
            hisGrade = 4;
            System.out.println(hisGrade + "-history");
        } else if (history > 91) {
            hisGrade = 5;
            System.out.println(hisGrade + "-history");
        }

        if (programming <= 60) {
            proGrade = 2;
            System.out.println(proGrade + "-programming");
        } else if (programming > 60 & programming <= 72) {
            proGrade = 3;
            System.out.println(proGrade + "-programming");
        } else if (programming > 72 & programming <= 91) {
            proGrade = 4;
            System.out.println(proGrade + "-programming");
        } else if (programming > 91) {
            proGrade = 5;
            System.out.println(proGrade + "-programming");
        }

        System.out.println("averege grade: " + ((proGrade + hisGrade)/2) +
                "\naverege percent: " + ((programming + history)/2));

        System.out.println("\nЗадание №8:расчет прибыли");
        int rent = 5000;
        int revenue = 13000;
        int costPrice = 9000;
        int profit = (revenue - costPrice - rent) * 12;

        if (profit > 0) {
            System.out.println("profit: +" + profit);
        } else {
            System.out.println("profit: " + profit);
        }


        System.out.println("\nЗадание №9:подсчёт количества банкнот");
        int sum = 567;
        int hun = sum / 100;
        int ten = sum / 10 % 10;
        int one = sum % 10;
        int finSum =0;

        if (ten > 5) {
            one = one + ((ten - 5) * 10);
            ten = 5;
        }

        System.out.println("Банкноты номиналом 100$: " + hun +
                "\nБанкноты номиналом 10$: " + ten +
                "\nБанкноты номиналом 1$: " + one);

        finSum = (hun * 100) + (ten * 10) + one;
        System.out.println("Исходная сумма: " + finSum + "$");
    }
}
