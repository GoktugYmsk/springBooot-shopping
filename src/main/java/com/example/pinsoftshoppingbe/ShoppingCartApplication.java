package com.example.pinsoftshoppingbe;

import com.example.pinsoftshoppingbe.item.Item;
import com.example.pinsoftshoppingbe.service.ShoppingCartService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ShoppingCartApplication {

  public static void main(String[] args) {
    SpringApplication.run(ShoppingCartApplication.class, args);
  }

  @Bean
  public CommandLineRunner demo(ShoppingCartService shoppingCartService) {
    return args -> {

      Item item1 = new Item("Laptop", "Lenovo", 2500.0, 2000.0);
      Item item2 = new Item("Akıllı Telefon", "Samsung", 1500.0, 1200.0);

      shoppingCartService.urunEkle(item1);
      shoppingCartService.urunEkle(item2);

      List<Item> sepet = shoppingCartService.getSepet();
      for (Item item : sepet) {
        System.out.println("Ürün Adı: " + item.getUrunAdi());
        System.out.println("Satış Fiyatı: " + item.getSatisFiyati());
        System.out.println("Alış Fiyatı: " + item.getAlisFiyati());
        System.out.println("Kar: " + item.hesaplaKar());
        System.out.println("----------------------");
      }
    };
  }
}

