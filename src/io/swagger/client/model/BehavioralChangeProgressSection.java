package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.BehavioralChangeProgressBehaviouralStageSubsection;
import io.swagger.client.model.BehavioralChangeProgressLifeStyleAssessmentSubSection;
import io.swagger.client.model.BehavioralChangeProgressGoalAssessmentSubSection;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class BehavioralChangeProgressSection   {
  
  private List<BehavioralChangeProgressBehaviouralStageSubsection> behaviouralStages = new ArrayList<BehavioralChangeProgressBehaviouralStageSubsection>();
  private List<BehavioralChangeProgressGoalAssessmentSubSection> goalAssessments = new ArrayList<BehavioralChangeProgressGoalAssessmentSubSection>();
  private List<BehavioralChangeProgressLifeStyleAssessmentSubSection> lifeStyleAssessments = new ArrayList<BehavioralChangeProgressLifeStyleAssessmentSubSection>();

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("behaviouralStages")
  public List<BehavioralChangeProgressBehaviouralStageSubsection> getBehaviouralStages() {
    return behaviouralStages;
  }
  public void setBehaviouralStages(List<BehavioralChangeProgressBehaviouralStageSubsection> behaviouralStages) {
    this.behaviouralStages = behaviouralStages;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("goalAssessments")
  public List<BehavioralChangeProgressGoalAssessmentSubSection> getGoalAssessments() {
    return goalAssessments;
  }
  public void setGoalAssessments(List<BehavioralChangeProgressGoalAssessmentSubSection> goalAssessments) {
    this.goalAssessments = goalAssessments;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("lifeStyleAssessments")
  public List<BehavioralChangeProgressLifeStyleAssessmentSubSection> getLifeStyleAssessments() {
    return lifeStyleAssessments;
  }
  public void setLifeStyleAssessments(List<BehavioralChangeProgressLifeStyleAssessmentSubSection> lifeStyleAssessments) {
    this.lifeStyleAssessments = lifeStyleAssessments;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BehavioralChangeProgressSection {\n");
    
    sb.append("    behaviouralStages: ").append(StringUtil.toIndentedString(behaviouralStages)).append("\n");
    sb.append("    goalAssessments: ").append(StringUtil.toIndentedString(goalAssessments)).append("\n");
    sb.append("    lifeStyleAssessments: ").append(StringUtil.toIndentedString(lifeStyleAssessments)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
