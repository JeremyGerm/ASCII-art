import java.util.Scanner;

public class ASCIIart {
    
    public static void main(String[] args){

         System.out.println("Which do you like more, cats or dogs?");

         Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        if(input.equals("cats") || input.equals("cat")){
            System.out.println("Cat ASCII art here:");
        } else if(input.equals("dogs") || input.equals("dog")){
            System.out.println("Dog ASCII art here:");
        } else {
            System.out.println("You must choose between cats or dogs");
        }
    }
}