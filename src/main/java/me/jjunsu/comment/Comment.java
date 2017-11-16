package me.jjunsu.comment;

import java.time.LocalDateTime;

import javax.persistence.*;
import lombok.Data;
import me.jjunsu.post.Post;

@Data
@Entity
public class Comment {
	@Id
	@GeneratedValue
	private Long id;

	private String content;

	private LocalDateTime regDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "POST_ID")
	private Post post;

	public Comment(String content, Post post) {
		this.content = content;
		this.post = post;
	}

	Comment() {

	}
}
