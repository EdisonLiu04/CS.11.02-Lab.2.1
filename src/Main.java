/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        System.out.println(add(3,8));
        System.out.println(newadd(3,8,4,9));
        System.out.println(morningGreeting("Toby Fox!"));
        System.out.println(afterGreeting("Mac Miller!"));
        System.out.println(triple(" oohbaby"));
        System.out.println(half(8.0));
        System.out.println(roundPositiveValueToNearestInteger(8.5));
        System.out.println(roundNegativeValueToNearestInteger(-8.5));
    }

    // 1. add
    public static int add(int a, int b){
        return a+b;
    }

    // 2. add
    public static int newadd(int a, int b, int c, int d) {
        return add(add(add(a,b),c),d);
        }
    // 3. morningGreeting
        public static String morningGreeting(String l){
            return ("早上好 " + l);
        }
    // 4. afternoonGreeting
        public static String afterGreeting(String w){
            return ("下午好 "+w);
        }
    // 5. triple
        public  static String triple(String word){
            return word+word+word;
        }
    // 6. half
        public static double half(double num){
            return num/2;
        }
    // 7. roundPositiveValueToNearestInteger
        public static double roundPositiveValueToNearestInteger(double z){
            return (int)(z+0.5);
        }

    // 8. roundNegativeValueToNearestInteger
        public static double roundNegativeValueToNearestInteger(double n){
            return (int)(n-0.5);
        }

}
