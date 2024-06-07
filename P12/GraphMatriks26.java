package P12;

public class GraphMatriks26 {
    int vertex;
    int[][] matriks;

    public GraphMatriks26(int vertex) {
        this.vertex = vertex;
        matriks = new int[vertex][vertex];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.println("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }

    public void degree(int asal) {
        int totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][asal] != 0) {
                totalIn++;
            }
            if (matriks[asal][i] != 0) {
                totalOut++;
            }
        }

        System.out.println("Indegree dari vertex " + (char) ('A' + asal) + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + (char) ('A' + asal) + " : " + totalOut);
        System.out.println("Degree dari vertex " + (char) ('A' + asal) + " : " + (totalIn + totalOut));
    }

}
