/*
有16个硬币的袋子。16个硬币中有一个是伪造的，并且那个伪造的硬币比真的硬币要轻一些。
我们要找出这个伪造的硬币。我们有一台可用来比较两组硬币重量的仪器
利用这台仪器，可以知道两组硬币的重量是否相同.（分治）（二分或三分）
*/ 
#include<stdio.h>

int main()
{
	int coins[6];
    int index = 0,k=0;
    printf("请输入每个硬币的权重：");  
    for(k = 0;k < 6;k++)
    {
    	scanf("%d",&coins[k]);           //较大的数表示真币，较小的数表示假币	
	} 
	index = fakeCoins(coins, 0, 5) + 1;
    printf("16枚硬币中第%d枚是假币",index);
}
int fakeCoins(int coins[],int low,int high)
{ 
	int x;
	int sum1 = 0,sum2 = 0,re = 0;
    if((high-low+1) % 2 == 0){              //如果总个数为偶数
    //前半段之和 
    	for(x = low;x <= low + (high - low) / 2;x++)
		{
        	sum1 += coins[x];
    	}
    	//后半段之和
    	for( x= low +(high - low ) / 2 + 1;x < high + 1;x++)
		{
        	sum2 += coins[x];
    	}
  		if(sum1 > sum2)
		{
    		re = fakeCoins(coins,low + (high - low) / 2 + 1,high);
        	return re;
		}
		else if(sum1 < sum2)
		{
        	re = fakeCoins(coins,low,low +(high - low) / 2);
        	return re;
    	}
		else
		{}
	}
    	if((high - low + 1) % 2 != 0){              //若总个数为奇数
    	//前半段之和
    	int sum3 = 0;
    	for(x = low;x <= low + (high - low) / 2 - 1; x++)
		{
    		sum1+=coins[x];
		}
    	for(x = low + (high - low) / 2 + 1;x < high + 1;x++)
		{
        	sum2+=coins[x];
    	}
    	sum3 = low + (high - low) / 2;
    	if(sum1 > sum2)
		{
    		re = fakeCoins(coins,low + (high - low) / 2 + 1,high);
        	return re;
    	}
		else if(sum1 < sum2)
		{
        	re = fakeCoins(coins,low,low + (high - low) / 2 - 1);
        	return re;
    	}
		else
		{
        	re = sum3;
        	return re;
    	}
    }
    return re;
}
