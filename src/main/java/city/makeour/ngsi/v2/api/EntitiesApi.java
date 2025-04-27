package city.makeour.ngsi.v2.api;

import city.makeour.ngsi.v2.invoker.ApiClient;

import city.makeour.ngsi.v2.model.CreateEntityRequest;
import city.makeour.ngsi.v2.model.ListEntitiesResponse;
import city.makeour.ngsi.v2.model.ReplaceAllEntityAttributesRequest;
import city.makeour.ngsi.v2.model.RetrieveEntityAttributesResponse;
import city.makeour.ngsi.v2.model.RetrieveEntityResponse;
import city.makeour.ngsi.v2.model.UpdateExistingEntityAttributesRequest;
import city.makeour.ngsi.v2.model.UpdateOrAppendEntityAttributesRequest;

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
public class EntitiesApi {
    private ApiClient apiClient;

    public EntitiesApi() {
        this(new ApiClient());
    }

    @Autowired
    public EntitiesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create Entity
     * The payload is an object representing the entity to be created. The object follows the JSON entity representation format (described in a \&quot;JSON Entity Representation\&quot; section). Response: * Successful operation uses 201 Created (if upsert option is not used) or 204 No Content (if   upsert option is used). Response includes a &#x60;Location&#x60; header with the URL of the   created entity. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param options Options dictionary
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createEntityRequestCreation(String contentType, CreateEntityRequest body, String options) throws RestClientResponseException {
        Object postBody = body;
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new RestClientResponseException("Missing the required parameter 'contentType' when calling createEntity", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new RestClientResponseException("Missing the required parameter 'body' when calling createEntity", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/v2/entities", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Entity
     * The payload is an object representing the entity to be created. The object follows the JSON entity representation format (described in a \&quot;JSON Entity Representation\&quot; section). Response: * Successful operation uses 201 Created (if upsert option is not used) or 204 No Content (if   upsert option is used). Response includes a &#x60;Location&#x60; header with the URL of the   created entity. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param options Options dictionary
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void createEntity(String contentType, CreateEntityRequest body, String options) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        createEntityRequestCreation(contentType, body, options).body(localVarReturnType);
    }

    /**
     * Create Entity
     * The payload is an object representing the entity to be created. The object follows the JSON entity representation format (described in a \&quot;JSON Entity Representation\&quot; section). Response: * Successful operation uses 201 Created (if upsert option is not used) or 204 No Content (if   upsert option is used). Response includes a &#x60;Location&#x60; header with the URL of the   created entity. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param options Options dictionary
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> createEntityWithHttpInfo(String contentType, CreateEntityRequest body, String options) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createEntityRequestCreation(contentType, body, options).toEntity(localVarReturnType);
    }

    /**
     * Create Entity
     * The payload is an object representing the entity to be created. The object follows the JSON entity representation format (described in a \&quot;JSON Entity Representation\&quot; section). Response: * Successful operation uses 201 Created (if upsert option is not used) or 204 No Content (if   upsert option is used). Response includes a &#x60;Location&#x60; header with the URL of the   created entity. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param options Options dictionary
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createEntityWithResponseSpec(String contentType, CreateEntityRequest body, String options) throws RestClientResponseException {
        return createEntityRequestCreation(contentType, body, options);
    }
    /**
     * List Entities
     * Retrieves a list of entities that match different criteria by id, type, pattern matching (either id or type) and/or those which match a query or geographical query (see [Simple Query Language](#simple_query_language) and  [Geographical Queries](#geographical_queries)). A given entity has to match all the criteria to be retrieved (i.e., the criteria is combined in a logical AND way). Note that pattern matching query parameters are incompatible (i.e. mutually exclusive) with their corresponding exact matching parameters, i.e. &#x60;idPattern&#x60; with &#x60;id&#x60; and &#x60;typePattern&#x60; with &#x60;type&#x60;. The response payload is an array containing one object per matching entity. Each entity follows the JSON entity representation format (described in \&quot;JSON Entity Representation\&quot; section). Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param id A comma-separated list of elements. Retrieve entities whose ID matches one of the elements in the list. Incompatible with &#x60;idPattern&#x60;.
     * @param type comma-separated list of elements. Retrieve entities whose type matches one of the elements in the list. Incompatible with &#x60;typePattern&#x60;.
     * @param idPattern A correctly formated regular expression. Retrieve entities whose ID matches the regular expression. Incompatible with &#x60;id&#x60;.
     * @param typePattern A correctly formated regular expression. Retrieve entities whose type matches the regular expression. Incompatible with &#x60;type&#x60;.
     * @param q A query expression, composed of a list of statements separated by &#x60;;&#x60;, i.e., q&#x3D;statement1;statement2;statement3. See [Simple Query Language specification](#simple_query_language).
     * @param mq A query expression for attribute metadata, composed of a list of statements separated by &#x60;;&#x60;, i.e., mq&#x3D;statement1;statement2;statement3. See [Simple Query Language specification](#simple_query_language).
     * @param georel Spatial relationship between matching entities and a reference shape. See [Geographical Queries](#geographical_queries).
     * @param geometry Geografical area to which the query is restricted. See [Geographical Queries](#geographical_queries).
     * @param coords List of latitude-longitude pairs of coordinates separated by &#39;;&#39;. See [Geographical Queries](#geographical_queries).
     * @param limit Limits the number of entities to be retrieved
     * @param offset Establishes the offset from where entities are retrieved
     * @param attrs Comma-separated list of attribute names whose data are to be included in the response. The attributes are retrieved in the order specified by this parameter. If this parameter is not included, the attributes are retrieved in arbitrary order. See \&quot;Filtering out attributes and metadata\&quot; section for more detail.
     * @param metadata A list of metadata names to include in the response. See \&quot;Filtering out attributes and metadata\&quot; section for more detail.
     * @param orderBy Criteria for ordering results. See \&quot;Ordering Results\&quot; section for details.
     * @param options Options dictionary
     * @return List&lt;ListEntitiesResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listEntitiesRequestCreation(String id, String type, String idPattern, String typePattern, String q, String mq, String georel, String geometry, String coords, Double limit, Double offset, String attrs, String metadata, String orderBy, String options) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "idPattern", idPattern));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "typePattern", typePattern));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mq", mq));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "georel", georel));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "geometry", geometry));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "coords", coords));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "attrs", attrs));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "metadata", metadata));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "options", options));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<ListEntitiesResponse>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/v2/entities", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List Entities
     * Retrieves a list of entities that match different criteria by id, type, pattern matching (either id or type) and/or those which match a query or geographical query (see [Simple Query Language](#simple_query_language) and  [Geographical Queries](#geographical_queries)). A given entity has to match all the criteria to be retrieved (i.e., the criteria is combined in a logical AND way). Note that pattern matching query parameters are incompatible (i.e. mutually exclusive) with their corresponding exact matching parameters, i.e. &#x60;idPattern&#x60; with &#x60;id&#x60; and &#x60;typePattern&#x60; with &#x60;type&#x60;. The response payload is an array containing one object per matching entity. Each entity follows the JSON entity representation format (described in \&quot;JSON Entity Representation\&quot; section). Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param id A comma-separated list of elements. Retrieve entities whose ID matches one of the elements in the list. Incompatible with &#x60;idPattern&#x60;.
     * @param type comma-separated list of elements. Retrieve entities whose type matches one of the elements in the list. Incompatible with &#x60;typePattern&#x60;.
     * @param idPattern A correctly formated regular expression. Retrieve entities whose ID matches the regular expression. Incompatible with &#x60;id&#x60;.
     * @param typePattern A correctly formated regular expression. Retrieve entities whose type matches the regular expression. Incompatible with &#x60;type&#x60;.
     * @param q A query expression, composed of a list of statements separated by &#x60;;&#x60;, i.e., q&#x3D;statement1;statement2;statement3. See [Simple Query Language specification](#simple_query_language).
     * @param mq A query expression for attribute metadata, composed of a list of statements separated by &#x60;;&#x60;, i.e., mq&#x3D;statement1;statement2;statement3. See [Simple Query Language specification](#simple_query_language).
     * @param georel Spatial relationship between matching entities and a reference shape. See [Geographical Queries](#geographical_queries).
     * @param geometry Geografical area to which the query is restricted. See [Geographical Queries](#geographical_queries).
     * @param coords List of latitude-longitude pairs of coordinates separated by &#39;;&#39;. See [Geographical Queries](#geographical_queries).
     * @param limit Limits the number of entities to be retrieved
     * @param offset Establishes the offset from where entities are retrieved
     * @param attrs Comma-separated list of attribute names whose data are to be included in the response. The attributes are retrieved in the order specified by this parameter. If this parameter is not included, the attributes are retrieved in arbitrary order. See \&quot;Filtering out attributes and metadata\&quot; section for more detail.
     * @param metadata A list of metadata names to include in the response. See \&quot;Filtering out attributes and metadata\&quot; section for more detail.
     * @param orderBy Criteria for ordering results. See \&quot;Ordering Results\&quot; section for details.
     * @param options Options dictionary
     * @return List&lt;ListEntitiesResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<ListEntitiesResponse> listEntities(String id, String type, String idPattern, String typePattern, String q, String mq, String georel, String geometry, String coords, Double limit, Double offset, String attrs, String metadata, String orderBy, String options) throws RestClientResponseException {
        ParameterizedTypeReference<List<ListEntitiesResponse>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listEntitiesRequestCreation(id, type, idPattern, typePattern, q, mq, georel, geometry, coords, limit, offset, attrs, metadata, orderBy, options).body(localVarReturnType);
    }

    /**
     * List Entities
     * Retrieves a list of entities that match different criteria by id, type, pattern matching (either id or type) and/or those which match a query or geographical query (see [Simple Query Language](#simple_query_language) and  [Geographical Queries](#geographical_queries)). A given entity has to match all the criteria to be retrieved (i.e., the criteria is combined in a logical AND way). Note that pattern matching query parameters are incompatible (i.e. mutually exclusive) with their corresponding exact matching parameters, i.e. &#x60;idPattern&#x60; with &#x60;id&#x60; and &#x60;typePattern&#x60; with &#x60;type&#x60;. The response payload is an array containing one object per matching entity. Each entity follows the JSON entity representation format (described in \&quot;JSON Entity Representation\&quot; section). Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param id A comma-separated list of elements. Retrieve entities whose ID matches one of the elements in the list. Incompatible with &#x60;idPattern&#x60;.
     * @param type comma-separated list of elements. Retrieve entities whose type matches one of the elements in the list. Incompatible with &#x60;typePattern&#x60;.
     * @param idPattern A correctly formated regular expression. Retrieve entities whose ID matches the regular expression. Incompatible with &#x60;id&#x60;.
     * @param typePattern A correctly formated regular expression. Retrieve entities whose type matches the regular expression. Incompatible with &#x60;type&#x60;.
     * @param q A query expression, composed of a list of statements separated by &#x60;;&#x60;, i.e., q&#x3D;statement1;statement2;statement3. See [Simple Query Language specification](#simple_query_language).
     * @param mq A query expression for attribute metadata, composed of a list of statements separated by &#x60;;&#x60;, i.e., mq&#x3D;statement1;statement2;statement3. See [Simple Query Language specification](#simple_query_language).
     * @param georel Spatial relationship between matching entities and a reference shape. See [Geographical Queries](#geographical_queries).
     * @param geometry Geografical area to which the query is restricted. See [Geographical Queries](#geographical_queries).
     * @param coords List of latitude-longitude pairs of coordinates separated by &#39;;&#39;. See [Geographical Queries](#geographical_queries).
     * @param limit Limits the number of entities to be retrieved
     * @param offset Establishes the offset from where entities are retrieved
     * @param attrs Comma-separated list of attribute names whose data are to be included in the response. The attributes are retrieved in the order specified by this parameter. If this parameter is not included, the attributes are retrieved in arbitrary order. See \&quot;Filtering out attributes and metadata\&quot; section for more detail.
     * @param metadata A list of metadata names to include in the response. See \&quot;Filtering out attributes and metadata\&quot; section for more detail.
     * @param orderBy Criteria for ordering results. See \&quot;Ordering Results\&quot; section for details.
     * @param options Options dictionary
     * @return ResponseEntity&lt;List&lt;ListEntitiesResponse&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ListEntitiesResponse>> listEntitiesWithHttpInfo(String id, String type, String idPattern, String typePattern, String q, String mq, String georel, String geometry, String coords, Double limit, Double offset, String attrs, String metadata, String orderBy, String options) throws RestClientResponseException {
        ParameterizedTypeReference<List<ListEntitiesResponse>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listEntitiesRequestCreation(id, type, idPattern, typePattern, q, mq, georel, geometry, coords, limit, offset, attrs, metadata, orderBy, options).toEntity(localVarReturnType);
    }

    /**
     * List Entities
     * Retrieves a list of entities that match different criteria by id, type, pattern matching (either id or type) and/or those which match a query or geographical query (see [Simple Query Language](#simple_query_language) and  [Geographical Queries](#geographical_queries)). A given entity has to match all the criteria to be retrieved (i.e., the criteria is combined in a logical AND way). Note that pattern matching query parameters are incompatible (i.e. mutually exclusive) with their corresponding exact matching parameters, i.e. &#x60;idPattern&#x60; with &#x60;id&#x60; and &#x60;typePattern&#x60; with &#x60;type&#x60;. The response payload is an array containing one object per matching entity. Each entity follows the JSON entity representation format (described in \&quot;JSON Entity Representation\&quot; section). Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param id A comma-separated list of elements. Retrieve entities whose ID matches one of the elements in the list. Incompatible with &#x60;idPattern&#x60;.
     * @param type comma-separated list of elements. Retrieve entities whose type matches one of the elements in the list. Incompatible with &#x60;typePattern&#x60;.
     * @param idPattern A correctly formated regular expression. Retrieve entities whose ID matches the regular expression. Incompatible with &#x60;id&#x60;.
     * @param typePattern A correctly formated regular expression. Retrieve entities whose type matches the regular expression. Incompatible with &#x60;type&#x60;.
     * @param q A query expression, composed of a list of statements separated by &#x60;;&#x60;, i.e., q&#x3D;statement1;statement2;statement3. See [Simple Query Language specification](#simple_query_language).
     * @param mq A query expression for attribute metadata, composed of a list of statements separated by &#x60;;&#x60;, i.e., mq&#x3D;statement1;statement2;statement3. See [Simple Query Language specification](#simple_query_language).
     * @param georel Spatial relationship between matching entities and a reference shape. See [Geographical Queries](#geographical_queries).
     * @param geometry Geografical area to which the query is restricted. See [Geographical Queries](#geographical_queries).
     * @param coords List of latitude-longitude pairs of coordinates separated by &#39;;&#39;. See [Geographical Queries](#geographical_queries).
     * @param limit Limits the number of entities to be retrieved
     * @param offset Establishes the offset from where entities are retrieved
     * @param attrs Comma-separated list of attribute names whose data are to be included in the response. The attributes are retrieved in the order specified by this parameter. If this parameter is not included, the attributes are retrieved in arbitrary order. See \&quot;Filtering out attributes and metadata\&quot; section for more detail.
     * @param metadata A list of metadata names to include in the response. See \&quot;Filtering out attributes and metadata\&quot; section for more detail.
     * @param orderBy Criteria for ordering results. See \&quot;Ordering Results\&quot; section for details.
     * @param options Options dictionary
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listEntitiesWithResponseSpec(String id, String type, String idPattern, String typePattern, String q, String mq, String georel, String geometry, String coords, Double limit, Double offset, String attrs, String metadata, String orderBy, String options) throws RestClientResponseException {
        return listEntitiesRequestCreation(id, type, idPattern, typePattern, q, mq, georel, geometry, coords, limit, offset, attrs, metadata, orderBy, options);
    }
    /**
     * Remove Entity
     * Delete the entity. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param entityId Id of the entity to be deleted
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec removeEntityRequestCreation(String entityId, String type) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'entityId' is set
        if (entityId == null) {
            throw new RestClientResponseException("Missing the required parameter 'entityId' when calling removeEntity", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("entityId", entityId);

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
        return apiClient.invokeAPI("/v2/entities/{entityId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Remove Entity
     * Delete the entity. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param entityId Id of the entity to be deleted
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void removeEntity(String entityId, String type) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        removeEntityRequestCreation(entityId, type).body(localVarReturnType);
    }

    /**
     * Remove Entity
     * Delete the entity. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param entityId Id of the entity to be deleted
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> removeEntityWithHttpInfo(String entityId, String type) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return removeEntityRequestCreation(entityId, type).toEntity(localVarReturnType);
    }

    /**
     * Remove Entity
     * Delete the entity. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param entityId Id of the entity to be deleted
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec removeEntityWithResponseSpec(String entityId, String type) throws RestClientResponseException {
        return removeEntityRequestCreation(entityId, type);
    }
    /**
     * Replace all entity attributes
     * The request payload is an object representing the new entity attributes. The object follows the JSON entity representation format (described in a \&quot;JSON Entity Representation\&quot; above), except that &#x60;id&#x60; and &#x60;type&#x60; are not allowed. The attributes previously existing in the entity are removed and replaced by the ones in the request. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param entityId Id of the entity in question.
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @param options Operations options
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec replaceAllEntityAttributesRequestCreation(String entityId, String contentType, ReplaceAllEntityAttributesRequest body, String type, String options) throws RestClientResponseException {
        Object postBody = body;
        // verify the required parameter 'entityId' is set
        if (entityId == null) {
            throw new RestClientResponseException("Missing the required parameter 'entityId' when calling replaceAllEntityAttributes", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new RestClientResponseException("Missing the required parameter 'contentType' when calling replaceAllEntityAttributes", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new RestClientResponseException("Missing the required parameter 'body' when calling replaceAllEntityAttributes", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("entityId", entityId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
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
        return apiClient.invokeAPI("/v2/entities/{entityId}/attrs", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Replace all entity attributes
     * The request payload is an object representing the new entity attributes. The object follows the JSON entity representation format (described in a \&quot;JSON Entity Representation\&quot; above), except that &#x60;id&#x60; and &#x60;type&#x60; are not allowed. The attributes previously existing in the entity are removed and replaced by the ones in the request. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param entityId Id of the entity in question.
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @param options Operations options
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void replaceAllEntityAttributes(String entityId, String contentType, ReplaceAllEntityAttributesRequest body, String type, String options) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        replaceAllEntityAttributesRequestCreation(entityId, contentType, body, type, options).body(localVarReturnType);
    }

    /**
     * Replace all entity attributes
     * The request payload is an object representing the new entity attributes. The object follows the JSON entity representation format (described in a \&quot;JSON Entity Representation\&quot; above), except that &#x60;id&#x60; and &#x60;type&#x60; are not allowed. The attributes previously existing in the entity are removed and replaced by the ones in the request. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param entityId Id of the entity in question.
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @param options Operations options
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> replaceAllEntityAttributesWithHttpInfo(String entityId, String contentType, ReplaceAllEntityAttributesRequest body, String type, String options) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return replaceAllEntityAttributesRequestCreation(entityId, contentType, body, type, options).toEntity(localVarReturnType);
    }

    /**
     * Replace all entity attributes
     * The request payload is an object representing the new entity attributes. The object follows the JSON entity representation format (described in a \&quot;JSON Entity Representation\&quot; above), except that &#x60;id&#x60; and &#x60;type&#x60; are not allowed. The attributes previously existing in the entity are removed and replaced by the ones in the request. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param entityId Id of the entity in question.
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @param options Operations options
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec replaceAllEntityAttributesWithResponseSpec(String entityId, String contentType, ReplaceAllEntityAttributesRequest body, String type, String options) throws RestClientResponseException {
        return replaceAllEntityAttributesRequestCreation(entityId, contentType, body, type, options);
    }
    /**
     * Retrieve Entity
     * The response is an object representing the entity identified by the ID. The object follows the JSON entity representation format (described in \&quot;JSON Entity Representation\&quot; section). This operation must return one entity element only, but there may be more than one entity with the same ID (e.g. entities with same ID but different types). In such case, an error message is returned, with the HTTP status code set to 409 Conflict. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for more details.
     * <p><b>200</b> - 
     * @param entityId Id of the entity to be retrieved
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @param attrs Comma-separated list of attribute names whose data must be included in the response. The attributes are retrieved in the order specified by this parameter. See \&quot;Filtering out attributes and metadata\&quot; section for more detail. If this parameter is not included, the attributes are retrieved in arbitrary order, and all the attributes of the entity are included in the response.
     * @param metadata A list of metadata names to include in the response. See \&quot;Filtering out attributes and metadata\&quot; section for more detail.
     * @param options Options dictionary
     * @return RetrieveEntityResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec retrieveEntityRequestCreation(String entityId, String type, String attrs, String metadata, String options) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'entityId' is set
        if (entityId == null) {
            throw new RestClientResponseException("Missing the required parameter 'entityId' when calling retrieveEntity", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("entityId", entityId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "attrs", attrs));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "metadata", metadata));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "options", options));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<RetrieveEntityResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/v2/entities/{entityId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve Entity
     * The response is an object representing the entity identified by the ID. The object follows the JSON entity representation format (described in \&quot;JSON Entity Representation\&quot; section). This operation must return one entity element only, but there may be more than one entity with the same ID (e.g. entities with same ID but different types). In such case, an error message is returned, with the HTTP status code set to 409 Conflict. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for more details.
     * <p><b>200</b> - 
     * @param entityId Id of the entity to be retrieved
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @param attrs Comma-separated list of attribute names whose data must be included in the response. The attributes are retrieved in the order specified by this parameter. See \&quot;Filtering out attributes and metadata\&quot; section for more detail. If this parameter is not included, the attributes are retrieved in arbitrary order, and all the attributes of the entity are included in the response.
     * @param metadata A list of metadata names to include in the response. See \&quot;Filtering out attributes and metadata\&quot; section for more detail.
     * @param options Options dictionary
     * @return RetrieveEntityResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public RetrieveEntityResponse retrieveEntity(String entityId, String type, String attrs, String metadata, String options) throws RestClientResponseException {
        ParameterizedTypeReference<RetrieveEntityResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return retrieveEntityRequestCreation(entityId, type, attrs, metadata, options).body(localVarReturnType);
    }

    /**
     * Retrieve Entity
     * The response is an object representing the entity identified by the ID. The object follows the JSON entity representation format (described in \&quot;JSON Entity Representation\&quot; section). This operation must return one entity element only, but there may be more than one entity with the same ID (e.g. entities with same ID but different types). In such case, an error message is returned, with the HTTP status code set to 409 Conflict. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for more details.
     * <p><b>200</b> - 
     * @param entityId Id of the entity to be retrieved
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @param attrs Comma-separated list of attribute names whose data must be included in the response. The attributes are retrieved in the order specified by this parameter. See \&quot;Filtering out attributes and metadata\&quot; section for more detail. If this parameter is not included, the attributes are retrieved in arbitrary order, and all the attributes of the entity are included in the response.
     * @param metadata A list of metadata names to include in the response. See \&quot;Filtering out attributes and metadata\&quot; section for more detail.
     * @param options Options dictionary
     * @return ResponseEntity&lt;RetrieveEntityResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RetrieveEntityResponse> retrieveEntityWithHttpInfo(String entityId, String type, String attrs, String metadata, String options) throws RestClientResponseException {
        ParameterizedTypeReference<RetrieveEntityResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return retrieveEntityRequestCreation(entityId, type, attrs, metadata, options).toEntity(localVarReturnType);
    }

    /**
     * Retrieve Entity
     * The response is an object representing the entity identified by the ID. The object follows the JSON entity representation format (described in \&quot;JSON Entity Representation\&quot; section). This operation must return one entity element only, but there may be more than one entity with the same ID (e.g. entities with same ID but different types). In such case, an error message is returned, with the HTTP status code set to 409 Conflict. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for more details.
     * <p><b>200</b> - 
     * @param entityId Id of the entity to be retrieved
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @param attrs Comma-separated list of attribute names whose data must be included in the response. The attributes are retrieved in the order specified by this parameter. See \&quot;Filtering out attributes and metadata\&quot; section for more detail. If this parameter is not included, the attributes are retrieved in arbitrary order, and all the attributes of the entity are included in the response.
     * @param metadata A list of metadata names to include in the response. See \&quot;Filtering out attributes and metadata\&quot; section for more detail.
     * @param options Options dictionary
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec retrieveEntityWithResponseSpec(String entityId, String type, String attrs, String metadata, String options) throws RestClientResponseException {
        return retrieveEntityRequestCreation(entityId, type, attrs, metadata, options);
    }
    /**
     * Retrieve Entity Attributes
     * This request is similar to retreiving the whole entity, however this one omits the &#x60;id&#x60; and &#x60;type&#x60; fields. Just like the general request of getting an entire entity, this operation must return only one entity element. If more than one entity with the same ID is found (e.g. entities with same ID but different type), an error message is returned, with the HTTP status code set to 409 Conflict. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param entityId Id of the entity to be retrieved
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @param attrs Comma-separated list of attribute names whose data are to be included in the response. The attributes are retrieved in the order specified by this parameter. If this parameter is not included, the attributes are retrieved in arbitrary order, and all the attributes of the entity are included in the response. See \&quot;Filtering out attributes and metadata\&quot; section for more detail.
     * @param metadata A list of metadata names to include in the response. See \&quot;Filtering out attributes and metadata\&quot; section for more detail.
     * @param options Options dictionary
     * @return RetrieveEntityAttributesResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec retrieveEntityAttributesRequestCreation(String entityId, String type, String attrs, String metadata, String options) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'entityId' is set
        if (entityId == null) {
            throw new RestClientResponseException("Missing the required parameter 'entityId' when calling retrieveEntityAttributes", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("entityId", entityId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "attrs", attrs));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "metadata", metadata));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "options", options));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<RetrieveEntityAttributesResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/v2/entities/{entityId}/attrs", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve Entity Attributes
     * This request is similar to retreiving the whole entity, however this one omits the &#x60;id&#x60; and &#x60;type&#x60; fields. Just like the general request of getting an entire entity, this operation must return only one entity element. If more than one entity with the same ID is found (e.g. entities with same ID but different type), an error message is returned, with the HTTP status code set to 409 Conflict. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param entityId Id of the entity to be retrieved
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @param attrs Comma-separated list of attribute names whose data are to be included in the response. The attributes are retrieved in the order specified by this parameter. If this parameter is not included, the attributes are retrieved in arbitrary order, and all the attributes of the entity are included in the response. See \&quot;Filtering out attributes and metadata\&quot; section for more detail.
     * @param metadata A list of metadata names to include in the response. See \&quot;Filtering out attributes and metadata\&quot; section for more detail.
     * @param options Options dictionary
     * @return RetrieveEntityAttributesResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public RetrieveEntityAttributesResponse retrieveEntityAttributes(String entityId, String type, String attrs, String metadata, String options) throws RestClientResponseException {
        ParameterizedTypeReference<RetrieveEntityAttributesResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return retrieveEntityAttributesRequestCreation(entityId, type, attrs, metadata, options).body(localVarReturnType);
    }

    /**
     * Retrieve Entity Attributes
     * This request is similar to retreiving the whole entity, however this one omits the &#x60;id&#x60; and &#x60;type&#x60; fields. Just like the general request of getting an entire entity, this operation must return only one entity element. If more than one entity with the same ID is found (e.g. entities with same ID but different type), an error message is returned, with the HTTP status code set to 409 Conflict. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param entityId Id of the entity to be retrieved
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @param attrs Comma-separated list of attribute names whose data are to be included in the response. The attributes are retrieved in the order specified by this parameter. If this parameter is not included, the attributes are retrieved in arbitrary order, and all the attributes of the entity are included in the response. See \&quot;Filtering out attributes and metadata\&quot; section for more detail.
     * @param metadata A list of metadata names to include in the response. See \&quot;Filtering out attributes and metadata\&quot; section for more detail.
     * @param options Options dictionary
     * @return ResponseEntity&lt;RetrieveEntityAttributesResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RetrieveEntityAttributesResponse> retrieveEntityAttributesWithHttpInfo(String entityId, String type, String attrs, String metadata, String options) throws RestClientResponseException {
        ParameterizedTypeReference<RetrieveEntityAttributesResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return retrieveEntityAttributesRequestCreation(entityId, type, attrs, metadata, options).toEntity(localVarReturnType);
    }

    /**
     * Retrieve Entity Attributes
     * This request is similar to retreiving the whole entity, however this one omits the &#x60;id&#x60; and &#x60;type&#x60; fields. Just like the general request of getting an entire entity, this operation must return only one entity element. If more than one entity with the same ID is found (e.g. entities with same ID but different type), an error message is returned, with the HTTP status code set to 409 Conflict. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param entityId Id of the entity to be retrieved
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @param attrs Comma-separated list of attribute names whose data are to be included in the response. The attributes are retrieved in the order specified by this parameter. If this parameter is not included, the attributes are retrieved in arbitrary order, and all the attributes of the entity are included in the response. See \&quot;Filtering out attributes and metadata\&quot; section for more detail.
     * @param metadata A list of metadata names to include in the response. See \&quot;Filtering out attributes and metadata\&quot; section for more detail.
     * @param options Options dictionary
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec retrieveEntityAttributesWithResponseSpec(String entityId, String type, String attrs, String metadata, String options) throws RestClientResponseException {
        return retrieveEntityAttributesRequestCreation(entityId, type, attrs, metadata, options);
    }
    /**
     * Update Existing Entity Attributes
     * The request payload is an object representing the attributes to update. The object follows the JSON entity representation format (described in \&quot;JSON Entity Representation\&quot; section), except that &#x60;id&#x60; and &#x60;type&#x60; are not allowed. The entity attributes are updated with the ones in the payload. In addition to that, if one or more attributes in the payload doesn&#39;t exist in the entity, an error is returned. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param entityId Id of the entity to be updated
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @param options Operations options
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateExistingEntityAttributesRequestCreation(String entityId, String contentType, UpdateExistingEntityAttributesRequest body, String type, String options) throws RestClientResponseException {
        Object postBody = body;
        // verify the required parameter 'entityId' is set
        if (entityId == null) {
            throw new RestClientResponseException("Missing the required parameter 'entityId' when calling updateExistingEntityAttributes", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new RestClientResponseException("Missing the required parameter 'contentType' when calling updateExistingEntityAttributes", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new RestClientResponseException("Missing the required parameter 'body' when calling updateExistingEntityAttributes", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("entityId", entityId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
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
        return apiClient.invokeAPI("/v2/entities/{entityId}/attrs", HttpMethod.PATCH, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update Existing Entity Attributes
     * The request payload is an object representing the attributes to update. The object follows the JSON entity representation format (described in \&quot;JSON Entity Representation\&quot; section), except that &#x60;id&#x60; and &#x60;type&#x60; are not allowed. The entity attributes are updated with the ones in the payload. In addition to that, if one or more attributes in the payload doesn&#39;t exist in the entity, an error is returned. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param entityId Id of the entity to be updated
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @param options Operations options
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateExistingEntityAttributes(String entityId, String contentType, UpdateExistingEntityAttributesRequest body, String type, String options) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateExistingEntityAttributesRequestCreation(entityId, contentType, body, type, options).body(localVarReturnType);
    }

    /**
     * Update Existing Entity Attributes
     * The request payload is an object representing the attributes to update. The object follows the JSON entity representation format (described in \&quot;JSON Entity Representation\&quot; section), except that &#x60;id&#x60; and &#x60;type&#x60; are not allowed. The entity attributes are updated with the ones in the payload. In addition to that, if one or more attributes in the payload doesn&#39;t exist in the entity, an error is returned. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param entityId Id of the entity to be updated
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @param options Operations options
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateExistingEntityAttributesWithHttpInfo(String entityId, String contentType, UpdateExistingEntityAttributesRequest body, String type, String options) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateExistingEntityAttributesRequestCreation(entityId, contentType, body, type, options).toEntity(localVarReturnType);
    }

    /**
     * Update Existing Entity Attributes
     * The request payload is an object representing the attributes to update. The object follows the JSON entity representation format (described in \&quot;JSON Entity Representation\&quot; section), except that &#x60;id&#x60; and &#x60;type&#x60; are not allowed. The entity attributes are updated with the ones in the payload. In addition to that, if one or more attributes in the payload doesn&#39;t exist in the entity, an error is returned. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param entityId Id of the entity to be updated
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @param options Operations options
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateExistingEntityAttributesWithResponseSpec(String entityId, String contentType, UpdateExistingEntityAttributesRequest body, String type, String options) throws RestClientResponseException {
        return updateExistingEntityAttributesRequestCreation(entityId, contentType, body, type, options);
    }
    /**
     * Update or Append Entity Attributes
     * The request payload is an object representing the attributes to append or update. The object follows the JSON entity representation format (described in \&quot;JSON Entity Representation\&quot; section), except that &#x60;id&#x60; and &#x60;type&#x60; are not allowed. The entity attributes are updated with the ones in the payload, depending on whether the &#x60;append&#x60; operation option is used or not. * If &#x60;append&#x60; is not used: the entity attributes are updated (if they previously exist) or appended   (if they don&#39;t previously exist) with the ones in the payload. * If &#x60;append&#x60; is used (i.e. strict append semantics): all the attributes in the payload not   previously existing in the entity are appended. In addition to that, in case some of the   attributes in the payload already exist in the entity, an error is returned. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param entityId Entity id to be updated
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @param options Operations options
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateOrAppendEntityAttributesRequestCreation(String entityId, String contentType, UpdateOrAppendEntityAttributesRequest body, String type, String options) throws RestClientResponseException {
        Object postBody = body;
        // verify the required parameter 'entityId' is set
        if (entityId == null) {
            throw new RestClientResponseException("Missing the required parameter 'entityId' when calling updateOrAppendEntityAttributes", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new RestClientResponseException("Missing the required parameter 'contentType' when calling updateOrAppendEntityAttributes", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new RestClientResponseException("Missing the required parameter 'body' when calling updateOrAppendEntityAttributes", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("entityId", entityId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
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
        return apiClient.invokeAPI("/v2/entities/{entityId}/attrs", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update or Append Entity Attributes
     * The request payload is an object representing the attributes to append or update. The object follows the JSON entity representation format (described in \&quot;JSON Entity Representation\&quot; section), except that &#x60;id&#x60; and &#x60;type&#x60; are not allowed. The entity attributes are updated with the ones in the payload, depending on whether the &#x60;append&#x60; operation option is used or not. * If &#x60;append&#x60; is not used: the entity attributes are updated (if they previously exist) or appended   (if they don&#39;t previously exist) with the ones in the payload. * If &#x60;append&#x60; is used (i.e. strict append semantics): all the attributes in the payload not   previously existing in the entity are appended. In addition to that, in case some of the   attributes in the payload already exist in the entity, an error is returned. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param entityId Entity id to be updated
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @param options Operations options
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateOrAppendEntityAttributes(String entityId, String contentType, UpdateOrAppendEntityAttributesRequest body, String type, String options) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateOrAppendEntityAttributesRequestCreation(entityId, contentType, body, type, options).body(localVarReturnType);
    }

    /**
     * Update or Append Entity Attributes
     * The request payload is an object representing the attributes to append or update. The object follows the JSON entity representation format (described in \&quot;JSON Entity Representation\&quot; section), except that &#x60;id&#x60; and &#x60;type&#x60; are not allowed. The entity attributes are updated with the ones in the payload, depending on whether the &#x60;append&#x60; operation option is used or not. * If &#x60;append&#x60; is not used: the entity attributes are updated (if they previously exist) or appended   (if they don&#39;t previously exist) with the ones in the payload. * If &#x60;append&#x60; is used (i.e. strict append semantics): all the attributes in the payload not   previously existing in the entity are appended. In addition to that, in case some of the   attributes in the payload already exist in the entity, an error is returned. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param entityId Entity id to be updated
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @param options Operations options
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateOrAppendEntityAttributesWithHttpInfo(String entityId, String contentType, UpdateOrAppendEntityAttributesRequest body, String type, String options) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateOrAppendEntityAttributesRequestCreation(entityId, contentType, body, type, options).toEntity(localVarReturnType);
    }

    /**
     * Update or Append Entity Attributes
     * The request payload is an object representing the attributes to append or update. The object follows the JSON entity representation format (described in \&quot;JSON Entity Representation\&quot; section), except that &#x60;id&#x60; and &#x60;type&#x60; are not allowed. The entity attributes are updated with the ones in the payload, depending on whether the &#x60;append&#x60; operation option is used or not. * If &#x60;append&#x60; is not used: the entity attributes are updated (if they previously exist) or appended   (if they don&#39;t previously exist) with the ones in the payload. * If &#x60;append&#x60; is used (i.e. strict append semantics): all the attributes in the payload not   previously existing in the entity are appended. In addition to that, in case some of the   attributes in the payload already exist in the entity, an error is returned. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param entityId Entity id to be updated
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id.
     * @param options Operations options
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateOrAppendEntityAttributesWithResponseSpec(String entityId, String contentType, UpdateOrAppendEntityAttributesRequest body, String type, String options) throws RestClientResponseException {
        return updateOrAppendEntityAttributesRequestCreation(entityId, contentType, body, type, options);
    }
}
