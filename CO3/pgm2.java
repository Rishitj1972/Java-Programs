//Method Overriding concept with inheritance to retrieve the salary from parent class using super keyword.

import java.util.*;

class Employee {
    int salary;

    Employee(int salary) {
        this.salary = salary;
    }

    int calculateSalary() {
        return salary;
    }
}

class Manager extends Employee {
    int bonus;

    Manager(int salary, int bonus) {
        super(salary);
        this.bonus = bonus;
    }

    int calculateSalary() {
        return salary + bonus;
    }
}

class Programmer extends Employee {
    int reward;

    Programmer(int salary, int reward) {
        super(salary);
        this.reward = reward;
    }

    @Override
    int calculateSalary() {
        return salary + reward;
    }
}

public class pgm2 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        
        System.out.print("Enter Manager salary: ");
        int mSalary = ob.nextInt();
        System.out.print("Enter Manager bonus: ");
        int mBonus = ob.nextInt();
        Manager m = new Manager(mSalary, mBonus);
        System.out.println("Manager Salary: " + m.calculateSalary());

        
        System.out.print("\nEnter Programmer salary: ");
        int pSalary = ob.nextInt();
        System.out.print("Enter Programmer reward: ");
        int pReward = ob.nextInt();
        Programmer p = new Programmer(pSalary, pReward);
        System.out.println("Programmer Salary: " + p.calculateSalary());

        ob.close();
    }
}
