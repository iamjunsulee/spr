package me.jjunsu.post;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class PostDto {
	
	  private Long id;
	  @NotBlank
	  private String title;
	  private String subTitle;
	  @NotBlank
	  private String content;

	  private String code;
	  
	  @NotNull
	  private Long categoryId;

	  private String categoryName; 
}
