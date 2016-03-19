// ------------------------------------------------------------------/
// Program  allows user to input actor's details 
// such as actor's name,address,age and movies that they starred in
// until the user does not wish to enter any more or all are entered.
//  The program  will then display of all the actor's inputed names,details and movie history
// -  each of the actor's separately.
// e.g. Jack Nicholson who's 74 and lives in Miami, "Wolf","As good as it gets","One
// flew over the cuckoo's nest
// 		Robin Williams 60 who lives in Pittsburgh,"Hook","What dreams may come","Patch Adams"
// ------------------------------------------------------------------/
package thirdjava;

/**
 *
 * @author Pio O'Connell
 */
import java.util.*;

import java.util.ArrayList;

public class MovieCatalog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> films = new ArrayList<String>(); //
        ArrayList<films> film = new ArrayList<films>(); //Temporary buffer to read in the movies for an actor
        ArrayList<actors> actor = new ArrayList<actors>(); // Main structure that contains all the actor details
        films test;
        String tempName, tempAddress; // temporary varibles to hold the names,addresses
        String tempAge; // tempory veriable to hold the age
        int tempAge1 = 0 /*,nmrActors=0 */; // tempory variable to hold the converted String from io
        Boolean numeric = true; // whether io numerical
        actors tempactor; // temporary variable to hold the actor
        char input;
        Boolean actorfinished = false; // set to false whilst continuing to read new actors

        do {
            System.out.println("------------------------------------");
            System.out.println("Actor's movie catalog system");
            System.out.println("Add/View/Delete actor's film history :");
            System.out.println("------------------------------------");

            System.out.println("Enter Actor's Name:(e.g. John Wayne) ");
            tempName = keyboard.nextLine();
            System.out.println("Enter Actor's Address:");
            tempAddress = keyboard.nextLine();
            System.out.println("Enter Actor's age :");
            tempAge = keyboard.nextLine();
            try {
                tempAge1 = Integer.parseInt(tempAge);
            } catch (NumberFormatException e) {
                //Will Throw exception!
                //do something! anything to handle the exception.
                numeric = false;

                System.out.print("Invalid -- no records will be added");
            }
            /*	if(numeric){
				nmrActors++;		
			}*/

//			String code=" ";
            String temp = " ";
            Boolean moviefinished = false;

            do {
                System.out.println("Please enter Movie Name into  " + tempName + " 's Catalog  :");

                // reads the movie name from input
                temp = keyboard.nextLine();
                // adds to film
                films.add(temp);
                // create new film structure and add to film array
                test = new films(temp);
                film.add(test);

                // display the details entered
                System.out.println(film);
                System.out.println("Enter another('y'/'n')  :");
                input = keyboard.next().trim().charAt(0);
                if (input == 'y') {
//					code = " ";
                    moviefinished = false;
                    keyboard.nextLine(); // to fflush() the buffer	
                } else if (input == 'n') {
                    moviefinished = true;
                } else {
                    System.out.println("Invalid input");
                    moviefinished = true;
                }
            } while (!moviefinished);

            // create new actor instance and add to the actor array
            tempactor = new actors(tempName, tempAddress, tempAge1, film);
            //allocate new memory for new film instance,last memory now part of previous actors
            film = new ArrayList<films>();
            actor.add(tempactor);
            System.out.println(" Movie stars with their movies entered into temporary database");
            System.out.println(actor);

            System.out.println("Enter another actor's details('y'/'n')  :");
            input = keyboard.next().trim().charAt(0);
            if (input == 'y') {
//			code = " ";
                actorfinished = false;
                keyboard.nextLine(); // to fflush() the buffer	
            } else if (input == 'n') {
                actorfinished = true;
            } else {
                System.out.println("Invalid input -- try again");
                actorfinished = false;
            }

        } while (!actorfinished);
        System.out.println(" Movie stars with their movies entered into temporary database");
        System.out.println(actor);
        System.out.println("Goodbye  -u have terminated peacefully");
    }
}
