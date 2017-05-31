package com.medipol.ecommerce.service;

import com.medipol.ecommerce.model.Basket;
import com.medipol.ecommerce.model.BasketItem;
import com.medipol.ecommerce.model.Product;
import com.medipol.ecommerce.service.ProductService;
import com.medipol.springdemo.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import static org.junit.Assert.assertTrue;

public class ProductServiceTest {


    // product   =   ürün
    // basket    =   sepet
    // quantitiy =   miktar
    // price     =   fiyat

    @Test
    public void shouldListInitialProducts() throws Exception {
        //TODO  başlangıctaki ürüğnleri listele

        final Product product = new Product(1, "nike air", 200);

        ProductService productService;
        productService.list();

    }

    @Test
    public void shouldAddOneProduct() throws Exception {
        //TODO bir ürün ekle
        final Product product = new Product(1, "Abc", 10);
        String productName = product.getName();
        assertTrue(productName.equals("Abc"));

    }

    @Test
    public void shouldMultipleOneProduct() throws Exception {
        //TODO birden fazla ürün ekle

        final Product product = new Product(1, "Bellona", 10);
        final Product product2 = new Product(2, "Casper", 5);

        String productName = product.getName();
        String productName2 = product2.getName();


        assertTrue(productName.equals("Bellona"));
        assertTrue(productName2.equals("Casper"));

    }

    @Test
    public void shouldDeleteProductById() throws Exception {
        //TODO id ile ürün sil
        final Product product = new Product(3, "Bellona", 10);
        int a = product.getId();
        // Kendime göre ek birşey yapayım dedim
        assertTrue(a== 3);
        ProductService productService;
        productService.delete(a);

    }

    @Test
    public void shouldUpdateProductName() throws Exception {
        //TODO ürün ismi güncelle
        ProductService productService;
        productService.update(3,"Merinos");

    }

    @Test
    public void shouldUpdateProductPrice() throws Exception {
        //TODO ürün fiyat güncelle
        ProductService productService;
        productService.update(3,"Merinos",100);

    }

    @Test
    public void shouldUpdateProductNameAndPrice() throws Exception {
        //TODO ürün isim ve fiyat güncelle
        ProductService productService;
        productService.update(3,"MerinosHali",550);
    }

}