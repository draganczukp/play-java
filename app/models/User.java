package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;

import play.data.validation.Constraints.Required;

@Entity
public class User extends Model{
	
	public static enum Role{
		USER, ADMIN
	}
	
	@Required
	@Id
	public Long id;
	
	@Required
	public String login;
	
	@Required
	public String password;
	
	@Required
	public String email;
	
	public Role role = Role.USER;
	
	public static Finder<Long, User> find = new Finder<>(User.class);
}
