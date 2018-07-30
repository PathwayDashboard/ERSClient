package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.CardiacRehabilitationProgrammeSection;
import io.swagger.client.model.GenericPostputResult;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class CardiacRehabilitationProgrammeApi {
  private ApiClient apiClient;

  public CardiacRehabilitationProgrammeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CardiacRehabilitationProgrammeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Gets a CardiacRehabilitationProgramme from a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param xSessionId Identifies user which undertakes this action
   * @return CardiacRehabilitationProgrammeSection
   */
  public CardiacRehabilitationProgrammeSection cardiacRehabilitationProgrammeGetCRProgramme (String patientNumber, String xSessionId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling cardiacRehabilitationProgrammeGetCRProgramme");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/CRProgramme/{patientNumber}".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<CardiacRehabilitationProgrammeSection>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Sets a BehaviouralChangeProgramme of a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param cardiacRehabilitationProgramme Data belonging to an CardiacRehabilitationProgramme
   * @param xSessionId Identifies user which undertakes this action
   * @return GenericPostputResult
   */
  public GenericPostputResult cardiacRehabilitationProgrammePutCRProgramme (String patientNumber, CardiacRehabilitationProgrammeSection cardiacRehabilitationProgramme, String xSessionId) throws ApiException {
    Object postBody = cardiacRehabilitationProgramme;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling cardiacRehabilitationProgrammePutCRProgramme");
     }
     
     // verify the required parameter 'cardiacRehabilitationProgramme' is set
     if (cardiacRehabilitationProgramme == null) {
        throw new ApiException(400, "Missing the required parameter 'cardiacRehabilitationProgramme' when calling cardiacRehabilitationProgrammePutCRProgramme");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/CRProgramme/{patientNumber}".replaceAll("\\{format\\}","json")
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
