/*
�����ÿ��������Ϊһ�����ݣ��� i�����ݶ�Ӧ��һ���Ǹ�������������ֵ cost[i](������0��ʼ)��
ÿ��������һ�������㶼Ҫ���Ѷ�Ӧ����������ֵ��Ȼ�������ѡ�������һ�����ݻ������������ݡ�
����Ҫ�ҵ��ﵽ¥�㶥������ͻ��ѡ��ڿ�ʼʱ�������ѡ�������Ϊ 0 �� 1 ��Ԫ����Ϊ��ʼ���ݡ�
ʾ�� 1:
����: cost = [10, 15, 20]
���: 15
����: ��ͻ����Ǵ�cost[1]��ʼ��Ȼ�����������ɵ����ݶ���һ������15��
ʾ�� 2:
����: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
���: 6
����: ��ͻ��ѷ�ʽ�Ǵ�cost[0]��ʼ�����������Щ1������cost[3]��һ������6��
��̬�滮 
*/

#include<stdio.h>
#define N 100
int min();
int stairs(); 
int cost[N];

int main()
{
	int n ,i ,res = 0;
	printf("�����������");
	scanf("%d",&n);
	printf("�������ÿ��̨������Ҫ������ֵ:"); 
	for(i = 0;i < n;i ++){
		scanf("%d",&cost[i]);
	}
	res = stairs(n);
	printf("�����%d\n",res);
	return 0;
}

int min(int a,int b)
{
	int res;
	res = (a < b ? a : b);
	return res; 
}

int stairs(int size) {
	int i;
	int t[size+1];
    if(size == 1)
        return cost[0];
    if(size == 2)
        return min(cost[0], cost[1]);
	t[0] = cost[0];
    t[1] = cost[1];
    for(i = 2; i <= size; i++)
    {
        t[i] = min(t[i-2], t[i-1]) + cost[i];       // t[i]�������i����������Ҫ����С����
    }
    return t[size];
}
