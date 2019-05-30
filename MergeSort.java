import java.util.*;

public class MergeSort{

public static void merge(int arr[],int l,int m,int r){

int n1=m-l+1;
int n2=r-m;

int l1[]=new int[n1];
int r1[]=new int[n2];

for(int i=0;i<n1;i++){
    l1[i]=arr[l+i];
}
for(int i=0;i<n2;i++){
    r1[i]=arr[m+1+i];
}
int k=l;
int i=0,j=0;
while(i<n1 && j<n2){
if(l1[i]<=r1[j]){
    arr[k]=l1[i];
    i++;
    k++;
}else{
    arr[k]=r1[j];
    j++;
    k++;
}
}
while(i<n1){
    arr[k]=l1[i];
    i++;
    k++;
}
while(j<n2){
    arr[k]=r1[j];
    j++;
    k++;
}

}
public static void sort(int arr[], int l,int r){
if(l<r)
{
    int m=(l+r)/2;

    sort(arr,l,m);
    sort(arr,m+1,r);
    merge(arr, l, m, r);
}
}

public static void main(String args[]){
    int arr[]={1,64,43,56,21,6,23,12};
    sort(arr,0,7);
    System.out.println("printitng the array");
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}
}
}