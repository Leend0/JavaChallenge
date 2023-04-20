public class Main {
    static int countStars = 0;

    public static void main(String[] args) {
        printDiamond(11);
    }

    public static void printDiamond(int width) {

        if (width%2!=0){
            //print top horizontal stars
            for (int y = 1; y <= width + 4; y++) {
                System.out.print("*");
            }
            System.out.println();

            printTopHalf(width);
            printBottomHalf(width);

            //print bottom horizontal stars
            for (int n = 1; n <= width + 4; n++) {
                System.out.print("*");
            }
        }
        else{
            System.out.println("Solution in progress... Try different width (prime number > 2)");
        }

    }

    public static void printTopHalf(int width) {

        int nu = width / 2;
        int halfWidth = width / 2;

        for (int x = 1; x <= width; x++) {

            //print left vertical stars
            if (x <= width / 2 + 1) {
                System.out.print("* ");
            }

            //add left horizontal spaces
            for (int i = 1; i <= halfWidth; i++) {
                System.out.print(" ");
            }
            halfWidth--;

            //print top half of diamond
            int numStars = x * 2 - 1;
            if (numStars <= width) {
                for (int j = 1; j <= numStars; j++) {
                    System.out.print("*");
                }

                //add right horizontal spaces
                for (int i = nu; i >= 1; i--) {
                    System.out.print(" ");
                }
                nu--;

                //print right vertical stars
                System.out.print(" *");

                System.out.println();

            }

        }
    }

    public static void printBottomHalf(int width) {
        int halfWidth = width / 2;
        int num = width / 2;

        //bottom half of diamond
        int space = 1;
        halfWidth = width / 2;
        int z = 1;
        for (int x = halfWidth + 1; x >= 1; x--) {

            if (z <= width / 2) {
                System.out.print("* ");
                z++;
            }

            for (int i = 1; i <= space; i++) {

                if (space < width / 2 + 1) {
                    System.out.print(" ");
                }
            }

            num = width / 2;
            int numStars = x * 2 - 1;
            if (numStars <= width) {
                for (int j = numStars - 2; j >= 1; j--) {
                    System.out.print("*");
                }

                if (numStars > 1) {
                    for (int i = num + 1; i >= x; i--) {
                        System.out.print(" ");
                    }
                    System.out.print(" *");
                }

                if (numStars != 1) {
                    System.out.println();
                    space++;
                }
            }
        }

    }

}