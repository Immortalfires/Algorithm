/*
����һ������ɾ������ĵ����� n ���ڵ㣬�������ɾ���������
ʾ��������һ������: 1->2->3->4->5��n = 2.��ɾ���˵����ڶ����ڵ��
�����Ϊ 1->2->3->5.˵���������� n ��֤����Ч�ġ�
*/ 
#include<stdio.h>
#include<stdlib.h>
typedef struct Linklist{
	int data;
	struct Linklist *pNext;
}Link;
int iCount = 0;
Link *Create()
{
	int n;
	Link *pHead = (Link *)malloc(sizeof(Link));
	Link *pEnd ,*pNew;
	pHead->pNext = NULL;
	pEnd = pHead;
	printf("��������������");
	scanf("%d",&n);
	while(n != -1){
		iCount ++;
		pNew = (Link *)malloc(sizeof(Link));
		pNew->data = n;      //�����ݴ����½ڵ� 
		pNew->pNext = NULL;   //�½ڵ�ָ��� 
		pEnd->pNext = pNew;   //�ɽڵ��ָ��ָ����һ���½ڵ� 
		pEnd = pNew;   //�½ڵ��Ϊ�ɽڵ� 
		scanf("%d",&n);
	}
	return pHead; 
}

void Print(Link *pHead)
{
	Link *pTemp = pHead->pNext;
	while(pTemp != NULL){
		printf("%d\t",pTemp->data);
		pTemp = pTemp->pNext; 
	}
}

int main()
{
	Link *pHead = Create();
	printf("ԭ�����ǣ�");
	Print(pHead);
	printf("\n");
	Link *p1 ,*p2;
	p1 = pHead;
	p2 = pHead; 
	int index ,i;
	printf("����ɾ�������ڼ�����");
	scanf("%d",&index);
	if(index == iCount){
		printf("�������%d\n",pHead->pNext->data);
		pHead->pNext = pHead->pNext->pNext; 
	}else if(index > iCount || index == 0){
		printf("��������");
		exit(1);
	}else{
		for(i = 0;i < index;i ++){
			p1 = p1->pNext;
		}
		while(p1->pNext != NULL){
			p2 = p2->pNext;
			p1 = p1->pNext;
		}
		printf("�������%d\n",p2->pNext->data);
		p2->pNext = p2->pNext->pNext;
	}
	printf("ɾ���������ǣ�"); 
	Print(pHead);
	return 0;
}
