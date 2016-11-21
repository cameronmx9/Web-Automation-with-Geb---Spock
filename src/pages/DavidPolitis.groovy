package pages

import geb.Page


class DavidPolitis extends Page{
	
	// current URL = baseURL + static URL
	
	static url =""

	// At Checker - Check Page Title	
	static at = {
		title == "BetterCloud - About Us"
		
	}
	
	
	// Navigator block
	static content = {		

		// Leadership link CSS Selector
		leadershipClick(wait:true){ $("#mag-sect > div.container > div.table.centered > ul > li:nth-child(2) > a")}
		
		// FName CSS Selector
		davidPName(wait:true){ $("h2.style-title.strong.no-margin")[0]}
		
		// Job Title CSS Selector
		davidPTitle(wait:true){ $("h5.no-margin.blue")[1]}
		
		// Image URL CSS Selector
		davidPImageURL(wait:true){ $("img.alignleft")[0]}
		
		// Content bio CSS Selector
		davidPcontent(wait:true){ $("#leaders > div > div:nth-child(2) > div:nth-child(1)")}
		
		// LinkedIn Link CSS Selector
		davidPLinkedInClick(wait:true){ $("#leaders > div > div:nth-child(2) > div:nth-child(1) > h2 > a")}
		
		// Verify Leadership title has loaded CSS Selector
		leadershipPageLoad(wait:true){$("#leaders > div > div:nth-child(1) > h2")}
		
		// Location CSS Selector
		davidPLocation(wait:true){ $("#demographics > dd.descriptor.adr > span")}
		
		
		

	}
	
	// Click the leadership button on About Us page
	def "Click Leadership button"(){
		leadershipClick.click()
	}
	
	// Retrieve the first name substring from the name string
	def "Get first name"(){
		
		String name = davidPName.text()
		
		String lastName = ""
		String firstName = ""
		
		if(name.split("\\w+").length>1){
			
			lastName = name.substring(name.lastIndexOf(" ")+1);
			firstName = name.substring(0, name.lastIndexOf(' '));
		}
		else{
			
			firstName = name;
		}
		
		return firstName
		
		
		
	}
	
	// Retrieve the last name substring from the name string
	def "Get last name"(){
		
		String name = davidPName.text()
		
		String lastName = ""
		String firstName = ""
		
		if(name.split("\\w+").length>1){
			
			lastName = name.substring(name.lastIndexOf(" ")+1);
			firstName = name.substring(0, name.lastIndexOf(' '));
		}
		else{
			
			firstName = name;
		}
		
		return lastName
		
	}
	
	// Retrive job title
	def "Get job title"() {
		
		return davidPTitle.text()
	}
	
	// Retrieve image URL
	def "Get image URL"() {
		return davidPImageURL.getAttribute("src")
	}
	
	// Retrieve first name count
	def "Get first name count"(){
		
		//println davidPcontent.text()
		//println "Get first name"()
		
		String str = davidPcontent.text()
		String findStr = "David"
		String wholeName = "David Politis"
		
		int lastIndex = 0;
		int count = 0;
		
		int lastIndexRem = 0;
		int remove = 0;
		
		while (lastIndex != -1){
			
			lastIndex = str.indexOf(findStr, lastIndex);
			
			if(lastIndex != -1){
				count++;
				lastIndex += findStr.length();
			}
		}
		
		while (lastIndexRem != -1){
			
			lastIndexRem = str.indexOf(wholeName, lastIndexRem);
			
			if(lastIndexRem != -1){
				remove++;
				lastIndexRem += wholeName.length();
			}
		}
		
		return count - remove
	}
	
	// Click LinkedIn Link
	def "Click LinkedIn Link"() {
		
		
		davidPLinkedInClick.click()
		//title == "David Politis | LinkedIn"
	}
	
	// Retrieve Location
	def "Get Location"() {
		println davidPLocation.value()
	}
	
	def "Sign into LinkedIn"(){
		signInLinkedIn.click()
	}
	
	def "Enter LinkedIn Email"(){
		enterEmail.value("test@gmail.com")
	}
	// Check to ensure Leadership page has fully loaded
	def "Check for Leadership page load"(){
		leadershipPageLoad.isDisplayed()
	}
	def "Get title of page"() {
		return title
	}
}
