import java.util.Scanner;

public class KeysInput {
    public static void main(String[] args){
        System.out.println("Please enter your name: ");
        String name;
        Scanner scanner = new Scanner(System.in);
        name=scanner.next();


        System.out.println("You name is "+ name);
    }
}
