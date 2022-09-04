
public class calculator {
    public static void main(String args[]){
		char ch = '^';
		int a = 7;
		int b = 2;
		
		if (ch == '+') System.out.printf("%2d %2c %2d = %2d",a,ch,b,(a+b));
			else if (ch == '-') System.out.printf("%2d %2c %2d = %2d",a,ch,b,(a-b));
			else if (ch == '*') System.out.printf("%2d %2c %2d = %2d",a,ch,b,(a*b));
			else if (ch == '/') System.out.printf("%2d %2c %2d = %2d",a,ch,b,(a/b));
			else if (ch == '%') System.out.printf("%2d %2c %2d = %2d",a,ch,b,(a%b));
			else if (ch == '^') {
				System.out.print(a + " " + ch + " " + b + " = ");
				for (int i = a; b>1; b--)
					a = i * a;
				System.out.print(a);
		} 
	

        
    }
}



