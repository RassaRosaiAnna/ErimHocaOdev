package com.medipol.ecommerce.service;

import com.medipol.ecommerce.model.Basket;
import org.junit.Test;

public class BasketServiceTest {

    @Test
    public void shouldCreateBasket() throws Exception {
        //TODO basket olustur
        Basket basket = new Basket();

    }

    @Test
    public void shouldAddProductWithOneQuantity() throws Exception {
        //TODO bir adetli ürün ekle
    }

    @Test
    public void shouldAddProductWithTwoQuantity() throws Exception {
        //TODO 2 adetli ürün ekeleme
    }

    @Test
    public void shouldAddMultipleProduct() throws Exception {
        //TODO birden fazla
    }

    @Test
    public void shouldRemoveProduct() throws Exception {
        //TODO
        //sepetten urunu sildi mi
    }

    @Test
    public void shouldIncrementBasketItemQuantity() throws Exception {
        //TODO  basketin ürün sayısını 1 arttır
    }

    @Test
    public void shouldDecrementBasketItemQuantity() throws Exception {
        //TODO basketin ürün sayısını 1 azakt
    }

    @Test
    public void shouldDecrementBasketItemQuantityAndRemoveWhenQuantityZero() throws Exception {
        //TODO  sepetteki ürünün sayısını bir azalt 0 sa ürünü sepetten sil
    }

    @Test
    public void shouldPriceBeZeroWhenBasketIsEmpty() throws Exception {
        //TODO sepet bosken total 0 olmalı

    }

    @Test
    public void shouldCalculateOneProductPrice() throws Exception {
        //TODO sepette 1 urun varken price hesaplanmali
    }

    @Test
    public void shouldCalculateMultipleProductPrice() throws Exception {
        //TODO sepette coklu urun varken price hesaplanmali
    }

    @Test
    public void shouldCalculateOneProductPriceAfterIncrement() throws Exception {
        //TODO sepette 1 urun varken sayisi arttirildiginda price hesaplanmali
    }

    @Test
    public void shouldCalculateOneProductPriceAfterDecrement() throws Exception {
        //TODO sepette 1 urun varken sayisi azaltildiginda price hesaplanmali
    }

    @Test
    public void shouldCalculatePriceWithMultipleProductAndOneQuantityIncrementOperation() throws Exception {
        //TODO sepette coklu urun varken ve bir sayi arttirma isleminden sonra price hesaplanmali
    }

    @Test
    public void shouldCalculatePriceWithMultipleProductAndOneQuantityDecrementOperation() throws Exception {
        //TODO sepette coklu urun varken ve bir sayi azaltma isleminden sonra price hesaplanmali
    }


}