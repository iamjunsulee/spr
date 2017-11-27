package me.jjunsu.post;

import java.time.LocalDateTime;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import me.jjunsu.exception.NotFoundException;

@Service
@Transactional
@RequiredArgsConstructor
public class PostService {
	private final PostRepository postRepository;
	
	public Post createPost(Post post){
		post.setRegDate(LocalDateTime.now());
		return postRepository.save(post);
	}
	public Post updatePost(Long id, Post post){
		Post oldPost = postRepository.findByIdAndStatus(id, PostStatus.Y);
		if(oldPost == null){
			throw new NotFoundException(id + " not found");
		}
		oldPost.setContent(post.getContent());
		oldPost.setCode(post.getCode());
		oldPost.setTitle(post.getTitle());
		oldPost.setSubtitle(post.getSubtitle());
		return oldPost;
	}
	public void deletePost(Long id){
		Post oldPost = postRepository.findByIdAndStatus(id, PostStatus.Y);
		if(oldPost == null){
			throw new NotFoundException(id + " not found");
		}
		oldPost.setStatus(PostStatus.N);
	}
	public Post findByIdAndStatus(Long id,PostStatus status){
		Post post = postRepository.findByIdAndStatus(id, status);
	    if(post == null){
	      throw new NotFoundException(id + " not found");
	    }
	    return post;
	}
}
