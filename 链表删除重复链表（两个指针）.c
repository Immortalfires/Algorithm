/*
����һ����������ɾ�������ظ���Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Ρ�
ʾ�� 1:
����: 1->1->2
���: 1->2
ʾ�� 2:
����: 1->1->2->3->3
���: 1->2->3
*/ 

#include<stdio.h>
#include<stdlib.h>
int iCount = 0;
typedef struct Number{
	int data;
	struct Number *pNext;
}Num;

Num *Create()
{
	int n;
	Num *pHead = (Num *)malloc(sizeof(Num));
	Num *pEnd,*pNew;
	pHead->pNext = NULL;
	pEnd = pHead;
	printf("����������Ԫ��(-1�������)��");
	scanf("%d",&n);
	while(n != -1){
		iCount ++;
		pNew = (Num *)malloc(sizeof(Num));   //�����ڴ�ռ� 
		pNew->data = n;    //����n 
		pNew->pNext = NULL;        //�½ڵ���һ��ָ��� 
		pEnd->pNext = pNew;   //�ɽڵ����һ�����½ڵ� 
		pEnd = pNew;    //���½ڵ��Ϊ�ɽڵ� 
		scanf("%d",&n);
	}
	return pHead; 
}

void Print(Num *pHead)
{
	int count = iCount;
	Num *pTemp = pHead->pNext;
	while(pTemp != NULL){
		if(count == 1){
			printf("%d",pTemp->data);
		}else{
			printf("%d->",pTemp->data);
		}
		pTemp = pTemp->pNext;
		count--;		
	}
	printf("\n");
}

void  DeleteOrder(Num *pHead)
{
	Num *p1 = pHead->pNext;
	Num *p2 = p1->pNext; 
	while(p1 != NULL && p1->pNext != NULL){
		if(p1->data == p2->data){
			p1->pNext = p2->pNext;
			p2 = p2->pNext;
			iCount--;
		}else{
			p1 = p1->pNext;
			p2 = p2->pNext;
		}
		if(p2 == NULL)
		{
			break;
		}
	}
}

int main()
{
	Num *pHead = Create();
	printf("�����е�Ԫ����:");
	Print(pHead);
	DeleteOrder(pHead);
	printf("ɾ���ظ�Ԫ�ص������ǣ�");
	Print(pHead); 
	return 0;	
}
