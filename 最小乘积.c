/*
����һ������������ nums���ҳ��������ڳ˻�С�� k ��������������ĸ���
ʾ�� ����: nums = [10,5,2,6], k = 100,���: 8
����: 8���˻�С��100��������ֱ�Ϊ: [10], [5], [2], [6], [10,5], [5,2], [2,6], [5,2,6]
	��Ҫע����� [10,5,2] �����ǳ˻�С��100��������
˵��:
	0 < nums.length <= 50000
	0 < nums[i] < 1000
	0 <= k < 10^6
*/ 
#include<stdio.h>
int main()
{
	int nums[1000]={0} ,i = 0 ,sum = 1, n ,k;
	int p = 0 ,q = 0 ,m = 0,iCount = 0;
	printf("������������������Ԫ�أ�");
	scanf("%d",&n);
	while(n != 10001){
		nums[i] = n;
		i += 1;
		scanf("%d",&n);
		iCount += 1;
	}             
	             //�������Ԫ�� 
	printf("�������˻�ֵ��");
	scanf("%d",&k);

	for(q;q < iCount;q++){
		sum *= nums[q];
		while(sum >= k && p <= q){
			sum /= nums[p++];
		}
		m += q - p + 1;
	}
	printf("%d",m);
	return 0;

