public class PasswordEncoder 
{
	private String password;
	public String encode(String password)
	{
		this.password=password;
		this.password=this.password.replace('E','3');
		this.password=this.password.replace('e','3');
		this.password=this.password.replace('A','4');
		this.password=this.password.replace('a','4');
		this.password=this.password.replace('I','1');
		this.password=this.password.replace('i','1');
		this.password=this.password.replace('o','0');
		this.password=this.password.replace('O','0');
		this.password=this.password.replace('T','7');
		this.password=this.password.replace('t','7');
		return this.password;
	}

}
