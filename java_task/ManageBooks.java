import java.util.Scanner;
import java.util.ArrayList;
class ManageBooks {

    ArrayList<Book> books = new ArrayList<Book>();
    Scanner type = new Scanner(System.in);

    void putBook() {
        System.out.println("name:");
        String name = type.nextLine();

        System.out.println("author:");
        String author = type.nextLine();

        System.out.println("description:");
        String description = type.nextLine();

        //System.out.println("num of pages:");
        int pageNum = 777;//type.nextInt();

        books.add(new Book(author, name, description, pageNum));

    }
    
    void getDemo() {
        LibDemo bd = new LibDemo();
        books.addAll(bd.addLib());
        System.out.println("DEMO BOOKS HAS BEEN ADDED!");
    }

    void delBook() {
            Scanner delT = new Scanner(System.in);
            int chId;
        while(true) {
            chId = 0;
            System.out.println("Enter index of book: ");
            try {
                chId = delT.nextInt();
            } catch(java.util.InputMismatchException e) {
                System.out.println("индекс это ЦИФРА а не буква!");
                break;
            }
	        //int i = Character.digit(choice, 10); java.util.inputMismatchException
            System.out.println("books size: " + books.size());
            System.out.println("chId: " + chId);

            if(chId >= 0 & chId < books.size()) {
                System.out.println(books.remove(chId)  + " has been removed.");
                break;
            }else {
                System.out.println("WRONG INDEX!");
                break;
            }
        }
    }

    void findBook() {
        System.out.print("|Enter name of book|\n >>> ");
        String search = type.nextLine();
        String name1; 
        int noFound = 0;

        for(Book bk: books) {
            name1 = bk.getName();
            //if(noFound == 1) System.out.println("found book: ");
            if(name1.contains(search)) noFound++;
            if(name1.contains(search)) {
                System.out.println("> " + bk.getName());
            }
        }
        if(noFound == 0)
            System.out.println("|Nothing found|");
    }

    void showAll() {
        for(Book bk: books) {
            System.out.println("\n\nname: " + bk.getName());
            System.out.println("----------------------------");
            System.out.println("author: " + bk.getAuthor());
            System.out.println("----------------------------");
            System.out.println("description:");
            bk.getDescription();
            System.out.println("\n----------------------------");

        }
    }
    void showAllshort() {
        System.out.println("index||Name" );
        for(Book bk: books) {
            System.out.println("---------------");
            System.out.printf("%5d| %s\n",books.indexOf(bk),bk.toString());
            }
            System.out.println("---------------");
    }
    
    void getMenu() {
        System.out.println("<<<| LIBRARY  MENU |>>>\n");
        System.out.println("|1| Add book.");
        System.out.println("|2| Del book.");
        System.out.println("|3| Find book.");
        System.out.println("|4| Show all books.");
        System.out.println("|5| Show books list.");
        System.out.println("|6| Get demo books.");
        System.out.println("|q| Exit.");

        System.out.println("\nenter the number of choice: ");
    }

    void getTest() {
        books.get(0).getDescription();
        /*for(Book bk: books) {
            System.out.println("description:");
            bk.getDescription();
            System.out.println("\n----------------------------");
        }*/
    }

}
