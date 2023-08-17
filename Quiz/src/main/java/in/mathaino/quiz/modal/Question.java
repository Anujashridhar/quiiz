package in.mathaino.quiz.modal;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

	@Entity
	@Getter
	@Setter
	public class Question {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer id;
		private String questionText;
		private String option1;
		private String option2;
		private String option3;
		private String option4;
		private String option5;
		private String answer;
		private String keywords;
		private Integer createdBy;
		private Date CreatedOn;
		private Date lastModifiedOn;
		private Integer lastModifiedBy;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getQuestionText() {
			return questionText;
		}
		public void setQuestionText(String questionText) {
			this.questionText = questionText;
		}
		public String getOption1() {
			return option1;
		}
		public void setOption1(String option1) {
			this.option1 = option1;
		}
		public String getOption2() {
			return option2;
		}
		public void setOption2(String option2) {
			this.option2 = option2;
		}
		public String getOption3() {
			return option3;
		}
		public void setOption3(String option3) {
			this.option3 = option3;
		}
		public String getOption4() {
			return option4;
		}
		public void setOption4(String option4) {
			this.option4 = option4;
		}
		public String getOption5() {
			return option5;
		}
		public void setOption5(String option5) {
			this.option5 = option5;
		}
		public String getAnswer() {
			return answer;
		}
		public void setAnswer(String answer) {
			this.answer = answer;
		}
		public String getKeywords() {
			return keywords;
		}
		public void setKeywords(String keywords) {
			this.keywords = keywords;
		}
		public Integer getCreatedBy() {
			return createdBy;
		}
		public void setCreatedBy(Integer createdBy) {
			this.createdBy = createdBy;
		}
		public Date getCreatedOn() {
			return CreatedOn;
		}
		public void setCreatedOn(Date createdOn) {
			CreatedOn = createdOn;
		}
		public Date getLastModifiedOn() {
			return lastModifiedOn;
		}
		public void setLastModifiedOn(Date lastModifiedOn) {
			this.lastModifiedOn = lastModifiedOn;
		}
		public Integer getLastModifiedBy() {
			return lastModifiedBy;
		}
		public void setLastModifiedBy(Integer lastModifiedBy) {
			this.lastModifiedBy = lastModifiedBy;
		}
		
		
		
}
