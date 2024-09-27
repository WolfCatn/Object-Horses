//Created my Naomi Johnson
//for CTE Software Development Class 2024
//Instructor: Kim Gross

public class Horse {
    //Setting up variables:
    String name; //current name of the horse
    int birthYear; //what year the horse was born
    String prevNames; //previous names of the horses (if there are any)

    public Horse(String horseName, int year) { //the horse constructor for the name and birth year
        this.name = horseName;
        this.birthYear = year;
    }
    
    //the command to print the name and birth year of the horse:
    public String toString() {
        return "The horse " + this.name + " was born in the year " + this.birthYear;
    }

    public static void main(String[] args) { 
        //uses the horse object for a few different horses
        Horse spice = new Horse("Spice", 2002);
        Horse nick = new Horse("Nick",2008);
        Horse misty = new Horse("Misty", 2013);

        //print the name and birth year of each horse
        System.out.println(spice.toString());
        System.out.println(nick.toString());
        System.out.println(misty.toString());
    }
}
