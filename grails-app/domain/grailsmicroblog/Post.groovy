package grailsmicroblog

class Post {
	
	String about
	String body
	Date datetime
	User user

    static constraints = {
		about(maxSize: 50)
		body(blank: false, maxSize: 280)
		datetime(attibutes: new Date())
    }
	
}
