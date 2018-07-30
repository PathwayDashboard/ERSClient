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

import io.swagger.client.model.GenericPostputResult;
import io.swagger.client.model.BehavioralChangeProgressLifeStyleAssessmentSubSection;
import io.swagger.client.model.BehaviouralChangeAssessmentQuestionnaire;
import io.swagger.client.model.BehavioralChangeProgressSection;
import io.swagger.client.model.BehavioralChangeProgressBehaviouralStageSubsection;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class BehaviouralChangeProgressApi {
  private ApiClient apiClient;

  public BehaviouralChangeProgressApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BehaviouralChangeProgressApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Adds LifeStyleAssessment of a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param lifeStyleAssessment Data belonging to an LifeStyleAssessment
   * @param xSessionId Identifies user which undertakes this action
   * @return GenericPostputResult
   */
  public GenericPostputResult behaviouralChangeProgressPostAddLifeStyleAssessment (String patientNumber, BehavioralChangeProgressLifeStyleAssessmentSubSection lifeStyleAssessment, String xSessionId) throws ApiException {
    Object postBody = lifeStyleAssessment;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling behaviouralChangeProgressPostAddLifeStyleAssessment");
     }
     
     // verify the required parameter 'lifeStyleAssessment' is set
     if (lifeStyleAssessment == null) {
        throw new ApiException(400, "Missing the required parameter 'lifeStyleAssessment' when calling behaviouralChangeProgressPostAddLifeStyleAssessment");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/AddLifeStyleAssessment/{patientNumber}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "patientNumber" + "\\}", apiClient.escapeString(patientNumber.toString()));

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
   * Gets BCAssessmentQuestionnaire from a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param category The goal category
   * @param xSessionId Identifies user which undertakes this action
   * @return List<BehaviouralChangeAssessmentQuestionnaire>
   */
  public List<BehaviouralChangeAssessmentQuestionnaire> behaviouralChangeProgressGetBCAssessmentQuestionnaire (String patientNumber, Integer category, String xSessionId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling behaviouralChangeProgressGetBCAssessmentQuestionnaire");
     }
     
     // verify the required parameter 'category' is set
     if (category == null) {
        throw new ApiException(400, "Missing the required parameter 'category' when calling behaviouralChangeProgressGetBCAssessmentQuestionnaire");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/BCAssessmentQuestionnaire/{patientNumber}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "patientNumber" + "\\}", apiClient.escapeString(patientNumber.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "category", category));
    

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

    

    
    
    TypeRef returnType = new TypeRef<List<BehaviouralChangeAssessmentQuestionnaire>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Gets a BehaviouralChangeProgress from a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param xSessionId Identifies user which undertakes this action
   * @return BehavioralChangeProgressSection
   */
  public BehavioralChangeProgressSection behaviouralChangeProgressGetBChangeProgress (String patientNumber, String xSessionId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling behaviouralChangeProgressGetBChangeProgress");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/BCProgress/{patientNumber}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "patientNumber" + "\\}", apiClient.escapeString(patientNumber.toString()));

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

    

    
    
    TypeRef returnType = new TypeRef<BehavioralChangeProgressSection>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Sets a BehaviouralChangeProgress of a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param behaviouralChangeProgress Data belonging to an BehaviouralChangeProgress
   * @param xSessionId Identifies user which undertakes this action
   * @return GenericPostputResult
   */
  public GenericPostputResult behaviouralChangeProgressPutBCProgress (String patientNumber, BehavioralChangeProgressSection behaviouralChangeProgress, String xSessionId) throws ApiException {
    Object postBody = behaviouralChangeProgress;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling behaviouralChangeProgressPutBCProgress");
     }
     
     // verify the required parameter 'behaviouralChangeProgress' is set
     if (behaviouralChangeProgress == null) {
        throw new ApiException(400, "Missing the required parameter 'behaviouralChangeProgress' when calling behaviouralChangeProgressPutBCProgress");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/BChangeProgress/{patientNumber}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "patientNumber" + "\\}", apiClient.escapeString(patientNumber.toString()));

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
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Sets a LifeStyleAssessment of a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param lifeStyleAssessment Data belonging to an LifeStyleAssessment
   * @param xSessionId Identifies user which undertakes this action
   * @return GenericPostputResult
   */
  public GenericPostputResult behaviouralChangeProgressPostLifeStyleAssessment (String patientNumber, BehavioralChangeProgressLifeStyleAssessmentSubSection lifeStyleAssessment, String xSessionId) throws ApiException {
    Object postBody = lifeStyleAssessment;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling behaviouralChangeProgressPostLifeStyleAssessment");
     }
     
     // verify the required parameter 'lifeStyleAssessment' is set
     if (lifeStyleAssessment == null) {
        throw new ApiException(400, "Missing the required parameter 'lifeStyleAssessment' when calling behaviouralChangeProgressPostLifeStyleAssessment");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/LifeStyleAssessment/{patientNumber}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "patientNumber" + "\\}", apiClient.escapeString(patientNumber.toString()));

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
   * Gets LifeStyleAssessments from a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param xSessionId Identifies user which undertakes this action
   * @return List<BehavioralChangeProgressLifeStyleAssessmentSubSection>
   */
  public List<BehavioralChangeProgressLifeStyleAssessmentSubSection> behaviouralChangeProgressGetPatientLifeStyleAssessments (String patientNumber, String xSessionId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling behaviouralChangeProgressGetPatientLifeStyleAssessments");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/PatientLifeStyleAssessments/{patientNumber}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "patientNumber" + "\\}", apiClient.escapeString(patientNumber.toString()));

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

    

    
    
    TypeRef returnType = new TypeRef<List<BehavioralChangeProgressLifeStyleAssessmentSubSection>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Sets a BehaviouralStage of a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param behaviouralStage Data belonging to an BehaviouralChangeProgress
   * @param xSessionId Identifies user which undertakes this action
   * @return GenericPostputResult
   */
  public GenericPostputResult behaviouralChangeProgressPutStage (String patientNumber, BehavioralChangeProgressBehaviouralStageSubsection behaviouralStage, String xSessionId) throws ApiException {
    Object postBody = behaviouralStage;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling behaviouralChangeProgressPutStage");
     }
     
     // verify the required parameter 'behaviouralStage' is set
     if (behaviouralStage == null) {
        throw new ApiException(400, "Missing the required parameter 'behaviouralStage' when calling behaviouralChangeProgressPutStage");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/Stage/{patientNumber}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "patientNumber" + "\\}", apiClient.escapeString(patientNumber.toString()));

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
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
