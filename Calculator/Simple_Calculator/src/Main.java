import java.util.Scanner;
import java.io.IOException;
public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static final String ANSi_RESET = "\u001B[0m";
    public static final String ANSi_Yellow = "\u001B[33m";
    public static final String ANSi_red = "\u001B[31m";
    public static final String ANSi_green = "\u001B[32m";
    public static final String ANSi_blue = "\u001B[34m";
    public static final String ANSi_purple = "\u001B[35m";
    public static final String ANSi_cyan = "\u001B[36m";
    public static final String ANSi_white = "\u001B[37m";

    public static double Multipication(double a,double b){
        return a*b;
    }
    public static double Additions(double a,double b){
        return a+b;
    }
    public static double Subtractions(double a,double b){
        return a-b;
    }
    public static double Division(double a,double b){
        return a/b;
    }
    public static double Modules(double a,double b){
        return a%b;
    }

    public static void Menu(){
        System.out.println(ANSi_Yellow+"\n      \uD83D\uDD33==================================================\uD83D\uDD33\n"+ANSi_RESET);
        System.out.println(ANSi_Yellow+"       ||                                                ||\n"+ANSi_RESET);
        System.out.println("\t   \uD83D\udd34\t\t   \uD83D\uDD37"+ANSi_cyan +"   C a l c u l a t o r  \uD83D\uDD37          \uD83D\udd34\n"+ANSi_RESET);
        System.out.println(ANSi_Yellow+"       ||                                                ||\n"+ANSi_RESET);
        System.out.println(ANSi_Yellow +"      \uD83D\uDD33==================================================\uD83D\uDD33\n\n"+ANSi_RESET );
        System.out.println("\t\t -: Choose Any Operation You Have To Be Perform :-");
        System.out.println(ANSi_green+"\t----------------------------------------------------------"+ANSi_RESET);
        System.out.println(ANSi_Yellow+"\t||  'a'  ||  'b'  ||  'c'  ||  'd'  ||  'e'  ||   'f'   ||"+ANSi_RESET);
        System.out.println(ANSi_green+"\t----------------------------------------------------------"+ANSi_RESET);
        System.out.println(ANSi_blue+"\t||   +   ||   -   ||   x   ||   /   ||   %   ||   e^x   ||");
        System.out.println(ANSi_green+"\t----------------------------------------------------------"+ANSi_RESET);
        System.out.println("\n\uD83D\uDC49"+ANSi_red+"\t\t\t  You have to Stop Calculation Enter 'g'           "+ANSi_RESET+"\uD83D\uDC48\n");
        System.out.println("\t\t\uD83D\uDD37_______________________________________________\uD83D\uDD37");
        System.out.println(ANSi_purple+"\t\t|+|               |*|              |*|           |+| ");
        System.out.println("\t\t|+|               |*|              |*|           |+| ");
        System.out.println("\t\t|+|       ^       |*|     ___      |*|   ____    |+|");
        System.out.println("\t\t|+|      /|       |*|     ___|     |*|    ___|   |+|");
        System.out.println("\t\t|+|     __|__     |*|    |___      |*|   ____|   |+|"+ANSi_RESET);
        System.out.println("\t\t\uD83D\uDD37_______________________________________________\uD83D\uDD37");
        System.out.println(ANSi_purple+"\t\t|+|               |*|              |*|           |+| ");
        System.out.println("\t\t|+|    |   |      |*|     ___      |*|    ___    |+|" );
        System.out.println("\t\t|+|    |___|      |*|    |___      |*|   |__     |+|");
        System.out.println("\t\t|+|        |      |*|     ___|     |*|   |__|    |+|");
        System.out.println("\t\t|+|               |*|              |*|           |+|"+ANSi_RESET);
        System.out.println("\t\t\uD83D\uDD37_______________________________________________\uD83D\uDD37");
        System.out.println(ANSi_purple+"\t\t|+|    ____       |*|      ---     |*|    ___    |+|");
        System.out.println("\t\t|+|        |      |*|     |   |    |*|   |   |   |+|");
        System.out.println("\t\t|+|        |      |*|      ---     |*|    ---|   |+|");
        System.out.println("\t\t|+|        |      |*|     |   |    |*|    ___|   |+|");
        System.out.println("\t\t|+|               |*|      ---     |*|           |+|"+ANSi_RESET);
        System.out.println("\t\t\uD83D\uDD37_______________________________________________\uD83D\uDD37");
        System.out.println(ANSi_purple+"\t\t|+|               |*|      ___     |*|           |+| ");
        System.out.println("\t\t|+|               |*|     |\\  |    |*|           |+| ");
        System.out.println("\t\t|+|               |*|     | \\ |    |*|           |+| ");
        System.out.println("\t\t|+|               |*|     |  \\|    |*|           |+| ");
        System.out.println("\t\t|+|               |*|      ---     |*|           |+| "+ANSi_RESET);
        System.out.println("\t\t\uD83D\uDD37_______________________________________________\uD83D\uDD37");


    }

    public static void setData(){
            System.out.println("  \t\t\t\t\t\t\t@~ -: Enter the first No. :- ~@");
            System.out.print("  \t\t\t\t\t\t\t\t\t\t  ");
            number1 = sc.nextDouble();
            System.out.println("  \t\t\t\t\t\t\t@~ -:Enter the Second No. :- ~@");
            System.out.print("  \t\t\t\t\t\t\t\t\t\t  ");
            number2 = sc.nextDouble();


    }
    static double number1=0, number2 = 0;

    public static double Exponential(double a,double b){
        return (int)Math.pow(a,b);
    }
    public static void main(String[] args)throws IOException, InterruptedException{
        int[] surrogates = {0xD83D, 0xDC49,0xDC48,0xDB49,0xD83D,0xDD37,0xDD33,0xDD34};
        Scanner input = new Scanner(System.in);
       // double number1=0, number2 = 0, result;
        String operator;
        boolean aa = true;
//        System.out.println(ANSi_Yellow+"\n      \uD83D\uDD33==================================================\uD83D\uDD33\n"+ANSi_RESET);
//        System.out.println(ANSi_Yellow+"       ||                                                ||\n"+ANSi_RESET);
//        System.out.println("\t   \uD83D\udd34\t\t   \uD83D\uDD37"+ANSi_cyan +"   C a l c u l a t o r  \uD83D\uDD37          \uD83D\udd34\n"+ANSi_RESET);
//        System.out.println(ANSi_Yellow+"       ||                                                ||\n"+ANSi_RESET);
//        System.out.println(ANSi_Yellow +"      \uD83D\uDD33==================================================\uD83D\uDD33\n\n"+ANSi_RESET );
//        System.out.println("\t\t -: Choose Any Operation You Have To Be Perform :-");
//        System.out.println(ANSi_green+"\t----------------------------------------------------------"+ANSi_RESET);
//        System.out.println(ANSi_Yellow+"\t||  'a'  ||  'b'  ||  'c'  ||  'd'  ||  'e'  ||   'f'   ||"+ANSi_RESET);
//        System.out.println(ANSi_green+"\t----------------------------------------------------------"+ANSi_RESET);
//        System.out.println(ANSi_blue+"\t||   +   ||   -   ||   x   ||   /   ||   %   ||   e^x   ||");
//        System.out.println(ANSi_green+"\t----------------------------------------------------------"+ANSi_RESET);
//        System.out.println("\n\uD83D\uDC49"+ANSi_red+"\t\t\t  You have to Stop Calculation Enter '00'           "+ANSi_RESET+"\uD83D\uDC48\n");
//        System.out.println("\t\t\uD83D\uDD37_______________________________________________\uD83D\uDD37");
//        System.out.println(ANSi_purple+"\t\t|+|               |*|              |*|           |+| ");
//        System.out.println("\t\t|+|               |*|              |*|           |+| ");
//        System.out.println("\t\t|+|       ^       |*|     ___      |*|   ____    |+|");
//        System.out.println("\t\t|+|      /|       |*|     ___|     |*|    ___|   |+|");
//        System.out.println("\t\t|+|     __|__     |*|    |___      |*|   ____|   |+|"+ANSi_RESET);
//        System.out.println("\t\t\uD83D\uDD37_______________________________________________\uD83D\uDD37");
//        System.out.println(ANSi_purple+"\t\t|+|               |*|              |*|           |+| ");
//        System.out.println("\t\t|+|    |   |      |*|     ___      |*|    ___    |+|" );
//        System.out.println("\t\t|+|    |___|      |*|    |___      |*|   |__     |+|");
//        System.out.println("\t\t|+|        |      |*|     ___|     |*|   |__|    |+|");
//        System.out.println("\t\t|+|               |*|              |*|           |+|"+ANSi_RESET);
//        System.out.println("\t\t\uD83D\uDD37_______________________________________________\uD83D\uDD37");
//        System.out.println(ANSi_purple+"\t\t|+|    ____       |*|      ---     |*|    ___    |+|");
//        System.out.println("\t\t|+|        |      |*|     |   |    |*|   |   |   |+|");
//        System.out.println("\t\t|+|        |      |*|      ---     |*|    ---|   |+|");
//        System.out.println("\t\t|+|        |      |*|     |   |    |*|    ___|   |+|");
//        System.out.println("\t\t|+|               |*|      ---     |*|           |+|"+ANSi_RESET);
//        System.out.println("\t\t\uD83D\uDD37_______________________________________________\uD83D\uDD37");
//        System.out.println(ANSi_purple+"\t\t|+|               |*|      ___     |*|           |+| ");
//        System.out.println("\t\t|+|               |*|     |\\  |    |*|           |+| ");
//        System.out.println("\t\t|+|               |*|     | \\ |    |*|           |+| ");
//        System.out.println("\t\t|+|               |*|     |  \\|    |*|           |+| ");
//        System.out.println("\t\t|+|               |*|      ---     |*|           |+| "+ANSi_RESET);
//        System.out.println("\t\t\uD83D\uDD37_______________________________________________\uD83D\uDD37");
//
//
        Menu();
        while(aa!=false) {
            System.out.println("\n ~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~");
            System.out.println("   ~@~@~@~@~@~@~@~@~@~@~@~@~@~\t\t\t\t\t\t\t ~@~@~@~@~@~@~@~@~@~@~@~@~@~");
            System.out.println("  \t\t\t\t\t\t\t@~ -: Enter the Operation :- ~@");
            System.out.print("  \t\t\t\t\t\t\t\t\t\t  ");
            operator = String.valueOf(sc.next().charAt(0));

//            System.out.print("Enter the 'first Number :- ");
//            number1 = sc.nextDouble();
//            System.out.print("Enter the 'Second Number :- ");
//            number2 = sc.nextDouble();

            switch (operator) {
                case "a":   setData();
                            System.out.println("\t\t\t\t\t        @~   \t -: Result :-        ~@");
                            System.out.println("\t\t\t\t\t\t\t@~\t\t [ "+number1+" + "+number2+" ]       ~@");
                            System.out.println("   ~@~@~@~@~@~@~@~@~@~@~@~@~@~\t\t\t "+Additions(number1, number2)+"\t\t     ~@~@~@~@~@~@~@~@~@~@~@~@~@~");
                            System.out.println(" ~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~");
                            Menu();
                            break;
                case "b" :  setData();
                            System.out.println("\t\t\t\t\t        @~   \t -: Result :-        ~@");
                            System.out.println("\t\t\t\t\t\t\t@~\t\t [ "+number1+" - "+number2+" ]       ~@");
                            System.out.println("   ~@~@~@~@~@~@~@~@~@~@~@~@~@~\t\t\t "+Subtractions(number1, number2)+"\t\t     ~@~@~@~@~@~@~@~@~@~@~@~@~@~");
                            System.out.println(" ~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~");
                            Menu();
                            break;
                case "c" :  setData();
                            System.out.println("\t\t\t\t\t        @~   \t -: Result :-        ~@");
                            System.out.println("\t\t\t\t\t\t\t@~\t\t [ "+number1+" X "+number2+" ]       ~@");
                            System.out.println("   ~@~@~@~@~@~@~@~@~@~@~@~@~@~\t\t\t "+Multipication(number1, number2)+"\t\t     ~@~@~@~@~@~@~@~@~@~@~@~@~@~");
                            System.out.println(" ~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~");
                            Menu();
                            break;
                case "d" :  setData();
                            System.out.println("\t\t\t\t\t        @~   \t -: Result :-        ~@");
                            System.out.println("\t\t\t\t\t\t\t@~\t\t [ "+number1+" / "+number2+" ]       ~@");
                            System.out.println("   ~@~@~@~@~@~@~@~@~@~@~@~@~@~\t\t\t "+Division(number1, number2)+"\t\t     ~@~@~@~@~@~@~@~@~@~@~@~@~@~");
                            System.out.println(" ~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~");
                            Menu();
                            break;
                case "e" :  setData();
                            System.out.println("\t\t\t\t\t        @~   \t -: Result :-        ~@");
                            System.out.println("\t\t\t\t\t\t\t@~\t\t [ "+number1+" % "+number2+" ]       ~@");
                            System.out.println("   ~@~@~@~@~@~@~@~@~@~@~@~@~@~\t\t\t "+Modules(number1, number2)+"\t\t     ~@~@~@~@~@~@~@~@~@~@~@~@~@~");
                            System.out.println(" ~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~");
                            Menu();
                            break;
                case "f" :  setData();
                            System.out.println("\t\t\t\t\t        @~   \t -: Result :-        ~@");
                            System.out.println("\t\t\t\t\t\t\t@~\t\t [ "+number1+" ^ "+number2+" ]       ~@");
                            System.out.println("   ~@~@~@~@~@~@~@~@~@~@~@~@~@~\t\t\t "+Exponential(number1, number2)+"\t\t     ~@~@~@~@~@~@~@~@~@~@~@~@~@~");
                            System.out.println(" ~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~");
                            Menu();
                            break;
                case "g" : aa= false;
                            System.out.println("   ~@~@~@~@~@~@~@~@~@~@~@~@~@~\t\t\t\t\t\t\t ~@~@~@~@~@~@~@~@~@~@~@~@~@~");
                            System.out.println(" ~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~@~");
                            break;
            }
        }
    }

        }


