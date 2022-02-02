package chapter8;

public class PasswordValidator {

        private static final String userName = ("Lakalaka");
        private static final String oldPass = ("!1234Pass");

    public static void main(String[] args){

        checkNewPass("1234s!Asass");


    }

    public static void checkNewPass(String text){


        boolean a1 = checkLong(text);
        boolean a2 = checkUpper(text);
        boolean a3 = checkSpecial(text);
        boolean a4 = checkOldName(text);
        boolean a5 = checkOldPass(text);

        System.out.println("New password is longer than 8 chars: " + a1);
        System.out.println("New password contains Upper case: " + a2);
        System.out.println("new pasword contains special char: " + a3);
        System.out.println("New password is the same as user name: " + a4);
        System.out.println("New password is the same as old password: " + a5);




    }

    public static boolean checkLong(String text){
        if (text.length() < 8) {
            return false;
        }
        return true;

    }

    public static boolean checkUpper(String text){
        boolean isUpper = false;
        var checkUpper = new StringBuilder(text);
        for (int i=0; i<checkUpper.length(); i++) {
            if (Character.isUpperCase(checkUpper.charAt(i))){
                isUpper = true;
            }
        }
        return isUpper;
    }

    public static boolean checkSpecial(String text){
        boolean isSpecial = true;
        if (text.matches("[a-zA-Z0-9]*")){
            isSpecial = false;
        }
        return  isSpecial;
    }

    public static boolean checkOldName(String text) {
        boolean isName = false;
        if (text == userName){
            isName = true;
        }
        return isName;
    }

    public static boolean checkOldPass(String text) {
        boolean isPass = false;
        if (text == oldPass){
            isPass = true;
        }
        return isPass;
    }

}
