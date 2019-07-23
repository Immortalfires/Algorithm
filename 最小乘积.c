/*
给定一个正整数数组 nums。找出该数组内乘积小于 k 的连续的子数组的个数
示例 输入: nums = [10,5,2,6], k = 100,输出: 8
解释: 8个乘积小于100的子数组分别为: [10], [5], [2], [6], [10,5], [5,2], [2,6], [5,2,6]
	需要注意的是 [10,5,2] 并不是乘积小于100的子数组
说明:
	0 < nums.length <= 50000
	0 < nums[i] < 1000
	0 <= k < 10^6
*/ 
#include<stdio.h>
int main()
{
	int nums[1000]={0} ,i = 0 ,sum = 1, n ,k;
	int p = 0 ,q = 0 ,m = 0,iCount = 0;
	printf("请输入你想存入的数组元素：");
	scanf("%d",&n);
	while(n != 10001){
		nums[i] = n;
		i += 1;
		scanf("%d",&n);
		iCount += 1;
	}             
	             //获得数组元素 
	printf("输入最大乘积值：");
	scanf("%d",&k);

	for(q;q < iCount;q++){
		sum *= nums[q];
		while(sum >= k && p <= q){
			sum /= nums[p++];
		}
		m += q - p + 1;
	}
	printf("%d",m);
	return 0;

