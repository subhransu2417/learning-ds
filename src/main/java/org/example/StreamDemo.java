package org.example;

import org.example.model.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String args[]) { // Initialization of Collection
        List<Order> orderBook = new ArrayList<>();
        Order buyGoogle = new Order("GOOG.NS", 300, 900.30, Order.Side.BUY);
        Order sellGoogle = new Order("GOOG.NS", 600, 890.30, Order.Side.SELL);
        Order buyApple = new Order("APPL.NS", 400, 552, Order.Side.BUY);
        Order sellApple = new Order("APPL.NS", 200, 550, Order.Side.SELL);
        Order buyGS = new Order("GS.NS", 300, 130, Order.Side.BUY);
        orderBook.add(buyGoogle);
        orderBook.add(sellGoogle);
        orderBook.add(buyApple);
        orderBook.add(sellApple);
        orderBook.add(buyGS);

        Stream<Order> orderStream = orderBook.stream();
        Stream orderBuy = orderStream.filter(order -> order.side().equals(Order.Side.BUY));
        System.out.println("orderBuy count = " + orderBuy.count());

        Stream orderSell = orderBook.stream().filter(order -> order.side()== Order.Side.SELL);
        System.out.println("orderSell count= " + orderSell.count());
    }
}