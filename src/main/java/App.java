package main.java;

public class App {

    public static boolean verify(int username,int passowrd,int otp){
        int defaultUsername = 1234;
        int defaultPassword = 1234;
        int defaultOTP = 8520;
        if(defaultUsername == username){
            if (defaultPassword == passowrd){
                if(defaultOTP == otp){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]){
        System.out.println("Nothinig here");
    }
}
