import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

waiting {
	//default waiting has timeout, and retryInterval	
	timeout = 100
	retryInterval = 0.5
	includeCauseInMessage = true
	
	preset {
		slow {
			timeout = 20
			retryInterval = 1
		}
		
		verySlow {
			timeout = 50
		}
	}
}

atCheckWaiting = "slow"
atCheckWaiting = true

driver = {new ChromeDriver()}
//Firefox
// new FireFoxDriver()

environments {
	
/*	this environment section is used through command line in that case format would be
	-Dgeb.env = <drivername>
	if we are going for chrome then it will be
	-Dgeb.env = chrome */
	
	chrome {
		driver = { new ChromeDriver()}
	}
	
	firefox {
		driver = { new FirefoxDriver()}
	}

}

baseUrl = "https://www.bettercloud.com/about-us"
reportsDir = "./target/report"

driver = {new ChromeDriver()}
