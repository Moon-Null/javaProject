package projectnull.javaproject.controller;
//히히 주석
//히히 또 주석
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import projectnull.javaproject.service.PostService;

@Controller
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/post")
    public String getPost() {
        return "post";
    }

    @PostMapping("/post")
    public String addPost(String title,String content) {
        postService.addPost(title,content);
        return "main";
        /* 문까쓰 vs 문카스 vs 문카츠 */
    }
}
