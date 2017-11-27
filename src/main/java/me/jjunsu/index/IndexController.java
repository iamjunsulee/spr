package me.jjunsu.index;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;
import me.jjunsu.config.Navigation;
import me.jjunsu.config.Section;
import me.jjunsu.post.Post;
import me.jjunsu.post.PostRepository;
import me.jjunsu.post.PostStatus;

import static org.springframework.data.domain.ExampleMatcher.matching;

@Controller
@RequiredArgsConstructor
@Navigation(Section.HOME)
public class IndexController {
	private final PostRepository postRepository;
	
	@GetMapping("/")
	public String home(@RequestParam(required = false) String q,String q2, Model model, @PageableDefault(size = 5, sort = "regDate", direction = Sort.Direction.DESC) Pageable pageable){
		Example<Post> post = Example.of(new Post(q,q2, PostStatus.Y),
	      matching()
	        .withMatcher("title", ExampleMatcher.GenericPropertyMatcher::contains));
	    model.addAttribute("posts", postRepository.findAll(post, pageable));
	    return "index";
	}
}
