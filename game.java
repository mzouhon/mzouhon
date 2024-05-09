import java.util.Scanner; 

/*The code begins by explaining to the user the premises of the
game, then asks the user a question to which they must respond
with either of two potential responses.If the user responds correctly
a point is added to their score and if not, no point is added. Their 
score is presented to them after they respond to each question. After
all questions have been answered, the user's final score is desplayed
 
*/

public class game {
public static void main (String[] args){

Scanner s = new Scanner(System.in);

//use of a double
double c=0;

//use of string
System.out.println("Welcome to Dickinson or Plath where you have to guess whether the line of poetry was written by Emily Dickinson or Sylvia Plath!");
System.out.println("\"I felt a Funeral, in my Brain,- And Mourners to and fro...\"");
System.out.println ("Dickinson or Plath? (1 pts)");

String a = s.next();
if (a.equals("Dickinson")) {

//use of integer and compound operator
c +=1;
System.out.println("Nice job!");
} else {
c=c;
System.out.println("Not quite.");
}
System.out.println( "Current Score: " + c);

System.out.println("\"After great pain, a formal feeling comes- The Nerves sit ceremonious, like Tombs...");
System.out.println("Dickinson or Plath? (1 pts)");

a = s.next();
if (a.equals("Dickinson")) {
c+=1;
System.out.println("You're on fire!");
} else {
c=c;
System.out.println("Nice try.");
}
System.out.println( "Current Score: " + c);

System.out.println("\"Dying- Is an art, like everything else.- I do it exceptionally well...");
System.out.println("Dickinson or Plath? (1 pts)");

a = s.next();
if (a.equals("Plath")) {
c+=1;
System.out.println("Fantastic!");
} else {
c=c;
System.out.println("So close.");
}
System.out.println( "Current Score: " + c);

System.out.println("\"Fail in an instant, no man did- Slipping- is Crashe's law");
System.out.println("Dickinson or Plath? (1 pts)");

a = s.next();
if (a.equals("Dickinson")) {
c+=1;
System.out.println("You rock!");
} else {
c=c;
System.out.println("Not quite.");
}
System.out.println( "Current Score: " + c);

System.out.println("\"Bit my pretty red heart in two.- I was ten when they buried you...");
System.out.println("Dickinson or Plath? (1 pts)");

a = s.next();
if (a.equals("Plath")) {
c+=1;
System.out.println("Excellent!");
} else {
c=c;
System.out.println("Nice try.");
}
System.out.println( "Current Score: " + c);

System.out.println("\"Out of the ash- I rise with my red hair- And I eat men like air");
System.out.println("Dickinson or Plath? (1 pts)");

a = s.next();
if (a.equals("Plath")) {
c+=1;
System.out.println("Nice job!");
} else {
c=c;
System.out.println("So close.");
}
System.out.println( "Final Score: " + c);

System.out.println( "Thanks for playing! How'd you do?");





}
}