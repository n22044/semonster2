package org.example;

public class Monster {
  String name;
  int rare;

  public Monster(String name, int rare) {
    // レア度が3以上なら進化
    if (rare >= 3) {
      this.name = evolveName(name);
    } else {
      this.name = name;
    }
    this.rare = rare;
  }

  // 召喚メソッド
  public static Monster summonMonster(int rare) {
    String[] monsterNames = {"デュラハン", "スライム", "ゴブリン", "オーク", "ドラゴン"};
    if (rare < 0 || rare >= monsterNames.length) {
      throw new IllegalArgumentException("レア度が不正です: " + rare);
    }
    return new Monster(monsterNames[rare], rare);
  }

  // 進化名へ変換
  private String evolveName(String name) {
    switch (name) {
      case "デュラハン":
        return "ヘッドレスナイト";
      case "スライム":
        return "キングスライム";
      case "ゴブリン":
        return "ゴブリンロード";
      case "オーク":
        return "オークキング";
      case "ドラゴン":
        return "ドラゴンマスター";
      default:
        return name + "（進化）";
    }
  }

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]";
  }
}
