package Application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.Departament;
import Entities.HoursContrats;
import Entities.Worker;
import Entities.enums.WorkerLevel;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");


        System.out.print("Enter with department's name: ");
        String departmentName = sc.nextLine();

        System.out.print("Enter with Worker data: ");

        System.out.print("name: ");
        String workerName = sc.nextLine();

        System.out.print("Level: ");
        String workerLevel = sc.nextLine();

        System.out.print("Base Salary: ");
        Double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departmentName));

        System.out.print("how many contracts to this worker: ");
        int contractsQuantities = sc.nextInt();

      
        int n = sc.nextInt();
        for (int i=1; i<= n ; i++ ){

            System.out.print("Enter contract n° " + i + "data: " );
            System.out.print("Date (DD/MM/YYY)");
            Date contractDate = sdf.parse(sc.next());
            
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            System.out.print("Duration (hours)");
            int hours = sc.nextInt();

            HoursContrats contratc = new HoursContrats(contractDate, baseSalary, hours);





        }

    








        sc.close();


    }
}
