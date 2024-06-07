package P12;

public class Graph26 {
    int vertex;
    DoubleLinkedList26[] list;

    public Graph26(int vertex) {
        this.vertex = vertex;
        list = new DoubleLinkedList26[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new DoubleLinkedList26();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addLast(tujuan, jarak);
//        list[tujuan].addLast(asal, jarak);
    }

    public void degree(int asal) throws Exception{
        int k = 0, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size; j++) {
                list[i].get(j);
            }

            for (k = 0; k < list[asal].size; k++) {
                list[asal].get(k);
            }
        }
        totalOut = k;

        System.out.println("Indegree dari vertex " + asal + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + asal + " : " + totalOut);
        System.out.println("Degree dari vertex " + asal + " : " + (totalIn + totalOut));
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }

        System.out.println("Semua edge berhasil dihapus");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size > 0) {
                System.out.print("Vertex " + (char) ('A' + i) + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + "(" + list[i].getJarak(j) + ") ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public void removeEdge(int asal, int tujuan) {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
//                return;
            }
        }
    }



}
