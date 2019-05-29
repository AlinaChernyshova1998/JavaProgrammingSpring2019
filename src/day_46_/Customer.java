package day_46_;

public class Customer {
private String name;
private String email;
static int count;//share count

public Customer() {
	System.out.println("no-args constractor");
	this.name="undefined";
	this.email="undefined";
	count++;
}
public Customer(String name, String email) {
	this.name=name.toUpperCase();
	this.email=email.toLowerCase();
	count++;
}
public String toString() {
	return "Customer [name=" + name + ", email=" + email + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
