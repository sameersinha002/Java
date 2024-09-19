import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

class Employee {
    private int empNo;
    private String empName;
    private int empBasic;

    Employee(int empNo, String empName, int empBasic) {
        this.empNo = empNo;
        this.empName = empName;
        this.empBasic = empBasic;
    }

    int getNo() {
        return empNo;
    }

    String getName() {
        return empName;
    }

    int getBasic() {
        return empBasic;
    }

    @Override
    public String toString() {
        return "No. " + empNo + "\nName: " + empName + "\nSalary: " + empBasic + "\n";
    }
}

public class WriteEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empNo = sc.nextInt();
        String empName = sc.next();
        int empBasic = sc.nextInt();
        Employee emp = new Employee(empNo, empName, empBasic);
        try {
            File f = new File("./emp.txt");
            FileOutputStream fos = new FileOutputStream(f);
            char charArr[] = emp.toString().toCharArray();
            for (char c : charArr)
                fos.write(c);

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
