/*���������� 0 �� 1 ��ɵ����� A�����Ƕ��� N_i:
�� A[0] �� A[i] �ĵ� i �������鱻����Ϊһ�������������������Чλ�������Чλ����
���ز���ֵ�б� answer��
ֻ�е� N_i ���Ա� 5 ����ʱ���� answer[i] Ϊ true������Ϊ false��
ʾ�� 1�����룺[0,1,1]	�����[true,false,false]	���ͣ���������Ϊ 0, 01, 011��Ҳ����ʮ�����е� 0, 1, 3 ��ֻ�е�һ�������Ա� 5 ��������� answer[0] Ϊ�档
ʾ�� 2�����룺[1,1,1]	�����[false,false,false]
ʾ�� 3�����룺[0,1,1,1,1,1]		�����[true,false,false,false,true,false]
ʾ�� 4��
���룺[1,1,1,0,1]
�����[false,false,false,false,false]
*/

#include<stdio.h>
#include<stdlib.h>
void Div();
int main(){
	int *A ,Asize ,i ,n;
	scanf("%d" ,&Asize);
	A = (int *) calloc(Asize,sizeof(int));
	for(i = 0;i < Asize;i++){
		scanf ("%d",&n);
		A[i] = n;
	}
	Div(A ,Asize);
	return 0;
}

void Div(int* A, int Asize){
	int i ,num=0 ,*res;
	res = (int *) calloc(Asize,sizeof(int));
	for(i = 0;i < Asize;i++){
		num = ((num<<1 )+ A[i]) % 5;
		if(num==0){
			res[i] = 1;
		}
	}
	for(i = 0;i < Asize;i++){
		if(res[i] == 1){
			printf("true\t");
		}else{
			printf("false\t");
		}
	}
}
