public class Loops {
    public static void main(String[] args) {
        //print “Bright IT Career” ten times using for loop
        for(int i=1;i<=10;i++){
            System.out.println("Bright IT Career");
        }

        //program to print 1 to 20 numbers using the while loop.
        int i=1;
        while(i<=20){
            System.out.println(i);
            i++;
        }

        //Program to equal operator and not equal operators
        int num=5;
        if(num!=5){
            System.out.println("FALSE");
        }
        if(num==5){
            System.out.println("TRUE");
        }

        //program to print the odd and even numbers.
        if(num%2==0){
            System.out.println(num+" is Even");
        }else{
            System.out.println(num+"Odd");
        }


        //program to print even number between 10 and 100 using while loop
        i=10;
        while(i<=100){
            if(i%2==0){
                System.out.println(i+" is even");
            }
        }

        //program to print 1 to 10 using the do-while loop statement.
        do{
            i =1;
            System.out.println(i);
            i++;
        }while (i<=10);

        //program to find Armstrong number or not



    }
    //program to print largest number among three numbers.
    //Program for multiple if else statement(Largest number in 10,20 and 30)
    public static void findLargest(int a,int b,int c){
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

    public static boolean checkArmstrong(int num){
        int original=num;
        int numDigits=0;
        for(;original!=0;original/=10,++numDigits);

        original=num;
        int rem=0;
        int ans=0;
        while (original!=0){
            rem=original%10;
            original/=10;
            ans+=Math.pow(rem,numDigits);
        }

        if(ans==num){
            return true;
        }else {
            return false;
        }

    }

    //program to find the prime or not.
    public static boolean checkPrime(int num){
        boolean ans=true;
        for (int i=2;i<=num/2;i++){
            if (num%i==0){
                ans=false;
                break;
            }
        }
        return ans;
    }

    //program to check for palindrome or not
    public static boolean isPalindrome(int num){
        boolean ans=false;
        int rev=0;
        int original=num;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(rev==original){
            ans=true;
        }
        return ans;
    }

    //Program to check whether a number is EVEN or ODD using switch
    public static void isEvenOrOdd(int num){
        int rem=num%2;
        switch (rem){
            case 0:
                System.out.print("Even");
                break;

            case 1:
                System.out.println("Odd");
                break;
        }
    }

    //Print gender (Male/Female) program according to given M/F using switch
    public static void maleOrFemale(char c){
        switch (c){
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("Female");
                break;
        }
    }






}
