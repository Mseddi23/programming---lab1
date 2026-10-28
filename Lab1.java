public class Lab1 {
    public static void main(String[] args) {
	
		int n;
		try {
			n = Integer.parseInt(args[0]);
		}
		catch (NumberFormatException error) {
			n = 14;
		}	
        short[] e = new short[n];
        for (int i = 0; i < e.length; i++) {
            e[i] = (short) (3 + i);
        }

        double[] x = new double[19];
        for (int i = 0; i < x.length; i++) {
            x[i] = (-3.0 + Math.random() * 14.0);
        }

        double[][] e1 = new double[n][19];
        for (int i = 0; i < e1.length; i++) {
            for (int j = 0; j < e1[i].length; j++) {
                e1[i][j] = calculateMatrix(e[i], x[j]);
            }
        }

        printMatrix(e1);
    }

    public static double calculateMatrix(short ei, double xj) {
        if (ei == 4) {
            return Math.log(Math.pow(Math.sin(Math.pow(((4.0 + Math.log(Math.abs(xj))) / 3.0) / 4.0, 2)), 2));
        }
        else if (ei == 3 || ei == 5 || ei == 7 || ei == 8 || ei == 9 || ei == 11 || ei == 12) {
            return Math.pow((2.0 / 3.0) / Math.log(Math.pow(Math.tan(xj), 2)), 2);
        }
        else {
            return Math.pow(2.0 / Math.cbrt(Math.pow(Math.pow((1.0 / 4.0) * (2.0 / 3.0 - xj), xj), (1.0 / 4.0) * (Math.pow((1.0 / 4.0) * (1 - xj), 3) + 1))), 3);
        }
    }

    public static void printMatrix(double[][] e1) {
        for (int i = 0; i < e1.length; i++) {
            for (int j = 0; j < e1[i].length; j++) {
                System.out.printf("%.3f ", e1[i][j]);
            }
            System.out.println();
        }
    }

}
