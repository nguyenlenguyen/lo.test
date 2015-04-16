package rakuten;

public class LoginPageEntity_ES_ extends LoginPageEntity {

	@Override
	public String[] SignInButton() {
		return new String[] { "xpath", "//input[@value='Iniciar sesi�n']" };
	}

}
