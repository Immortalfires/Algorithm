/*
������������¥�ݡ���Ҫ n ������ܵ���¥����
ÿ��������� 1 �� 2 ��̨�ס�
���ж����ֲ�ͬ�ķ�����������¥���أ���������

*/ 
#include<stdio.h>
int stairs(int n){
	int x1=1,x2=2,x3,i;
	if (n <= 0){
		return 0;
	}
	else if(n == 1){
		return 1;
	}
	else if(n == 2){
		return 2;
	}
	else{
		for(i = 3;i <= n;i++){
			x3 = x1 + x2;
			x1 = x2;
			x2 = x3;
		}
		return x3;
	}
}
int main()
{
	int n;
	printf("���м���̨�ף�");
	scanf("%d",&n);
	printf("��%d�ַ���",stairs(n));
	return 0;
}
