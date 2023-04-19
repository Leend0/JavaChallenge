public class Main {
    static int countStars = 0;
    public static void main(String[] args) {
        // print(10);
        printDiamond(5);
    }

    public static void printDiamond(int width) {

        int halfWidth = width / 2;
        int num = width/2;

        for (int y = 1; y <= width + 3; y++) {
            System.out.print("*");
        }
        System.out.println();

        for (int x = 1; x <= width; x++) {

            if (x <= width/2+1) {
                System.out.print("* ");
                countStars++;
            }

            for (int i = 1; i <= halfWidth; i++) {
                System.out.print(" ");
            }
            halfWidth--;

            int numStars = x * 2 - 1;
            if (numStars <= width) {
                for (int j = 1; j <= numStars; j++) {
                    System.out.print("*");
                }

                for (int i = 1; i <= num+1; i++) {
                    System.out.print(" ");
                    num--;
                }
                System.out.print(" *");

                System.out.println();

            }

        }

        int space = 1;
        halfWidth = width / 2;
        for (int x = width - halfWidth; x >= 1; x--) {

            if (x >= width/2) {
                System.out.print("* ");
                countStars++;
            }

            for (int i = 1; i <= space; i++) {

                if (space < width/2+1) {
                    System.out.print(" ");
                }
            }

            num = width/2;
            int numStars = x * 2 - 1;
            if (numStars <= width) {
                for (int j = numStars - 2; j >= 1; j--) {
                    System.out.print("*");
                }

                if (numStars > 1){
                    for (int i = num+1; i >= x; i--) {
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
        for (int n = 1; n <= width + 3; n++) {
            System.out.print("*");
        }

    }

}