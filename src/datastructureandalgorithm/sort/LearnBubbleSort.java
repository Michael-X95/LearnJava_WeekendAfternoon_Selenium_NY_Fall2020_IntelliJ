package datastructureandalgorithm.sort;

public class LearnBubbleSort {


    public static void main(String[] args) {

        int stID[]={3,56,78,23,5,12,99};

        System.out.println("Before bubble sort");
        for(int i=0; i<stID.length; i++){
            System.out.print(stID[i]+" ");

        }
        System.out.println("After bubble sort");
        LearnBubbleSort.bubblesort(stID);

    }

    public static void bubblesort(int num []){
        int temp =0;
        for (int i=0; i<num.length; i++){
            for (int j=1; j<(num.length-i);j++){
                if(num[j-1]>num[j]){
                    //swap
                    temp=num[j-1];
                    num[j-1]=num[j];
                    num[j]=temp;


                }
            }
        }
    }
}
