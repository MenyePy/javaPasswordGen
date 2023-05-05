import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        //Password generator test
        //generate a completely random string that ranges from 8-24 characters in length.
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int length = 0;
        int level = 0;
        ArrayList password = new ArrayList();
        System.out.println("Enter desired password length (min: 8)");
        length = input.nextInt();
        System.out.println("Enter encryption level (1-3). ***Note: level 2 and 3 may not be supported on all platforms.");
        level = input.nextInt();
        if (length >= 8) {
            if (level == 1) {
                for (int i = 0; i < length; i++) {
                    char x = (char) rand.nextInt(33, 126);
                    password.add(x);
                }
            } else if (level == 2) {
                for (int i = 0; i < length; i++) {
                    char x = (char) rand.nextInt(33, 126);
                    char y = (char) rand.nextInt(161, 255);
                    boolean z = rand.nextBoolean();
                    if(z) {
                        password.add(x);
                    } else {
                        password.add(y);
                    }
                }
            } else if (level == 3) {
                for (int i = 0; i < length; i++) {
                    char x = (char) rand.nextInt(33, 126);
                    char y = (char) rand.nextInt(161, 526);
                    boolean z = rand.nextBoolean();
                    if(z) {
                        password.add(x);
                    } else {
                        password.add(y);
                    }
                }
            } else {
                System.out.println("We are not that far into the future yet.");
            }
        }
        System.out.println("Your password is: ");
        for(int i = 0; i < password.size(); i++){
            System.out.print(password.get(i));
        }
    }
}