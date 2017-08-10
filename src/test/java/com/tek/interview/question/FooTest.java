package com.tek.interview.question;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import org.junit.Assert;

@RunWith(MockitoJUnitRunner.class)
public class FooTest {   
    
    private Item item;
    private OrderLine orderLine;
    private Order order;
    private calculator calculator;
    private static final double DELTA = 1e-15;
    
    @Before
    public void setUp() throws Exception {
        item = new Item("book", (float)12.49);
        orderLine = new OrderLine(item, 1);
        order = new Order();        
        calculator = new calculator();        
    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void testItem() {        
        Assert.assertEquals(item.getDescription(), "book");
        Assert.assertEquals(item.getPrice(), (float)12.49, DELTA);       
    }
    
    @Test
    public void testOrderLine() {
        Assert.assertNotNull(orderLine.getItem());
        Assert.assertEquals(item.getDescription(), "book");
        Assert.assertEquals(item.getPrice(), (float)12.49, DELTA);    
        Assert.assertEquals(orderLine.getQuantity(), 1);        
    }
    
    @Test(expected=Exception.class)
    public void testOrderLineWithException() throws Exception {
        item = null;
        orderLine = new OrderLine(item, 1);
    }
    
    @Test
    public void testOrder() throws Exception {
        
        order.add(orderLine);
        Assert.assertEquals(order.size(), 1);
        Assert.assertNotNull(order.get(0));
    }
    
    @Test(expected = Exception.class)
    public void testOrderWithException() throws Exception {
        
        order.add(null);        
    }
    
    @Test
    public void setCalculator() throws Exception {
        
        order.add(orderLine);
        Map<String, Order> orders = new LinkedHashMap<String, Order>();
        orders.put("Order 1", order);
        calculator.calculate(orders);
        Assert.assertEquals(calculator.rounding(order.get(0).getItem().getPrice()), 12.49, DELTA);        
    }

}