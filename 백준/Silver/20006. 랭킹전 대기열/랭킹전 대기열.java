import java.io.*;
import java.util.*;

public class Main {

    static class Player {
        int level;
        String name;

        Player(int level, String name) {
            this.level = level;
            this.name = name;
        }
    }

    static class Room {
        int baseLevel;
        List<Player> players = new ArrayList<>();

        Room(int baseLevel) {
            this.baseLevel = baseLevel;
        }

        boolean canEnter(Player p, int m) {
            if (players.size() >= m) return false;
            return Math.abs(p.level - baseLevel) <= 10;
        }

        void add(Player p) {
            players.add(p);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int p = Integer.parseInt(st.nextToken()); 
        int m = Integer.parseInt(st.nextToken()); 

        List<Room> rooms = new ArrayList<>();

        for (int i = 0; i < p; i++) {
            st = new StringTokenizer(br.readLine());
            int level = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            Player player = new Player(level, name);

            boolean entered = false;
            for (Room room : rooms) {
                if (room.canEnter(player, m)) {
                    room.add(player);
                    entered = true;
                    break;
                }
            }

            if (!entered) {
                Room newRoom = new Room(level);
                newRoom.add(player);
                rooms.add(newRoom);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (Room room : rooms) {
            if (room.players.size() == m) {
                sb.append("Started!\n");
            } else {
                sb.append("Waiting!\n");
            }

            room.players.sort(Comparator.comparing(ply -> ply.name));

            for (Player ply : room.players) {
                sb.append(ply.level).append(" ").append(ply.name).append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}
