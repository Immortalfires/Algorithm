/*
给定一个链表，删除链表的倒数第 n 个节点，并且输出删除后的链表。
示例：给定一个链表: 1->2->3->4->5和n = 2.当删除了倒数第二个节点后
链表变为 1->2->3->5.说明：给定的 n 保证是有效的。
*/ 
#include<stdio.h>
#include<stdlib.h>
int iCount = 0;

typedef struct Linklist{
	int data;
	struct Linklist *pNext;
}Link;

Link *Create()
{	
	int n; 
	Link *pHead = (Link *)malloc(sizeof(Link));
	Link *pEnd,*pNew;
	pHead->pNext = NULL;
	pEnd = pHead;
	printf("输入你想存入的数据：");
	scanf("%d",&n);
	while(n!=-1)
	{
		iCount ++;
		pNew=(Link *)malloc(sizeof(Link));
		pNew->data = n;
		pNew->pNext = NULL;//新节点指向空，因为后面还没有元素加入
		pEnd->pNext = pNew;    //旧节点的指针指向新节点
		pEnd = pNew;      //新节点变为旧节点
		scanf("%d",&n);
	}
	return pHead;
}

void Print(Link *pHead)
{
	Link *pTemp = pHead->pNext;
	while (pTemp != NULL){
		printf("%d\t",pTemp->data);
		pTemp = pTemp->pNext;
	}
}
void Delete(Link *pHead,int pos)
{
	int i;
	Link *pBe,*pTemp;
	pBe = pTemp =pHead->pNext;
	if(pos != 1){
		for(i = 1;i<pos;i++){
			pBe = pTemp;
			pTemp = pTemp->pNext;
		}
	printf("这个数字是%d\n",pTemp->data); 
	pBe->pNext = pTemp->pNext;
	free(pTemp); 
	}else{
		printf("这个数字是%d\n",pHead->pNext->data);
		pHead->pNext = pHead->pNext->pNext;
	}
	iCount--;
}


int main()
{
	Link *pHead;
	int index;
	pHead = Create();
	printf("该链表中现在有%d个元素\n",iCount);
	Print(pHead);
	printf("你想删去倒数第几个元素：");
	scanf("%d",&index);
	Delete(pHead,iCount + 1 - index);
	printf("删除后，该链表中现在有%d个元素\n",iCount);
	Print(pHead);
	return 0;
} 
