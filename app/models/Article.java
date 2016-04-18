package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.avaje.ebean.Model;

import play.data.validation.Constraints.MaxLength;
import play.data.validation.Constraints.Required;

@Entity
public class Article extends Model {
	
	@Required
	@Id
	public Long id;
	
	@Required
	@MaxLength(255)
	public String title;
	
	@Required
	public String content;
	
	@Required
	@ManyToOne(targetEntity=User.class, optional=false)
	public User author;

	public long views = 0;
	
	public static Finder<Long, Article> find = new Finder<>(Article.class);

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content=" + content + ", author=" + author + ", views="
				+ views + "]";
	}
	
	
}
