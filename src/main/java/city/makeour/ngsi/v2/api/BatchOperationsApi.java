package city.makeour.ngsi.v2.api;

import city.makeour.ngsi.v2.invoker.ApiClient;

import city.makeour.ngsi.v2.model.NotifyRequest;
import city.makeour.ngsi.v2.model.QueryRequest;
import city.makeour.ngsi.v2.model.QueryResponse;
import city.makeour.ngsi.v2.model.UpdateRequest;

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
public class BatchOperationsApi {
    private ApiClient apiClient;

    public BatchOperationsApi() {
        this(new ApiClient());
    }

    @Autowired
    public BatchOperationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Notify
     * This operation is intended to consume a notification payload so that all the entity data included by such notification is persisted, overwriting if necessary. This operation is useful when one NGSIv2 endpoint is subscribed to another NGSIv2 endpoint (federation scenarios).  The request payload must be an NGSIv2 notification payload.  The behaviour must be exactly the same as &#x60;POST /v2/op/update&#x60; with &#x60;actionType&#x60; equal to &#x60;append&#x60;. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param options Options dictionary
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec notifyRequestCreation(String contentType, NotifyRequest body, String options) throws RestClientResponseException {
        Object postBody = body;
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new RestClientResponseException("Missing the required parameter 'contentType' when calling notify", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new RestClientResponseException("Missing the required parameter 'body' when calling notify", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "options", options));
        

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
        return apiClient.invokeAPI("/v2/op/notify", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Notify
     * This operation is intended to consume a notification payload so that all the entity data included by such notification is persisted, overwriting if necessary. This operation is useful when one NGSIv2 endpoint is subscribed to another NGSIv2 endpoint (federation scenarios).  The request payload must be an NGSIv2 notification payload.  The behaviour must be exactly the same as &#x60;POST /v2/op/update&#x60; with &#x60;actionType&#x60; equal to &#x60;append&#x60;. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param options Options dictionary
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void notify(String contentType, NotifyRequest body, String options) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        notifyRequestCreation(contentType, body, options).body(localVarReturnType);
    }

    /**
     * Notify
     * This operation is intended to consume a notification payload so that all the entity data included by such notification is persisted, overwriting if necessary. This operation is useful when one NGSIv2 endpoint is subscribed to another NGSIv2 endpoint (federation scenarios).  The request payload must be an NGSIv2 notification payload.  The behaviour must be exactly the same as &#x60;POST /v2/op/update&#x60; with &#x60;actionType&#x60; equal to &#x60;append&#x60;. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param options Options dictionary
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> notifyWithHttpInfo(String contentType, NotifyRequest body, String options) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return notifyRequestCreation(contentType, body, options).toEntity(localVarReturnType);
    }

    /**
     * Notify
     * This operation is intended to consume a notification payload so that all the entity data included by such notification is persisted, overwriting if necessary. This operation is useful when one NGSIv2 endpoint is subscribed to another NGSIv2 endpoint (federation scenarios).  The request payload must be an NGSIv2 notification payload.  The behaviour must be exactly the same as &#x60;POST /v2/op/update&#x60; with &#x60;actionType&#x60; equal to &#x60;append&#x60;. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param options Options dictionary
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec notifyWithResponseSpec(String contentType, NotifyRequest body, String options) throws RestClientResponseException {
        return notifyRequestCreation(contentType, body, options);
    }
    /**
     * Query
     * The response payload is an Array containing one object per matching entity, or an empty array &#x60;[]&#x60; if  no entities are found. The entities follow the JSON entity representation format (described in the section \&quot;JSON Entity Representation\&quot;). The payload may contain the following elements (all of them optional): + &#x60;entities&#x60;: a list of entites to search for. Each element is represented by a JSON object with the   following elements:     + &#x60;id&#x60; or &#x60;idPattern&#x60;: Id or pattern of the affected entities. Both cannot be used at the same       time, but one of them must be present.     + &#x60;type&#x60; or &#x60;typePattern&#x60;: Type or type pattern of the entities to search for. Both cannot be used at       the same time. If omitted, it means \&quot;any entity type\&quot;. + &#x60;attrs&#x60;: List of attributes to be provided (if not specified, all attributes). + &#x60;expression&#x60;: an expression composed of &#x60;q&#x60;, &#x60;mq&#x60;, &#x60;georel&#x60;, &#x60;geometry&#x60; and &#x60;coords&#x60; (see \&quot;List    entities\&quot; operation above about this field). + &#x60;metadata&#x60;: a list of metadata names to include in the response.    See \&quot;Filtering out attributes and metadata\&quot; section for more detail. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param limit Limit the number of entities to be retrieved.
     * @param offset Skip a number of records.
     * @param orderBy Criteria for ordering results. See \&quot;Ordering Results\&quot; section for details.
     * @param options Options dictionary
     * @return List&lt;QueryResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec queryRequestCreation(String contentType, QueryRequest body, Double limit, Double offset, String orderBy, String options) throws RestClientResponseException {
        Object postBody = body;
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new RestClientResponseException("Missing the required parameter 'contentType' when calling query", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new RestClientResponseException("Missing the required parameter 'body' when calling query", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "options", options));
        

        if (contentType != null)
        headerParams.add("Content-Type", apiClient.parameterToString(contentType));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<QueryResponse>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/v2/op/query", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Query
     * The response payload is an Array containing one object per matching entity, or an empty array &#x60;[]&#x60; if  no entities are found. The entities follow the JSON entity representation format (described in the section \&quot;JSON Entity Representation\&quot;). The payload may contain the following elements (all of them optional): + &#x60;entities&#x60;: a list of entites to search for. Each element is represented by a JSON object with the   following elements:     + &#x60;id&#x60; or &#x60;idPattern&#x60;: Id or pattern of the affected entities. Both cannot be used at the same       time, but one of them must be present.     + &#x60;type&#x60; or &#x60;typePattern&#x60;: Type or type pattern of the entities to search for. Both cannot be used at       the same time. If omitted, it means \&quot;any entity type\&quot;. + &#x60;attrs&#x60;: List of attributes to be provided (if not specified, all attributes). + &#x60;expression&#x60;: an expression composed of &#x60;q&#x60;, &#x60;mq&#x60;, &#x60;georel&#x60;, &#x60;geometry&#x60; and &#x60;coords&#x60; (see \&quot;List    entities\&quot; operation above about this field). + &#x60;metadata&#x60;: a list of metadata names to include in the response.    See \&quot;Filtering out attributes and metadata\&quot; section for more detail. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param limit Limit the number of entities to be retrieved.
     * @param offset Skip a number of records.
     * @param orderBy Criteria for ordering results. See \&quot;Ordering Results\&quot; section for details.
     * @param options Options dictionary
     * @return List&lt;QueryResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<QueryResponse> query(String contentType, QueryRequest body, Double limit, Double offset, String orderBy, String options) throws RestClientResponseException {
        ParameterizedTypeReference<List<QueryResponse>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return queryRequestCreation(contentType, body, limit, offset, orderBy, options).body(localVarReturnType);
    }

    /**
     * Query
     * The response payload is an Array containing one object per matching entity, or an empty array &#x60;[]&#x60; if  no entities are found. The entities follow the JSON entity representation format (described in the section \&quot;JSON Entity Representation\&quot;). The payload may contain the following elements (all of them optional): + &#x60;entities&#x60;: a list of entites to search for. Each element is represented by a JSON object with the   following elements:     + &#x60;id&#x60; or &#x60;idPattern&#x60;: Id or pattern of the affected entities. Both cannot be used at the same       time, but one of them must be present.     + &#x60;type&#x60; or &#x60;typePattern&#x60;: Type or type pattern of the entities to search for. Both cannot be used at       the same time. If omitted, it means \&quot;any entity type\&quot;. + &#x60;attrs&#x60;: List of attributes to be provided (if not specified, all attributes). + &#x60;expression&#x60;: an expression composed of &#x60;q&#x60;, &#x60;mq&#x60;, &#x60;georel&#x60;, &#x60;geometry&#x60; and &#x60;coords&#x60; (see \&quot;List    entities\&quot; operation above about this field). + &#x60;metadata&#x60;: a list of metadata names to include in the response.    See \&quot;Filtering out attributes and metadata\&quot; section for more detail. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param limit Limit the number of entities to be retrieved.
     * @param offset Skip a number of records.
     * @param orderBy Criteria for ordering results. See \&quot;Ordering Results\&quot; section for details.
     * @param options Options dictionary
     * @return ResponseEntity&lt;List&lt;QueryResponse&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<QueryResponse>> queryWithHttpInfo(String contentType, QueryRequest body, Double limit, Double offset, String orderBy, String options) throws RestClientResponseException {
        ParameterizedTypeReference<List<QueryResponse>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return queryRequestCreation(contentType, body, limit, offset, orderBy, options).toEntity(localVarReturnType);
    }

    /**
     * Query
     * The response payload is an Array containing one object per matching entity, or an empty array &#x60;[]&#x60; if  no entities are found. The entities follow the JSON entity representation format (described in the section \&quot;JSON Entity Representation\&quot;). The payload may contain the following elements (all of them optional): + &#x60;entities&#x60;: a list of entites to search for. Each element is represented by a JSON object with the   following elements:     + &#x60;id&#x60; or &#x60;idPattern&#x60;: Id or pattern of the affected entities. Both cannot be used at the same       time, but one of them must be present.     + &#x60;type&#x60; or &#x60;typePattern&#x60;: Type or type pattern of the entities to search for. Both cannot be used at       the same time. If omitted, it means \&quot;any entity type\&quot;. + &#x60;attrs&#x60;: List of attributes to be provided (if not specified, all attributes). + &#x60;expression&#x60;: an expression composed of &#x60;q&#x60;, &#x60;mq&#x60;, &#x60;georel&#x60;, &#x60;geometry&#x60; and &#x60;coords&#x60; (see \&quot;List    entities\&quot; operation above about this field). + &#x60;metadata&#x60;: a list of metadata names to include in the response.    See \&quot;Filtering out attributes and metadata\&quot; section for more detail. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param limit Limit the number of entities to be retrieved.
     * @param offset Skip a number of records.
     * @param orderBy Criteria for ordering results. See \&quot;Ordering Results\&quot; section for details.
     * @param options Options dictionary
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec queryWithResponseSpec(String contentType, QueryRequest body, Double limit, Double offset, String orderBy, String options) throws RestClientResponseException {
        return queryRequestCreation(contentType, body, limit, offset, orderBy, options);
    }
    /**
     * Update
     * This operation allows to create, update and/or delete several entities in a single batch operation. The payload is an object with two properties: + &#x60;actionType&#x60;, to specify the kind of update action to do: either &#x60;append&#x60;, &#x60;appendStrict&#x60;, &#x60;update&#x60;,   &#x60;delete&#x60;, or &#x60;replace&#x60;. + &#x60;entities&#x60;, an array of entities, each entity specified using the JSON entity representation format   (described in the section \&quot;JSON Entity Representation\&quot;). This operation is split in as many individual operations as entities in the &#x60;entities&#x60; vector, so the &#x60;actionType&#x60; is executed for each one of them. Depending on the &#x60;actionType&#x60;, a mapping with regular non-batch operations can be done: * &#x60;append&#x60;: maps to &#x60;POST /v2/entities&#x60; (if the entity does not already exist) or &#x60;POST /v2/entities/&lt;id&gt;/attrs&#x60;   (if the entity already exists). * &#x60;appendStrict&#x60;: maps to &#x60;POST /v2/entities&#x60; (if the entity does not already exist) or   &#x60;POST /v2/entities/&lt;id&gt;/attrs?options&#x3D;append&#x60; (if the entity already exists). * &#x60;update&#x60;: maps to &#x60;PATCH /v2/entities/&lt;id&gt;/attrs&#x60;. * &#x60;delete&#x60;: maps to &#x60;DELETE /v2/entities/&lt;id&gt;/attrs/&lt;attrName&gt;&#x60; on every attribute included in the entity or   to &#x60;DELETE /v2/entities/&lt;id&gt;&#x60; if no attribute were included in the entity. * &#x60;replace&#x60;: maps to &#x60;PUT /v2/entities/&lt;id&gt;/attrs&#x60;. Response: * Successful operation uses 204 No Content. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param options Options dictionary
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateRequestCreation(String contentType, UpdateRequest body, String options) throws RestClientResponseException {
        Object postBody = body;
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new RestClientResponseException("Missing the required parameter 'contentType' when calling update", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new RestClientResponseException("Missing the required parameter 'body' when calling update", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "options", options));
        

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
        return apiClient.invokeAPI("/v2/op/update", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update
     * This operation allows to create, update and/or delete several entities in a single batch operation. The payload is an object with two properties: + &#x60;actionType&#x60;, to specify the kind of update action to do: either &#x60;append&#x60;, &#x60;appendStrict&#x60;, &#x60;update&#x60;,   &#x60;delete&#x60;, or &#x60;replace&#x60;. + &#x60;entities&#x60;, an array of entities, each entity specified using the JSON entity representation format   (described in the section \&quot;JSON Entity Representation\&quot;). This operation is split in as many individual operations as entities in the &#x60;entities&#x60; vector, so the &#x60;actionType&#x60; is executed for each one of them. Depending on the &#x60;actionType&#x60;, a mapping with regular non-batch operations can be done: * &#x60;append&#x60;: maps to &#x60;POST /v2/entities&#x60; (if the entity does not already exist) or &#x60;POST /v2/entities/&lt;id&gt;/attrs&#x60;   (if the entity already exists). * &#x60;appendStrict&#x60;: maps to &#x60;POST /v2/entities&#x60; (if the entity does not already exist) or   &#x60;POST /v2/entities/&lt;id&gt;/attrs?options&#x3D;append&#x60; (if the entity already exists). * &#x60;update&#x60;: maps to &#x60;PATCH /v2/entities/&lt;id&gt;/attrs&#x60;. * &#x60;delete&#x60;: maps to &#x60;DELETE /v2/entities/&lt;id&gt;/attrs/&lt;attrName&gt;&#x60; on every attribute included in the entity or   to &#x60;DELETE /v2/entities/&lt;id&gt;&#x60; if no attribute were included in the entity. * &#x60;replace&#x60;: maps to &#x60;PUT /v2/entities/&lt;id&gt;/attrs&#x60;. Response: * Successful operation uses 204 No Content. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param options Options dictionary
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void update(String contentType, UpdateRequest body, String options) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateRequestCreation(contentType, body, options).body(localVarReturnType);
    }

    /**
     * Update
     * This operation allows to create, update and/or delete several entities in a single batch operation. The payload is an object with two properties: + &#x60;actionType&#x60;, to specify the kind of update action to do: either &#x60;append&#x60;, &#x60;appendStrict&#x60;, &#x60;update&#x60;,   &#x60;delete&#x60;, or &#x60;replace&#x60;. + &#x60;entities&#x60;, an array of entities, each entity specified using the JSON entity representation format   (described in the section \&quot;JSON Entity Representation\&quot;). This operation is split in as many individual operations as entities in the &#x60;entities&#x60; vector, so the &#x60;actionType&#x60; is executed for each one of them. Depending on the &#x60;actionType&#x60;, a mapping with regular non-batch operations can be done: * &#x60;append&#x60;: maps to &#x60;POST /v2/entities&#x60; (if the entity does not already exist) or &#x60;POST /v2/entities/&lt;id&gt;/attrs&#x60;   (if the entity already exists). * &#x60;appendStrict&#x60;: maps to &#x60;POST /v2/entities&#x60; (if the entity does not already exist) or   &#x60;POST /v2/entities/&lt;id&gt;/attrs?options&#x3D;append&#x60; (if the entity already exists). * &#x60;update&#x60;: maps to &#x60;PATCH /v2/entities/&lt;id&gt;/attrs&#x60;. * &#x60;delete&#x60;: maps to &#x60;DELETE /v2/entities/&lt;id&gt;/attrs/&lt;attrName&gt;&#x60; on every attribute included in the entity or   to &#x60;DELETE /v2/entities/&lt;id&gt;&#x60; if no attribute were included in the entity. * &#x60;replace&#x60;: maps to &#x60;PUT /v2/entities/&lt;id&gt;/attrs&#x60;. Response: * Successful operation uses 204 No Content. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param options Options dictionary
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateWithHttpInfo(String contentType, UpdateRequest body, String options) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateRequestCreation(contentType, body, options).toEntity(localVarReturnType);
    }

    /**
     * Update
     * This operation allows to create, update and/or delete several entities in a single batch operation. The payload is an object with two properties: + &#x60;actionType&#x60;, to specify the kind of update action to do: either &#x60;append&#x60;, &#x60;appendStrict&#x60;, &#x60;update&#x60;,   &#x60;delete&#x60;, or &#x60;replace&#x60;. + &#x60;entities&#x60;, an array of entities, each entity specified using the JSON entity representation format   (described in the section \&quot;JSON Entity Representation\&quot;). This operation is split in as many individual operations as entities in the &#x60;entities&#x60; vector, so the &#x60;actionType&#x60; is executed for each one of them. Depending on the &#x60;actionType&#x60;, a mapping with regular non-batch operations can be done: * &#x60;append&#x60;: maps to &#x60;POST /v2/entities&#x60; (if the entity does not already exist) or &#x60;POST /v2/entities/&lt;id&gt;/attrs&#x60;   (if the entity already exists). * &#x60;appendStrict&#x60;: maps to &#x60;POST /v2/entities&#x60; (if the entity does not already exist) or   &#x60;POST /v2/entities/&lt;id&gt;/attrs?options&#x3D;append&#x60; (if the entity already exists). * &#x60;update&#x60;: maps to &#x60;PATCH /v2/entities/&lt;id&gt;/attrs&#x60;. * &#x60;delete&#x60;: maps to &#x60;DELETE /v2/entities/&lt;id&gt;/attrs/&lt;attrName&gt;&#x60; on every attribute included in the entity or   to &#x60;DELETE /v2/entities/&lt;id&gt;&#x60; if no attribute were included in the entity. * &#x60;replace&#x60;: maps to &#x60;PUT /v2/entities/&lt;id&gt;/attrs&#x60;. Response: * Successful operation uses 204 No Content. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param options Options dictionary
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateWithResponseSpec(String contentType, UpdateRequest body, String options) throws RestClientResponseException {
        return updateRequestCreation(contentType, body, options);
    }
}
