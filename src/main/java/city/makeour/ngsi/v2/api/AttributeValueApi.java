package city.makeour.ngsi.v2.api;

import city.makeour.ngsi.v2.invoker.ApiClient;

import city.makeour.ngsi.v2.model.GetAttributeValueResponse;
import city.makeour.ngsi.v2.model.UpdateAttributeValueRequest;

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
public class AttributeValueApi {
    private ApiClient apiClient;

    public AttributeValueApi() {
        this(new ApiClient());
    }

    @Autowired
    public AttributeValueApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get Attribute Value
     * This operation returns the &#x60;value&#x60; property with the value of the attribute. * If attribute value is JSON Array or Object:   * If &#x60;Accept&#x60; header can be expanded to &#x60;application/json&#x60; or &#x60;text/plain&#x60; return the value as a JSON with a     response type of application/json or text/plain (whichever is the first in &#x60;Accept&#x60; header or     &#x60;application/json&#x60; in case of &#x60;Accept: *_/_*&#x60;).   * Else return a HTTP error \&quot;406 Not Acceptable: accepted MIME types: application/json, text/plain\&quot; * If attribute value is a string, number, null or boolean:   * If &#x60;Accept&#x60; header can be expanded to text/plain return the value as text. In case of a string, citation     marks are used at the begining and end.   * Else return a HTTP error \&quot;406 Not Acceptable: accepted MIME types: text/plain\&quot; Response: * Successful operation uses 200 OK. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param entityId Id of the entity in question
     * @param attrName Name of the attribute to be retrieved.
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @return GetAttributeValueResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getAttributeValueRequestCreation(String entityId, String attrName, String type) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'entityId' is set
        if (entityId == null) {
            throw new RestClientResponseException("Missing the required parameter 'entityId' when calling getAttributeValue", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'attrName' is set
        if (attrName == null) {
            throw new RestClientResponseException("Missing the required parameter 'attrName' when calling getAttributeValue", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetAttributeValueResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/v2/entities/{entityId}/attrs/{attrName}/value", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Attribute Value
     * This operation returns the &#x60;value&#x60; property with the value of the attribute. * If attribute value is JSON Array or Object:   * If &#x60;Accept&#x60; header can be expanded to &#x60;application/json&#x60; or &#x60;text/plain&#x60; return the value as a JSON with a     response type of application/json or text/plain (whichever is the first in &#x60;Accept&#x60; header or     &#x60;application/json&#x60; in case of &#x60;Accept: *_/_*&#x60;).   * Else return a HTTP error \&quot;406 Not Acceptable: accepted MIME types: application/json, text/plain\&quot; * If attribute value is a string, number, null or boolean:   * If &#x60;Accept&#x60; header can be expanded to text/plain return the value as text. In case of a string, citation     marks are used at the begining and end.   * Else return a HTTP error \&quot;406 Not Acceptable: accepted MIME types: text/plain\&quot; Response: * Successful operation uses 200 OK. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param entityId Id of the entity in question
     * @param attrName Name of the attribute to be retrieved.
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @return GetAttributeValueResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public GetAttributeValueResponse getAttributeValue(String entityId, String attrName, String type) throws RestClientResponseException {
        ParameterizedTypeReference<GetAttributeValueResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getAttributeValueRequestCreation(entityId, attrName, type).body(localVarReturnType);
    }

    /**
     * Get Attribute Value
     * This operation returns the &#x60;value&#x60; property with the value of the attribute. * If attribute value is JSON Array or Object:   * If &#x60;Accept&#x60; header can be expanded to &#x60;application/json&#x60; or &#x60;text/plain&#x60; return the value as a JSON with a     response type of application/json or text/plain (whichever is the first in &#x60;Accept&#x60; header or     &#x60;application/json&#x60; in case of &#x60;Accept: *_/_*&#x60;).   * Else return a HTTP error \&quot;406 Not Acceptable: accepted MIME types: application/json, text/plain\&quot; * If attribute value is a string, number, null or boolean:   * If &#x60;Accept&#x60; header can be expanded to text/plain return the value as text. In case of a string, citation     marks are used at the begining and end.   * Else return a HTTP error \&quot;406 Not Acceptable: accepted MIME types: text/plain\&quot; Response: * Successful operation uses 200 OK. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param entityId Id of the entity in question
     * @param attrName Name of the attribute to be retrieved.
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @return ResponseEntity&lt;GetAttributeValueResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetAttributeValueResponse> getAttributeValueWithHttpInfo(String entityId, String attrName, String type) throws RestClientResponseException {
        ParameterizedTypeReference<GetAttributeValueResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getAttributeValueRequestCreation(entityId, attrName, type).toEntity(localVarReturnType);
    }

    /**
     * Get Attribute Value
     * This operation returns the &#x60;value&#x60; property with the value of the attribute. * If attribute value is JSON Array or Object:   * If &#x60;Accept&#x60; header can be expanded to &#x60;application/json&#x60; or &#x60;text/plain&#x60; return the value as a JSON with a     response type of application/json or text/plain (whichever is the first in &#x60;Accept&#x60; header or     &#x60;application/json&#x60; in case of &#x60;Accept: *_/_*&#x60;).   * Else return a HTTP error \&quot;406 Not Acceptable: accepted MIME types: application/json, text/plain\&quot; * If attribute value is a string, number, null or boolean:   * If &#x60;Accept&#x60; header can be expanded to text/plain return the value as text. In case of a string, citation     marks are used at the begining and end.   * Else return a HTTP error \&quot;406 Not Acceptable: accepted MIME types: text/plain\&quot; Response: * Successful operation uses 200 OK. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param entityId Id of the entity in question
     * @param attrName Name of the attribute to be retrieved.
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getAttributeValueWithResponseSpec(String entityId, String attrName, String type) throws RestClientResponseException {
        return getAttributeValueRequestCreation(entityId, attrName, type);
    }
    /**
     * Update Attribute Value
     * The request payload is the new attribute value. * If the request payload MIME type is &#x60;application/json&#x60;, then the value of the attribute is set to   the JSON object or array coded in the payload (if the payload is not a valid JSON document,   then an error is returned). * If the request payload MIME type is &#x60;text/plain&#x60;, then the following algorithm is applied to the   payload:   * If the payload starts and ends with citation-marks (&#x60;\&quot;&#x60;), the value is taken as a string     (the citation marks themselves are not considered part of the string)   * If &#x60;true&#x60; or &#x60;false&#x60;, the value is taken as a boolean.   * If &#x60;null&#x60;, the value is taken as null.   * If these first three tests &#39;fail&#39;, the text is interpreted as a number.   * If not a valid number, then an error is returned and the attribute&#39;s value is unchanged. The payload MIME type in the request is specified in the &#x60;Content-Type&#x60; HTTP header. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param entityId Id of the entity to be updated.
     * @param attrName Attribute name.
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateAttributeValueRequestCreation(String entityId, String attrName, String contentType, UpdateAttributeValueRequest body, String type) throws RestClientResponseException {
        Object postBody = body;
        // verify the required parameter 'entityId' is set
        if (entityId == null) {
            throw new RestClientResponseException("Missing the required parameter 'entityId' when calling updateAttributeValue", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'attrName' is set
        if (attrName == null) {
            throw new RestClientResponseException("Missing the required parameter 'attrName' when calling updateAttributeValue", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new RestClientResponseException("Missing the required parameter 'contentType' when calling updateAttributeValue", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new RestClientResponseException("Missing the required parameter 'body' when calling updateAttributeValue", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/v2/entities/{entityId}/attrs/{attrName}/value", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update Attribute Value
     * The request payload is the new attribute value. * If the request payload MIME type is &#x60;application/json&#x60;, then the value of the attribute is set to   the JSON object or array coded in the payload (if the payload is not a valid JSON document,   then an error is returned). * If the request payload MIME type is &#x60;text/plain&#x60;, then the following algorithm is applied to the   payload:   * If the payload starts and ends with citation-marks (&#x60;\&quot;&#x60;), the value is taken as a string     (the citation marks themselves are not considered part of the string)   * If &#x60;true&#x60; or &#x60;false&#x60;, the value is taken as a boolean.   * If &#x60;null&#x60;, the value is taken as null.   * If these first three tests &#39;fail&#39;, the text is interpreted as a number.   * If not a valid number, then an error is returned and the attribute&#39;s value is unchanged. The payload MIME type in the request is specified in the &#x60;Content-Type&#x60; HTTP header. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param entityId Id of the entity to be updated.
     * @param attrName Attribute name.
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateAttributeValue(String entityId, String attrName, String contentType, UpdateAttributeValueRequest body, String type) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateAttributeValueRequestCreation(entityId, attrName, contentType, body, type).body(localVarReturnType);
    }

    /**
     * Update Attribute Value
     * The request payload is the new attribute value. * If the request payload MIME type is &#x60;application/json&#x60;, then the value of the attribute is set to   the JSON object or array coded in the payload (if the payload is not a valid JSON document,   then an error is returned). * If the request payload MIME type is &#x60;text/plain&#x60;, then the following algorithm is applied to the   payload:   * If the payload starts and ends with citation-marks (&#x60;\&quot;&#x60;), the value is taken as a string     (the citation marks themselves are not considered part of the string)   * If &#x60;true&#x60; or &#x60;false&#x60;, the value is taken as a boolean.   * If &#x60;null&#x60;, the value is taken as null.   * If these first three tests &#39;fail&#39;, the text is interpreted as a number.   * If not a valid number, then an error is returned and the attribute&#39;s value is unchanged. The payload MIME type in the request is specified in the &#x60;Content-Type&#x60; HTTP header. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param entityId Id of the entity to be updated.
     * @param attrName Attribute name.
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateAttributeValueWithHttpInfo(String entityId, String attrName, String contentType, UpdateAttributeValueRequest body, String type) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateAttributeValueRequestCreation(entityId, attrName, contentType, body, type).toEntity(localVarReturnType);
    }

    /**
     * Update Attribute Value
     * The request payload is the new attribute value. * If the request payload MIME type is &#x60;application/json&#x60;, then the value of the attribute is set to   the JSON object or array coded in the payload (if the payload is not a valid JSON document,   then an error is returned). * If the request payload MIME type is &#x60;text/plain&#x60;, then the following algorithm is applied to the   payload:   * If the payload starts and ends with citation-marks (&#x60;\&quot;&#x60;), the value is taken as a string     (the citation marks themselves are not considered part of the string)   * If &#x60;true&#x60; or &#x60;false&#x60;, the value is taken as a boolean.   * If &#x60;null&#x60;, the value is taken as null.   * If these first three tests &#39;fail&#39;, the text is interpreted as a number.   * If not a valid number, then an error is returned and the attribute&#39;s value is unchanged. The payload MIME type in the request is specified in the &#x60;Content-Type&#x60; HTTP header. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param entityId Id of the entity to be updated.
     * @param attrName Attribute name.
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateAttributeValueWithResponseSpec(String entityId, String attrName, String contentType, UpdateAttributeValueRequest body, String type) throws RestClientResponseException {
        return updateAttributeValueRequestCreation(entityId, attrName, contentType, body, type);
    }
}
