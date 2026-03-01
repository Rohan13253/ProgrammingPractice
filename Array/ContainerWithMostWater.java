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
