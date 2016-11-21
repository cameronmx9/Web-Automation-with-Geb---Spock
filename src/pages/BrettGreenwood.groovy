package pages

import geb.Page


class BrettGreenwood extends Page{
	
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
		BrettGName(wait:true){ $("h2.style-title.strong.no-margin")[6]}
		
		// Job Title CSS Selector
		BrettGTitle(wait:true){ $("h5.no-margin.blue")[7]}
		
		// Image URL CSS Selector
		BrettGImageURL(wait:true){ $("img.alignleft")[6]}
		
		// Content bio CSS Selector
		BrettGcontent(wait:true){ $("#leaders > div > div:nth-child(2) > div:nth-child(13)")}
		
		// LinkedIn Link CSS Selector
		BrettGLinkedInClick(wait:true){ $("#leaders > div > div:nth-child(2) > div:nth-child(13) > h2 > a")}
		
		// Verify Leadership title has loaded CSS Selector
		leadershipPageLoad(wait:true){$("#leaders > div > div:nth-child(1) > h2")}
		
		// Location CSS Selector
		BrettGLocation(wait:true){ $("#name > h1 > span > span")}
		
		linkinClick(wait:true){ $("#header-banner > div > a")}

	}
	
	// Click the leadership button on About Us page
	def "Click Leadership button"(){
		leadershipClick.click()
	}
	
	// Retrieve the first name substring from the name string
	def "Get first name"(){
		
		String name = BrettGName.text()
		
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
		
		String name = BrettGName.text()
		
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
		
		return BrettGTitle.text()
	}
	
	// Retrieve image URL
	def "Get image URL"() {
		return BrettGImageURL.getAttribute("src")
	}
	
	// Retrieve first name count
	def "Get first name count"(){
		
		//println BrettGcontent.text()
		//println "Get first name"()
		
		String str = BrettGcontent.text()
		String findStr = "Brett"
		String wholeName = "Brett Greenwood"
		
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
		
		
		BrettGLinkedInClick.click()
		//title == "Brett Greenwood | LinkedIn"
	}
	
	// Retrieve Location
	def "Get Location"() {
		println BrettGLocation.value()
	}
	
	def "LinkedIn Click"() {
		linkinClick.click()
	}
	
	// Check to ensure Leadership page has fully loaded
	def "Check for Leadership page load"(){
		leadershipPageLoad.isDisplayed()
	}
	def "Get title of page"() {
		return title
	}
}
