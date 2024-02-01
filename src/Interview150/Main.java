package Interview150;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4,2,3,7};
        int n = 0;
        System.out.println(challenge1(arr , n, 2, 2));
    }

    private static int challenge1(int[] arr, int n, int x, int y) {
        //x is the no. of session i.e. the number of times loop will run
        //y is the index value that is to be incremented.
        //n is starting day.
        int count =0;// this while count number of sessions.
        int cost =0;// this will return total cost
        while (n < arr.length){
            cost +=arr[n];//value added to cost
            n +=y; // incremented the day for next session
            if (count<=x){
                count+=1;
            }else break;// if number of sessions are completed then loop breaks
        }
        return cost;// returning the final cost.
    }
}
