package me.jjunsu.index;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import me.jjunsu.config.Navigation;
import me.jjunsu.config.Section;
import me.jjunsu.post.PostRepository;

@Controller
@RequiredArgsConstructor
@Navigation(Section.HOME)
public class IndexController {
	private final PostRepository postRepository;
	
	@GetMapping("/")
	public String home(Model model, Pageable pageable){
		model.addAttribute("posts", postRepository.findAll(pageable));
		//model.addAttribute("message", "hello world");
		return "index";  
	}
}
