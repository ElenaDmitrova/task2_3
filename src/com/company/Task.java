package com.company;

//7.Удалить из списка все элементы, индекс которых (отсчет начинаем с 0) соответствует какому-либо числу Фибоначчи.

public class Task {
    public static SimpleLinkedList<Integer> Process(SimpleLinkedList<Integer> list) throws Exception, SimpleLinkedList.SimpleLinkedListException {
        int k = 0;
        for (int i = 0; i < list.size(); i++){
            int even = list.get(i);
            if (even % 2 == 0){
                list.remove(k);
                k--;
                }
            k++;
        }
        return list;
    }

    public static void Vivod(int[][] arr, int s, int v){
        for (int i = 0; i <= s; i++){
            for (int j = 0; j<= v; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
