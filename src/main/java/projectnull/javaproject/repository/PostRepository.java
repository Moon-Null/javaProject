package projectnull.javaproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projectnull.javaproject.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
