public class homework6 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,8};
        int[] arr2 = {1,2,3,4,5,6,7};
        System.out.print(equals(arr1,arr2));
    }

    public static boolean equals(int[] arr1 , int[] arr2){
        if(arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]){
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }
}
