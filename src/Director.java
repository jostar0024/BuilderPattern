
public class Director {
	private final Builder m_builder;
	
	public Director(final Builder builder) {
		m_builder = builder;
	}
	
	public void construct() {
		m_builder.makeTitle("私の好きな果物");
		m_builder.makeString("ランキング");
		m_builder.makeItems(new String[] {
				"リンゴ",
				"みかん",
				"もも",
		});
		m_builder.close();
	}
}
