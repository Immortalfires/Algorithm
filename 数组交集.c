/*
�����������飬��дһ���������������ǵĽ�����

ʾ�� 1:

����: nums1 = [1,2,2,1], nums2 = [2,2] ���: [2] 

ʾ�� 2:

����: nums1 = [4,9,5], nums2 = [9,4,9,8,4] ���: [9,4]

˵��:

�������е�ÿ��Ԫ��һ����Ψһ��

���ǿ��Բ�������������˳��

*/ 
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define N 1000
#define M 100000 
void jiaoji (int *a, int *b, int n, int m)  {
	int *c = (int *)malloc(M * sizeof(int));
	memset(c, 0, sizeof(int) * M);
	int i, j, max = 0;
	for (i = 0; i < n; i++) {
		if(c[a[i]] == 0){
			c[a[i]]++;
		}
		if (max < a[i]){
			max = a[i];
		}
	}
	for (i = 0; i < m; i++) {
		if(c[b[i]] == 1 || c[b[i] == 0]){
			c[b[i]]++;
		} 
		if (max < b[i]) {
			max = b[i];
		}
	}
	for (i = 0; i <= max; i++) {
		if (c[i] > 1) {
		printf("%d ", i);
		}
	}

}
int main () {
	int a[N], b[N];
	int n, i, m, k;
	scanf("%d%d", &n, &m);
	for (i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}
	for (i = 0; i < m; i++) {
		scanf("%d", &b[i]);
	}
	jiaoji(a, b, n, m);
	return 0;
} 
