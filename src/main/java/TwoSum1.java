import sun.awt.image.ShortInterleavedRaster;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 杨斌
 * @Date: 2019/5/18 22:22
 */
public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            Integer j =map.get(target-nums[i]);
            if(j!=null){
                return new int[] {j,i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No answer found");
    }

    public static void main(String[] args) {
        TwoSum1 twoSum1=new TwoSum1();
        System.out.println(Arrays.toString(twoSum1.twoSum(new int[] { 2, 11, 7, 15 }, 26)));
    }
}
