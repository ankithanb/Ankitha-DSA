// import java.util.Arrays;
// public class merge {
//     public static void main(String[] args)
//     {
//         int[] arr1 = {1,3,5,0,0,0};
//         int[] arr2 = {2,4,6};
//         arr1 = Merge(arr1, arr2);
//         System.out.println(Arrays.toString(arr1));
//     }

//     static int[] Merge(int[] first, int[] second)
//     {
//         int count1 = 0;
//         for(int i = 0; i < first.length; i++)
//         {
//             if(first[i] == 0)
//                 break;
//             count1++;
//         }
//         int count2 = 0;
//         for(int j = 0; j < second.length; j++)
//         {
//             if(second[j] == 0)
//                 break;
//             count2++;
//         }

//         int[] mix = new int[count1 + count2];

//         int i = 0, j = 0, k = 0;

//         while(i < first.length && j < second.length)
//         {
//             if(first[i] == 0)
//             {
//                 i++;
//                 continue;
//             }
//             if(second[j] == 0)
//             {
//                 j++;
//                 continue;
//             }
        
//             if(first[i] < second[j])
//             {
//                 mix[k] = first[i];
//                 i++;
//             }
//             else{
//                 mix[k] = second[j];
//                 j++;
//             }
//             k++;
//         }

//         while(i < first.length)
//         {
//             mix[k] = first[i];
//             i++;
//             k++;
//         }

//         while(j < second.length)
//         {
//             mix[k] = second[j];
//             j++;
//             k++;
//         }
//         return  mix;
//     }
// }







import java.util.Arrays;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1 , j = n-1 , k = m + n - 1;

        while(i >= 0 && j >= 0)
        {
            if(nums1[i] > nums2[j])
            {
                nums1[k] = nums1[i];
                i--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while(i >= 0)
        {
            nums1[k] = nums1[i];
            i--;
            k--;
        }
        while(j >= 0)
        {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}