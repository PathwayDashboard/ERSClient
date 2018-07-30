package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.BehaviouralChangeProgrammePersonalGoalSubsection;
import io.swagger.client.model.BehaviouralChangeProgrammeRecommendedGoalSubsection;
import io.swagger.client.model.BehaviouralChangeProgrammeGoodHabitSubsection;
import java.util.*;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class BehaviouralChangeProgrammeSection   {
  
  private Integer assessmentPeriodMonthInterval = null;
  private Date date = null;
  private List<BehaviouralChangeProgrammePersonalGoalSubsection> personalGoals = new ArrayList<BehaviouralChangeProgrammePersonalGoalSubsection>();
  private List<BehaviouralChangeProgrammeRecommendedGoalSubsection> recommendedGoals = new ArrayList<BehaviouralChangeProgrammeRecommendedGoalSubsection>();
  private List<BehaviouralChangeProgrammeGoodHabitSubsection> goodHabits = new ArrayList<BehaviouralChangeProgrammeGoodHabitSubsection>();

  
  /**
   * assessmentPeriodMonthInterval
   **/
  @ApiModelProperty(value = "assessmentPeriodMonthInterval")
  @JsonProperty("assessmentPeriodMonthInterval")
  public Integer getAssessmentPeriodMonthInterval() {
    return assessmentPeriodMonthInterval;
  }
  public void setAssessmentPeriodMonthInterval(Integer assessmentPeriodMonthInterval) {
    this.assessmentPeriodMonthInterval = assessmentPeriodMonthInterval;
  }

  
  /**
   * date
   **/
  @ApiModelProperty(value = "date")
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("personalGoals")
  public List<BehaviouralChangeProgrammePersonalGoalSubsection> getPersonalGoals() {
    return personalGoals;
  }
  public void setPersonalGoals(List<BehaviouralChangeProgrammePersonalGoalSubsection> personalGoals) {
    this.personalGoals = personalGoals;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("recommendedGoals")
  public List<BehaviouralChangeProgrammeRecommendedGoalSubsection> getRecommendedGoals() {
    return recommendedGoals;
  }
  public void setRecommendedGoals(List<BehaviouralChangeProgrammeRecommendedGoalSubsection> recommendedGoals) {
    this.recommendedGoals = recommendedGoals;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("goodHabits")
  public List<BehaviouralChangeProgrammeGoodHabitSubsection> getGoodHabits() {
    return goodHabits;
  }
  public void setGoodHabits(List<BehaviouralChangeProgrammeGoodHabitSubsection> goodHabits) {
    this.goodHabits = goodHabits;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BehaviouralChangeProgrammeSection {\n");
    
    sb.append("    assessmentPeriodMonthInterval: ").append(StringUtil.toIndentedString(assessmentPeriodMonthInterval)).append("\n");
    sb.append("    date: ").append(StringUtil.toIndentedString(date)).append("\n");
    sb.append("    personalGoals: ").append(StringUtil.toIndentedString(personalGoals)).append("\n");
    sb.append("    recommendedGoals: ").append(StringUtil.toIndentedString(recommendedGoals)).append("\n");
    sb.append("    goodHabits: ").append(StringUtil.toIndentedString(goodHabits)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
