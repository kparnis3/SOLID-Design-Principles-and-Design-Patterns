package com.company.intersegrega.service;

import java.util.Map;
import java.util.HashMap;

import com.company.intersegrega.entity.Order;

//Added new class
public class OrderPersistenceService implements PersistenceService<Order>{

    private static final Map<Long, Order> Orders = new HashMap<>();

    @Override
    public void delete(Order entity) {
        synchronized(Orders){
            Orders.remove(entity.getId());
        }
    }

    @Override
    public Order findById(Long id) {
        synchronized(Orders){
            return Orders.get(id);
        }
    }

    //Doesn't make sense to have find by name in order
    /* 
    @Override
    public List<Order> findByName(String name) {
        throw new UnsupportedOperationException("File by name is not suported");
    } */

    @Override
    public void save(Order entity) {
        synchronized(Orders){
            Orders.put(entity.getId(), entity);
        }
        
    }


    
}
