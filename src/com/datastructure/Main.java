package com.datastructure;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] colors = {"green","purple"};
        for (int i = 0;i< colors.length;i++){
            System.out.println(colors[i]);
        }
            //reverse a loop
        for (int i = colors.length-1;i >= 0;i--){
            System.out.println(colors[i]);
        }

    }
}

//
//public class BubbleSort {
//    public static void main(String[] args) {
//        int[] arr = {64, 34, 25, 12, 22, 11, 90};
//        int n = arr.length;
//
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    // Swap arr[j] and arr[j+1]
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//    }
//}


//public class QuickSort {
//    public static void main(String[] args) {
//        int[] arr = {64, 34, 25, 12, 22, 11, 90};
//        int n = arr.length;
//
//        quickSort(arr, 0, n - 1);
//    }
//
//    static int partition(int arr[], int low, int high) {
//        int pivot = arr[high];
//        int i = (low - 1);
//        for (int j = low; j < high; j++) {
//            if (arr[j] < pivot) {
//                i++;
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//        int temp = arr[i + 1];
//        arr[i + 1] = arr[high];
//        arr[high] = temp;
//        return i + 1;
//    }
//
//    static void quickSort(int arr[], int low, int high) {
//        if (low < high) {
//            int pi = partition(arr, low, high);
//            quickSort(arr, low, pi - 1);
//            quickSort(arr, pi + 1, high);
//        }
//    }
//}


//import java.util.*;
//
//class Graph {
//    private int V;
//    private LinkedList<Integer> adjListArray[];
//
//    Graph(int V) {
//        this.V = V;
//        adjListArray = new LinkedList[V];
//        for (int i = 0; i < V; i++) {
//            adjListArray[i] = new LinkedList<>();
//        }
//    }
//
//    void addEdge(int src, int dest) {
//        adjListArray[src].add(dest);
//        adjListArray[dest].add(src);
//    }
//}


//class Node {
//    int key;
//    Node left, right;
//
//    public Node(int item) {
//        key = item;
//        left = right = null;
//    }
//}
//
//class BinaryTree {
//    Node root;
//
//    BinaryTree(int key) {
//        root = new Node(key);
//    }
//
//    BinaryTree() {
//        root = null;
//    }
//}