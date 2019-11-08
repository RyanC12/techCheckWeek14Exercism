import java.lang.Math;



class ArmstrongNumbers {
    int convertToNumber;


    boolean isArmstrongNumber(int numberToCheck) {


        String[] convertToString = Integer.toString(numberToCheck).split("");
        double len = convertToString.length;
        int result = 0;


        for(String word: convertToString){
            double num = Integer.parseInt(word);
            result += Math.pow(num, len);
        }

        if( result == numberToCheck ) {
            return true;
        }
        else {
            return false;
        }
    }

}