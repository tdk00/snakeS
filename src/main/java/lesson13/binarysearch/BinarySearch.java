package lesson13.binarysearch;

import lesson10.Utils;
import java.util.Arrays;

public class BinarySearch {
  static int counter=0;

  public static boolean find(int[] data, int val) {
    int left = 0;
    int right = data.length - 1;
    while (left < right) {
      counter++;
      int middle = (left + right) / 2;
      if (data[middle] == val) return true;
      if (data[middle] < val) left = middle + 1;
      else if (data[middle] > val) right = middle - 1;
    }
    return false;
  }

  public static void main(String[] args) {
    int[] data = Utils.create_random_data(30);
    int val = (int) (Math.random() * 100);
    Arrays.sort(data);
    Utils.printArray("data:", data);
    System.out.printf("val:%d\n", val);
    System.out.println(find(data, val));
    System.out.printf("counter:%d\n", counter);
  }
}
