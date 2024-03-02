public class Reverse_An_Array {
    public static void main(String[] args) {
        int arr [] = {4, 5, 4, 8, 9, 11, 46, 50, 2, 1};
        reverseArray(arr);

        for(int ele: arr)
            System.err.print(ele + " ");
    }

    private static void reverseArray(int [] arr){
        int n = arr.length;
        int s = 0;
        int e = n - 1;


        while(s < e){
            int t = arr[s];
            arr[s++] = arr[e];
            arr[e--] = t;
        }
    }
}
