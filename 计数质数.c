/*
统计所有小于非负整数 n 的质数的数量。
示例:	输入: 10	输出: 4
解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
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
	printf("小于%d的质数一共%d个",n,res);
	return 0;
}
