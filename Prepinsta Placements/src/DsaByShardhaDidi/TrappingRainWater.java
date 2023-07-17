package DsaByShardhaDidi;

public class TrappingRainWater {
    static int trappingRainWater(int[] height, int width){
        // calculate leftMax
        int[] leftMax = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i] , leftMax[i-1]);
        }
        // calculate rightMax
        int[] rightMax = new int[height.length];
        rightMax[rightMax.length-1] = height[height.length-1];
        for (int i =height.length-2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i] , rightMax[i+1]);
        }
        // now calculate waterLevel
        int trappedWater = 0;
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(leftMax[i] , rightMax[i]);
            trappedWater = (trappedWater + waterLevel - height[i]) * width;
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int ans = trappingRainWater(height,1);
        System.out.println(ans);
    }
}
