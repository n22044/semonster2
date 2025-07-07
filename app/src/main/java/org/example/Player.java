package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Player {
    String name;
    ArrayList<Monster> deck;

    public Player(String name) {
        this.name = name;
        this.deck = new ArrayList<>();
        Random rand = new Random();

        // デッキに8体のモンスターを追加
        for (int i = 0; i < 8; i++) {
            int rarity = rand.nextInt(5); // 0～4
            deck.add(Monster.summonMonster(rarity));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Deck:").append(name).append("\n");
        for (Monster m : deck) {
            sb.append(m.toString()).append("\n");
        }
        return sb.toString().trim(); // 最後の改行を削除
    }
}
