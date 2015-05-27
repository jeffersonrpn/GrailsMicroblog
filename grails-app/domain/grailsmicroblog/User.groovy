package grailsmicroblog

class User {
	
	String fullname
	String username
	String email
	String password
	static hasMany = [posts : Post]
	
	String toString() { fullname }

    static constraints = {
		fullname(blank: false, maxSize: 50)
		username(blank: false, unique: true, size: 4..20, matches: "[a-zA-Z]+")
		email(blank: false, unique: true, email: true)
		password(blank: false, size: 6..15)
    }
	
}
