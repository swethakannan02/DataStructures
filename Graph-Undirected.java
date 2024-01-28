/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.ArrayList;
import java.util.List;

class Graph {
    private int numVertices;
    private List<List<Integer>> adjacentList;

    // constructor
    public Graph(int numVertices) {
        this.numVertices = numVertices;
        this.adjacentList = new ArrayList<>(numVertices);

        // loop for number of vertices
        for (int i = 0; i < numVertices; i++) {
            this.adjacentList.add(new ArrayList<>());
        }
    }

    public void addEdges(int source, int destination) {
        // undirected Graph
        this.adjacentList.get(source).add(destination);
        this.adjacentList.get(destination).add(source);
    }

    // method for graph value
    public void graphPrint() {
        System.out.println("Graph: ");
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + ": ");

            // foreach loop for encapsulation
            for (Integer near : adjacentList.get(i)) {
                System.out.print(near + " ");
            }

            System.out.println();
        }
    }
}

// main class
public class ListArray {
    public static void main(String[] args) {
        // object for subclass -> Graph
        Graph grp = new Graph(5);

        // edges
        grp.addEdges(1, 3);
        grp.addEdges(0, 2);
        grp.addEdges(1, 4);
        grp.addEdges(0, 4);
        grp.addEdges(2, 3);

        // invoking the graph method
        grp.graphPrint();
    }
}
