package inheritance2;

public class EmailLogger extends Logger{
	@Override //extends ettiðimi(basedekini) eziyorum kendi yaptýðým geçerli olacak demek
	public void log() {
		System.out.println("Email yollandý");
	}
}
