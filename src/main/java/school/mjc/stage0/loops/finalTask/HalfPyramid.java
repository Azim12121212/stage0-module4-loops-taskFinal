package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        char asterisk = '*';

        if (cathetusLength==0) {
            System.out.print("");
        } else if (cathetusLength==1) {
            System.out.print(asterisk);
        } else {
            for (int i=1; i<=cathetusLength; i++) {
                for (int j=1; j<=cathetusLength; j++) {
                    if (j<=cathetusLength-i) {
                        System.out.print(" ");
                    } else {
                        System.out.print(asterisk);
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(3);
    }
}
