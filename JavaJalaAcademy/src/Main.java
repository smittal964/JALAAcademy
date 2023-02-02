public class Main {
    public static void main(String[] args) {
        System.out.println(checkArmstrong(1634));
        System.out.println("Hello world!");
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
}