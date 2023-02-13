public class Homework_1 {
    public static void main(String[] agrs) {
        int a = 333;

        //16 -> 10
        System.out.println(333 * 10);    //3330
        System.out.println(333 % 10);   //3
        System.out.println();

        System.out.println(3330 * 10);  //33300
        System.out.println(3330 % 10);  //0
        System.out.println();

        int a10 = 0x14d;

        System.out.println(3*Math.pow(16,2) + 3*Math.pow(16,1) + 3*Math.pow(16,0));
        System.out.println("Result (16 -> 10) by Java = " + Integer.toHexString(a));

        //2 +> 10
        System.out.println("Result = " +
                (2*Math.pow(2,6) + 0*Math.pow(2,5) + 0*Math.pow(2,4) +
                        0*Math.pow(2,3) + 3*Math.pow(2,2) + 4*Math.pow(2,1) + 5*Math.pow(2,0)));
        //Result = 153.0

        // 10 -> 16
         int d =637;

         System.out.println(637 / 16);  //39
                System.out.println(637 % 16);      //13
                System.out.println();

                System.out.println(39 / 16);  //2
                System.out.println(39 % 16);    //7
                System.out.println();

                System.out.println(2 / 16);  //0
                System.out.println(2 % 16);  //2

                int a16 = 0x2b;
                System.out.println("Result 637 (10 -> 16) by Java = " + a16);

                //16 -> 10
                System.out.println("Result (16 -> 10) = " + (2*Math.pow(16,1) + 11*Math.pow(16,0)));

        //10 -> 2
        int a2 = 637;
        System.out.println(637 / 2);  //318
        System.out.println(637 % 2);    //1
        System.out.println();

        System.out.println(318 / 2);    //159
        System.out.println(318 % 2);    //0
        System.out.println();

        System.out.println(159 / 2);       //79
        System.out.println(159 % 2);    //1
        System.out.println();

        System.out.println(79 / 2);     //39
        System.out.println(79 % 2);     //1
        System.out.println();

        System.out.println(39 / 2);     //19
        System.out.println(39 % 2);     //1
        System.out.println();

        System.out.println(19 / 2);     //9
        System.out.println(19 % 2);     //1
        System.out.println();

         int a1 =0x9;
        System.out.println("Recult 637 (10->2) = " + a2);

        //2 -> 10
        //11100111
        System.out.println("Result (2 -> 10) = "
               + (1*Math.pow(2,6) + 1*Math.pow(2,5) + 1*Math.pow(2,4) + 1*Math.pow(2,3) + 1*Math.pow(2,2) + 1*Math.pow(2,1) + 1*Math.pow(2,0)));
       // Result (2 -> 10) = 127.0

        //10 -> 3
        int b2 = 637;
        System.out.println(637 / 3);        //212
        System.out.println(637 % 3);        //1
        System.out.println();

        System.out.println(212 / 3);   //70
        System.out.println(212 % 3);  //2
        System.out.println();

        System.out.println(70 / 3);  //23
        System.out.println(70 % 3);  //1
        System.out.println();

        System.out.println(23 / 3);
        System.out.println(23 % 3);
        System.out.println();

        int b = 0x637;
        System.out.println("Recult 637 (10->3) = " + a2);


    }
}
