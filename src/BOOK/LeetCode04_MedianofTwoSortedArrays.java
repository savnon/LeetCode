package BOOK;

public class LeetCode04_MedianofTwoSortedArrays {
	public double findMedianSortedArrays(int[]nums1, int[]nums2) {
		int i = 0;
		int j = 0;
		int k = 0;
		int[]union = new int[nums1.length + nums2.length];
		while (i < nums1.length && j < nums2.length && k<=union.length/2) {
			if (nums1[i] < nums2[j]) {
				union[k++]=nums1[i++];
			} else {
				union[k++]=nums2[j++];
			}
		}
		while(i<nums1.length && k<=union.length/2){
			union[k++]=nums1[i++];
		}
		while(j<nums2.length && k<=union.length/2){
			union[k++]=nums2[j++];
		}
		if(union.length%2==1)
			return union[union.length/2];
		else
			return (union[union.length/2-1]+union[union.length/2])/2.0;
	}
}
