
// 11. Container With Most Water
// Medium

// You are given an integer array height of length n.
// There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
// Find two lines that together with the x-axis form a container,
// such that the container contains the most water.
// Return the maximum amount of water a container can store.
// Notice that you may not slant the container.
    
class ArrayX 
{
    int ContainerWithMostWaterX(int height[])
    {

        int left = 0;
        int right = height.length -1;

        int maxArea = -1;

        while(left < right) 
        {
            int width = right - left;
            int minHeight = Math.min(height[left],height[right]);
            int Area = width * minHeight;

            if(Area > maxArea)
            {
                maxArea = Area;
            }
         
            if(height[left] < height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
            
        }

        return maxArea;
    }

    
}


public class ContainerWithMostWater {
    
}
