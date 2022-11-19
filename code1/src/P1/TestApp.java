package P1;
import P1.EmpAddress;

import java.util.*;

class Employee implements Comparable<Employee> {
    private String empName;
    private int empId;
    private double empSalary;
    private List<EmpAddress> empAdd;

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                ", empSalary=" + empSalary +
                ", empAdd=" + empAdd +
                '}';
    }

    public String getEmpName() {

        return empName;
    }

    public Employee() {

        super();
    }

    public Employee(String empName, int empId, double empSalary, List<EmpAddress> empAdd) {
        super();
        this.empName = empName;
        this.empId = empId;
        this.empSalary = empSalary;
        this.empAdd = empAdd;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {

        this.empId = empId;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public List<EmpAddress> getEmpAdd() {
        return empAdd;
    }

    public void setEmpAdd(List<EmpAddress> empAdd) {
        this.empAdd = empAdd;
    }

    @Override
    public int compareTo(Employee o) {
        return (int) (this.getEmpSalary() - o.getEmpSalary());
    }
}
class EmpNameSort implements Comparator<Employee>
{

    @Override
    public int compare(Employee o1, Employee o2) {

        return o1.getEmpName().compareTo(o2.getEmpName());
    }
}

class EmpIdSort implements Comparator<Employee>
{

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getEmpId() < o2.getEmpId()) {
            return -1;
        } else if (o1.getEmpId() > o2.getEmpId()) {
            return 1;
        } else {
            return 0;
        }
    }

}
public class TestApp {
    public static void main(String[] args) {
        ArrayList<Employee> e = new ArrayList<>();
        e.add(new Employee("Pallabi Mazumder", 25, 50000.0, Arrays.asList(new EmpAddress(432, "DumDum", "kolkata", "WestBengal", 700030))));
        e.add(new Employee("Sudipta Patra", 9, 60000.0, Arrays.asList(new EmpAddress(433, "London Street Bistro", "Nichitput", "Jharkhand", 700089))));
        e.add(new Employee("Debdipta Chakraborty", 14, 70000.0, Arrays.asList(new EmpAddress(434, "AjayNagar", "kolkata", "WestBengal", 700075))));
        e.add(new Employee("Subhadeep Basack", 18, 80000.0, Arrays.asList(new EmpAddress(435, "PatiPukur", "kolkata", "WestBengal", 700002))));

        System.out.println("Collection of Employees before performing any sorting algorithm");
        for (Employee temp : e) {
            System.out.println(temp.getEmpName() + " " + temp.getEmpId() + " " + temp.getEmpSalary() + " " + temp.getEmpAdd());
        }

        System.out.println();

        System.out.println("Collection of Employees after performing sorting algorithm on the basis of employee salary using comparable");
        Collections.sort(e);
        for (Employee temp : e) {
            System.out.println(temp.getEmpName() + " " + temp.getEmpId() + " " + temp.getEmpSalary() + " " + temp.getEmpAdd());
        }

        System.out.println();

        System.out.println("Collection of Employees after performing sorting algorithm on the basis of employee name using comparator");
        EmpNameSort nameSort = new EmpNameSort();
        Collections.sort(e, nameSort);
        for (Employee temp : e) {
            System.out.println(temp.getEmpName() + " " + temp.getEmpId() + " " + temp.getEmpSalary() + " " + temp.getEmpAdd());
        }

        System.out.println();

        System.out.println("Collection of Employees after performing sorting algorithm on the basis of employee ID using comparator");
        EmpIdSort idSort = new EmpIdSort();
        Collections.sort(e, idSort);
        for (Employee temp : e) {
            System.out.println(temp.getEmpName() + " " + temp.getEmpId() + " " + temp.getEmpSalary() + " " + temp.getEmpAdd());
        }

    }
}




