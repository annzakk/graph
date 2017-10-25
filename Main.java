package graphs;

	import java.util.ArrayList;

	public class Main {

		public static void main(String[] args) {
			
			DirectedGraph graph = new DirectedGraph();
			
			Node a = new Node(1,"yellow");
			Node b = new Node(2,"blue");
			Node c = new Node(3,"pink");
			Node d = new Node(4,"red");
			Node e = new Node(5, "brown");
			graph.addNode(a);
			graph.addNode(b);
			graph.addNode(c);
			graph.addNode(d);
			graph.addNode(e);
			ArrayList<Node> neigh_list = new ArrayList<Node>();
			neigh_list.add(b);
			neigh_list.add(c);
			neigh_list.add(d);
			neigh_list.add(e);
			graph.addNeighbourList(a, neigh_list);
			graph.addNeighbour(b, c);
		
			System.out.println("DIRECTED GRAPH");
			graph.printNodes();
			System.out.println("");
			ArrayList<Node> neighbours = graph.getNeighboursOfNode(a);
			System.out.print("Neighbors of node " + a.getId() + " are: ");
			for(int i=0; i<neighbours.size(); i++) {
				System.out.print(neighbours.get(i).getId() + " ");
			}
			System.out.println("");
			System.out.println("");
			
			graph.deleteNeighbour(a, b);
			graph.printNodes();
			System.out.println("");
			
			graph.deleteNeighbour(d, e);
			
			UndirectedGraph undirected_graph = new UndirectedGraph();

			undirected_graph.addNode(a);
			undirected_graph.addNode(c);
			undirected_graph.addNode(e);
			undirected_graph.addNeighbour(a, c);
			undirected_graph.addNeighbour(a, e);
			undirected_graph.addNeighbour(e, c);
		
			System.out.println("");
			System.out.println("UNDIRECTED GRAPH");
			undirected_graph.printNodes();
			System.out.println("");
			
			undirected_graph.deleteNeighbour(c, a);
			undirected_graph.printNodes();
			System.out.println("");
			
			LabelledDirectedGraph labelled_graph = new LabelledDirectedGraph();
			
			labelled_graph.addNode(a);
			labelled_graph.addNode(b);
			labelled_graph.addNode(c);
			Edge edge1 = new Edge(b, "bright");
			Edge edge2 = new Edge(c, "dark");
			labelled_graph.addEdge(a, edge1);
			labelled_graph.addEdge(a, edge2);
			
			System.out.println("LABELLED DIRECTED GRAPH");
			labelled_graph.printNodes();
			System.out.println("");
			
			labelled_graph.deleteEdge(a, edge2);
			labelled_graph.printNodes();

		}

	}