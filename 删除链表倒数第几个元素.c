/*
����һ������ɾ������ĵ����� n ���ڵ㣬�������ɾ���������
ʾ��������һ������: 1->2->3->4->5��n = 2.��ɾ���˵����ڶ����ڵ��
�����Ϊ 1->2->3->5.˵���������� n ��֤����Ч�ġ�
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
	printf("���������������ݣ�");
	scanf("%d",&n);
	while(n!=-1)
	{
		iCount ++;
		pNew=(Link *)malloc(sizeof(Link));
		pNew->data = n;
		pNew->pNext = NULL;//�½ڵ�ָ��գ���Ϊ���滹û��Ԫ�ؼ���
		pEnd->pNext = pNew;    //�ɽڵ��ָ��ָ���½ڵ�
		pEnd = pNew;      //�½ڵ��Ϊ�ɽڵ�
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
	printf("���������%d\n",pTemp->data); 
	pBe->pNext = pTemp->pNext;
	free(pTemp); 
	}else{
		printf("���������%d\n",pHead->pNext->data);
		pHead->pNext = pHead->pNext->pNext;
	}
	iCount--;
}


int main()
{
	Link *pHead;
	int index;
	pHead = Create();
	printf("��������������%d��Ԫ��\n",iCount);
	Print(pHead);
	printf("����ɾȥ�����ڼ���Ԫ�أ�");
	scanf("%d",&index);
	Delete(pHead,iCount + 1 - index);
	printf("ɾ���󣬸�������������%d��Ԫ��\n",iCount);
	Print(pHead);
	return 0;
} 
