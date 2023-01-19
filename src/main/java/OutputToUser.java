import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class OutputToUser {


    public static void displayWelcomeBanner(){
        System.out.println();
        System.out.println("\tWelcome to my Climbing Grade Converter!");
        System.out.println();
    }

    public static void questionTheirKnowledge(){
        System.out.println("Quick! What's 7C using the V-Scale?");
    }

    public static void displayPromptToUser(){
        System.out.println("Ever find it hard to convert between YDS and French grading systems?\n");
        System.out.println("Think it's annoying when you're watching Jimmy Webb on the YouTubes \n" +
                            "cruising some boulder in the Swizzy Alp and they use the Font scale???");
    }

    public static void askForInput(){
        System.out.println("Press (1) if you want to convert from V-Scale to Fontainebleau Scale\n" +
                "Press (2) if you want to convert from Fontainebleau Scale to V-Scale");
    }

    public static void askUserForGrade(){
        System.out.print("Enter the grade: ");
    }

    public static void getTheDate(){
        System.out.println();
        LocalDate date = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_TIME;
        String timeFormatted = time.format(formatter);
        System.out.println("\tToday's date is: " + date + ".\n\tIt is currently: " + timeFormatted);

    }

    public static void presentMapOfAllBoulderingGrades(Map<String, String> boulderingGrades) {
        System.out.println("The following is what the V-Scale bouldering grading system looks like: ");
        for (Map.Entry<String, String> currentVGrade : boulderingGrades.entrySet()) {
            System.out.println(currentVGrade.getKey());
        }
        System.out.println("The following is what the Fontainebleau bouldering grading system looks like: ");
        for (Map.Entry<String, String> currentFontGrade : boulderingGrades.entrySet()) {
            System.out.println(currentFontGrade.getValue());
        }
    }
}
