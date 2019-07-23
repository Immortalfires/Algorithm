/*
假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
每次你可以爬 1 或 2 个台阶。
你有多少种不同的方法可以爬到楼顶呢？（迭代）

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
	printf("还有几个台阶：");
	scanf("%d",&n);
	printf("有%d种方法",stairs(n));
	return 0;
}
