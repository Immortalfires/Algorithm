/*
��дһ�������������ַ��������е������ǰ׺��
��������ڹ���ǰ׺�����ؿ��ַ��� ""��
ʾ�� 1:����: ["flower","flow","flight"] ���: "fl"
ʾ�� 2:����: ["dog","racecar","car"]  ���: ""
����: ���벻���ڹ���ǰ׺��
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
	printf("�������뼸���ַ�����������ʮ������");
	scanf("%d",&n); 
	for(i = 0;i < n;i++){
		scanf("%s",str[i]);
	}
	qianzhui();
	return 0;
}
