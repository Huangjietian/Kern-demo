package cn.kerninventory.demos.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * <p>
 *     服务权重的简单实现方式1
 * </p>
 *
 * @author Kern
 */
public class Weight {

    public static void main(String[] args) {
        Upstream upstream = new Upstream();
        upstream.addServer(new Server("Server1"));
        upstream.addServer(new Server("Server2", 5));
        upstream.addServer(new Server("Server3", 2));

        for (int i = 0 ; i < 30 ; i++) {
            upstream.getServer().dispose();
        }
    }

    public static class Upstream {
        Map<Integer, Server> serverMap = new HashMap<>();
        private int serverIndex;
        Random random = new Random(0);

        public void addServer(Server server) {
            for (int i = 0 ; i < server.getWeight(); i++) {
                serverMap.put(serverIndex++, server);
            }
        }

        public Server getServer() {
            int index = random.nextInt(serverIndex);
            return serverMap.get(index);
        }

    }

    public static class Server {

        public Server(String name) {
            this.name = name;
        }

        public Server(String name, int weight) {
            this.name = name;
            if (weight <= 0) {
                weight = 0;
            }
            this.weight = weight;
        }

        private String name;
        private int weight = 1;

        public int getWeight() {
            return weight;
        }

        public void dispose() {
            System.out.println("Server :" + this.name);
        }
    }
}
