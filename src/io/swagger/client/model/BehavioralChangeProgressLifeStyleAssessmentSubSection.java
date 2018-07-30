package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.BehavioralChangeProgressLifeStyleAssessmentTextAnswerSubSubsection;
import io.swagger.client.model.BehavioralChangeProgressLifeStyleAssessmentQuantitativeAnswerSubSubsection;
import java.util.*;
import io.swagger.client.model.BehavioralChangeProgressLifeStyleAssessmentYesNoAnswerSubSubsection;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class BehavioralChangeProgressLifeStyleAssessmentSubSection   {
  
  private Integer id = null;
  private Integer category = null;
  private Date submissionDate = null;
  private Boolean read = null;
  private Double score = null;
  private List<BehavioralChangeProgressLifeStyleAssessmentTextAnswerSubSubsection> textAnwers = new ArrayList<BehavioralChangeProgressLifeStyleAssessmentTextAnswerSubSubsection>();
  private List<BehavioralChangeProgressLifeStyleAssessmentQuantitativeAnswerSubSubsection> quantitativeAnwers = new ArrayList<BehavioralChangeProgressLifeStyleAssessmentQuantitativeAnswerSubSubsection>();
  private List<BehavioralChangeProgressLifeStyleAssessmentYesNoAnswerSubSubsection> yesNoAnwers = new ArrayList<BehavioralChangeProgressLifeStyleAssessmentYesNoAnswerSubSubsection>();

  
  /**
   * id
   **/
  @ApiModelProperty(value = "id")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * category
   **/
  @ApiModelProperty(value = "category")
  @JsonProperty("category")
  public Integer getCategory() {
    return category;
  }
  public void setCategory(Integer category) {
    this.category = category;
  }

  
  /**
   * submissionDate
   **/
  @ApiModelProperty(value = "submissionDate")
  @JsonProperty("submissionDate")
  public Date getSubmissionDate() {
    return submissionDate;
  }
  public void setSubmissionDate(Date submissionDate) {
    this.submissionDate = submissionDate;
  }

  
  /**
   * read
   **/
  @ApiModelProperty(value = "read")
  @JsonProperty("read")
  public Boolean getRead() {
    return read;
  }
  public void setRead(Boolean read) {
    this.read = read;
  }

  
  /**
   * score
   **/
  @ApiModelProperty(value = "score")
  @JsonProperty("score")
  public Double getScore() {
    return score;
  }
  public void setScore(Double score) {
    this.score = score;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("textAnwers")
  public List<BehavioralChangeProgressLifeStyleAssessmentTextAnswerSubSubsection> getTextAnwers() {
    return textAnwers;
  }
  public void setTextAnwers(List<BehavioralChangeProgressLifeStyleAssessmentTextAnswerSubSubsection> textAnwers) {
    this.textAnwers = textAnwers;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("quantitativeAnwers")
  public List<BehavioralChangeProgressLifeStyleAssessmentQuantitativeAnswerSubSubsection> getQuantitativeAnwers() {
    return quantitativeAnwers;
  }
  public void setQuantitativeAnwers(List<BehavioralChangeProgressLifeStyleAssessmentQuantitativeAnswerSubSubsection> quantitativeAnwers) {
    this.quantitativeAnwers = quantitativeAnwers;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("yesNoAnwers")
  public List<BehavioralChangeProgressLifeStyleAssessmentYesNoAnswerSubSubsection> getYesNoAnwers() {
    return yesNoAnwers;
  }
  public void setYesNoAnwers(List<BehavioralChangeProgressLifeStyleAssessmentYesNoAnswerSubSubsection> yesNoAnwers) {
    this.yesNoAnwers = yesNoAnwers;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BehavioralChangeProgressLifeStyleAssessmentSubSection {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    category: ").append(StringUtil.toIndentedString(category)).append("\n");
    sb.append("    submissionDate: ").append(StringUtil.toIndentedString(submissionDate)).append("\n");
    sb.append("    read: ").append(StringUtil.toIndentedString(read)).append("\n");
    sb.append("    score: ").append(StringUtil.toIndentedString(score)).append("\n");
    sb.append("    textAnwers: ").append(StringUtil.toIndentedString(textAnwers)).append("\n");
    sb.append("    quantitativeAnwers: ").append(StringUtil.toIndentedString(quantitativeAnwers)).append("\n");
    sb.append("    yesNoAnwers: ").append(StringUtil.toIndentedString(yesNoAnwers)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
