public class Lab1 {
    public static void main(String[] args) {

        short[] z = new short[11];
        for (int i = 0; i < z.length; i++) {
            z[i] = (short) (4 + 2 * i);
        }

        double[] x = new double[17];
        for (int i = 0; i < x.length; i++) {
            x[i] = (-2.0 + Math.random() * 7.0);
        }

        double[][] e = new double[11][17];
        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[i].length; j++) {
                e[i][j] = calculateMatrix(z[i], x[j]);
            }
        }

        printMatrix(e);
    }

    public static double calculateMatrix(short zi, double xj) {
        if (zi == 14) {
            return Math.asin(1.0 / Math.pow(Math.exp((4.0 / 2.0) / (5 + Math.abs(xj))), Math.pow(0.5 / (Math.sin(xj) - 1), 3)));
        }
        else if (zi == 4 || zi == 8 || zi == 16 || zi == 18 || zi == 20) {
            return Math.pow((Math.pow((2.0 * xj / 2.0), 2)) / (1 - Math.pow(Math.atan((xj + 1.5) / 7.0) / (Math.tan(xj) + 1), 3)), 2);
        }
        else {
            return Math.sin(Math.exp(Math.atan(Math.pow(((xj + 1.5) / 7), 2))));
        }
    }

    public static void printMatrix(double[][] e) {
        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[i].length; j++) {
                System.out.printf("%.4f ", e[i][j]);
            }
            System.out.println();
        }
    }

}
