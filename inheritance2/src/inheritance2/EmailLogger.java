package inheritance2;

public class EmailLogger extends Logger{
	@Override //extends etti�imi(basedekini) eziyorum kendi yapt���m ge�erli olacak demek
	public void log() {
		System.out.println("Email yolland�");
	}
}
