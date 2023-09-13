package com.bootcoding;

import com.bootcoding.dao.CustomerDAO;
import com.bootcoding.dao.VendorDAO;

public class Application {

    public static void main(String[] args) {
        CustomerDAO cd = new CustomerDAO();
        for(int i = 103; i < 1000; i++){
            cd.insertCustomer(i);
        }
        cd.getCustomerData();

        VendorDAO vd = new VendorDAO();
        for(int i = 103; i < 1000; i++){
            vd.insertVendor(i);
        }
    }
}
