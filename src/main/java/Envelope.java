
public class Envelope {
    public static void main(String[] args) {
        int width = 20;
        int height = 8;

        // vertical loop
        for (int i = 0; i < height; i++) {
            // horizontal loop
            for (int j = 0; j < width; j++) {
                if (
                        i == 0             // first horizontal line
                        || i == height - 1 // last horizontal line
                        || j == 0          // left vertical line
                        || j == width - 1  // right vertical line
                        || i == j
                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
