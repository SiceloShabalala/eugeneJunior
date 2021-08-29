/**
 * @author: Sicelokuhle Siyabonga Shabalala
 * @date: 29/08/2021
 * 
 *  This is a program called eugenejunior.java that interacts with the user in a conversational manner by
    asking questions and responding appropriately. The program should make the following queries and
    responses:
    1. Ask the user for name and surname, and respond with a greeting that includes their initials.
    2. Ask for the current year and the user’s age, responding with their year of birth.
    3. Ask the user for their height in metres, and respond with the same in feet and inches.
    4. Tell the user that it’s going to calculate their ‘Star Wars name’.
        o Ask for their mother’s first name.
        o Ask for the name of the city closest to their place of birth.
        o Respond with their Star Wars name.
 */
import java.util.*;
public class eugenejunior
{
    //THis is the main method where execution of the program occurs
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, I am Eugene Junior.");
        System.out.println("What is your first name?");
        String name = scanner.nextLine();
        System.out.println("What is your last name?");
        String surname = scanner.nextLine();
        askUserName(name, surname);

        System.out.println("What year is this?");
        int year = scanner.nextInt();
        System.out.println("What age are you?");
        int age = scanner.nextInt();
        userDOB(age, year);

        System.out.println("How tall are you (metres)?");
        double height = scanner.nextDouble();
        heightMetresToInchesAndFeet(height);
        
        System.out.println("I'm going to tell you your Star Wars name.");
        System.out.println("What's your mother's first name?");
        String mamaName = scanner.next();
        System.out.println(mamaName);
        System.out.println("What's the name of the city nearest to your place of birth?");
        String city = scanner.next();
        starWarsName(name, surname, mamaName, city);
    }

    public static void askUserName(String userName, String userSurname)
    {
        System.out.println("Hi "+userName.substring(0,1).toUpperCase()+"."+userSurname.substring(0,1).toUpperCase()+".!");
    }

    public static void userDOB(int age, int currentYear)
    {
        int dob = currentYear - age;
        System.out.println("Okay, so you were born in "+dob+".");
    }

    public static void heightMetresToInchesAndFeet(double heightInMetres)
    {
        double metresToFeet = heightInMetres*3.281;
        String doubleAsString = String.valueOf(metresToFeet);
        int indexOfDecimal = doubleAsString.indexOf(".");
        String feetValue = doubleAsString.substring(0, indexOfDecimal);
        Double feetLower = Double.parseDouble(doubleAsString.substring(indexOfDecimal));

        String lowerFeetToInches = String.valueOf(feetLower*12);
        int indexOfDecimal1 = lowerFeetToInches.indexOf(".");

        System.out.println("That's "+feetValue+"'"+lowerFeetToInches.substring(0, indexOfDecimal1)+"\"");
    }

    public static void starWarsName(String name, String surname, String mamaName, String city)
    {
        String nameStarWars = surname.substring(0,3)+name.substring(0,2);
        String surnameStarWars = mamaName.substring(mamaName.length()-2)+city.substring(city.length()-3);
        System.out.println("Your Star Wars name is "+nameStarWars.substring(0,1).toUpperCase()+nameStarWars.substring(1).toLowerCase()+" "+surnameStarWars.substring(0,1).toUpperCase()+surnameStarWars.substring(1)+".");
    }
}