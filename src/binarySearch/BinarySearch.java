package binarySearch;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;  // Orta noktayı hesapla

            if (arr[mid] == target) {
                return mid;  // Hedef bulundu
            } else if (arr[mid] < target) {
                left = mid + 1;  // Sağdaki yarıya geç
            } else {
                right = mid - 1;  // Soldaki yarıya geç
            }
        }
        return -1;  // Hedef bulunamadı
    }


}

