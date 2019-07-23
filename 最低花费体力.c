/*
数组的每个索引做为一个阶梯，第 i个阶梯对应着一个非负数的体力花费值 cost[i](索引从0开始)。
每当你爬上一个阶梯你都要花费对应的体力花费值，然后你可以选择继续爬一个阶梯或者爬两个阶梯。
您需要找到达到楼层顶部的最低花费。在开始时，你可以选择从索引为 0 或 1 的元素作为初始阶梯。
示例 1:
输入: cost = [10, 15, 20]
输出: 15
解释: 最低花费是从cost[1]开始，然后走两步即可到阶梯顶，一共花费15。
示例 2:
输入: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
输出: 6
解释: 最低花费方式是从cost[0]开始，逐个经过那些1，跳过cost[3]，一共花费6。
动态规划 
*/

#include<stdio.h>
#define N 100
int min();
int stairs(); 
int cost[N];

int main()
{
	int n ,i ,res = 0;
	printf("输入阶梯数：");
	scanf("%d",&n);
	printf("输入登上每层台阶所需要的体力值:"); 
	for(i = 0;i < n;i ++){
		scanf("%d",&cost[i]);
	}
	res = stairs(n);
	printf("输出：%d\n",res);
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
        t[i] = min(t[i-2], t[i-1]) + cost[i];       // t[i]代表到达第i级阶梯所需要的最小花费
    }
    return t[size];
}
