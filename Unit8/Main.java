package Unit8;

public class Main {
    public static void main(String[] args) {
        double[][] tempValues1 = { {50, 70, 90},
                                   {60, 80, 100},
                                   {55, 75, 95} };
        double[][] tempValues2 = { {40, 60, 80},
                                   {50, 70, 90},
                                   {45, 65, 85} };

        TemperatureGrid temp1 = new TemperatureGrid(tempValues1);
        TemperatureGrid temp2 = new TemperatureGrid(tempValues2);

        boolean temp1Boolean = temp1.updateAllTemps(1);
        double[][] temp1Array = temp1.getTemps();

        for (int i = 0; i < temp1Array.length; i++) {
            for (int j = 0; j < temp1Array[i].length; j++) {
                System.out.print(temp1Array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(temp1Boolean);

        boolean temp2Boolean = temp2.updateAllTemps(100);
        double[][] temp2Array = temp2.getTemps();

        for (int i = 0; i < temp2Array.length; i++) {
            for (int j = 0; j < temp2Array[i].length; j++) {
                System.out.print(temp2Array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(temp2Boolean);
    }
}
