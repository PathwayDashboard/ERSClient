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

import io.swagger.client.model.BehaviouralChangeNotificationPreferencesSection;
import io.swagger.client.model.GenericPostputResult;
import io.swagger.client.model.ExerciseNotificationPreferencesSection;
import io.swagger.client.model.ExercisePreferenceSection;
import io.swagger.client.model.PersonalisedParameterSubSection;
import java.util.*;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class PreferencesApi {
  private ApiClient apiClient;

  public PreferencesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PreferencesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Gets a BehaviouralChangeNotificationPreferences from a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param xSessionId Identifies user which undertakes this action
   * @return BehaviouralChangeNotificationPreferencesSection
   */
  public BehaviouralChangeNotificationPreferencesSection preferencesGetBehaviouralChangeNotificationPreferences (String patientNumber, String xSessionId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling preferencesGetBehaviouralChangeNotificationPreferences");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/BehaviouralChangeNotificationPreferences/{patientNumber}".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<BehaviouralChangeNotificationPreferencesSection>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Sets a BehaviouralChangeNotificationPreferences of a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param behaviouralChangeNotificationPreferences Data belonging to an BehaviouralChangeNotificationPreferences
   * @param xSessionId Identifies user which undertakes this action
   * @return GenericPostputResult
   */
  public GenericPostputResult preferencesPutBehaviouralChangeNotificationPreferences (String patientNumber, BehaviouralChangeNotificationPreferencesSection behaviouralChangeNotificationPreferences, String xSessionId) throws ApiException {
    Object postBody = behaviouralChangeNotificationPreferences;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling preferencesPutBehaviouralChangeNotificationPreferences");
     }
     
     // verify the required parameter 'behaviouralChangeNotificationPreferences' is set
     if (behaviouralChangeNotificationPreferences == null) {
        throw new ApiException(400, "Missing the required parameter 'behaviouralChangeNotificationPreferences' when calling preferencesPutBehaviouralChangeNotificationPreferences");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/BehaviouralChangeNotificationPreferences/{patientNumber}".replaceAll("\\{format\\}","json")
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
   * Gets a ExerciseNotificationPreferences from a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param xSessionId Identifies user which undertakes this action
   * @return ExerciseNotificationPreferencesSection
   */
  public ExerciseNotificationPreferencesSection preferencesGetExerciseNotificationPreferences (String patientNumber, String xSessionId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling preferencesGetExerciseNotificationPreferences");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/ExerciseNotificationPreferences/{patientNumber}".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<ExerciseNotificationPreferencesSection>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Sets a ExerciseNotificationPreferences of a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param exerciseNotificationPreferences Data belonging to an ExerciseNotificationPreferences
   * @param xSessionId Identifies user which undertakes this action
   * @return GenericPostputResult
   */
  public GenericPostputResult preferencesPutExerciseNotificationPreferences (String patientNumber, ExerciseNotificationPreferencesSection exerciseNotificationPreferences, String xSessionId) throws ApiException {
    Object postBody = exerciseNotificationPreferences;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling preferencesPutExerciseNotificationPreferences");
     }
     
     // verify the required parameter 'exerciseNotificationPreferences' is set
     if (exerciseNotificationPreferences == null) {
        throw new ApiException(400, "Missing the required parameter 'exerciseNotificationPreferences' when calling preferencesPutExerciseNotificationPreferences");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/ExerciseNotificationPreferences/{patientNumber}".replaceAll("\\{format\\}","json")
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
   * Gets a ExercisePreference from a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param xSessionId Identifies user which undertakes this action
   * @return ExercisePreferenceSection
   */
  public ExercisePreferenceSection preferencesGetPatientExercisePreference (String patientNumber, String xSessionId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling preferencesGetPatientExercisePreference");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/PatientExercisePreference/{patientNumber}".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<ExercisePreferenceSection>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Sets a ExercisePreference of a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param exercisePreference Data belonging to an ExercisePreference
   * @param xSessionId Identifies user which undertakes this action
   * @return GenericPostputResult
   */
  public GenericPostputResult preferencesPutPatientExercisePreference (String patientNumber, ExercisePreferenceSection exercisePreference, String xSessionId) throws ApiException {
    Object postBody = exercisePreference;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling preferencesPutPatientExercisePreference");
     }
     
     // verify the required parameter 'exercisePreference' is set
     if (exercisePreference == null) {
        throw new ApiException(400, "Missing the required parameter 'exercisePreference' when calling preferencesPutPatientExercisePreference");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/PatientExercisePreference/{patientNumber}".replaceAll("\\{format\\}","json")
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
   * Gets PersonalizedParameters from a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param xSessionId Identifies user which undertakes this action
   * @return List<PersonalisedParameterSubSection>
   */
  public List<PersonalisedParameterSubSection> preferencesGetPatientPersonalizedParameters (String patientNumber, String xSessionId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling preferencesGetPatientPersonalizedParameters");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/PatientPersonalizedParameters/{patientNumber}".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<List<PersonalisedParameterSubSection>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Sets a PersonalizedParameters of a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param personalizedParameters Data belonging to an PersonalizedParameters
   * @param xSessionId Identifies user which undertakes this action
   * @return GenericPostputResult
   */
  public GenericPostputResult preferencesPutPersonalizedParameters (String patientNumber, List<PersonalisedParameterSubSection> personalizedParameters, String xSessionId) throws ApiException {
    Object postBody = personalizedParameters;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling preferencesPutPersonalizedParameters");
     }
     
     // verify the required parameter 'personalizedParameters' is set
     if (personalizedParameters == null) {
        throw new ApiException(400, "Missing the required parameter 'personalizedParameters' when calling preferencesPutPersonalizedParameters");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/PatientPersonalizedParameters/{patientNumber}".replaceAll("\\{format\\}","json")
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
