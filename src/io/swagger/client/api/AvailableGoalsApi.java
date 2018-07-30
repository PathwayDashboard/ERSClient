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
package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.BehaviouralChangeGoalDescriptionSubsection;
import io.swagger.client.model.GenericPostputResult;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class AvailableGoalsApi {
  private ApiClient apiClient;

  public AvailableGoalsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AvailableGoalsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Sets a AvailableGoal of a patient
   * 
   * @param availableGoal Data belonging to an AvailableGoal
   * @param xSessionId Identifies user which undertakes this action
   * @return GenericPostputResult
   */
  public GenericPostputResult availableGoalsPostDeliveredMessage (BehaviouralChangeGoalDescriptionSubsection availableGoal, String xSessionId) throws ApiException {
    Object postBody = availableGoal;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'availableGoal' is set
     if (availableGoal == null) {
        throw new ApiException(400, "Missing the required parameter 'availableGoal' when calling availableGoalsPostDeliveredMessage");
     }
     
    // create path and map variables
    String path = "/api/AvailableGoals".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (xSessionId != null)
    headerParams.put("X-session_id", apiClient.parameterToString(xSessionId));
    

    

    final String[] accepts = {
      "application/json", "text/json", "application/xml", "text/xml"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<GenericPostputResult>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Gets AvailableGoals from a patient
   * 
   * @param xSessionId Identifies user which undertakes this action
   * @return List<BehaviouralChangeGoalDescriptionSubsection>
   */
  public List<BehaviouralChangeGoalDescriptionSubsection> availableGoalsGetAvailableGoals (String xSessionId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/pathway/hdm/AvailableGoals".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (xSessionId != null)
    headerParams.put("X-session_id", apiClient.parameterToString(xSessionId));
    

    

    final String[] accepts = {
      "application/json", "text/json", "application/xml", "text/xml"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<List<BehaviouralChangeGoalDescriptionSubsection>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
