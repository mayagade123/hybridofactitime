package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomListener;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;

@Listeners(CustomListener.class)
public class TestActiTimeLogout extends BaseTest{
  @Test
  public void logout() throws InterruptedException, IOException {
	LoginPage lp = new LoginPage(driver);
	Flib flib = new Flib();
	lp.actiTimeValidLogin(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));
	HomePage hp = new HomePage(driver);
	hp.logOutmethod();
  }
}
