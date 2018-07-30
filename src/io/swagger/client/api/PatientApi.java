package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.DailyActivity;
import io.swagger.client.model.GenericPostputResult;
import io.swagger.client.model.PATIENT;
import java.util.Date;
import io.swagger.client.model.RefreshTokenParam;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class PatientApi {
  private ApiClient apiClient;

  public PatientApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PatientApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Gets all daily activities
   * 
   * @param patientNumber 
   * @param xSessionId Identifies user which undertakes this action
   * @return List<DailyActivity>
   */
  public List<DailyActivity> patientGetDailyActivities (String patientNumber, String xSessionId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling patientGetDailyActivities");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/DailyActivity/{patientNumber}".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<List<DailyActivity>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * stores Daily activity
   * 
   * @param patientNumber The ID of the patient
   * @param dailyActivity 
   * @param xSessionId Identifies user which undertakes this action
   * @return GenericPostputResult
   */
  public GenericPostputResult patientPostDailyActivity (String patientNumber, DailyActivity dailyActivity, String xSessionId) throws ApiException {
    Object postBody = dailyActivity;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling patientPostDailyActivity");
     }
     
     // verify the required parameter 'dailyActivity' is set
     if (dailyActivity == null) {
        throw new ApiException(400, "Missing the required parameter 'dailyActivity' when calling patientPostDailyActivity");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/DailyActivity/{patientNumber}".replaceAll("\\{format\\}","json")
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
   * Gets Patient info from a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param xSessionId Identifies user which undertakes this action
   * @return PATIENT
   */
  public PATIENT patientGetPatient (String patientNumber, String xSessionId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling patientGetPatient");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/PatientInfo/{patientNumber}".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<PATIENT>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Gets the patient&#39;s last login date
   * 
   * @param patientNumber The health ID of the patient
   * @param xSessionId Identifies user which undertakes this action
   * @return Date
   */
  public Date patientGetPatientLastLogin (String patientNumber, String xSessionId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling patientGetPatientLastLogin");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/PatientLastLogin/{patientNumber}".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<Date>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Gets Patient token
   * 
   * @param patientNumber The health ID of the patient
   * @param xSessionId Identifies user which undertakes this action
   * @return String
   */
  public String patientGetRefreshToken (String patientNumber, String xSessionId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling patientGetRefreshToken");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/RefreshToken/{patientNumber}".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<String>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * ets Patient token
   * 
   * @param patientNumber The health ID of the patient
   * @param refreshTokenParam 
   * @param xSessionId Identifies user which undertakes this action
   * @return GenericPostputResult
   */
  public GenericPostputResult patientPostRefreshToken (String patientNumber, RefreshTokenParam refreshTokenParam, String xSessionId) throws ApiException {
    Object postBody = refreshTokenParam;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling patientPostRefreshToken");
     }
     
     // verify the required parameter 'refreshTokenParam' is set
     if (refreshTokenParam == null) {
        throw new ApiException(400, "Missing the required parameter 'refreshTokenParam' when calling patientPostRefreshToken");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/RefreshToken/{patientNumber}".replaceAll("\\{format\\}","json")
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
  
}
