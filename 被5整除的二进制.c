/*给定由若干 0 和 1 组成的数组 A。我们定义 N_i:
从 A[0] 到 A[i] 的第 i 个子数组被解释为一个二进制数（从最高有效位到最低有效位）。
返回布尔值列表 answer。
只有当 N_i 可以被 5 整除时，答案 answer[i] 为 true，否则为 false。
示例 1：输入：[0,1,1]	输出：[true,false,false]	解释：输入数字为 0, 01, 011；也就是十进制中的 0, 1, 3 。只有第一个数可以被 5 整除，因此 answer[0] 为真。
示例 2：输入：[1,1,1]	输出：[false,false,false]
示例 3：输入：[0,1,1,1,1,1]		输出：[true,false,false,false,true,false]
示例 4：
输入：[1,1,1,0,1]
输出：[false,false,false,false,false]
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
