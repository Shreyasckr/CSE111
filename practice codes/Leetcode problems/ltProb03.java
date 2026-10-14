public class ltProb03{
    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        int max = 0;
        for(int i = 0;i<height.length-1;i++){
            for(int j = i+1;j<height.length;j++){
                int small = height[i];
                if(height[i]>height[j]){
                    small = height[j];
                }
                int x = Math.abs(i-j)*small;
                if(max<x){
                    max = x;
                }
            }
        }
        System.out.println(max);
    }
}
