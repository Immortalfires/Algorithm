/*返回所有长度为 N 且满足其每两个连续位上的数字之间的差的绝对值为 K 的非负整数。
请注意，除了数字 0 本身之外，答案中的每个数字都不能有前导零。
例如，01 因为有一个前导零，所以是无效的；但 0 是有效的。你可以按任何顺序返回答案。
示例 1：输入：N = 3, K = 7	
		输出：[181,292,707,818,929]
		解释：注意，070 不是一个有效的数字，因为它有前导零。
示例 2：输入：N = 2, K = 1
		输出：[10,12,21,23,32,34,43,45,54,56,65,67,76,78,87,89,98]
 提示：		1 <= N <= 9    0 <= K <= 9
*/ 
#include<stdio.h>
#include<math.h>
void Special(int N ,int K){
	int i ,j ,k ,flag;
	int num[9] ,last;
	for(i = pow(10,N - 1);i < pow(10,N) - 1;i++){
		last = i;
		j = 0;
		flag = 0;
		while(last){
			num[j] = last % 10;
			last /= 10;
			j++;
		}
		for(j = 0,k = 1;k < N;j++,k++){
			if(abs(num[j] - num[k]) == K){
				flag++;
			}			
		}
		if(flag == N - 1){
			printf("%d\t",i);
		}
	}
} 

int main()
{
	int N,K;
	printf("请输入需要返回的长度和差"); 
	scanf("%d%d",&N,&K);
	Special(N,K);
	return 0;
}
