package OOP1;

public class EmployeOOP {

        int empId;
        String empName;
        int empAge;

  //method to display the details
        void displayDetails( ) {
            System.out.println("Emp.loyee ID: " + empId);
            System.out.println("Employee Name: " + empName);
            System.out.println("Employee Age: " + empAge);
        }
//Constractor to initialize the Objects
        EmployeOOP(int empId,int empAge,String empName) {/*constractor:a method same name as class name used
            initialize objects*/
            this.empId=empId;
            this.empName = empName;
            this.empAge = empAge;
        }
}
