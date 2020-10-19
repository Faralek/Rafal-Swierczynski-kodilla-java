package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private ItemDao itemDao ;


    @Test
    public void testInvoiceDaoSave() {
        //given
        Product product = new Product("Kubek");
        Invoice invoice = new Invoice("123");
        Invoice invoice1 = new Invoice("987");
        Item item = new Item(new BigDecimal(100),2,new BigDecimal(200));
        Item item1 = new Item(new BigDecimal(50),3,new BigDecimal(150));

        product.getItems().add(item);
        product.getItems().add(item1);

        item.setInvoice(invoice);
        item1.setInvoice(invoice1);

        int id = product.getId();

        //when
        itemDao.save(item);

        //then
        int size = product.getItems().size();
        Assert.assertEquals(2,size);
        //clean up

    }
}
