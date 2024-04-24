import Frame.mainFrame;
import login.LogIn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome....-1 to quit");
        System.out.println("1:login");
        System.out.println("2:signup");
        Scanner scanner = new Scanner(System.in);
        int response;
        mainFrame frame = new mainFrame();
        LogIn login = new LogIn(frame);
        do {
            response=scanner.nextInt();
            if(response ==1);

        }while(response !=-1);
    }
}