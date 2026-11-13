// Write a Java program that calculates the maximum number of pens (10) and pencils (5) a customer can purchase with a given amount of money and returns any remaining changes.
class Computer1 {
    public void Music() {
        System.out.println("Music is playing");
    }

    public String Getmeapen(int cost) {
        int pens = cost / 10;
        int remainingAmount = cost % 10;

        int pencils = remainingAmount / 5;
        int change = remainingAmount % 5;

        String result = "";

        if (pens > 0) {
            result = result + pens + " pens ";
        }

        if (pencils > 0) {
            result = result + pencils + " pencils";
        }

        if (change > 0) {
            result = result + " and ₹" + change + " returned";
        }

        if (pens == 0 && pencils == 0) {
            return "Insufficient money";
        }

        return result;
    }
}


public class javalooppractice {
    public static void main(String[] args) {
        Computer1 com = new Computer1();
        com.Music();
        String str = com.Getmeapen(17);
        System.out.println(str);
    }
}
