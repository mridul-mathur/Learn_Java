package Notes.BinarySearch;

public class PeakIndex {
    public static void main(String[] args) {
        int[] arr ={3,5,3,2,0};
        System.out.println("Peak:" + peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[]arr){
        if(arr.length<3){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+end/2;
            if (arr[mid]<arr[mid+1]) {
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
}
