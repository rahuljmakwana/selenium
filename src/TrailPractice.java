public class TrailPractice {

    //no return type with parameter
    public void subtraction(int a, int b){

        System.out.println( a-b);
    }

    //addition method
    public void addition (int a, int b ){

        System.out.println ( a+b );
    }

    // Multiplications method
    public static void multiplication(int a, int b){

        System.out.println( a*b);
    }

    //Division method
    public static void division(int a, int b ){

        System.out.println(a/b);

    }

    public static void main(String[] args) {

        //object for Non static method
        TrailPractice tp = new TrailPractice();

        tp.subtraction(12, 11);

        tp.addition(10, 30);

        multiplication( 5, 6);

        division(9,3   );




     }


}


class Practice {

      static int a =100;
      static int b =50;

      public static void addition(){

        System.out.println(a+b);


    }

    public static void substraction (){

          System.out.println(a-b);

    }

    public static void multiply(){

        System.out.println(a*b);

    }

    public static void division(){

        System.out.println(a/b);


    }
    public static void main(String[] args) {

        addition();

        substraction();

        multiply();

        division();
    }

}

class Practice2{

    int a = 9;
    int b = 78;

    float total = 0;



    //no return type no parameter
    public void addition(){

         System.out.println( total = a+b);

    }

     public void substraction(){

         System.out.println(a-b);

     }

     public void multiply(){

         System.out.println(a*b);

     }
      public void division(){

          System.out.println( total = a/b);

      }


    public static void main(String[] args) {

        Practice2 maths = new Practice2();

        maths.addition();
        maths.substraction();
        maths.multiply();
        maths.division();



    }




}
