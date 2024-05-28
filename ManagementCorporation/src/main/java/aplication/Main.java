package aplication;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import jdk.internal.access.JavaNetHttpCookieAccess;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args, JavaNetHttpCookieAccess sdf) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Entre com o nome do departamento: ");
        String departamentName = leitor.nextLine();
        System.out.println("Entre com os dados do trabalhador:");
        System.out.print("Name: ");
        String workName = leitor.nextLine();
        System.out.print("Level: ");
        String workLevel = leitor.nextLine();
        System.out.print("baseSalary: ");
        String workBaseSalary = leitor.nextLine();
        Departament departament = new Departament(departamentName);

        Worker worker = new Worker(workName, workLevel.valueOf(workLevel), workBaseSalary, departament);

        System.out.print("Quantos contratos esse trabalhador tem?");
        int numberContracts = Integer.parseInt(leitor.nextLine());

        for (int i=0; i<=numberContracts; i++){
            System.out.println("Enter contract #"+numberContracts+"data:");
            System.out.print("date (DD/MM/YYYY)");
            Date contractDate = (Date) sdf.parse(leitor.next());
            System.out.print("Valor por hora: ");
            double valuePerHour = Double.parseDouble(leitor.nextLine());
            System.out.print("Duração (Horas): ");
            int hours = Integer.parseInt(leitor.nextLine());
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Entre com o mês e ano para calcular a renda (MM/YYYY): ");
        String monthAndYear = leitor.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("nome " + worker.getName());
        System.out.println("Departamento " + worker.getDepartament().getName());
        System.out.print("Renda De " + monthAndYear + " : " + String.format("%2f", worker.income(year, month)));

    leitor.close();

    }

}