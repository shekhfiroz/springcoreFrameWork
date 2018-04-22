package classloader;
import classloader.Rocket;
public class Launcher {
	Rocket rock;
	public static void main(String args[]) throws Exception {

		Object obj = Class.forName("classloader.Rocket",true, Launcher.class.getClassLoader().getParent());
		System.out.println(obj);
	}
}
