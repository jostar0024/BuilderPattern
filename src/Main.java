
public class Main {
	public static void main(String[] args) {
		final TextBuilder textBuilder = new TextBuilder();
		final Director director = new Director(textBuilder);
		director.construct();
		System.out.println(textBuilder.getText());
	}
}
