/*
��Ŀ������һ���Ǹ����� num������������λ�ϵ�������ӣ�ֱ�����Ϊһλ����
ʾ��:
����: 38
���: 2 
����: ��λ��ӵĹ���Ϊ��3 + 8 = 11, 1 + 1 = 2�� ���� 2 ��һλ�������Է��� 2
*/
//��ȡ�ݹ�
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
	printf("�����%d",num(data));
	return 0;
} 
