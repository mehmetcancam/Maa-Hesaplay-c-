package MaaşHesaplayıcısı;

public class Employee {

    String name;
    double salary;
    int workhours;
    int hireYear;
    double vergi;
    int bonus;
    double salar;
    Employee(String name, double salary, int workhours, int hireYear){
        this.name= name;
        this.salary=salary;
        this.workhours=workhours;
        this.hireYear=hireYear;
    }
    void tax(){
        if (this.salary>1000){
            double tax = this.salary*0.03;
            vergi = tax;
            System.out.println("Vergi: "+ tax);
        }else {

            System.out.println("Vergi: 0");
        }
    }
    void bonus(){
        int extra,kalan;
        if(this.workhours>40){
            kalan= this.workhours-40;
            extra=kalan*30;
            bonus= extra;
            System.out.println("Bonus: "+extra);
        }else{extra =0;
            System.out.println("Bonus: "+extra);
        }

    }
    void raiseSalary(){
        double salaryRise;
        if (2021-this.hireYear<10){
            salaryRise = 0.05*this.salary;
            salar=salaryRise;
            System.out.println("Salary Rise: "+salaryRise);
        }if (2021-this.hireYear<20 && 2021-this.hireYear>10){
            salaryRise = 0.1*this.salary;
            salar=salaryRise;
            System.out.println("Salary Rise: "+salaryRise);
        }if (2021-this.hireYear > 19){
            salaryRise = 0.15 * this.salary;
            salar = salaryRise;
            System.out.println("Salary Rise: "+salaryRise);
        }

    }
    void newSalary(){
        double newSalary= bonus+salary-vergi;
        System.out.println("Vergi ve Bonuslar ile birlikte maas: "+ newSalary);
    }
    void toplamMaas(){
        double maas = salar+ salary;
        System.out.println("Toplam Maas: "+maas);
    }
    void print(){
        System.out.println("Adi: "+name);
        System.out.println("Maasi: "+salary);
        System.out.println("Calisma saati: "+workhours);
        System.out.println("Baslangic yili: "+hireYear);
        tax();
        bonus();
        raiseSalary();
        newSalary();
        toplamMaas();

    }

}
