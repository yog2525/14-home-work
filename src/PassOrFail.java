// Pass or Fail according to subject marks//

public class PassOrFail {

        String name = "Yogesh Patel";
        String number = "0005";
        String marks;
        static int Maths = 65;
        static int  English= 40;
        static int History = 68;
        public static void main(String[] args) {
            System.out.println("Name:" + "Yogesh Patel");
            System.out.println("Roll Numbers:" + "0005");

            if (Maths >= 35 && English >= 35 && History >= 35)     {
                System.out.println("Pass");
            }
            else  {
                System.out.println("Fail");   }
        }}