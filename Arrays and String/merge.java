public class merge
{   
    static void conquer(int nums[],int si,int mid , int ei){
        int merge[] = new int[ei-si+1];
        
        int id1 = si;
        int id2 = mid+1;
        int x = 0;
        while(id1 <= mid && id2 <= ei){
            if(nums[id1] <= nums[id2]){
                merge[x++] = nums[id1++];
            }else{
                merge[x++] = nums[id2++];
            }
        }
        
        while(id1 <= mid){
            merge[x++] = nums[id1++];
            
        }
        while(id2 <= ei){
            merge[x++] = nums[id2++];
        }
        
        for(int i=0 , j=si;i<merge.length;i++,j++){
            nums[j] = merge[i];
        }
    }
    static void divide(int nums[] , int si , int ei){
        if(si>=ei){
            return;
        }
        
        int mid = si + (ei-si)/2;
        divide(nums,si,mid);
        divide(nums,mid+1,ei);
        conquer(nums,si,mid,ei);

    }    
    
    public static void main(String []args){
        int nums[] = {6,3,9,5,2,8};
        divide(nums,0,nums.length-1);
        
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}