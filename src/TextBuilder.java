
public class TextBuilder implements Builder{
	private StringBuilder m_builder = new StringBuilder();
	
	@Override
	public void makeTitle(final String title) {
		m_builder.append("**************¥n");
		m_builder.append("----");
		m_builder.append(title);
		m_builder.append("----¥r¥r");
	}
	
	@Override
	public void makeString(final String str) {
		m_builder.append("");
		m_builder.append(str);
		m_builder.append("¥n¥n");
	}
	
	@Override
	public void makeItems(final String[] items) {
		for(final String item : items) {
			m_builder.append("+");
			m_builder.append(item);
			m_builder.append("¥n");
		}
	}
	
	@Override
	public void close() {
		m_builder.append("**************");
	}
	
	public String getText() {
		return m_builder.toString();
	}
}
