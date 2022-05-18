package Unit8;

public class TemperatureGrid {
    private double[][] temperatureGrid;

    public TemperatureGrid(double[][] tg) {
        temperatureGrid = tg;
    }

    public double[][] getTemps() {
        return temperatureGrid;
    }

    public double computeTemp(int row, int column) {
        if (row == 0 || row == temperatureGrid.length - 1) {
            return temperatureGrid[row][column];
        }

        if (column == 0 || column == temperatureGrid[0].length - 1) {
            return temperatureGrid[row][column];
        }

        double average = (temperatureGrid[row - 1][column] + temperatureGrid[row + 1][column] + temperatureGrid[row][column - 1] + temperatureGrid[row][column + 1]) / 4;
        return average;
    }

    public boolean updateAllTemps(double tolerance) {
        double[][] newTemperatureGrid = new double[temperatureGrid.length][temperatureGrid[0].length];

        for (int i = 0; i < temperatureGrid.length; i++) {
            for (int j = 0; j < temperatureGrid[i].length; j++) {
                newTemperatureGrid[i][j] = computeTemp(i, j);
            }
        }

        for (int i = 0; i < temperatureGrid.length; i++) {
            for (int j = 0; j < temperatureGrid[i].length; j++) {
                if (Math.abs(newTemperatureGrid[i][j] - temperatureGrid[i][j]) > tolerance) {
                    temperatureGrid = newTemperatureGrid;
                    return false;
                }
            }
        }

        temperatureGrid = newTemperatureGrid;
        return true;
    }
}
