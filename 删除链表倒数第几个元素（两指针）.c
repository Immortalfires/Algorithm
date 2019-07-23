/*
给定一个链表，删除链表的倒数第 n 个节点，并且输出删除后的链表。
示例：给定一个链表: 1->2->3->4->5和n = 2.当删除了倒数第二个节点后
链表变为 1->2->3->5.说明：给定的 n 保证是有效的。
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
	printf("输入你想存的数：");
	scanf("%d",&n);
	while(n != -1){
		iCount ++;
		pNew = (Link *)malloc(sizeof(Link));
		pNew->data = n;      //将数据存入新节点 
		pNew->pNext = NULL;   //新节点指向空 
		pEnd->pNext = pNew;   //旧节点的指针指向下一个新节点 
		pEnd = pNew;   //新节点变为旧节点 
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
	printf("原数组是：");
	Print(pHead);
	printf("\n");
	Link *p1 ,*p2;
	p1 = pHead;
	p2 = pHead; 
	int index ,i;
	printf("你想删除倒数第几个数");
	scanf("%d",&index);
	if(index == iCount){
		printf("这个数是%d\n",pHead->pNext->data);
		pHead->pNext = pHead->pNext->pNext; 
	}else if(index > iCount || index == 0){
		printf("输入有误");
		exit(1);
	}else{
		for(i = 0;i < index;i ++){
			p1 = p1->pNext;
		}
		while(p1->pNext != NULL){
			p2 = p2->pNext;
			p1 = p1->pNext;
		}
		printf("这个数是%d\n",p2->pNext->data);
		p2->pNext = p2->pNext->pNext;
	}
	printf("删除后数组是："); 
	Print(pHead);
	return 0;
}
