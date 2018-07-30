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

import io.swagger.client.model.CPETTestSection;
import io.swagger.client.model.GenericPostputResult;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class ClinicalDataApi {
  private ApiClient apiClient;

  public ClinicalDataApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ClinicalDataApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Gets a CPETTest from a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param xSessionId Identifies user which undertakes this action
   * @return CPETTestSection
   */
  public CPETTestSection clinicalDataGetCPETTest (String patientNumber, String xSessionId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling clinicalDataGetCPETTest");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/CPETTest/{patientNumber}".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<CPETTestSection>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Sets a CPETTest of a patient
   * 
   * @param patientNumber The health ID of the patient
   * @param cPETTest Data belonging to an CPETTest
   * @param xSessionId Identifies user which undertakes this action
   * @return GenericPostputResult
   */
  public GenericPostputResult clinicalDataPutCPETTest (String patientNumber, CPETTestSection cPETTest, String xSessionId) throws ApiException {
    Object postBody = cPETTest;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'patientNumber' is set
     if (patientNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'patientNumber' when calling clinicalDataPutCPETTest");
     }
     
     // verify the required parameter 'cPETTest' is set
     if (cPETTest == null) {
        throw new ApiException(400, "Missing the required parameter 'cPETTest' when calling clinicalDataPutCPETTest");
     }
     
    // create path and map variables
    String path = "/pathway/hdm/CPETTest/{patientNumber}".replaceAll("\\{format\\}","json")
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
