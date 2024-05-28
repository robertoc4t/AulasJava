package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;

    private Departament departament;
    private List<HourContract> contracts = new ArrayList<>();


    public Worker(String workName, String s, String workBaseSalary, Departament departament){
    }

    public Worker(String name, WorkerLevel level, double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract){
        this.contracts.add(contract);
    }
    public void removeContract(HourContract contract){
        this.contracts.remove(contract);
    }

    public double income(int year, int month){
        double sum = this.baseSalary;
        Calendar cal = Calendar.getInstance();
        for(HourContract c: contracts){
            cal.setTime(c.getDate());
            int cYear = cal.get(Calendar.YEAR);
            int cMonth = 1 + cal.get(Calendar.MONTH);
            if (year == cYear && month == cMonth){
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
