package com.middle.advanced.test;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;

public class Subject {

    public static void main(String[] args) {

    }

    /**
     * 算出nums中俩数相加得target的坐标
     * **/
    public void getTarget(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                result[0] = i;
                result[1] = hash.get(nums[i]);
            }
            hash.put(target - nums[i], i);
        }
        System.out.println(JSON.toJSONString(result));
    }

    /**
     *给定一个字符串S，检查是否能重新排布其中的字母，使得两相邻的字符不同。
     若可行，输出任意可行的结果。若不可行，返回空字符串。
     示例 1:
     输入: S = "aab"
     输出: "aba"
     示例 2:
     输入: S = "aaab"
     输出: ""
     **/
    public String getSortString(String S){

        return null;
    }
}
