/*
��Ŀ������һ���Ǹ����� num������������λ�ϵ�������ӣ�ֱ�����Ϊһλ����
ʾ��:
����: 38
���: 2 
����: ��λ��ӵĹ���Ϊ��3 + 8 = 11, 1 + 1 = 2�� ���� 2 ��һλ�������Է��� 2��
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
