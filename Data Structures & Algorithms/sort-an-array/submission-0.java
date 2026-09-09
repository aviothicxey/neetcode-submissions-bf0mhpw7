class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    void mergeSort(int[]arr,int low , int high){
        if(low >= high) return;
        int mid = low + (high - low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low , mid , high);
    }
    void merge(int[]arr,int low , int mid , int high){
        int temp[] = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int ind =0;

        while(left <= mid && right <= high){
            if(arr[left]<=arr[right]){
                temp[ind] = arr[left];
                ind++;
                left++;
            }else{
                temp[ind]=arr[right];
                right++;
                ind++;
            }
        }
        while(left<= mid){
            temp[ind] = arr[left];
            ind++;
            left++;
        }
        while(right <= high){
            temp[ind] = arr[right];
            right++;
            ind++;
        }
        for(int i = 0 ; i < temp.length ; i++){
            arr[low+i] = temp[i];
        }
    }
}