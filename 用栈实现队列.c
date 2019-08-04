#include<stdio.h>
#include<stdlib.h>
#include<string.h> 
typedef struct stack{
	int data;
	struct stack *pNext;
}Stack;

typedef struct queue{
	Stack *s1;
	int count;
}Queue;

Queue *initQueue(){
	Queue *q = (Queue *)malloc(sizeof(Queue));
	memset(q,0,sizeof(q));
	return q;
}

void queuePush(Queue *q,int n){
	Stack *temp = (Stack *)malloc(sizeof(Stack));
	Stack *s2 = NULL;
	Stack *s3 = NULL;
	temp->data = n;
	temp->pNext = NULL;
	//若栈temp中存在元素，则一次性压入栈s2中 
	while(q->s1){
		s3 = q->s1;
		q->s1 = q->s1->pNext;
		s3->pNext = s2;
		s2 = s3;
	}
	//压入栈temp 
	q->s1 = temp;
	//将栈s2中的元素重新按最开始的入栈顺序压入栈temp
	while(s2){
		s3 = s2;
		s2 = s2->pNext;
		s3->pNext = q->s1;
		q->s1 = s3; 
	} 
	q->count ++;
}

int queuePop(Queue* temp) {
    int res;
    Stack *p = temp->s1;
    temp->s1 = p->pNext;
    temp->count--;
    res = p->data;
    free(p);
    return res;
}

int queuePeek(Queue* temp) {
    return temp->s1->data;
}

void isEmpty(Queue* temp) {
    if(temp->count){
    	printf("false");
	}else{
		printf("true");
	}
}

int main(){
	Queue *queue = initQueue(); 
	queuePush(queue,2);
	queuePush(queue,3);
	queuePush(queue,34);
	queuePush(queue,58);
	queuePush(queue,77);
	printf("pop (%d)\n",queuePop(queue));
	printf("peek is %d\n",queuePeek(queue));
	isEmpty(queue);
	return 0;
	return 0;
} 
