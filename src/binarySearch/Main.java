package binarySearch;

import static binarySearch.BinarySearch.binarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 10;
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Hedef bulunamadı.");
        } else {
            System.out.println("Hedef " + target + " indeksinde bulundu.");
        }
    }
}
