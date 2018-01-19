package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;

public class TestInvalidLogin extends BaseTest 
{
	@Test
	public void testInvalidLogin()
	{
	LoginPage l=new LoginPage(driver);
	Lib lib=new Lib();
	lib.getRowCount(EXCEL_PATH,"InvalidLogin");
	for(int i=0;i<4;i++)
	{
		String username=Lib.getCellValue(EXCEL_PATH,"InvalidLogin", i, 0);
		String password=Lib.getCellValue(EXCEL_PATH,"InvalidLogin", i, 1);
		l.setPassword(password);
		l.setUsername(username);
		l.clickLogin();
	}
	
	}

}
