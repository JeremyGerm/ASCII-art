import java.util.Scanner;

public class ASCIIart {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

       
        while(true){
            System.out.println("Which do you like more, cats or dogs?");
            String input = scan.nextLine();

            if(input.equalsIgnoreCase("cats") || input.equalsIgnoreCase("cat")){
                System.out.println("Cat ASCII art here:");
                break;
            } else if(input.equalsIgnoreCase("dogs") || input.equalsIgnoreCase("dog")){
                System.out.println("Dog ASCII art here:");
                break;
            } else {
                System.out.println("You must choose between cats or dogs");
            }
        }
    }
}