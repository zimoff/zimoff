import java.util.Scanner;
import java.util.ArrayList;
class Library {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ManageBooks menu = new ManageBooks();

        System.out.println("<<< LIBRARY >>>");
        while(true) {
            System.out.println("|q - exit| |m - menu|");
            
            String type = scan.next();
            char choice = type.charAt(0);
            if(choice == 'q') break;
            if(choice == 'm') menu.getMenu(); 

            else {
                switch(choice) {
                    case ('1'):
                        menu.putBook();
                        break;
                    case ('2'):
                        menu.delBook();
                        break;
                    case ('3'):
                        menu.findBook();
                        break;
                    case ('4'):
                        menu.showAll();
                        break;
                    case ('5'):
                        menu.showAllshort();
                        break;
                    case ('6'):
                        menu.getDemo();
                        break;
                    case ('7'):
                        menu.getTest();
                        break;
                    default:
                        System.out.println(">>> Symbol is unknown <<<");
                        break;
                }
            }
        }
        
        
    }
}
