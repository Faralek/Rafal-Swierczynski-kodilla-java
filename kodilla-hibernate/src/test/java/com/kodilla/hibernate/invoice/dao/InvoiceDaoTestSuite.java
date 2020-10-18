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
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoTest() {
        //Given
        Product kubek = new Product("Kubek");
        Product krzeslo = new Product("Krzeslo");
        Product dlugopis = new Product("dlugopis");
        Product sluchawki = new Product("sluchawki");

        Item zestaw1 = new Item(new BigDecimal(100), 3, new BigDecimal(300));
        Item zestaw2 = new Item(new BigDecimal(200), 3, new BigDecimal(600));

        List<Product> zestawA = new ArrayList<>();
        List<Product> zestawB = new ArrayList<>();
        zestawA.add(kubek);
        zestawA.add(krzeslo);
        zestawB.add(dlugopis);
        zestawB.add(sluchawki);

        zestaw1.setProductList(zestawA);
        zestaw2.setProductList(zestawB);

        List<Item> items = new ArrayList<>();
        items.add(zestaw1);
        items.add(zestaw2);

        Invoice invoice = new Invoice();
        invoice.setItems(items);
        //When

        invoiceDao.save(invoice);
        int invoiceID = invoice.getId();
        //Then
        Assert.assertEquals(4, items.size());
        //CleanUp
        try {
             invoiceDao.deleteById(invoiceID);
        } catch (Exception e) {
            //do nothing
        }
    }
}