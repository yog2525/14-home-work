
// Student Grade//
public class Student {

        String name = "Yogesh Patel";
        String number = "0005";
        String marks;
        static int a = 65; // Marks of Maths//
        static int b = 30; // Marks of English//
        static int c = 68; // Marks of History//
        static int total = a + b + c;
        double percentage = (total / 300.00) * 100; // % of 3 subjects//
            public static void main(String[] args){
                System.out.println( "Name:" + "Yogesh Patel");
                System.out.println( "Roll Numbers:" + "0005");
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(total);
                int percentage=35;

        if (percentage>=80){
            System.out.println("Pass A+");
        }
        else if (percentage>=60){
            System.out.println("Pass A");
        }
        else if (percentage>=50){
            System.out.println( "Pass B");
        }
        else if (percentage>=35){
            System.out.println("Pass C");
        }



    }


    }

