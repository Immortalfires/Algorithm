/*��дһ�������жϸ��������Ƿ�Ϊ������ ����������ֻ���������� 2, 3, 5���������� 
	ʾ�� 1: ����: 6		���: true
			����: 6 = 2 ��3
	ʾ�� 2:	����: 8		���: true
			����: 8 = 2 �� 2 ��2
	ʾ��3�� ����: 14	���: false 
			����: 14 ���ǳ�������Ϊ������������һ�������� 7��
*/ 

#include<stdio.h>

int Judge(int n);

int main()
{
	int n ,res;
	printf("�����������жϵ��Ǹ�����");
	scanf("%d",&n);
	res = Judge(n);
	if(res){
		printf("true");
	}else{
		printf("false");
	}
	return 0;
}

int Judge(int n)
{
	int k = n;
	while(k != 1){
		if(n % 2 == 0){
			n /= 2;
		}else if(n % 3 == 0){
			n /= 3;
		}else if(n % 5 == 0){
			n /= 5;
		}else{
			return 0;
		}
		k = n;
	}
	return 1;
}
