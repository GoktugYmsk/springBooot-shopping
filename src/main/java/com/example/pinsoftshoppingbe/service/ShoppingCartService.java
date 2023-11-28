package com.example.pinsoftshoppingbe.service;

import com.example.pinsoftshoppingbe.item.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShoppingCartService {

  private List<Item> sepet = new ArrayList<>();

  public void urunEkle(Item item) {
    sepet.add(item);
  }

  public List<Item> getSepet() {
    return sepet;
  }


}
