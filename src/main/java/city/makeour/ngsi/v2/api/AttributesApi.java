package city.makeour.ngsi.v2.api;

import city.makeour.ngsi.v2.invoker.ApiClient;

import city.makeour.ngsi.v2.model.GetAttributeDataResponse;
import city.makeour.ngsi.v2.model.UpdateAttributeDataRequest;

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
public class AttributesApi {
    private ApiClient apiClient;

    public AttributesApi() {
        this(new ApiClient());
    }

    @Autowired
    public AttributesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get attribute data
     * Returns a JSON object with the attribute data of the attribute. The object follows the JSON representation for attributes (described in \&quot;JSON Attribute Representation\&quot; section). Response: * Successful operation uses 200 OK. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param entityId Id of the entity
     * @param attrName Name of the attribute to be retrieved.
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @param metadata A list of metadata names to include in the response. See \&quot;Filtering out attributes and metadata\&quot; section for more detail.
     * @return GetAttributeDataResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getAttributeDataRequestCreation(String entityId, String attrName, String type, String metadata) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'entityId' is set
        if (entityId == null) {
            throw new RestClientResponseException("Missing the required parameter 'entityId' when calling getAttributeData", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'attrName' is set
        if (attrName == null) {
            throw new RestClientResponseException("Missing the required parameter 'attrName' when calling getAttributeData", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("entityId", entityId);
        pathParams.put("attrName", attrName);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "metadata", metadata));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetAttributeDataResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/v2/entities/{entityId}/attrs/{attrName}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get attribute data
     * Returns a JSON object with the attribute data of the attribute. The object follows the JSON representation for attributes (described in \&quot;JSON Attribute Representation\&quot; section). Response: * Successful operation uses 200 OK. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param entityId Id of the entity
     * @param attrName Name of the attribute to be retrieved.
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @param metadata A list of metadata names to include in the response. See \&quot;Filtering out attributes and metadata\&quot; section for more detail.
     * @return GetAttributeDataResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public GetAttributeDataResponse getAttributeData(String entityId, String attrName, String type, String metadata) throws RestClientResponseException {
        ParameterizedTypeReference<GetAttributeDataResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getAttributeDataRequestCreation(entityId, attrName, type, metadata).body(localVarReturnType);
    }

    /**
     * Get attribute data
     * Returns a JSON object with the attribute data of the attribute. The object follows the JSON representation for attributes (described in \&quot;JSON Attribute Representation\&quot; section). Response: * Successful operation uses 200 OK. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param entityId Id of the entity
     * @param attrName Name of the attribute to be retrieved.
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @param metadata A list of metadata names to include in the response. See \&quot;Filtering out attributes and metadata\&quot; section for more detail.
     * @return ResponseEntity&lt;GetAttributeDataResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetAttributeDataResponse> getAttributeDataWithHttpInfo(String entityId, String attrName, String type, String metadata) throws RestClientResponseException {
        ParameterizedTypeReference<GetAttributeDataResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getAttributeDataRequestCreation(entityId, attrName, type, metadata).toEntity(localVarReturnType);
    }

    /**
     * Get attribute data
     * Returns a JSON object with the attribute data of the attribute. The object follows the JSON representation for attributes (described in \&quot;JSON Attribute Representation\&quot; section). Response: * Successful operation uses 200 OK. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param entityId Id of the entity
     * @param attrName Name of the attribute to be retrieved.
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @param metadata A list of metadata names to include in the response. See \&quot;Filtering out attributes and metadata\&quot; section for more detail.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getAttributeDataWithResponseSpec(String entityId, String attrName, String type, String metadata) throws RestClientResponseException {
        return getAttributeDataRequestCreation(entityId, attrName, type, metadata);
    }
    /**
     * Remove a Single Attribute
     * Removes an entity attribute. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param entityId Id of the entity.
     * @param attrName Attribute name.
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec removeASingleAttributeRequestCreation(String entityId, String attrName, String type) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'entityId' is set
        if (entityId == null) {
            throw new RestClientResponseException("Missing the required parameter 'entityId' when calling removeASingleAttribute", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'attrName' is set
        if (attrName == null) {
            throw new RestClientResponseException("Missing the required parameter 'attrName' when calling removeASingleAttribute", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("entityId", entityId);
        pathParams.put("attrName", attrName);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        
        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/v2/entities/{entityId}/attrs/{attrName}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Remove a Single Attribute
     * Removes an entity attribute. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param entityId Id of the entity.
     * @param attrName Attribute name.
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void removeASingleAttribute(String entityId, String attrName, String type) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        removeASingleAttributeRequestCreation(entityId, attrName, type).body(localVarReturnType);
    }

    /**
     * Remove a Single Attribute
     * Removes an entity attribute. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param entityId Id of the entity.
     * @param attrName Attribute name.
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> removeASingleAttributeWithHttpInfo(String entityId, String attrName, String type) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return removeASingleAttributeRequestCreation(entityId, attrName, type).toEntity(localVarReturnType);
    }

    /**
     * Remove a Single Attribute
     * Removes an entity attribute. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param entityId Id of the entity.
     * @param attrName Attribute name.
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec removeASingleAttributeWithResponseSpec(String entityId, String attrName, String type) throws RestClientResponseException {
        return removeASingleAttributeRequestCreation(entityId, attrName, type);
    }
    /**
     * Update Attribute Data
     * The request payload is an object representing the new attribute data. Previous attribute data is replaced by the one in the request. The object follows the JSON representation for attributes (described in \&quot;JSON Attribute Representation\&quot; section). Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param entityId Id of the entity to update
     * @param attrName Attribute name
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateAttributeDataRequestCreation(String entityId, String attrName, String contentType, UpdateAttributeDataRequest body, String type) throws RestClientResponseException {
        Object postBody = body;
        // verify the required parameter 'entityId' is set
        if (entityId == null) {
            throw new RestClientResponseException("Missing the required parameter 'entityId' when calling updateAttributeData", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'attrName' is set
        if (attrName == null) {
            throw new RestClientResponseException("Missing the required parameter 'attrName' when calling updateAttributeData", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new RestClientResponseException("Missing the required parameter 'contentType' when calling updateAttributeData", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new RestClientResponseException("Missing the required parameter 'body' when calling updateAttributeData", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("entityId", entityId);
        pathParams.put("attrName", attrName);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        

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
        return apiClient.invokeAPI("/v2/entities/{entityId}/attrs/{attrName}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update Attribute Data
     * The request payload is an object representing the new attribute data. Previous attribute data is replaced by the one in the request. The object follows the JSON representation for attributes (described in \&quot;JSON Attribute Representation\&quot; section). Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param entityId Id of the entity to update
     * @param attrName Attribute name
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateAttributeData(String entityId, String attrName, String contentType, UpdateAttributeDataRequest body, String type) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateAttributeDataRequestCreation(entityId, attrName, contentType, body, type).body(localVarReturnType);
    }

    /**
     * Update Attribute Data
     * The request payload is an object representing the new attribute data. Previous attribute data is replaced by the one in the request. The object follows the JSON representation for attributes (described in \&quot;JSON Attribute Representation\&quot; section). Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param entityId Id of the entity to update
     * @param attrName Attribute name
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateAttributeDataWithHttpInfo(String entityId, String attrName, String contentType, UpdateAttributeDataRequest body, String type) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateAttributeDataRequestCreation(entityId, attrName, contentType, body, type).toEntity(localVarReturnType);
    }

    /**
     * Update Attribute Data
     * The request payload is an object representing the new attribute data. Previous attribute data is replaced by the one in the request. The object follows the JSON representation for attributes (described in \&quot;JSON Attribute Representation\&quot; section). Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param entityId Id of the entity to update
     * @param attrName Attribute name
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateAttributeDataWithResponseSpec(String entityId, String attrName, String contentType, UpdateAttributeDataRequest body, String type) throws RestClientResponseException {
        return updateAttributeDataRequestCreation(entityId, attrName, contentType, body, type);
    }
}
