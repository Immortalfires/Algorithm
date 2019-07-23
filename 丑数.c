/*编写一个程序判断给定的数是否为丑数。 （丑数就是只包含质因数 2, 3, 5的正整数） 
	示例 1: 输入: 6		输出: true
			解释: 6 = 2 ×3
	示例 2:	输入: 8		输出: true
			解释: 8 = 2 × 2 ×2
	示例3： 输入: 14	输出: false 
			解释: 14 不是丑数，因为它包含了另外一个质因数 7。
*/ 

#include<stdio.h>

int Judge(int n);

int main()
{
	int n ,res;
	printf("请输入你想判断的那个数：");
	scanf("%d",&n);
	res = Judge(n);
	if(res){
		printf("true");
	}else{
		printf("false");
	}
	return 0;
}

int Judge(int n)
{
	int k = n;
	while(k != 1){
		if(n % 2 == 0){
			n /= 2;
		}else if(n % 3 == 0){
			n /= 3;
		}else if(n % 5 == 0){
			n /= 5;
		}else{
			return 0;
		}
		k = n;
	}
	return 1;
}
