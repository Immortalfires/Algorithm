/*������������¥�ݡ���Ҫ n ������ܵ���¥����
ÿ��������� 1 �� 2 ��̨�ס����ж����ֲ�ͬ�ķ���
��������¥���أ����ݹ飩
*/ 
#include<stdio.h>         //�ݹ� 
int stairs(int n){
	if(n == 1)
		return 1;
	else if(n == 2)
		return 2;
	else if(n <= 0)
		return 0;
	else{
		return stairs(n-1)+stairs(n-2);
	}
} 
int main(){
	int n,num;
	printf("��ʣ����¥�ݣ�");
	scanf("%d",&n);
	printf("һ����%d���߷�",stairs(n));
	return 0;
}
