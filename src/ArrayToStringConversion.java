public class ArrayToStringConversion {

    public static String helper(int [] arr){
        int n = arr.length;
        StringBuilder ans = new StringBuilder();

        int start = arr[0];

        for (int i = 1; i<=n;i++){
            // check for the element || check the range is break
            if(i == arr.length || arr[i] != arr[i-1]+1) {
                // this is for last condition
                if (start == arr[i - 1]) {
                    ans.append(start);
                } else {
                    ans.append(start).append("-").append(arr[i - 1]);
                }

                // if there are still number present in the arr
                if (i != n) {
                    ans.append(",");
                    start = arr[i];
                }
            }
        }return ans.toString();
    }

    public static void main(String[] args) {
        int [] arr =  {1,2,3,5,6,7,9};
        System.out.print(helper(arr));

    }
}
