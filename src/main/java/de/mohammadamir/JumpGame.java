package de.mohammadamir;

// Jump Game
// https://leetcode.com/problems/jump-game/
public class JumpGame {
    public boolean canJump(int[] nums) {
        int reachableIndex = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if ( (i + nums[i]) >= reachableIndex) {
                reachableIndex = i;
            }
        }

        return (reachableIndex == 0);
    }
}
