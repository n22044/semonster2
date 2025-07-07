import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SeMonsterGame {
    private Map<String, Player> players;

    public SeMonsterGame() {
        this.players = new HashMap<>();
    }

    public void addPlayer(String playerName) {
        if (!players.containsKey(playerName)) {
            players.put(playerName, new Player(playerName));
        }
    }

    public void draw(String playerName) {
        Player player = players.get(playerName);
        if (player == null) {
            System.out.println("プレイヤーが存在しません: " + playerName);
            return;
        }

        // モンスターをランダムに1体生成して追加（仮実装）
        Monster m = MonsterGenerator.randomMonster(); // 仮: Monster生成用クラス
        player.getMonsters().add(m);
        System.out.println(playerName + " drew a monster: " + m);
    }

    public void showPlayers() {
        for (Player p : players.values()) {
            System.out.println(p);
        }
    }



    public class Monster {
    private String name;
    private int power;

    public Monster(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public String toString() {
        return name + "(" + power + ")";
    }
}

  }


