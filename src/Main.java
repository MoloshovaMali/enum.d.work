import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String soz = sc.nextLine();
        Day day= Day.valueOf(soz.toUpperCase());
        switch (day) {
            case MONDAY -> System.out.println("Дуйшомбу куну техникалык сабак болот");
            case TUESDAY -> System.out.println("Шейшемби куну англис тил сабагы жана практика сабагы болот");
            case WEDNESDAY-> System.out.println("Шаршемби куну техникалык сабак болот");
            case THURSDAY-> System.out.println("Бейшемби куну практика сабагы болот");
            case FRIDAY -> System.out.println("Жума куну техникалык сабак болот");
            case SATURDAY-> System.out.println("Ишемби куну практика сабагы болот");
            case SUNDAY -> System.out.println(" Жекшемби куну сабак болбойт");

        }
    }
}