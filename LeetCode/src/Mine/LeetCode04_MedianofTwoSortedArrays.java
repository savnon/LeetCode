package Mine;

public class LeetCode04_MedianofTwoSortedArrays {

	
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	   int m = nums1.length, n = nums2.length;
           int i = 0, j = 0, current = 0, val = 0;
           double ans = 0;
           int[] arr1 = new int[m+n];
           
           while(i<m && j<n) {
               if(nums1[i] > nums2[j]) {
               	val = nums2[j++];
               } else {
               	val = nums1[i++];
               }
               arr1[current] = val;
               current++;

           }
           
           
           while(i<m) {
           	arr1[current++] = nums1[i++];
           }
           
           while(j<n) {
           	arr1[current++] = nums2[j++];
           }
           
           
           if((m + n)%2 == 1) {
               int mid = (m + n)/2;
               ans = arr1[mid];
           }else {
               int mid2 = (m + n)/2;
               
               ans = (arr1[mid2 -1] + arr1[mid2])/2.0;
           }
           
           return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr1 = {1,2};
			int[] arr2 = {3,4};
			double a = findMedianSortedArrays(arr1,arr2);
			System.out.println(a);
	}

}
