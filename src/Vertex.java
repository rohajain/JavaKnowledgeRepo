
public class Vertex {
	String label;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Vertex(String label) {
		super();
		this.label = label;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this==obj)
			return true;
		
		if(!(obj instanceof Vertex))
				return false;
		Vertex v = (Vertex)obj;
		
		return this.label.equals(v.label);
	}
	

}
