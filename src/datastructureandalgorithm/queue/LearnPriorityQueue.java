package datastructureandalgorithm.queue;

import java.util.PriorityQueue;

public class LearnPriorityQueue {


    // Top element from priority Queue: peek method only peek value from Queue

    public static void main(String[] args) {
        PriorityQueue<String> productList= new PriorityQueue<>();
        productList.add("T-shirt");
        productList.add("Shoes");
        productList.add("Pants");
        productList.add("Belts");
        productList.add("Suits");
        productList.add("Jacket");
        productList.add("Apple");

        System.out.println(productList.peek());

        PriorityQueue<Integer> productId= new PriorityQueue<>();
        productId.add(201);
        productId.add(202);
        productId.add(203);
        productId.add(204);
        productId.add(205);
        productId.add(206);
        productId.add(207);
        productId.add(199);
        System.out.println(productId.peek());

        for (Integer in: productId){
            System.out.println("Product Id : "+in);
        }

        System.out.println("************** Using pool Method");
        // peek() Retrieve but does not remove the head of the Queue
        System.out.println(productId.peek());
        // pool() Retrieve but remove the head of the Queue
        System.out.println(productId.poll());
        for (Integer in: productId){
            System.out.println("Product Id : "+in);
        }


    }













}