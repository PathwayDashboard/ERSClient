/*******************************************************************************
 * Copyright 2018 Engineering Ing. Inf. S.p.A.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-23T11:55:27.820+01:00")
public class ScreeningInfoDates   {
  
  private Date startDate = null;
  private Date stopDate = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("stopDate")
  public Date getStopDate() {
    return stopDate;
  }
  public void setStopDate(Date stopDate) {
    this.stopDate = stopDate;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreeningInfoDates {\n");
    
    sb.append("    startDate: ").append(StringUtil.toIndentedString(startDate)).append("\n");
    sb.append("    stopDate: ").append(StringUtil.toIndentedString(stopDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
