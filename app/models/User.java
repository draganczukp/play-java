package models;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.EnumValue;

import play.data.format.Formats.DateTime;
import play.data.validation.Constraints.Required;

@Entity
public class User extends Model{
	
	public static enum Role{
		@EnumValue("user")
		USER,
		@EnumValue("admin")
		ADMIN, 
		@EnumValue("editor")
		EDITOR
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
	
	@DateTime(pattern="dd/mm/yyyy : hh:mm:ss:SSS")
	public Date joinDate = Date.from(Instant.now());
	
	public String filePath;
	
	@OneToMany(targetEntity=Article.class, mappedBy="author")
	public List<Article> articles = new ArrayList<>();
	
	public static Finder<Long, User> find = new Finder<>(User.class);
}
