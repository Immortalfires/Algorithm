/*
编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""。
示例 1:输入: ["flower","flow","flight"] 输出: "fl"
示例 2:输入: ["dog","racecar","car"]  输出: ""
解释: 输入不存在公共前缀。
*/ 
#include<stdio.h>
#include<string.h>
char str[10][10];
int n;
void qianzhui()
{
	int i ,j ,iCount;
	if(n == 0){
		printf("NO");
	}else if(n == 1){
		printf("%s",str[0]);
	}else{
		for(i = 0;i < 10;i++){
			iCount = 0;
			for(j = 1; j < n ;j++){
				if(str[0][i] == str[j][i] && iCount == 1){
					printf("%c",str[j][i]);
					break;
				}else if(str[0][i] == str[j][i]){
					iCount++;
				}else{
					break;
				}
			}
		}
	}
}

int main()
{
	int i;
	printf("你想输入几个字符串（不超过十个）：");
	scanf("%d",&n); 
	for(i = 0;i < n;i++){
		scanf("%s",str[i]);
	}
	qianzhui();
	return 0;
}
