package org.example;

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

}
