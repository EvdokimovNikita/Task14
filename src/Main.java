import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {
    /*14) ты вводишь на клавиатуре дату рождения в формате “14.02.1956” а программа пишет - сколько тебе лет*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String youBirthday = scanner.nextLine();
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate startDate = LocalDate.parse(youBirthday, formatter);
        Period period = Period.between(startDate, currentDate);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}