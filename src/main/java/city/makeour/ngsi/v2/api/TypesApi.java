package city.makeour.ngsi.v2.api;

import city.makeour.ngsi.v2.invoker.ApiClient;

import city.makeour.ngsi.v2.model.ListEntityTypesResponse;
import city.makeour.ngsi.v2.model.RetrieveEntityTypeResponse;

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
public class TypesApi {
    private ApiClient apiClient;

    public TypesApi() {
        this(new ApiClient());
    }

    @Autowired
    public TypesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List Entity Types
     * If the &#x60;values&#x60; option is not in use, this operation returns a JSON array with the entity types. Each element is a JSON object with information about the type: * &#x60;type&#x60; : the entity type name. * &#x60;attrs&#x60; : the set of attribute names along with all the entities of such type, represented in   a JSON object whose keys are the attribute names and whose values contain information of such   attributes (in particular a list of the types used by attributes with that name along with all the   entities). * &#x60;count&#x60; : the number of entities belonging to that type. If the &#x60;values&#x60; option is used, the operation returns a JSON array with a list of entity type names as strings. Results are ordered by entity &#x60;type&#x60; in alphabetical order. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param limit Limit the number of types to be retrieved.
     * @param offset Skip a number of records.
     * @param options Options dictionary.
     * @return List&lt;ListEntityTypesResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listEntityTypesRequestCreation(Double limit, Double offset, String options) throws RestClientResponseException {
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

        ParameterizedTypeReference<List<ListEntityTypesResponse>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/v2/types/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List Entity Types
     * If the &#x60;values&#x60; option is not in use, this operation returns a JSON array with the entity types. Each element is a JSON object with information about the type: * &#x60;type&#x60; : the entity type name. * &#x60;attrs&#x60; : the set of attribute names along with all the entities of such type, represented in   a JSON object whose keys are the attribute names and whose values contain information of such   attributes (in particular a list of the types used by attributes with that name along with all the   entities). * &#x60;count&#x60; : the number of entities belonging to that type. If the &#x60;values&#x60; option is used, the operation returns a JSON array with a list of entity type names as strings. Results are ordered by entity &#x60;type&#x60; in alphabetical order. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param limit Limit the number of types to be retrieved.
     * @param offset Skip a number of records.
     * @param options Options dictionary.
     * @return List&lt;ListEntityTypesResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<ListEntityTypesResponse> listEntityTypes(Double limit, Double offset, String options) throws RestClientResponseException {
        ParameterizedTypeReference<List<ListEntityTypesResponse>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listEntityTypesRequestCreation(limit, offset, options).body(localVarReturnType);
    }

    /**
     * List Entity Types
     * If the &#x60;values&#x60; option is not in use, this operation returns a JSON array with the entity types. Each element is a JSON object with information about the type: * &#x60;type&#x60; : the entity type name. * &#x60;attrs&#x60; : the set of attribute names along with all the entities of such type, represented in   a JSON object whose keys are the attribute names and whose values contain information of such   attributes (in particular a list of the types used by attributes with that name along with all the   entities). * &#x60;count&#x60; : the number of entities belonging to that type. If the &#x60;values&#x60; option is used, the operation returns a JSON array with a list of entity type names as strings. Results are ordered by entity &#x60;type&#x60; in alphabetical order. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param limit Limit the number of types to be retrieved.
     * @param offset Skip a number of records.
     * @param options Options dictionary.
     * @return ResponseEntity&lt;List&lt;ListEntityTypesResponse&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ListEntityTypesResponse>> listEntityTypesWithHttpInfo(Double limit, Double offset, String options) throws RestClientResponseException {
        ParameterizedTypeReference<List<ListEntityTypesResponse>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listEntityTypesRequestCreation(limit, offset, options).toEntity(localVarReturnType);
    }

    /**
     * List Entity Types
     * If the &#x60;values&#x60; option is not in use, this operation returns a JSON array with the entity types. Each element is a JSON object with information about the type: * &#x60;type&#x60; : the entity type name. * &#x60;attrs&#x60; : the set of attribute names along with all the entities of such type, represented in   a JSON object whose keys are the attribute names and whose values contain information of such   attributes (in particular a list of the types used by attributes with that name along with all the   entities). * &#x60;count&#x60; : the number of entities belonging to that type. If the &#x60;values&#x60; option is used, the operation returns a JSON array with a list of entity type names as strings. Results are ordered by entity &#x60;type&#x60; in alphabetical order. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param limit Limit the number of types to be retrieved.
     * @param offset Skip a number of records.
     * @param options Options dictionary.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listEntityTypesWithResponseSpec(Double limit, Double offset, String options) throws RestClientResponseException {
        return listEntityTypesRequestCreation(limit, offset, options);
    }
    /**
     * Retrieve entity type
     * This operation returns a JSON object with information about the type: * &#x60;attrs&#x60; : the set of attribute names along with all the entities of such type, represented in   a JSON object whose keys are the attribute names and whose values contain information of such   attributes (in particular a list of the types used by attributes with that name along with all the   entities). * &#x60;count&#x60; : the number of entities belonging to that type. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param entityType Entity Type
     * @return RetrieveEntityTypeResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec retrieveEntityTypeRequestCreation(String entityType) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new RestClientResponseException("Missing the required parameter 'entityType' when calling retrieveEntityType", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("entityType", entityType);

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

        ParameterizedTypeReference<RetrieveEntityTypeResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/v2/types/{entityType}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve entity type
     * This operation returns a JSON object with information about the type: * &#x60;attrs&#x60; : the set of attribute names along with all the entities of such type, represented in   a JSON object whose keys are the attribute names and whose values contain information of such   attributes (in particular a list of the types used by attributes with that name along with all the   entities). * &#x60;count&#x60; : the number of entities belonging to that type. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param entityType Entity Type
     * @return RetrieveEntityTypeResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public RetrieveEntityTypeResponse retrieveEntityType(String entityType) throws RestClientResponseException {
        ParameterizedTypeReference<RetrieveEntityTypeResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return retrieveEntityTypeRequestCreation(entityType).body(localVarReturnType);
    }

    /**
     * Retrieve entity type
     * This operation returns a JSON object with information about the type: * &#x60;attrs&#x60; : the set of attribute names along with all the entities of such type, represented in   a JSON object whose keys are the attribute names and whose values contain information of such   attributes (in particular a list of the types used by attributes with that name along with all the   entities). * &#x60;count&#x60; : the number of entities belonging to that type. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param entityType Entity Type
     * @return ResponseEntity&lt;RetrieveEntityTypeResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RetrieveEntityTypeResponse> retrieveEntityTypeWithHttpInfo(String entityType) throws RestClientResponseException {
        ParameterizedTypeReference<RetrieveEntityTypeResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return retrieveEntityTypeRequestCreation(entityType).toEntity(localVarReturnType);
    }

    /**
     * Retrieve entity type
     * This operation returns a JSON object with information about the type: * &#x60;attrs&#x60; : the set of attribute names along with all the entities of such type, represented in   a JSON object whose keys are the attribute names and whose values contain information of such   attributes (in particular a list of the types used by attributes with that name along with all the   entities). * &#x60;count&#x60; : the number of entities belonging to that type. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param entityType Entity Type
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec retrieveEntityTypeWithResponseSpec(String entityType) throws RestClientResponseException {
        return retrieveEntityTypeRequestCreation(entityType);
    }
}
