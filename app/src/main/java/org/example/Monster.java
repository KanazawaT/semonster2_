package org.example;

import java.util.Random;

public class Monster {
  public String name;
  public int rarity;
  static String[] rareRank = { "common", "uncommon", "rare", "SR", "SSR", "UR" };

  Monster() {
    this.name = "nanashi";
    this.rarity = 0;
  }

  public String call() {
    return rareRank[this.rarity] + " : " + this.name;
  }

  public void reName(String name) {
    this.name = name;
    Random random = new Random(name.hashCode());
    this.rarity = random.nextInt() % rareRank.length;
  }

}
