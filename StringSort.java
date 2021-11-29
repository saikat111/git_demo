public class StringSort  {
    public static void main(String aregs[]) {
    String[] arr = { "apple","geeksforGeeks", "quiz",
                "practice", "gblogs", "coding" , "aaa" };

    int n = arr.length;
    sortString(arr, n);
    for (int i = 0; i < n; i++)
            System.out.println("String " + (i + 1) + " is " + arr[i]);
    }
    static void sortString(String arr[] ,int n){
        String temp;
        for(int i= 0; i<n; i++){
            for(int j = i+1 ; j <n ;j++){
                    if(arr[i].compareTo(arr[j])> 0){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }

            }
        }

    }
}
