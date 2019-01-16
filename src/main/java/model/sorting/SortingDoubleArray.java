package model.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortingDoubleArray implements SortingArray {
    public void ascendingSort(double[] array) {
        Arrays.sort(array);
    }

    public void descendingSort(double[] array) {
        ArrayList<Double> arraysDoubleList = new ArrayList<Double>();
        for (int i = 0; i < array.length; i++) {
            arraysDoubleList.add(array[i]);
            Collections.sort(arraysDoubleList);
            Collections.reverse(arraysDoubleList);
            for (int j = 0; j < arraysDoubleList.size(); j++) {
                array[j] = arraysDoubleList.get(j);
            }
        }
    }

    public double minArrayValue(double[] array) {
        double minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public double maxArrayValue(double[] array) {
        double maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public double summOfArrayNumber(double[] array) {
        double sumOfArray = array[0];
        for (int i = 1; i < array.length; i++) {
            sumOfArray += array[i];
        }
        return sumOfArray;
    }

    public double averageNumberOfArray(double[] array) {
        double sumOfArray = array[0];
        for (int i = 1; i < array.length; i++) {
            sumOfArray += array[i];
        }
        double averageNumber = sumOfArray / array.length;
        return averageNumber;
    }

    public void replaceElement(double[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array index to replace: ");
        try {
            int arrayIndex = scanner.nextInt();
            System.out.println("Enter new double number: ");

            double newNumber = scanner.nextDouble();
            array[arrayIndex] = newNumber;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}


