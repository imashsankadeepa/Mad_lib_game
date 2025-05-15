import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        String adjective;
        String noun1;
        String adjective2;
        String adjective3;
        String verb1;

        System.out.print("Enter an adjective(description) :");
        adjective=scn.nextLine();

        System.out.print("Enter the Noun (animal or person) :");
        noun1 = scn.nextLine();

        System.out.print("Enter the adjective (description) :");
        adjective2=scn.nextLine();

        System.out.print("Enter a verb end with -ing (action):");
        verb1 =scn.nextLine();

        System.out.print("Enter the adjective (description) :");
        adjective3 = scn.nextLine();


        System.out.println("\n today i went to a" + adjective + "zoo.");
        System.out.println("In a exhibit, I saw a "+ noun1 +".");
        System.out.println(noun1 +"Was" + adjective2 + "and" + verb1 + "!");
        System.out.println("i was" + adjective3 + "!");



        scn.close();
    }
}
