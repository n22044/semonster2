package org.example;

public class Monster {
    private String name;
    private int rare;

    public Monster(String name, int rare) {
        this.name = name;
        this.rare = rare;
        evolve(); // rareが高ければ進化させる
    }

    public void evolve() {
        if (rare >= 3) {
            this.name = "進化した" + this.name;
        }
    }

    @Override
    public String toString() {
        return this.name + ":レア度[" + this.rare + "]";
    }

    public static Monster summonMonster(int n) {
        String[] names = { "スライム", "デュラハン", "ゴーレム", "ドラゴン", "ユニコーン" };
        int index = Math.max(0, Math.min(n, names.length - 1));
        return new Monster(names[index], n);
    }

    // getter（テスト用に必要なら）
    public String getName() {
        return name;
    }

    public int getRare() {
        return rare;
    }
}
