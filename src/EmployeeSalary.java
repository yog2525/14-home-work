public class EmployeeSalary {


    public static <TA> void main(String [] ars){
        int employeeId = 0025;
        String name = "Yogesh";
        double BasicSalary = 20000.00;
       double HRA = (BasicSalary*10/100);
       double DA = (BasicSalary*8/100);
       double TA = (BasicSalary*9/100);
        double PF = (BasicSalary*20/100);
        double GrossSalary = (BasicSalary+(HRA)+(DA)+(TA)-(PF));

       System.out.println( "Name:" + "Yogesh Patel");
        System.out.println( "EmployeeId:" + "0025");
        System.out.println( "Recived: HRA £" +HRA);
        System.out.println( "Recived: DA £" +DA);
        System.out.println( "Recived: TA £" +TA);
        System.out.println( "Deducted: PF £" +PF);
        System.out.println( "Recived Gross Pay of £" +GrossSalary);















    }
}



