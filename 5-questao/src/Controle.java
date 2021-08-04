import java.util.Scanner;

public class Controle {

    public String leString(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an String");
        String mystr = keyboard.next();
        return  mystr;
    }

    public int leInt(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");
        int mystring = keyboard.nextInt();
        return mystring;
    }

}
