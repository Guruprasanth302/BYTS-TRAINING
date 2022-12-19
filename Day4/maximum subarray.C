int maxSubArray(int* arr, int n){
    int sum=0;
    int maxsum=arr[0];
    for(int i=0;i<n;i++){
        sum+=arr[i];
        if(sum>maxsum)
            maxsum=sum;
        if(sum<0)
            sum=0;
    }
    return maxsum;
    }
