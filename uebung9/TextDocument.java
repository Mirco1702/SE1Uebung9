package exercises.uebung9;

import java.nio.charset.Charset;

public class TextDocument extends CoreDocument {

	private String content;
    private Encoding encoding;

    public TextDocument(String content, Encoding encoding) {
        this.content = content;
        this.encoding = encoding;
    }

    @Override
    public int getSize() {
    	return content.getBytes(Charset.forName(encoding.getCharsetName())).length;
    }
}
