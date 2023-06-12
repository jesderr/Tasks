import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class RandomDensityGraph extends Frame {
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 600;

    private ArrayList<Double> listOfRandomNumbers = new ArrayList<>();

    public RandomDensityGraph() {
        super("Random Density Graph");
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        //1232 7654 6418
        long firstValue = 3123;
        long number = firstValue;

        int len = String.valueOf(firstValue).length();
        double result = ((double) number / Math.pow(10, len));
        listOfRandomNumbers.add(result);

        ArrayList<Long> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(number);

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            number *= number;
            number = number / 100 % 10000;

            if (number == firstValue || listOfNumbers.contains(number)) {
                break;
            }
            len = String.valueOf(number).length();
            result = ((double) number / Math.pow(10, len));
            listOfRandomNumbers.add(result);
            listOfNumbers.add(number);
        }
        // Sort the list of random numbers in ascending order
        Collections.sort(listOfRandomNumbers);
    }

    @Override
    public void paint(Graphics g) {
        // Draw the density of the random numbers
        double binWidth = 0.02;
        int numBins = (int) Math.ceil((listOfRandomNumbers.get(listOfRandomNumbers.size() - 1) - listOfRandomNumbers.get(0)) / binWidth);
        int[] histogram = new int[numBins];

        for (int i = 0; i < listOfRandomNumbers.size(); i++) {
            int binIndex = (int) Math.floor((listOfRandomNumbers.get(i) - listOfRandomNumbers.get(0)) / binWidth);
            histogram[binIndex]++;
        }

        int maxCount = 0;
        for (int count : histogram) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        g.setColor(Color.BLUE);
        g.drawString("Random Density", 10, 20);

        for (int i = 0; i < histogram.length; i++) {
            double x = i * binWidth;
            double y = (double) histogram[i] / maxCount * (HEIGHT - 60) + 30;
            g.drawLine((int) (x * WIDTH), HEIGHT - 30, (int) (x * WIDTH), HEIGHT - (int) y);
        }

        // Draw the density of the exponential distribution with lambda = 1
        double lambda = 1.0;
        g.setColor(new Color(255, 0, 0, 128)); // set the color to transparent red
        g.drawString("Exponential Density with Lambda = 1", 10, 40);

        int stepSize = 15; // set the step size to 5 pixels
        for (int i = 0; i < WIDTH - 150; i+=stepSize) {
            double x = i / (double) (WIDTH - 40);
            double y = lambda * Math.exp(-lambda * x) * (HEIGHT - 60) + 30;
            g.drawLine(i + 20, HEIGHT - 30, i + 20, HEIGHT - (int) y);
        }

//        double maxRandomX = (histogram.length - 1) * binWidth;
//
//// Plot the exponential density function for x values up to maxRandomX only
//        for (int i = 0; i < (int) (maxRandomX / (double) (WIDTH - 40) * (WIDTH - 20)); i++) {
//            double x = i * ((double) (WIDTH - 40) / (double) (maxRandomX));
//            double y = lambda * Math.exp(-lambda * x) * (HEIGHT - 60) + 30;
//            g.drawLine((int)x + 20, HEIGHT - 30, (int)x + 20, HEIGHT - (int) y);
//        }
        // Draw the legend
        g.setColor(Color.BLACK);
        g.drawString("Legend:", WIDTH - 420, HEIGHT - 550);
        g.setColor(Color.BLACK);
        g.drawString("Number of size:" + listOfRandomNumbers.size(), WIDTH - 420, HEIGHT - 490);
        g.setColor(Color.BLUE);
        g.drawString("- Random Density", WIDTH - 420, HEIGHT - 530);
        g.setColor(Color.RED);
        g.drawString("- Exponential Density with Lambda = 1", WIDTH - 420, HEIGHT - 510);
    }

    public static void main(String[] args) {
        new RandomDensityGraph().setVisible(true);
    }
}