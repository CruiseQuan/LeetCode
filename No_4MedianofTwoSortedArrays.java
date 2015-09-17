public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		      int m = nums1.length;
	        int n = nums2.length;
	        if ((m + n) % 2 == 0) {//两个数组合并后的长度为偶数，查找这两个数组合并后的第(m+n)/2与第(m+n)/2+1个数，求平均值
	            double r1 = (double) findMedianSortedArraysHelp(nums1, 0, m, nums2, 0, n, (m + n) / 2);
	            double r2 = (double) findMedianSortedArraysHelp(nums1, 0, m, nums2, 0, n, (m + n) / 2 + 1);
	            return (r1 + r2) / 2;
	        } else{//两个数组合并后的长度为奇数，找寻这两个数组合并后的第(m+n)/2个数
	            return findMedianSortedArraysHelp(nums1, 0, m, nums2, 0, n, (m +n+1) / 2);
	        }
		 
	 }
	 public  int findMedianSortedArraysHelp(int[]nums1, int left1, int right1, int []nums2, int left2, int right2, int k){
		 int length1=right1-left1;
		 int length2=right2-left2;
		 if(length1<=0)//数组为空
			 return  nums2[left2 + k - 1];
		 if(length2<=0)
			 return  nums1[left1 + k - 1];
		 if (k == 1)//只需要找第一个数，返回二者中的最小数
	            return Math.min(nums1[left1], nums2[left2]);
		 int mid1=(left1+right1)/2;
		 int mid2=(left2+right2)/2;
		 if (nums1[mid1] <= nums2[mid2]) {
	            if (length1 / 2 + length2 / 2 + 1 >= k)
	                return findMedianSortedArraysHelp(nums1, left1, right1, nums2, left2, mid2, k);
	            else
	                return findMedianSortedArraysHelp(nums1, mid1 + 1, right1, nums2, left2, right2, k - length1 / 2 - 1);
	        } else {
	            if (length1 / 2 + length2 / 2 + 1 >= k)
	                return findMedianSortedArraysHelp(nums1, left1, mid1, nums2, left2, right2, k);
	            else
	                return findMedianSortedArraysHelp(nums1, left1, right1, nums2, mid2 + 1, right2, k - length2/ 2 - 1);

	        }
		 
	 }
}
