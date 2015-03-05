package nyc.c4q.jvidals1;

/**
 * Created by s3a on 3/3/15.
 */

//Exercise


public class MoreVariablesAndPrinting {public static void main( String[] args )
{

    /*Sample
    String Name, Eyes, Teeth, Hair;
    int Age;
    double Height;
    double Weight;
    */


    //My Sample

    String Name, Eyes, Hair;

    int Age;
    double Height;
    double Weight;


    Name = "Zed A. Shaw";
    Age = 35;     // not a lie
    Height = 187.96;  // inches
    Weight = 180 * 2.2; // lbs
    Eyes = "Blue";
    String Teeth = "white";
    Hair = "Brown";


    System.out.println( "Let's talk about " + Name + "." );
    System.out.println( "He's " + Height + " centimeters tall." );
    System.out.println( "He's " + Weight + " kilos heavy." );
    System.out.println( "Actually, that's not too heavy." );
    System.out.println( "He's got " + Eyes + " eyes and " + Hair + " hair." );
    System.out.println( "His teeth are usually " + Teeth + " depending on the coffee." );

    // This line is tricky; try to get it exactly right.
    System.out.println( "If I add " + Age + ", " + Height + ", and " + Weight
            + " I get " +  (Age + Height + Weight) + "." );
    }
}
