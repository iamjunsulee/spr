package me.jjunsu.post;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class PostDto {
	
	  private Long id;
	  @NotBlank
	  private String title;
	  @NotBlank
	  private String content;

	  private String code;
}
