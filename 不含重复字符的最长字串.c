/*
.����һ���ַ�����
�����ҳ����в������ظ��ַ��� ��Ӵ� �ĳ���
*/ 
#include<stdio.h>
#include<string.h>
int get(char *s) {
	int a = 0 ,b = 0 ,i ,res; 
    char *p = s;    //�����ַ�ָ�� 
    char *p1 = p;    
	while (*p1 != '\0')
    { 
        for (i = 0; i < a; ++i) {          
            if(*(p+i) == *p1){
                if(b < a)
                    b = a;       //��δ����  if(*(p+i) == *p1)�Ĵ�����ֵ��b
                a = 0;            //������ظ��ַ���a��ֵΪ0������ѭ��
                p++;            // ָ�������ƶ�һλ
                p1 = p;         //����ָ��ָ��ͬһλ��
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
	return res;               //���ؽϴ���������ü�����
}

int main()
{
	char t[100];
	printf("�����������жϵ��ַ�����"); 
	gets(t);
	char *str = t;
	printf("%d",get(str));
	return 0;
}
