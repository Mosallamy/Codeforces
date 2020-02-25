import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Graph<A> {

    // We use Hashmap to store the edges in the graph 
    public Map<A, List<A> > map = new HashMap<>();

    // This function adds a new vertex to the graph 
    public void addVertex(A s)
    {
        map.put(s, new LinkedList<A>());
    }

    // This function adds the edge 
    // between source to destination 
    public void addEdge(A source,
                        A destination,
                        boolean bidirectional)
    {

        if (!map.containsKey(source))
            addVertex(source);

        if (!map.containsKey(destination))
            addVertex(destination);

        map.get(source).add(destination);
        if (bidirectional == true) {
            map.get(destination).add(source);
        }
    }

    // This function gives the count of vertices 
    public void getVertexCount()
    {
        System.out.println("The graph has "
                + map.keySet().size()
                + " vertex");
    }

    // This function gives the count of edges 
    public void getEdgesCount(boolean bidirection)
    {
        int count = 0;
        for (A v : map.keySet()) {
            count += map.get(v).size();
        }
        if (bidirection == true) {
            count = count / 2;
        }
        System.out.println("The graph has "
                + count
                + " edges.");
    }

    // This function gives whether 
    // a vertex is present or not. 
    public void hasVertex(A s)
    {
        if (map.containsKey(s)) {
            System.out.println("The graph contains "
                    + s + " as a vertex.");
        }
        else {
            System.out.println("The graph does not contain "
                    + s + " as a vertex.");
        }
    }

    // This function gives whether an edge is present or not. 
    public void hasEdge(A s, A d)
    {
        if (map.get(s).contains(d)) {
            System.out.println("The graph has an edge between "
                    + s + " and " + d + ".");
        }
        else {
            System.out.println("The graph has no edge between "
                    + s + " and " + d + ".");
        }
    }

    // Prints the adjancency list of each vertex. 
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        for (A v : map.keySet()) {
            builder.append(v.toString() + ": ");
            for (A w : map.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }

        return (builder.toString());
    }
}

// Driver Code 
class Main{

    public static void main(String args[]) throws FileNotFoundException {
        Scanner input = new Scanner(new File("graph.in"));
        Graph<Integer> g = new Graph<Integer>();

        int nodes = input.nextInt();
        int edges = input.nextInt();
        int weights[] = new int[nodes];

        for (int i = 0; i < nodes; i++) {
            weights[i] = input.nextInt();
        }

        for (int i = 0; i < edges; i++) {

            int source = input.nextInt();
            int distination = input.nextInt();
            g.addEdge(source,distination,false);
        }

        int length = 0;
        int max =0;
        int last =0;
        int i =0;
        while (g.map.get(i).size() > 0) {
            max= 0;
            if(g.map.get(i).size() > 0) {
                System.out.println("--------");
                for (int j = 0; j < g.map.get(i).size(); j++) {
                    System.out.println("Here " + (i) + " - " +g.map.get(i).get(j) +" " + weights[g.map.get(i).get(j) ] );
                    if(weights[g.map.get(i).get(j)] > max) {
                        max = weights[g.map.get(i).get(j)];
                        last = g.map.get(i).get(j);
                    }
                }
                length += max;
            }
            System.out.println("Winner is "+ last + " " + length);
            i = last;
        }
        System.out.println(length + " " + last);
    }
}
