package daay14_pratik;

import java.util.Arrays;

public class C01 {

    public static void main(String[] args) {

        /*

       Integer olarak artan değerler şeklinde verilen dizinin elemanlarının karesini alıp yine artan
       değerlerde ekrana yazdıran metod oluşturunuz

       Örnek :

       Input: nums = [-4,-1,0,3,10]
       Output: [0,1,9,16,100]

       */

        int[] nums = {-4, -1, 0, 3, 10};
        int[] nums2 = Arrays.stream(nums).map(x -> x * x).sorted().toArray();
        nums = sortedArray(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));
    }

    private static int[] sortedArray(int[] num) {
        for (int i = 0; i < num.length; i++) {
            num[i] = num[i] * num[i];
        }
        Arrays.sort(num);
        return num;
    }
}
