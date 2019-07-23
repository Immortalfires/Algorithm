/*假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
每次你可以爬 1 或 2 个台阶。你有多少种不同的方法
可以爬到楼顶呢？（递归）
*/ 
#include<stdio.h>         //递归 
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
	printf("还剩几个楼梯：");
	scanf("%d",&n);
	printf("一共有%d种走法",stairs(n));
	return 0;
}
