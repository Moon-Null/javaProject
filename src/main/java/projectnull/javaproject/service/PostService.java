package projectnull.javaproject.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import projectnull.javaproject.entity.Post;
import projectnull.javaproject.entity.User;
import projectnull.javaproject.repository.PostRepository;
import projectnull.javaproject.repository.UserRepository;

import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private UserRepository userRepository;

    public Post addPost(String title, String content) {
        String userName = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        Optional<User> user = userRepository.findByUsername(userName);
        //post 엔티티를 만들어서 저장시키는 로직
        Post post = Post.builder().content(content).title(title).writer(user.get()).build();
        return postRepository.save(post);
    }
}
