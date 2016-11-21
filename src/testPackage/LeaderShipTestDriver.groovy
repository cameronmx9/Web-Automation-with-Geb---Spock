package testPackage

import geb.spock.GebSpec
import pages.*



class LeaderShipTestDriver extends GebSpec{
	
	// create new Leadership.csv file to output data to
	def LeadershipFile = new File('Leadership.csv')
	
	
	// methods for scraping David Politis Data		
	def "David Politis Methods"() {		
		
		when:
		// call the DavidPolitis.groovy class	
		to DavidPolitis
		
		and:
				
		"Click Leadership button"()	
		
		and:
		
		// Make sure leadership page has fully loaded		
		"Check for Leadership page load"()
		
		and:
		
		println "Get first name"()
		println "Get first name"()
		
		// Creatle Leadership.csv Title in first row
		LeadershipFile.append("BetterCloud SDET Leadership Data Assesment " + "," + "by: Cameron Townley" + "\r" + "\r")
		
		// Write first name to Leadership.csv
		LeadershipFile.append("First Name: " + "," + "Get first name"() + "\r")		
		
		and:
		
		println "Get last name"()
		// Write last name to Leadership.csv
		LeadershipFile.append("Last Name: "+"," + "Get last name"() + "\r")
		
		and:
		
		println "Get job title"()
		// Write job title to Leadership.csv
		LeadershipFile.append("Title: " + "," + "Get job title"() + "\r")
		
		and:
		
		println "Get image URL"()
		// Write image URL to Leadership.csv
		LeadershipFile.append("Image URL: " + "," + "Get image URL"() + "\r")
		
		and:
		
		println "Get first name count"()
		// Write first name counter to Leadership.csv
		LeadershipFile.append("First Name Count: "+"," + "Get first name count"() + "\r")
		
//		and:
//		
//		"Click LinkedIn Link"()
		
		then:
		println "Done with Daivd Politis BetterCloud Bio"
		
		// Create blank row after finishing data
		LeadershipFile.append("\r")		

	}
	
	// methods for scraping David Hardwick Data
	def "David Hardwick Methods"() {
		
		when:
		// call the DavidHardwick.groovy class
		to DavidHardwick
		
		and:
				
		"Click Leadership button"()
		
		and:
		
		// Make sure leadership page has fully loaded
		"Check for Leadership page load"()
		
		and:
		
		println "Get first name"()
		println "Get first name"()
		
		// Write first name to Leadership.csv
		LeadershipFile.append("First Name: " + "," + "Get first name"() + "\r")
		
		and:
		
		println "Get last name"()
		// Write last name to Leadership.csv
		LeadershipFile.append("Last Name: "+"," + "Get last name"() + "\r")
		
		and:
		
		println "Get job title"()
		// Write job title to Leadership.csv
		LeadershipFile.append("Title: " + "," + "Get job title"() + "\r")
		
		and:
		
		println "Get image URL"()
		// Write image URL to Leadership.csv
		LeadershipFile.append("Image URL: " + "," + "Get image URL"() + "\r")
		
		and:
		
		println "Get first name count"()
		// Write first name counter to Leadership.csv
		LeadershipFile.append("First Name Count: "+"," + "Get first name count"() + "\r")
		
//		and:
//		
//		"Click LinkedIn Link"()
		
		then:
		println "Done with David Hardwick BetterCloud Bio"
		
		// Create blank row after finishing data
		LeadershipFile.append("\r")

	}	
	
	
	// methods for scraping Bart Hacking Data
	def "Bart Hacking Methods"() {
		
		when:
		// call the DavidHardwick.groovy class
		to BartHacking
		
		and:
				
		"Click Leadership button"()
		
		and:
		
		// Make sure leadership page has fully loaded
		"Check for Leadership page load"()
		
		and:
		
		println "Get first name"()
		println "Get first name"()
		
		// Write first name to Leadership.csv
		LeadershipFile.append("First Name: " + "," + "Get first name"() + "\r")
		
		and:
		
		println "Get last name"()
		// Write last name to Leadership.csv
		LeadershipFile.append("Last Name: "+"," + "Get last name"() + "\r")
		
		and:
		
		println "Get job title"()
		// Write job title to Leadership.csv
		LeadershipFile.append("Title: " + "," + "Get job title"() + "\r")
		
		and:
		
		println "Get image URL"()
		// Write image URL to Leadership.csv
		LeadershipFile.append("Image URL: " + "," + "Get image URL"() + "\r")
		
		and:
		
		println "Get first name count"()
		// Write first name counter to Leadership.csv
		LeadershipFile.append("First Name Count: "+"," + "Get first name count"() + "\r")
		
//		and:
//
//		"Click LinkedIn Link"()
		
		then:
		println "Done with Bart Hacking BetterCloud Bio"
		
		// Create blank row after finishing data
		LeadershipFile.append("\r")

	}
	
	// methods for scraping Russell Sachs Data
	def "Russell Sachs Methods"() {
		
		when:
		// call the RussellSachs.groovy class
		to RussellSachs
		
		and:
				
		"Click Leadership button"()
		
		and:
		
		// Make sure leadership page has fully loaded
		"Check for Leadership page load"()
		
		and:
		
		println "Get first name"()
		println "Get first name"()
		
		// Write first name to Leadership.csv
		LeadershipFile.append("First Name: " + "," + "Get first name"() + "\r")
		
		and:
		
		println "Get last name"()
		// Write last name to Leadership.csv
		LeadershipFile.append("Last Name: "+"," + "Get last name"() + "\r")
		
		and:
		
		println "Get job title"()
		// Write job title to Leadership.csv
		LeadershipFile.append("Title: " + "," + "Get job title"() + "\r")
		
		and:
		
		println "Get image URL"()
		// Write image URL to Leadership.csv
		LeadershipFile.append("Image URL: " + "," + "Get image URL"() + "\r")
		
		and:
		
		println "Get first name count"()
		// Write first name counter to Leadership.csv
		LeadershipFile.append("First Name Count: "+"," + "Get first name count"() + "\r")
		
//		and:
//
//		"Click LinkedIn Link"()
		
		then:
		println "Done with Russell Sachs BetterCloud Bio"
		
		// Create blank row after finishing data
		LeadershipFile.append("\r")

	}
	
	// methods for scraping Kevin Skibbe Data
	def "Kevin Skibbe Methods"() {
		
		when:
		// call the RussellSachs.groovy class
		to KevinSkibbe
		
		and:
				
		"Click Leadership button"()
		
		and:
		
		// Make sure leadership page has fully loaded
		"Check for Leadership page load"()
		
		and:
		
		println "Get first name"()
		println "Get first name"()
		
		// Write first name to Leadership.csv
		LeadershipFile.append("First Name: " + "," + "Get first name"() + "\r")
		
		and:
		
		println "Get last name"()
		// Write last name to Leadership.csv
		LeadershipFile.append("Last Name: "+"," + "Get last name"() + "\r")
		
		and:
		
		println "Get job title"()
		// Write job title to Leadership.csv
		LeadershipFile.append("Title: " + "," + "Get job title"() + "\r")
		
		and:
		
		println "Get image URL"()
		// Write image URL to Leadership.csv
		LeadershipFile.append("Image URL: " + "," + "Get image URL"() + "\r")
		
		and:
		
		println "Get first name count"()
		// Write first name counter to Leadership.csv
		LeadershipFile.append("First Name Count: "+"," + "Get first name count"() + "\r")
		
//		and:
//
//		"Click LinkedIn Link"()
		
		then:
		println "Done with Kevin Skibbe BetterCloud Bio"
		
		// Create blank row after finishing data
		LeadershipFile.append("\r")

	}
	
	// methods for scraping Taylor Gould Data
	def "Taylor Gould Methods"() {
		
		when:
		// call the TaylorGuild.groovy class
		to TaylorGould
		
		and:
				
		"Click Leadership button"()
		
		and:
		
		// Make sure leadership page has fully loaded
		"Check for Leadership page load"()
		
		and:
		
		println "Get first name"()
		println "Get first name"()
		
		// Write first name to Leadership.csv
		LeadershipFile.append("First Name: " + "," + "Get first name"() + "\r")
		
		and:
		
		println "Get last name"()
		// Write last name to Leadership.csv
		LeadershipFile.append("Last Name: "+"," + "Get last name"() + "\r")
		
		and:
		
		println "Get job title"()
		// Write job title to Leadership.csv
		LeadershipFile.append("Title: " + "," + "Get job title"() + "\r")
		
		and:
		
		println "Get image URL"()
		// Write image URL to Leadership.csv
		LeadershipFile.append("Image URL: " + "," + "Get image URL"() + "\r")
		
		and:
		
		println "Get first name count"()
		// Write first name counter to Leadership.csv
		LeadershipFile.append("First Name Count: "+"," + "Get first name count"() + "\r")
		
//		and:
//
//		"Click LinkedIn Link"()
		
		then:
		println "Done with Taylor Gould BetterCloud Bio"
		
		// Create blank row after finishing data
		LeadershipFile.append("\r")

	}

	// methods for scraping Brett Greenwood Data
	def "Brett Greenwood Methods"() {
		
		when:
		// call the TaylorGuild.groovy class
		to BrettGreenwood
		
		and:
				
		"Click Leadership button"()
		
		and:
		
		// Make sure leadership page has fully loaded
		"Check for Leadership page load"()
		
		and:
		
		println "Get first name"()
		println "Get first name"()
		
		// Write first name to Leadership.csv
		LeadershipFile.append("First Name: " + "," + "Get first name"() + "\r")
		
		and:
		
		println "Get last name"()
		// Write last name to Leadership.csv
		LeadershipFile.append("Last Name: "+"," + "Get last name"() + "\r")
		
		and:
		
		println "Get job title"()
		// Write job title to Leadership.csv
		LeadershipFile.append("Title: " + "," + "Get job title"() + "\r")
		
		and:
		
		println "Get image URL"()
		// Write image URL to Leadership.csv
		LeadershipFile.append("Image URL: " + "," + "Get image URL"() + "\r")
		
		and:
		
		println "Get first name count"()
		// Write first name counter to Leadership.csv
		LeadershipFile.append("First Name Count: "+"," + "Get first name count"() + "\r")
		
//		and:
//
//		"Click LinkedIn Link"()
		
		then:
		println "Done with Brett Greenwood BetterCloud Bio"
		
		// Create blank row after finishing data
		LeadershipFile.append("\r")

	}


}
