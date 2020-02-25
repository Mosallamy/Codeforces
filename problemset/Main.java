import java.util.*; 
  
class Graph<A> { 
  
    // We use Hashmap to store the edges in the graph 
    private Map<A, List<A> > map = new HashMap<>(); 
  
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
public class Main { 
  
    public static void main(String args[]) 
    { 
  
        // Object of graph is created. 
        Graph<Integer> g = new Graph<Integer>(); 
  
        // edges are added. 
        // Since the graph is bidirectional, 
        // so boolean bidirectional is passed as true. 
        g.addEdge(0, 1, false); 
        g.addEdge(0, 4, false); 
        g.addEdge(1, 2, false); 
        g.addEdge(1, 3, false); 
        g.addEdge(1, 4, false); 
        g.addEdge(2, 3, false); 
        g.addEdge(3, 4, false); 
  
        // print the graph. 
        System.out.println("Graph:\n"
                           + g.toString()); 
  
        // gives the no of vertices in the graph. 
        g.getVertexCount(); 
  
        // gives the no of edges in the graph. 
        g.getEdgesCount(false); 
  
        // tells whether the edge is present or not. 
        g.hasEdge(3, 4); 
  
        // tells whether vertex is present or not 
        g.hasVertex(5); 
    } 
} 