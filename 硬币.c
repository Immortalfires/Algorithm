/*
��16��Ӳ�ҵĴ��ӡ�16��Ӳ������һ����α��ģ������Ǹ�α���Ӳ�ұ����Ӳ��Ҫ��һЩ��
����Ҫ�ҳ����α���Ӳ�ҡ�������һ̨�������Ƚ�����Ӳ������������
������̨����������֪������Ӳ�ҵ������Ƿ���ͬ.�����Σ������ֻ����֣�
*/ 
#include<stdio.h>

int main()
{
	int coins[6];
    int index = 0,k=0;
    printf("������ÿ��Ӳ�ҵ�Ȩ�أ�");  
    for(k = 0;k < 6;k++)
    {
    	scanf("%d",&coins[k]);           //�ϴ������ʾ��ң���С������ʾ�ٱ�	
	} 
	index = fakeCoins(coins, 0, 5) + 1;
    printf("16öӲ���е�%dö�Ǽٱ�",index);
}
int fakeCoins(int coins[],int low,int high)
{ 
	int x;
	int sum1 = 0,sum2 = 0,re = 0;
    if((high-low+1) % 2 == 0){              //����ܸ���Ϊż��
    //ǰ���֮�� 
    	for(x = low;x <= low + (high - low) / 2;x++)
		{
        	sum1 += coins[x];
    	}
    	//����֮��
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
    	if((high - low + 1) % 2 != 0){              //���ܸ���Ϊ����
    	//ǰ���֮��
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
