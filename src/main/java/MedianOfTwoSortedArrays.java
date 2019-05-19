import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 杨斌
 * @Date: 2019/5/19 22:42
 * O(N)复杂度，不符合题目要求
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> sortedFullArray = new ArrayList<>();
        int max = Math.max(nums1.length, nums2.length);

        int i = 0, j = 0;

        while (true) {
            if (i >= nums1.length && j >= nums2.length) {
                break;
            }
            if (i > nums1.length - 1) {
                sortedFullArray.add(nums2[j++]);
                i++;
                continue;
            }
            if (j > nums2.length - 1) {
                sortedFullArray.add(nums1[i++]);
                j++;
                continue;
            }
            if (nums1[i] > nums2[j]) {
                sortedFullArray.add(nums2[j++]);
            } else {
                sortedFullArray.add(nums1[i++]);
            }
        }
        if (sortedFullArray.size() % 2 != 0) {
            return sortedFullArray.get(sortedFullArray.size() / 2);
        } else {
            if (sortedFullArray.size() == 1) {
                return sortedFullArray.get(0);
            }
            return ((double) (sortedFullArray.get(sortedFullArray.size() / 2) + sortedFullArray
                    .get((sortedFullArray.size() - 1) / 2))) / 2;
        }
    }

    public static void main(String[] args) {
        System.out.println(new MedianOfTwoSortedArrays().findMedianSortedArrays(new int[] { 3 }, new int[] { -2, -1 }));
    }
}
