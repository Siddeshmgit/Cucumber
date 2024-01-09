package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksExample {
@Before(order=1,value="@valid")
public void validLogin() {
	System.out.println("validLogin");
}
@Before(value="@invalid" ,order=1)
public void invalidLogin() {
	System.out.println("invalidLogin");
}
@Before(order=0)
public void openBrowser() {
	System.out.println("openBrowser");
}
@After(order=0)
public void closeBrowser() {
	System.out.println("closeBrowser");
}
@After(value="@valid", order=1)
public void logout() {
	System.out.println("logout");
}

}
