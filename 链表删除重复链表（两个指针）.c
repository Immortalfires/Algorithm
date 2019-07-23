/*
给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
示例 1:
输入: 1->1->2
输出: 1->2
示例 2:
输入: 1->1->2->3->3
输出: 1->2->3
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
	printf("输入你想存的元素(-1代表结束)：");
	scanf("%d",&n);
	while(n != -1){
		iCount ++;
		pNew = (Num *)malloc(sizeof(Num));   //开辟内存空间 
		pNew->data = n;    //读入n 
		pNew->pNext = NULL;        //新节点下一个指向空 
		pEnd->pNext = pNew;   //旧节点的下一个是新节点 
		pEnd = pNew;    //将新节点变为旧节点 
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
	printf("链表中的元素有:");
	Print(pHead);
	DeleteOrder(pHead);
	printf("删除重复元素的链表是：");
	Print(pHead); 
	return 0;	
}
