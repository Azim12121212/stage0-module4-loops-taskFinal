package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int width = 0;
        int value = cathetusLength;

        if (cathetusLength==0) {
            System.out.print("");
        } else if (cathetusLength==1) {
            System.out.print(value);
        } else {
            width = cathetusLength-1 + cathetusLength;
            for (int i=1; i<=cathetusLength; i++) {
                for (int j=1; j<=width; j++) {
                    if (j<=cathetusLength-i) {
                        System.out.print(" ");
                    } else if (j>=cathetusLength+i) {
                        // do nothing
                    } else {
                        System.out.print(value);
                    }

                    if (j<cathetusLength) {
                        value--;
                    } else if (j>=cathetusLength && value<cathetusLength) {
                        value++;
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(9);
    }
}
