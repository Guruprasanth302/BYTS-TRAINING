int* majorityElement(int* nums, int numsSize, int* returnSize){
int c1, c2, count1 = 0, count2 = 0, *res = (int*)malloc(sizeof(int)*3);
    
*returnSize = 0;
    
for (int i = 0; i < numsSize; i++)
{
    if(c1 == nums[i]) count1++;
    else if (c2 == nums[i]) count2++;
    else if (count1 == 0) ((c1 = nums[i]) | (count1++));
    else if (count2 == 0) ((c2 = nums[i]) | (count2++));
    else ((count1--) | (count2--));
}    

count1 = 0; count2 = 0;

for (int i = 0; i < numsSize; i++)
    if(c1 == nums[i]) count1++;
    else if(c2 == nums[i]) count2++;

if (count1 > (numsSize/3)) res[(*returnSize)++] = c1;
if (count2 > (numsSize/3)) res[(*returnSize)++] = c2;
                
return res;
}
