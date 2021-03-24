

public class SalaryAndCommission {
    public static void main(String[] args) {
    int salesID = 9025;
    String sellerName = "Dan Jones";
    double SalesAmount = 45000;
    double BasicSalary = 50000;
    double SalesCommission1 = SalesAmount*35/100; // commission by 35%//
    double SalesCommission2 = SalesAmount*20/100; // commission by 20%//
    double SalesCommission3 = SalesAmount*10/100; // commission by 10%//
    double SalesCommission4 = SalesAmount*5/100;  // commission by 5%//
    double SalesCommission5 = SalesAmount*2/100;  // commission by 2%//
    System.out.println ( "Name: Dan Jones");
    System.out.println( "SalesID: 9025");
    System.out.println( "Basic Salary: £ 50000");

    if (SalesAmount>=50000){
        System.out.println( "Sales Commission: £" + SalesCommission1);
        System.out.println( "Sales Commission: £" + (BasicSalary+SalesCommission1));   }
    else if( SalesAmount>=30000 && SalesAmount<=50000){
        System.out.println( "Sales Commission: £" + SalesCommission2);
        System.out.println( "Sales Commission: £" + (BasicSalary+SalesCommission2));    }
     else if( SalesAmount>=20000 && SalesAmount<=30000){
        System.out.println( "Sales Commission: £" + SalesCommission3);
        System.out.println( "Sales Commission: £" + (BasicSalary+SalesCommission3));    }
     else if( SalesAmount>=10000 && SalesAmount<=20000){
        System.out.println( "Sales Commission: £" + SalesCommission4);
        System.out.println( "Sales Commission: £" + (BasicSalary+SalesCommission4));    }
     else if ( SalesAmount<=10000 && SalesAmount>=10000){
        System.out.println( "Sales Commission: £" + SalesCommission5);
        System.out.println( "Sales Commission: £" + (BasicSalary+SalesCommission5));    }

}}




