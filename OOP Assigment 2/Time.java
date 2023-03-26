import java.util.Scanner;

public class Time {
    public static void main(String args[]){
       Scanner s=new Scanner(System.in);
       System.out.println("Please the time in Seconds : ");
       int timeInSeconds=s.nextInt();
        System.out.print(formatSeconds(timeInSeconds));
    }
    //From Seconds to Given Formate in the Method
public static String formatSeconds(int timeInSeconds)
{
    int hours = timeInSeconds / 3600;
    int secondsLeft = timeInSeconds - hours * 3600;
    int minutes = secondsLeft / 60;
    int seconds = secondsLeft - minutes * 60;

    String formattedTime = "";
    if (hours < 10)
        formattedTime += "0";
    formattedTime += hours + ":";

    if (minutes < 10)
        formattedTime += "0";
    formattedTime += minutes + ":";

    if (seconds < 10)
        formattedTime += "0";
    formattedTime += seconds ;

    return formattedTime;
}
//   public static void formatSeconds(Integer result){

//       System.out.print(String.format("%02d",result/3600)+":");
//       System.out.print(String.format("%02d",result/60%60)+":");
//       System.out.println(String.format("%02d",result%60));

//      }
}