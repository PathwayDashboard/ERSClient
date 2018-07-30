package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.GenericPostputResult;
import io.swagger.client.model.CardiacRehabilitationProgressActiveLifestylePASessionSubsection;
import io.swagger.client.model.CardiacRehabilitationProgressExerClassSessionSubsection;
import io.swagger.client.model.CardiacRehabilitationProgressExerGameSessionSubsection;
import io.swagger.client.model.CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionSubsection;
import io.swagger.client.model.CardiacRehabilitationProgressSection;
import java.util.Date;
import io.swagger.client.model.CardiacRehabilitationProgressExerClassSessionPreScreeningInfoSubSubsection;
import io.swagger.client.model.StartStopDateParam;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class CardiacRehabilitationProgressApi {
  private ApiClient apiClient;

  public CardiacRehabilitationProgressApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CardiacRehabilitationProgressApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Records a ActiveLifestylePASession of a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param activeLifestylePASession Data belonging to an ActiveLifestylePASession
   * @param xSessionId Identifies user which undertakes this action
   * @return GenericPostputResult
   */
  public GenericPostputResult cardiacRehabilitationProgressPostActiveLifestylePASession (String patientNumber, CardiacRehabilitationProgressActiveLifestylePASessionSubsection activeLifestylePASession, String xSessionId) throws ApiException {
    Object postBody = activeLifestylePASession;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling cardiacRehabilitationProgressPostActiveLifestylePASession");
     }
     
     // verify the required parameter 'activeLifestylePASession' is set
     if (activeLifestylePASession == null) {
        throw new ApiException(400, "Missing the required parameter 'activeLifestylePASession' when calling cardiacRehabilitationProgressPostActiveLifestylePASession");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/ActiveLifestylePASession/{patientNumber}".replaceAll("\\{format\\}","json")
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
   * Records a ExerClassSession of a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param exerClassSession Data belonging to an ExerClassSession
   * @param xSessionId Identifies user which undertakes this action
   * @return GenericPostputResult
   */
  public GenericPostputResult cardiacRehabilitationProgressPostExerClassSession (String patientNumber, CardiacRehabilitationProgressExerClassSessionSubsection exerClassSession, String xSessionId) throws ApiException {
    Object postBody = exerClassSession;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling cardiacRehabilitationProgressPostExerClassSession");
     }
     
     // verify the required parameter 'exerClassSession' is set
     if (exerClassSession == null) {
        throw new ApiException(400, "Missing the required parameter 'exerClassSession' when calling cardiacRehabilitationProgressPostExerClassSession");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/ExerClassSession/{patientNumber}".replaceAll("\\{format\\}","json")
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
   * Records a ExerGameSession of a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param exerGameSession Data belonging to an ExerGameSession
   * @param xSessionId Identifies user which undertakes this action
   * @return GenericPostputResult
   */
  public GenericPostputResult cardiacRehabilitationProgressPostExerGameSession (String patientNumber, CardiacRehabilitationProgressExerGameSessionSubsection exerGameSession, String xSessionId) throws ApiException {
    Object postBody = exerGameSession;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling cardiacRehabilitationProgressPostExerGameSession");
     }
     
     // verify the required parameter 'exerGameSession' is set
     if (exerGameSession == null) {
        throw new ApiException(400, "Missing the required parameter 'exerGameSession' when calling cardiacRehabilitationProgressPostExerGameSession");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/ExerGameSession/{patientNumber}".replaceAll("\\{format\\}","json")
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
   * Sets a CardiacRehabilitationProgressHealthAndFitnessAssessmentSession of a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param cardiacRehabilitationProgressHealthAndFitnessAssessmentSession Data belonging to an cardiacRehabilitationProgressHealthAndFitnessAssessmentSession
   * @param xSessionId Identifies user which undertakes this action
   * @return GenericPostputResult
   */
  public GenericPostputResult cardiacRehabilitationProgressPostHealthAndFitnessAssessmentSession (String patientNumber, CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionSubsection cardiacRehabilitationProgressHealthAndFitnessAssessmentSession, String xSessionId) throws ApiException {
    Object postBody = cardiacRehabilitationProgressHealthAndFitnessAssessmentSession;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling cardiacRehabilitationProgressPostHealthAndFitnessAssessmentSession");
     }
     
     // verify the required parameter 'cardiacRehabilitationProgressHealthAndFitnessAssessmentSession' is set
     if (cardiacRehabilitationProgressHealthAndFitnessAssessmentSession == null) {
        throw new ApiException(400, "Missing the required parameter 'cardiacRehabilitationProgressHealthAndFitnessAssessmentSession' when calling cardiacRehabilitationProgressPostHealthAndFitnessAssessmentSession");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/HealthAndFitnessAssessmentSession/{patientNumber}".replaceAll("\\{format\\}","json")
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
   * Gets a CardiacRehabilitationProgress from a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param startDate The start of the sessions
   * @param stopDate The stop of the sessions
   * @param xSessionId Identifies user which undertakes this action
   * @return CardiacRehabilitationProgressSection
   */
  public CardiacRehabilitationProgressSection cardiacRehabilitationProgressGetPatientCRProgress (String patientNumber, Date startDate, Date stopDate, String xSessionId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling cardiacRehabilitationProgressGetPatientCRProgress");
     }
     
     // verify the required parameter 'startDate' is set
     if (startDate == null) {
        throw new ApiException(400, "Missing the required parameter 'startDate' when calling cardiacRehabilitationProgressGetPatientCRProgress");
     }
     
     // verify the required parameter 'stopDate' is set
     if (stopDate == null) {
        throw new ApiException(400, "Missing the required parameter 'stopDate' when calling cardiacRehabilitationProgressGetPatientCRProgress");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/PatientCRProgress/{patientNumber}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "patientNumber" + "\\}", apiClient.escapeString(patientNumber.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    
    queryParams.addAll(apiClient.parameterToPairs("", "stopDate", stopDate));
    

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

    

    
    
    TypeRef returnType = new TypeRef<CardiacRehabilitationProgressSection>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Sets a BehaviouralChangeProgress of a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param cardiacRehabilitationProgress Data belonging to an CardiacRehabilitationProgress
   * @param xSessionId Identifies user which undertakes this action
   * @return GenericPostputResult
   */
  public GenericPostputResult cardiacRehabilitationProgressPutPatientCRProgress (String patientNumber, CardiacRehabilitationProgressSection cardiacRehabilitationProgress, String xSessionId) throws ApiException {
    Object postBody = cardiacRehabilitationProgress;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling cardiacRehabilitationProgressPutPatientCRProgress");
     }
     
     // verify the required parameter 'cardiacRehabilitationProgress' is set
     if (cardiacRehabilitationProgress == null) {
        throw new ApiException(400, "Missing the required parameter 'cardiacRehabilitationProgress' when calling cardiacRehabilitationProgressPutPatientCRProgress");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/PatientCRProgress/{patientNumber}".replaceAll("\\{format\\}","json")
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
   * Gets PreScreeningInfos from a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param startStopDate The start and stop date of the PreScreeningInfo
   * @param xSessionId Identifies user which undertakes this action
   * @return List<CardiacRehabilitationProgressExerClassSessionPreScreeningInfoSubSubsection>
   */
  public List<CardiacRehabilitationProgressExerClassSessionPreScreeningInfoSubSubsection> cardiacRehabilitationProgressGetPreScreeningInfos (String patientNumber, StartStopDateParam startStopDate, String xSessionId) throws ApiException {
    Object postBody = startStopDate;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling cardiacRehabilitationProgressGetPreScreeningInfos");
     }
     
     // verify the required parameter 'startStopDate' is set
     if (startStopDate == null) {
        throw new ApiException(400, "Missing the required parameter 'startStopDate' when calling cardiacRehabilitationProgressGetPreScreeningInfos");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/PreScreeningInfos/{patientNumber}".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<List<CardiacRehabilitationProgressExerClassSessionPreScreeningInfoSubSubsection>>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
