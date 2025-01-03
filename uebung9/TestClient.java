package exercises.uebung9;

public class TestClient {

	 public static void main(String[] args) {
	        // Erstellen der Dokumente
	        
	        ComplexDocument doc0 = new ComplexDocument();
	        doc0.setId("cd0");
	        
	        TextDocument doc2 = new TextDocument("Die Klausur im Fach SE findet bald statt", Encoding.UTF8);
	        doc2.setId("td2");
	        
	        ComplexDocument doc3 = new ComplexDocument();
	        doc3.setId("cd3");
	        
	        GraficDocument doc4 = new GraficDocument("localhost:8080");
	        doc4.setId("gd4");
	        
	        TextDocument doc5 = new TextDocument("Software Engineering I ist eine Vorlesung in den Studiengaengen BIS und BCS", Encoding.UTF32);
	        doc5.setId("td5");

	        ComplexDocument root = new ComplexDocument();
	        root.setId("C1");

	        // Hinzufügen der Dokumente
	        doc0.addDocument(doc2);
	        doc0.addDocument(doc3);
	        
	        doc3.addDocument(doc4);
	        doc3.addDocument(doc5);

	        // Berechnung der gesamten Größe
	        int totalSize = doc0.getSize();
	        System.out.println("Gesamte Größe der Dokumentstruktur: " + totalSize + " Bytes");
	    }
}
