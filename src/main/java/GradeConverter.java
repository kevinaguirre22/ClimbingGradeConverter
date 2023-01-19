import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Map<String, String> boulderingGrades = new HashMap<>();
        boulderingGrades.put("V0", "4");
        boulderingGrades.put("V1", "5");
        boulderingGrades.put("V2", "5+");
        boulderingGrades.put("V3", "6A or 6A+");
        boulderingGrades.put("V4", "6B or 6B+");
        boulderingGrades.put("V5", "6C or 6C+");
        boulderingGrades.put("V6", "7A+");
        boulderingGrades.put("V7", "7B");
        boulderingGrades.put("V8", "7B or 7B+");
        boulderingGrades.put("V9", "7C");
        boulderingGrades.put("V10", "7C+");
        boulderingGrades.put("V11", "8A");
        boulderingGrades.put("V12", "8A+");
        boulderingGrades.put("V13", "8B");
        boulderingGrades.put("V14", "8B+");
        boulderingGrades.put("V15", "8C");
        boulderingGrades.put("V16", "8C+");
        boulderingGrades.put("V17", "9A");

        OutputToUser.getTheDate();
        OutputToUser.displayWelcomeBanner();
        System.out.println("Press Enter to Continue");
        String wait = input.nextLine();
        //OutputToUser.presentMapOfAllBoulderingGrades(boulderingGrades);
        //OutputToUser.questionTheirKnowledge();
        OutputToUser.askForInput();
        String userAnswer = input.nextLine();
        OutputToUser.askUserForGrade();
        String grade = input.nextLine();
        for(Map.Entry <String, String> currentKey : boulderingGrades.entrySet()){
            if (userAnswer.equals("1")){
                if(grade.equals(currentKey.getKey())){
                    System.out.println(grade + " is a " + currentKey.getValue() + " in the Fontainebleau Scale." );
                }
            } else if(userAnswer.equals("2")){
                if(grade.equals(currentKey.getValue())){
                    System.out.println(grade + " is a " + currentKey.getKey() + " in the V-Scale.");
                }
            }
        }
        //OutputToUser.displayPromptToUser();
        //create method where if V3, V4, v5, v6, or v8 is chosen, then display message that says that there is some
        //overlap in the scales
    }
}
