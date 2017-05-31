package com.medipol.ecommerce;

import com.medipol.ecommerce.model.Basket;
import com.medipol.ecommerce.model.BasketItem;
import com.medipol.ecommerce.model.Product;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BasketTest {

    @Test
    public void shouldAddProductWithOneQuantity() throws Exception {

        final Basket basket = new Basket();
        final Product product = new Product(1, "nike air", 200);

        basket.addItem(new BasketItem(1, product));

        assertTrue(basket.getItems().size() == 1);
        assertTrue(basket.getItems().get(0).getProduct().equals(product));

    }

    @Test
    public void shouldAddProductWithTwoQuantity() throws Exception {

      //TODO

        final Basket basket = new Basket();
        final Product product = new Product(2, "Adidas", 400);

        basket.addItem(new BasketItem(2, product));

        assertTrue(basket.getItems().get(0).getQuantity() == 2);
        assertTrue(basket.getItems().get(0).getProduct().equals(product));


    }

    @Test
    public void shouldAddTwoDifferentProduct() throws Exception {
      //TODO

        final Basket basket = new Basket();
        final Product product = new Product(3, "Kinetix", 300);

        basket.addItem(new BasketItem(1, product));

        assertTrue(basket.getItems().size() ==3);
        assertTrue(basket.getItems().get(0).getProduct().equals(product));

        final Basket basket1 = new Basket();
        final Product product1 = new Product(4, "AbcMarka", 300);

        basket.addItem(new BasketItem(1, product1));

        assertTrue(basket1.getItems().size() ==4);
        assertTrue(basket1.getItems().get(0).getProduct().equals(product1));


    }

    @Test
    public void shouldCalculateBasketPriceWithOneProductOneQuantity() throws Exception {

        //TODO  sepette bir ürün ve 1 adet varken sepet miktarını hesapla yani fiyat

    }

    @Test
    public void shouldCalculateBasketPriceWithOneProductTwoQuantity() throws Exception {

        //TODO  1 üründen 2 tane  varken sepet miktarını hesapla yani fiyat

    }

    @Test
    public void shouldCalculateBasketPriceWithMultipleProduct() throws Exception {
        //TODO 1 den fazla ürün varken sepet miktarını ghesapla
    }

    @Test
    public void shouldUpdateBasketItemQuantity() throws Exception {
        //TODO sepetteki ürünü sayısını güncelle
    }

}