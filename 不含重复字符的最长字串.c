/*
.给定一个字符串，
请你找出其中不含有重复字符的 最长子串 的长度
*/ 
#include<stdio.h>
#include<string.h>
int get(char *s) {
	int a = 0 ,b = 0 ,i ,res; 
    char *p = s;    //定义字符指针 
    char *p1 = p;    
	while (*p1 != '\0')
    { 
        for (i = 0; i < a; ++i) {          
            if(*(p+i) == *p1){
                if(b < a)
                    b = a;       //把未进入  if(*(p+i) == *p1)的次数赋值给b
                a = 0;            //如果含重复字符，a赋值为0，跳出循环
                p++;            // 指针向右移动一位
                p1 = p;         //两个指针指向同一位置
            }
        }
        p1++;
        a++;
    }
    if(b > a){
    	res = b;
	}else{
		res = a;
	}
	return res;               //返回较大的数，所得即所求
}

int main()
{
	char t[100];
	printf("请输入你想判断的字符串："); 
	gets(t);
	char *str = t;
	printf("%d",get(str));
	return 0;
}
