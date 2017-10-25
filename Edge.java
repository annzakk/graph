package graphs;

	public class Edge {
		
		private Node name;
		private String label;
		
		public Edge(Node nam, String lab) {
			this.name = nam;
			this.label = lab;
		}
		
		public Node getName() {
			return name;
		}
		public void setname(Node name) {
			this.name = name;
		}
		public String getLabel() {
			return label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
	}
