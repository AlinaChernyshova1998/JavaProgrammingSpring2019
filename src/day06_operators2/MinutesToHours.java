package day06_operators2;

public class MinutesToHours {
public static void main(String[] args) {
int minutes=67;
int hours=minutes/60;
int remainingMinutes= minutes%60;
System.out.println(hours);
System.out.println(remainingMinutes);

// print n hours and nn minutes
System.out.println(hours + " hours and " +remainingMinutes+" minutes");

}
}
