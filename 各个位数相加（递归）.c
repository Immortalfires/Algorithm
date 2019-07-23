/*
题目：给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
示例:
输入: 38
输出: 2 
解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2
*/
//采取递归
#include<stdio.h>
int num(int x)
{
	int res = 0 ,temp;
	temp = x;
	if(temp / 10 == 0){
		res += temp;
	}else{
		while(x){
			temp = x % 10;
			res += temp; 
			x /= 10;
		}
		if(res / 10 != 0){
			return num(res);
		}
	}
	return res;
}
int main()
{
	int data;
	scanf("%d",&data);
	printf("输出：%d",num(data));
	return 0;
} 
