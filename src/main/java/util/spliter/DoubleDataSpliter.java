package util.spliter;

public class DoubleDataSpliter implements DataSpliter {
    public double[] spliter(String unspliterData) {
        String[] spliterData = unspliterData.split(" ");
        double[] doubleData = new double[spliterData.length];
        for (int i = 0; i < spliterData.length; i++) {
            doubleData[i] = Double.parseDouble(spliterData[i]);
        }
        return doubleData;
    }
}
