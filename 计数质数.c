/*
ͳ������С�ڷǸ����� n ��������������
ʾ��:	����: 10	���: 4
����: С�� 10 ������һ���� 4 ��, ������ 2, 3, 5, 7 ��
*/
#include<stdio.h>
#include<math.h> 
int main(){
	int n ,res ,i ,j ,flag;
	scanf("%d",&n);
	if(n < 3){
		res = 0;
	}else{
		for(i = 3;i < n;i++){
			flag = 0;
			for(j = 2;j < sqrt(i) + 1;j++){
				if(i % j == 0){
					flag = 1;
					break;
				}
			}
			if(flag){
				res++;
			}
		}
	}
	printf("С��%d������һ��%d��",n,res);
	return 0;
}
