public class Operators {

    public static void arithmeticOperators(int a, int b){
        System.out.println("Add: "+a+b);
        System.out.println("Subtract: "+(a-b));
        System.out.println("Multiply: "+a*b);
        System.out.println("Divide: "+a/b);
    }

    public static void incdecrement(int a){
        System.out.println("Increment: "+a++);
        System.out.println("Increment: "+a--);
    }

    public static void equalOperators(int a, int b){
        if(a==b){
            System.out.println("a is equal to b");
        }else{
            System.out.println("a is not equal to b");
        }
    }

    public static void findLargest(int a, int b, int c){
        if(b==0||c==0){
            System.out.println("Either b is equal to 0 or b and c are equal to zero");
        }
        if(a>=b&&a>=c){
            System.out.println(a+" is the largest");
        }else if(b>=a&&b>=c){
            System.out.println(b+" is the largest");
        }else{
            System.out.println(c+" is the largest");
        }
    }

    public static void findSmallest(int a, int b, int c){
        if(a<=b&&a<=c){
            System.out.println(a+" is the smallest");
        }else if(b<=a&&b<=c){
            System.out.println(b+" is the smallest");
        }else{
            System.out.println(c+" is the smallest");
        }
    }


    public static void main(String[] args) {

    }
}
