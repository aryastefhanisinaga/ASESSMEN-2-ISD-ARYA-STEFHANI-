import java.util.Scanner;

public class Main {

    private static void executePrancis(boolean useBFS) {
        AdjacencyList adjacencyList = new AdjacencyList();
        
        adjacencyList.addEdge("Paris", "Brussels");
        adjacencyList.addEdge("Paris", "Zurich");
        
        adjacencyList.addEdge("Brussels", "Amsterdam");
        adjacencyList.addEdge("Brussels", "Zurich");
        adjacencyList.addEdge("Brussels", "Paris");


        adjacencyList.addEdge("Zurich", "Paris");
        adjacencyList.addEdge("Zurich", "Brussels");
        adjacencyList.addEdge("Zurich", "Vienna");
        adjacencyList.addEdge("Zurich", "Prague");


        adjacencyList.addEdge("Amsterdam", "Brussels");
        adjacencyList.addEdge("Amsterdam", "Hamburg");
        adjacencyList.addEdge("Amsterdam", "Prague");


        adjacencyList.addEdge("Vienna", "Budapest");
        adjacencyList.addEdge("Vienna", "Prague");
        adjacencyList.addEdge("Vienna", "Zurich");


        adjacencyList.addEdge("Prague", "Vienna");
        adjacencyList.addEdge("Prague", "Zurich");
        adjacencyList.addEdge("Prague", "Warsaw");
        adjacencyList.addEdge("Prague", "Hamburg");
        adjacencyList.addEdge("Prague", "Amsterdam");
        
        
        adjacencyList.addEdge("Hamburg", "Amsterdam");
        adjacencyList.addEdge("Hamburg", "Prague");
        adjacencyList.addEdge("Hamburg", "Warsaw");

        adjacencyList.addEdge("Warsaw", "Prague");
        adjacencyList.addEdge("Warsaw", "Budapest");
        adjacencyList.addEdge("Warsaw", "Hamburg");


        adjacencyList.addEdge("Budapest", "Vienna");
        adjacencyList.addEdge("Budapest", "Warsaw");
       

        if (useBFS) {
            BFS bfs = new BFS(adjacencyList);
            System.out.println("BFS dari Paris:");
            bfs.search("Paris");
        } else {
            DFS dfs = new DFS(adjacencyList);
            System.out.println("DFS dari Paris:");
            dfs.search("Paris");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih algoritma untuk mencari urutan kunjungan kota:");
        System.out.println("1. BFS");
        System.out.println("2. DFS");
        int choice = scanner.nextInt();
        scanner.close();

        if (choice == 1) {
            executePrancis(true);
        } else if (choice == 2) {
            executePrancis(false);
        } else {
            System.out.println("Pilihan tidak valid. Pilih 1 untuk mencari BFS dan Pilih 2 untuk mencari DFS");
        }
    }
}
