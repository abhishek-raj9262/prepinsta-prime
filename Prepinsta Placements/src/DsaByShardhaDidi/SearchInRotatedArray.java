package DsaByShardhaDidi;

public class SearchInRotatedArray {
    static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (target==arr[mid]){
                return mid;
            }if (target==arr[start]){
                return start;
            }if (target==arr[end]){
                return end;

            }if (arr[start] < arr[mid]){ //it means that left part of array is sorted
                if (target >= arr[start] && target < arr[mid]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            } else {
                if (target > arr[mid] && target < arr[end]){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
                
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {120,130,40,50,90,100,110};
        int ans = search(arr,100);
        System.out.println(ans);
    }
}
