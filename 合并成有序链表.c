/*
将两个有序链表合并为一个新的有序链表并返回。
新链表是通过拼接给定的两个链表的所有节点组成的。
*/ 
#include<stdio.h>
#include<stdlib.h>
typedef struct Node{
	int number;
	struct Node *pNext;
}Linklist;
int iCount;

Linklist *Create()                                                    //链表创建 
{
	Linklist *pHead=NULL;
	Linklist *pNew,*pEnd;
	iCount=0;
	pNew=pEnd=(Linklist *)malloc(sizeof(Linklist));
	printf("enter the number\n"); 
	scanf("%d",&pNew->number);
	while(pNew->number!=0)
	{
		iCount++;
		if(iCount==1)
		{
			pNew->pNext=NULL;
			pEnd=pNew;
			pHead=pNew;
		}
		else
		{
			pNew->pNext=NULL;
			pEnd->pNext=pNew;
			pEnd=pNew;
		}
		pNew=(Linklist *)malloc(sizeof(Linklist));
		scanf("%d",&pNew->number);
	}
	free(pNew);
	return pHead;
}
void Print(Linklist *pHead){
	Linklist *pTemp = pHead;
	while(pTemp != NULL){
		printf("%d\t",pTemp->number);
		pTemp = pTemp->pNext;
	}
}

Linklist *Merge(Linklist *pHead1,Linklist *pHead2){
	if(pHead1 ==NULL){
		return pHead2;
	}
	if(pHead2 == NULL){
		return pHead1;
	}
	Linklist *head,*p1,*p2;
	if(pHead1->number < pHead2->number){
		head = pHead1;
		p1 = pHead1->pNext;
		p2 = pHead2;
	}else{
		head = pHead2;
		p1 = pHead1;
		p2 = pHead2->pNext;
	} 
	Linklist *pMove = head;
	while (p1 && p2){
		if(p1->number < p2->number){
			pMove->pNext = p1;
			pMove = p1;
			p1 = p1->pNext;
		}else if(p1->number > p2->number){
			pMove->pNext = p2;
			pMove = p2;
			p2 = p2->pNext; 
		}
	}
	if(p1)
		pMove->pNext = p1;
	if(p2)
		pMove->pNext = p2;
	return head;

} 

int main()
{
	int i ,j ,k ,n;
	Linklist *pHead1 = Create();
	Print(pHead1);
	printf("\n"); 
	printf("第一个链表创建完成\n");
	Linklist *pHead2 = Create();
	Print(pHead2);
	printf("\n");
	printf("第二个链表创建完成\n"); 
	Linklist *pHead3 = Merge(pHead1,pHead2);
	printf("合并之后的有序链表是：");
	Print(pHead3);
	return 0;
}
