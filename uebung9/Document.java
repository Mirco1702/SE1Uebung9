package exercises.uebung9;

public abstract class Document {
	
	private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public abstract int getSize();
}
