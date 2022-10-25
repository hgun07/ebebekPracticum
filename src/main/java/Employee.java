public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double raise;
    double raisedSalary;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return (salary / 100 * 3);
        }
    }

    double bonus() {
        if (workHours > 40) {
            return ((workHours - 40) * 30);
        } else return 0;
    }

    void raiseSalary() {
        if (2021 - hireYear < 10) {
            raise = salary / 100 * 5;
        } else if (2021 - hireYear > 9 && 2021 - hireYear < 20) {
            raise = salary / 100 * 10;
        } else {
            raise = salary / 100 * 15;
        }
        raisedSalary = salary + raise + bonus() - tax();
    }

    public String toString() {
        return (name + " " + salary + " " + workHours + " " + hireYear);
    }

    public static void main(String args[]) {


        Employee a = new Employee("mustafa", 3000, 45, 1984);

        System.out.print("Adı : ");
        System.out.println(a.name);
        System.out.print("Maaşı : ");
        System.out.println(a.salary);
        System.out.print("Çalışma Saati : ");
        System.out.println(a.workHours);
        System.out.print("Başlangıç Yılı : ");
        System.out.println(a.hireYear);
        System.out.print("Vergi : ");
        System.out.println(a.tax());
        System.out.print("Bonus : ");
        System.out.println(a.bonus());
        System.out.print("Maaş Artışı : ");
        a.raiseSalary();
        System.out.println(a.raise);
        System.out.print("Vergi ve Bonuslar ile Birlikte maaş : ");
        System.out.println(a.salary + a.bonus() - a.tax());
        System.out.print("Toplam maas : ");
        System.out.println(a.raisedSalary);


    }
}

