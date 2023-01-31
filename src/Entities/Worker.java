package Entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Entities.enums.WorkerLevel;

public class Worker {
    
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    
    private Departament department;
    private List<HoursContrats> contracts = new ArrayList<>();

    public Worker(){
        
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public Departament getDepartment() {
        return department;
    }

    public List<HoursContrats> getContracts() {
        return contracts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setDepartment(Departament department) {
        this.department = department;
    }

    public void addContract (HoursContrats contract ){
contracts.add(contract);

    } 

public void removeContract(HoursContrats contract){

    contracts.remove(contract);
}

public double income (int year, int month){

double sum = baseSalary;
Calendar cal = Calendar.getInstance();
for (HoursContrats c : contracts){
    cal.setTime(c.getDate());

int c_year = cal.get(Calendar.YEAR);
int c_month = 1 + cal.get(Calendar.MONTH);
    if(year == c_year && month == c_month ) {
        sum += c.totalValue();
    }
}


return sum;
}

}
