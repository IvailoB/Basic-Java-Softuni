package ConStatAdvancedExe;

import java.util.Scanner;

public class onTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ExamHour = Integer.parseInt(scanner.nextLine());
        int ExamMin = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMin = Integer.parseInt(scanner.nextLine());

        int ExamTime = ExamHour * 60 + ExamMin;
        int arriveTime = arriveHour*60 + arriveMin;

        String output = "";
        String output2 = "";
        int difference = 0;

        if (arriveTime < ExamTime - 30){
            output = "Early";
            difference = ExamTime - arriveTime;
            if(difference < 60){
                output2 = String.format("%d minutes before the start",difference);
            }else {
                int hour = difference /60;
                int min = difference % 60;
                output2 = String.format("%d:%02d hours before the start",hour , min);
            }

        }else if (arriveTime <= ExamTime){
            output = "On Time";
            difference = ExamTime - arriveTime;
            output2 = String.format("%d minutes before the start", difference);

        }else if (arriveTime > ExamTime){
            output = "Late";
            difference = arriveTime - ExamTime;
            if (difference<60){
                output2 = String.format("%d minutes after the start",difference);
            }
        }else {
            int hour = difference /60;
            int min = difference % 60;
            output2 = String.format("%d:%02d hours after the start" , hour , min);
        }
        System.out.println(output);
        System.out.println(output2);
    }
}