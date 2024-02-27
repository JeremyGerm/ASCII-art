import java.util.Scanner;

public class ASCIIart {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

       
        while(true){
            System.out.println("Which do you like more, cats, dogs or fish?");
            String input = scan.nextLine();

            if(input.equalsIgnoreCase("cats") || input.equalsIgnoreCase("cat")){
                System.out.println("Cat ASCII art here: \n /\\_/\\\r\n" + //
                                        "( o.o )\r\n" + //
                                        " > ^ <");
                break;
            } else if(input.equalsIgnoreCase("dogs") || input.equalsIgnoreCase("dog")){
                System.out.println("Dog ASCII art here:  \n  __      _\r\n" + //
                                        "o'')}____//\r\n" + //
                                        " `_/      )\r\n" + //
                                        " (_(_/-(_/");
                break;
            } else if(input.equalsIgnoreCase("fish")){
                System.out.println("Dog ASCII art here:\n     |\\    o\r\n" + //
                                            "    |  \\    o\r\n" + //
                                            "|\\ /    .\\ o\r\n" + //
                                            "| |       (\r\n" + //
                                            "|/ \\     /\r\n" + //
                                            "    |  /\r\n" + //
                                            "     |/");
                break;
            } else {
                System.out.println("You must choose between cats or dogs");
            }
        }
    }
}