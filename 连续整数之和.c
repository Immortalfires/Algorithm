/*
����һ�������� N�������ж���������������������������֮��Ϊ N?
ʾ�� 1:	����: 5			���: 2
		����: 5 = 5 = 2 + 3������������������([5],[2,3])��ͺ�Ϊ 5��
ʾ�� 2:	����: 9			���: 3
		����: 9 = 9 = 4 + 5 = 2 + 3 + 4
ʾ�� 3:	����: 15		���: 4
		����: 15 = 15 = 8 + 7 = 4 + 5 + 6 = 1 + 2 + 3 + 4 + 5
˵��:?1 <= N <= 10 ^9
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
