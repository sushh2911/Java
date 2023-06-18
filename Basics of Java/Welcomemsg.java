import java.lang.*;
import java.util.*;

class Welcomemsg
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name;
        System.out.println("Kindly enter your name! ");
        name = s.nextLine();
        System.out.println("Welcome Mr./Mrs."+ name +"!");

    }
}