package com.tut.array_java;

public class Insert_Updata_Delete_Display_Array {
    public static void insert(int[]arr,int ele,int pos){
      int i;
      for(i=arr.length-1;i>pos-1;i--){
          arr[i]=arr[i-1];
      }

      arr[pos-1]=ele;

      for(i=0;i<arr.length;i++){
          System.out.print(arr[i]+"\t");
      }
    }
    public static void delete_bypos(int[]arr,int pos){
        int i;
        for(i=pos-1;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }

        System.out.println();
        for(i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+"\t");
        }
    }
    public static void delete_byele(int[]arr,int ele){
        int i;
        for(i=0;i<arr.length;i++){
           if(arr[i]==ele){
               break;
           }
        }

        for(int j=i;j<arr.length-1;j++){
            arr[j]=arr[j+1];
        }

        System.out.println();
        for(i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public static void update(int[]arr,int ele,int pos){
         int i;
         arr[pos]=ele;
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public static void main(String[] args) {
        int[]arr = {3,4,7,2,5};

//        insert(arr,6,3);
//        delete_bypos(arr,3);
//        delete_byele(arr,4);
        update(arr,8,1);

    }
}
