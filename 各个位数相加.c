/*
题目：给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
示例:
输入: 38
输出: 2 
解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
*/
#include<stdio.h>

int main()
{
	int data ,sum ,t ,temp1 ,temp2;
	scanf("%d",&data);
	temp1 = data;
	while(temp1 / 10 != 0){
		data = temp1;
		sum = 0;
		while(data){
			t = data % 10;
			sum += t; 
			data /= 10;
		}
		temp1 = sum;
	}
	printf("%d",sum);
	return 0;
 } 
