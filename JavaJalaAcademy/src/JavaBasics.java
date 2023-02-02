public class JavaBasics {


    //Single-Line Coment
    /*
    Multi-Line Comment
     */
    /**
     * Documentation
     * @param args
     */
    static int globalVariable=5;

    public static void main(String[] args) {
        System.out.println("Satvik Mittal");
        int a=4;
        System.out.println(a);
        System.out.println(globalVariable);
        char ch='A';
        boolean value=false;
        float f= 6.4f;
        double d=4.54;
        printName("Satvik");
    }

    public static void printName(String name){
        System.out.println("Name: "+name);
    }

}
