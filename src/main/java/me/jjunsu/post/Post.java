package me.jjunsu.post;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.Data;
import me.jjunsu.category.Category;
import me.jjunsu.comment.Comment;

@Data
@Entity
public class Post {
	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	private String title;
	
	private String subtitle;
	
	@Lob
	@NotNull
	private String content;

	@Lob
	private String code;

	@Enumerated(EnumType.STRING)
	private PostStatus status;

	private LocalDateTime regDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CATEGORY_ID")
	private Category category;
	
	@OneToMany(mappedBy = "post", fetch = FetchType.LAZY)
	private List<Comment> comments;
	
	Post(){
	}
	public Post(Long id){
		this.id = id;
	}
	public Post(String title, String subtitle, PostStatus status){
		this.title = title;
		this.subtitle = subtitle;
		this.status = status;
	}
	public Post(Long id, String title, String subtitle, String content, String code, PostStatus status){
		this.id = id;
		this.title = title;
		this.subtitle = subtitle;
		this.content = content;
		this.code = code;
		this.status = status;
	}

	public Post(String title, String subtitle, String content, String code, PostStatus status){
		this.title = title;
		this.subtitle = subtitle;
		this.content = content;
		this.code = code;
		this.status = status;
	}
	
	public Post(String title, String subtitle, String content, String code, PostStatus status, Category category) {
	    this.title = title;
	    this.subtitle = subtitle; 
	    this.content = content;
	    this.code = code;
	    this.status = status;
	    this.category = category;
	}
}

