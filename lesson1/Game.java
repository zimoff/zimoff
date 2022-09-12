public class Game {

    public static void main(String[] args) {
        int num = 23;

        for (int i = 1; i <= 100;) {
            if (i < num) {
                System.out.println("пробуй больше! " + i);
                i += 10;
            } else if (i > num) {
                System.out.println("пробуй меньше! " + i);
                i -= 2;
            } else break;
        }
        System.out.println("ой всё,ты выйгиал!");
    }
}
