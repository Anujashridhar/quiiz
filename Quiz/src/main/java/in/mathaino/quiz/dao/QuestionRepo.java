package in.mathaino.quiz.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import in.mathaino.quiz.modal.Question;

@RepositoryRestResource
public interface QuestionRepo  extends CrudRepository<Question, Integer>{
	
	
	

		@RestResource(path = "find-by-answer",rel = "find-by-answer")
		
		List<Question> findByAnswerContaining(@Param("answer")String answer);

}
