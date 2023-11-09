public class TappingRainWater {

    public static int tappingRainWater(int height[]) {
        int width = 1;
        int tappedWater = 0;
        int waterLevel = 0;
        int n = height.length;

        int leftMax[] = new int[n];
        int rightmax[] = new int[n];

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        for (int i = 0; i < n; i++) {
            waterLevel = Math.min(leftMax[i], rightmax[i]);
            tappedWater += waterLevel - height[i] * width;
        }

        return tappedWater;
    }

    public static void main(String[] args) {

        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(tappingRainWater(arr));

    }
}
