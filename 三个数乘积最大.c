/*
����һ���������飬���������ҳ�����������ɵ����˻������������˻���
ʾ�� 1:	����: [1,2,3]		���: 6
ʾ�� 2:	����: [1,2,3,4]		���: 24
*/

#include<stdio.h>
#define N 20 
int main()
{
	int n ,a[N] = {0} ,i ,j ,t ,sum1 ,sum2 ,sum;
	int flag = 0; 
	printf("���������ܸ�����");
	scanf("%d",&n);
	printf("��ʼ�����飺");
	for(i = 0;i < n;i ++){
		scanf("%d",&a[i]); 
		if(a[j] <= 0){
			flag ++;
		}

	}
	for(i = 0;i < n;i++){
		for(j = 0;j < n - 1 - i;j++){
			if(a[j] < a[j + 1]){
				t = a[j];
				a[j] = a[j + 1];
				a[j + 1] = t;
			}
		}
	}

	for(i = 0;i < n;i++){
		printf("%5d",a[i]);
	}

	if(flag >= 2){
		sum = a[0] * a[i - 1] * a[i - 2];
	}else{
		sum = a[0] * a[1] *a[2];
	}

	printf("\n%d",sum);
	return 0; 
 }
