/*
给定一个正整数 N，试求有多少组连续正整数满足所有数字之和为 N?
示例 1:	输入: 5			输出: 2
		解释: 5 = 5 = 2 + 3，共有两组连续整数([5],[2,3])求和后为 5。
示例 2:	输入: 9			输出: 3
		解释: 9 = 9 = 4 + 5 = 2 + 3 + 4
示例 3:	输入: 15		输出: 4
		解释: 15 = 15 = 8 + 7 = 4 + 5 + 6 = 1 + 2 + 3 + 4 + 5
说明:?1 <= N <= 10 ^9
*/ 

#include<stdio.h>

void Judge(int N){
	int i ,j , k, sum ,iCount = 1;
	int temp;
	for(i = 1;i <= N / 2;i++){
		for(j = i + 1;j < N;j++){
			sum = 0;
			for(k = i;k < j;k++){
				sum += k;
			}
			if(sum == N){
				iCount++;
				printf("[");
				temp = i;
				while(temp != j){
					printf("%d,",temp++);
					if(j - temp == 1){
						printf("%d]\n",temp++);
					}

				} 
			}
		}
	}
	printf("[%d]\n",N); 
	printf("%d",iCount);
}

int main()
{
	int N;
	scanf("%d",&N);
	Judge(N);
	return 0;
}
