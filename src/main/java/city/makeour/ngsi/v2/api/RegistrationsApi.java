package city.makeour.ngsi.v2.api;

import city.makeour.ngsi.v2.invoker.ApiClient;

import city.makeour.ngsi.v2.model.CreateRegistrationRequest;
import city.makeour.ngsi.v2.model.ListRegistrationsResponse;
import city.makeour.ngsi.v2.model.RetrieveRegistrationResponse;
import city.makeour.ngsi.v2.model.UpdateRegistrationRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestClient.ResponseSpec;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-27T19:56:40.594359+09:00[Asia/Tokyo]", comments = "Generator version: 7.12.0")
public class RegistrationsApi {
    private ApiClient apiClient;

    public RegistrationsApi() {
        this(new ApiClient());
    }

    @Autowired
    public RegistrationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create Registration
     * Creates a new context provider registration. This is typically used for binding context sources as providers of certain data. The registration is represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 201 Created * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>201</b> - 
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createRegistrationRequestCreation(String contentType, CreateRegistrationRequest body) throws RestClientResponseException {
        Object postBody = body;
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new RestClientResponseException("Missing the required parameter 'contentType' when calling createRegistration", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new RestClientResponseException("Missing the required parameter 'body' when calling createRegistration", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();


        if (contentType != null)
        headerParams.add("Content-Type", apiClient.parameterToString(contentType));
        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/v2/registrations", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Registration
     * Creates a new context provider registration. This is typically used for binding context sources as providers of certain data. The registration is represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 201 Created * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>201</b> - 
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void createRegistration(String contentType, CreateRegistrationRequest body) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        createRegistrationRequestCreation(contentType, body).body(localVarReturnType);
    }

    /**
     * Create Registration
     * Creates a new context provider registration. This is typically used for binding context sources as providers of certain data. The registration is represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 201 Created * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>201</b> - 
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> createRegistrationWithHttpInfo(String contentType, CreateRegistrationRequest body) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createRegistrationRequestCreation(contentType, body).toEntity(localVarReturnType);
    }

    /**
     * Create Registration
     * Creates a new context provider registration. This is typically used for binding context sources as providers of certain data. The registration is represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 201 Created * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>201</b> - 
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createRegistrationWithResponseSpec(String contentType, CreateRegistrationRequest body) throws RestClientResponseException {
        return createRegistrationRequestCreation(contentType, body);
    }
    /**
     * Delete Registration
     * Cancels a context provider registration. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param registrationId registration Id.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteRegistrationRequestCreation(String registrationId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'registrationId' is set
        if (registrationId == null) {
            throw new RestClientResponseException("Missing the required parameter 'registrationId' when calling deleteRegistration", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("registrationId", registrationId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/v2/registrations/{registrationId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete Registration
     * Cancels a context provider registration. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param registrationId registration Id.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void deleteRegistration(String registrationId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deleteRegistrationRequestCreation(registrationId).body(localVarReturnType);
    }

    /**
     * Delete Registration
     * Cancels a context provider registration. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param registrationId registration Id.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteRegistrationWithHttpInfo(String registrationId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteRegistrationRequestCreation(registrationId).toEntity(localVarReturnType);
    }

    /**
     * Delete Registration
     * Cancels a context provider registration. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param registrationId registration Id.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteRegistrationWithResponseSpec(String registrationId) throws RestClientResponseException {
        return deleteRegistrationRequestCreation(registrationId);
    }
    /**
     * List Registrations
     * Lists all the context provider registrations present in the system.
     * <p><b>200</b> - 
     * @param limit Limit the number of registrations to be retrieved
     * @param offset Skip a number of registrations
     * @param options Options dictionary
     * @return List&lt;ListRegistrationsResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listRegistrationsRequestCreation(Double limit, Double offset, String options) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "options", options));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<ListRegistrationsResponse>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/v2/registrations", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List Registrations
     * Lists all the context provider registrations present in the system.
     * <p><b>200</b> - 
     * @param limit Limit the number of registrations to be retrieved
     * @param offset Skip a number of registrations
     * @param options Options dictionary
     * @return List&lt;ListRegistrationsResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<ListRegistrationsResponse> listRegistrations(Double limit, Double offset, String options) throws RestClientResponseException {
        ParameterizedTypeReference<List<ListRegistrationsResponse>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listRegistrationsRequestCreation(limit, offset, options).body(localVarReturnType);
    }

    /**
     * List Registrations
     * Lists all the context provider registrations present in the system.
     * <p><b>200</b> - 
     * @param limit Limit the number of registrations to be retrieved
     * @param offset Skip a number of registrations
     * @param options Options dictionary
     * @return ResponseEntity&lt;List&lt;ListRegistrationsResponse&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ListRegistrationsResponse>> listRegistrationsWithHttpInfo(Double limit, Double offset, String options) throws RestClientResponseException {
        ParameterizedTypeReference<List<ListRegistrationsResponse>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listRegistrationsRequestCreation(limit, offset, options).toEntity(localVarReturnType);
    }

    /**
     * List Registrations
     * Lists all the context provider registrations present in the system.
     * <p><b>200</b> - 
     * @param limit Limit the number of registrations to be retrieved
     * @param offset Skip a number of registrations
     * @param options Options dictionary
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listRegistrationsWithResponseSpec(Double limit, Double offset, String options) throws RestClientResponseException {
        return listRegistrationsRequestCreation(limit, offset, options);
    }
    /**
     * Retrieve Registration
     * The response is the registration represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param registrationId registration Id.
     * @return RetrieveRegistrationResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec retrieveRegistrationRequestCreation(String registrationId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'registrationId' is set
        if (registrationId == null) {
            throw new RestClientResponseException("Missing the required parameter 'registrationId' when calling retrieveRegistration", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("registrationId", registrationId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<RetrieveRegistrationResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/v2/registrations/{registrationId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve Registration
     * The response is the registration represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param registrationId registration Id.
     * @return RetrieveRegistrationResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public RetrieveRegistrationResponse retrieveRegistration(String registrationId) throws RestClientResponseException {
        ParameterizedTypeReference<RetrieveRegistrationResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return retrieveRegistrationRequestCreation(registrationId).body(localVarReturnType);
    }

    /**
     * Retrieve Registration
     * The response is the registration represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param registrationId registration Id.
     * @return ResponseEntity&lt;RetrieveRegistrationResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RetrieveRegistrationResponse> retrieveRegistrationWithHttpInfo(String registrationId) throws RestClientResponseException {
        ParameterizedTypeReference<RetrieveRegistrationResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return retrieveRegistrationRequestCreation(registrationId).toEntity(localVarReturnType);
    }

    /**
     * Retrieve Registration
     * The response is the registration represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param registrationId registration Id.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec retrieveRegistrationWithResponseSpec(String registrationId) throws RestClientResponseException {
        return retrieveRegistrationRequestCreation(registrationId);
    }
    /**
     * Update Registration
     * Only the fields included in the request are updated in the registration. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param registrationId registration Id.
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateRegistrationRequestCreation(String registrationId, String contentType, UpdateRegistrationRequest body) throws RestClientResponseException {
        Object postBody = body;
        // verify the required parameter 'registrationId' is set
        if (registrationId == null) {
            throw new RestClientResponseException("Missing the required parameter 'registrationId' when calling updateRegistration", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new RestClientResponseException("Missing the required parameter 'contentType' when calling updateRegistration", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new RestClientResponseException("Missing the required parameter 'body' when calling updateRegistration", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("registrationId", registrationId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();


        if (contentType != null)
        headerParams.add("Content-Type", apiClient.parameterToString(contentType));
        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/v2/registrations/{registrationId}", HttpMethod.PATCH, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update Registration
     * Only the fields included in the request are updated in the registration. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param registrationId registration Id.
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateRegistration(String registrationId, String contentType, UpdateRegistrationRequest body) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateRegistrationRequestCreation(registrationId, contentType, body).body(localVarReturnType);
    }

    /**
     * Update Registration
     * Only the fields included in the request are updated in the registration. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param registrationId registration Id.
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateRegistrationWithHttpInfo(String registrationId, String contentType, UpdateRegistrationRequest body) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateRegistrationRequestCreation(registrationId, contentType, body).toEntity(localVarReturnType);
    }

    /**
     * Update Registration
     * Only the fields included in the request are updated in the registration. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param registrationId registration Id.
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateRegistrationWithResponseSpec(String registrationId, String contentType, UpdateRegistrationRequest body) throws RestClientResponseException {
        return updateRegistrationRequestCreation(registrationId, contentType, body);
    }
}
