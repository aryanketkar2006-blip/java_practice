class Computer1{
    public void Music() {
        System.out.println("Music is playing");
    }
    public String Getmeapen(int cost) {
        int pens = cost / 10;
        int remainingAmount = cost % 10;
        int pensil = remainingAmount/5;
        int change = remainingAmount % 5;
        if (pens > 0 && remainingAmount > 0) {
//            return pens + " pens and " + remainingAmount + " returned";
            return pens + " pens " + pensil + " pencil and " + change + " returned";

        } else if (pens > 0) {
            return pens + " pens returned";

        } else if (pensil > 0) {
            return pensil + " pensil " + change + " rupess returned";

        } else {
            return "Insufficiant money";
        }
    }
}


public class javalooppractice {
    public static void main(String[] args) {
        Computer1 com = new Computer1();
        com.Music();
        String str = com.Getmeapen(12);
        System.out.println(str);
    }
}
