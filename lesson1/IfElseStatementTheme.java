
public class IfElseStatementTheme{

    public static void main(String args[]){
        System.out.println("Задание №1:Перевод псевдокода на язык java.");
        int age = 27;
        double height = 1.63;
        String name = "alex";
                
        if(age >= 25) {
                System.out.println("you are old");
                } else {
                System.out.println("you are young!");
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
        int var2 = 49;
                
        if(var1 > var2) {
                System.out.println(var1 + " is max\n" + var2 + " is min");
                } else {
                System.out.println(var2 + " is max\n" + var1 + " is min");
                }


        System.out.println("\nЗадание №3:работа с числом");

        int workNum = 4;
                
        switch (workNum) {
                case 0:
                System.out.println("number is zero!");
                break;
                default:
                if(workNum%2 == 0){
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
        int num1 = 371;
        int num2 = 274;

        int hundred1 = 0;
        int ten1 = 0;
        int one1 = 0;

        int hundred2 = 0;
        int ten2 = 0;
        int one2 = 0;

        one1 = num1 % 10;
        hundred1 = num1 / 10;
        ten1 = hundred1 % 10;
        hundred1 = hundred1 / 10;
        
        one2 = num2 % 10;
        hundred2 = num2 / 10;
        ten2 = hundred2 % 10;
        hundred2 = hundred2 / 10;
        
        System.out.println(
                "Первое число: " + num1 + "\n" +
                "Второе число: " + num2 
                );

        if (one1 == one2) {
                System.out.println("Цифры первого разряда обох чисел равны.\nЦифра первого числа: " +
                                one1 + "\nЦифра второго числа: " + one2);
        } else if (ten1 == ten2) {
                System.out.println("Цифры второго разряда обох чисел равны.\nЦифра первого числа: " +
                                ten1 + "\nЦифра второго числа: " + ten2);
        } else if (hundred1 == hundred2) {
                System.out.println("Цифры третьего разряда обох чисел равны.\nЦифра первого числа: " +
                                hundred1 + "\nЦифра второго числа: " + hundred2);
        }

        System.out.println("\nЗадание №5:определение буквы,числа или символа по их коду");
        char symbol = '\u0057';
        
        if (Character.isDigit(symbol)) {
                System.out.println("symbol is digit: " + symbol);
                } else if (Character.isLetter(symbol)) {
                        System.out.println("symbol is letter: " + symbol);
                        if (symbol == Character.toUpperCase(symbol)) {
                                System.out.println("letter is in upper register");
                                } else {
                                System.out.println("letter is in lower register");
                                }
                } else {
                       System.out.println("symbol is not a digit or a letter");
                       }               
                       
                        
        System.out.println("\nЗадание №6:определение суммы вклада и начисленных банком %");
        int deposit = 300_000;
        int percent = 5;
        int sumOfDeposit = (deposit * percent)/100;

        System.out.println("начальная сумма вклада: " + deposit);
        
        if (deposit <= 100_000) {
                System.out.println("начисляемый процент годовых: " + sumOfDeposit + "\n" +
                                "итоговая сумма вклада: " + (deposit + sumOfDeposit));
                } else if (deposit > 100_000 & deposit <= 300_000) {
                percent = 7;
                System.out.println("начисляемый процент годовых: " + sumOfDeposit + "\n" +
                                "итоговая сумма вклада: " + (deposit + sumOfDeposit));
                } else if (deposit > 300_000) {
                percent = 10;
                System.out.println("начисляемый процент годовых: " + sumOfDeposit + "\n" +
                                "итоговая сумма вклада: " + (deposit + sumOfDeposit));
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
                
        System.out.println("averege grade: " + ((proGrade + hisGrade)/2));
        System.out.println("averege percent: " + ((programming + history)/2));

        System.out.println("\nЗадание №8:расчет прибыли");

        int rent = 5000;
        int revenue = 13000;
        int costPrice = 9000;
        int profit;

        profit = (revenue - costPrice - rent) * 12;

        if (profit > 0) {
                System.out.println("profit: +" + profit);
                } else {
                System.out.println("profit: " + profit);
                }


        System.out.println("\nЗадание №9:подсчёт количества банкнот");

        int sum = 567;
        int hun = 0;
        int ten = 0;
        int one = 0;
        int finSum =0;

        one = sum % 10;
        hun = sum / 10;
        ten = hun % 10;
        hun = hun / 10;

        if (ten > 5) {
                one = one + ((ten - 5) * 10);
                ten = 5;}

        System.out.println("Банкноты номиналом 100$: " + hun + "\n" + 
                           "Банкноты номиналом 10$: " + ten + "\n" + 
                           "Банкноты номиналом 1$: " + one);

        finSum = (hun * 100) + (ten * 10) + one;
        System.out.println("Исходная сумма: " + finSum + "$");







    }
}



