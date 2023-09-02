package demo.main.xpath;

public class XpathLogin {
	
	// singleton
	private static XpathLogin obj = null;

	private XpathLogin() {
	}

	public static XpathLogin getInstancia() {
		instanciar();
		return obj;
	}

	private synchronized static void instanciar() {
		if (obj == null) {
			obj = new XpathLogin();
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public final String txtuser = "//*[@id='user-name']";
	public final String txtpassword = "//*[@id='password']";
	public final String btnLogin = "//*[@id='login-button']";

	
}
