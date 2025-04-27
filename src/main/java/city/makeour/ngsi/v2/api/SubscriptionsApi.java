package city.makeour.ngsi.v2.api;

import city.makeour.ngsi.v2.invoker.ApiClient;

import city.makeour.ngsi.v2.model.CreateSubscriptionRequest;
import city.makeour.ngsi.v2.model.ListSubscriptionsResponse;
import city.makeour.ngsi.v2.model.UpdateSubscriptionRequest;

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
public class SubscriptionsApi {
    private ApiClient apiClient;

    public SubscriptionsApi() {
        this(new ApiClient());
    }

    @Autowired
    public SubscriptionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create Subscription
     * Creates a new subscription. The subscription is represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 201 Created * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>201</b> - 
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createSubscriptionRequestCreation(String contentType, CreateSubscriptionRequest body) throws RestClientResponseException {
        Object postBody = body;
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new RestClientResponseException("Missing the required parameter 'contentType' when calling createSubscription", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new RestClientResponseException("Missing the required parameter 'body' when calling createSubscription", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/v2/subscriptions", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Subscription
     * Creates a new subscription. The subscription is represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 201 Created * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>201</b> - 
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void createSubscription(String contentType, CreateSubscriptionRequest body) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        createSubscriptionRequestCreation(contentType, body).body(localVarReturnType);
    }

    /**
     * Create Subscription
     * Creates a new subscription. The subscription is represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 201 Created * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>201</b> - 
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> createSubscriptionWithHttpInfo(String contentType, CreateSubscriptionRequest body) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createSubscriptionRequestCreation(contentType, body).toEntity(localVarReturnType);
    }

    /**
     * Create Subscription
     * Creates a new subscription. The subscription is represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 201 Created * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>201</b> - 
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createSubscriptionWithResponseSpec(String contentType, CreateSubscriptionRequest body) throws RestClientResponseException {
        return createSubscriptionRequestCreation(contentType, body);
    }
    /**
     * Delete subscription
     * Cancels subscription. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param subscriptionId subscription Id.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteSubscriptionRequestCreation(String subscriptionId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new RestClientResponseException("Missing the required parameter 'subscriptionId' when calling deleteSubscription", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("subscriptionId", subscriptionId);

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
        return apiClient.invokeAPI("/v2/subscriptions/{subscriptionId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete subscription
     * Cancels subscription. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param subscriptionId subscription Id.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void deleteSubscription(String subscriptionId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deleteSubscriptionRequestCreation(subscriptionId).body(localVarReturnType);
    }

    /**
     * Delete subscription
     * Cancels subscription. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param subscriptionId subscription Id.
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteSubscriptionWithHttpInfo(String subscriptionId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteSubscriptionRequestCreation(subscriptionId).toEntity(localVarReturnType);
    }

    /**
     * Delete subscription
     * Cancels subscription. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param subscriptionId subscription Id.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteSubscriptionWithResponseSpec(String subscriptionId) throws RestClientResponseException {
        return deleteSubscriptionRequestCreation(subscriptionId);
    }
    /**
     * List Subscriptions
     * Returns a list of all the subscriptions present in the system. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param limit Limit the number of subscriptions to be retrieved
     * @param offset Skip a number of subscriptions
     * @param options Options dictionary
     * @return List&lt;ListSubscriptionsResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listSubscriptionsRequestCreation(Double limit, Double offset, String options) throws RestClientResponseException {
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

        ParameterizedTypeReference<List<ListSubscriptionsResponse>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/v2/subscriptions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List Subscriptions
     * Returns a list of all the subscriptions present in the system. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param limit Limit the number of subscriptions to be retrieved
     * @param offset Skip a number of subscriptions
     * @param options Options dictionary
     * @return List&lt;ListSubscriptionsResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<ListSubscriptionsResponse> listSubscriptions(Double limit, Double offset, String options) throws RestClientResponseException {
        ParameterizedTypeReference<List<ListSubscriptionsResponse>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listSubscriptionsRequestCreation(limit, offset, options).body(localVarReturnType);
    }

    /**
     * List Subscriptions
     * Returns a list of all the subscriptions present in the system. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param limit Limit the number of subscriptions to be retrieved
     * @param offset Skip a number of subscriptions
     * @param options Options dictionary
     * @return ResponseEntity&lt;List&lt;ListSubscriptionsResponse&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ListSubscriptionsResponse>> listSubscriptionsWithHttpInfo(Double limit, Double offset, String options) throws RestClientResponseException {
        ParameterizedTypeReference<List<ListSubscriptionsResponse>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return listSubscriptionsRequestCreation(limit, offset, options).toEntity(localVarReturnType);
    }

    /**
     * List Subscriptions
     * Returns a list of all the subscriptions present in the system. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param limit Limit the number of subscriptions to be retrieved
     * @param offset Skip a number of subscriptions
     * @param options Options dictionary
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listSubscriptionsWithResponseSpec(Double limit, Double offset, String options) throws RestClientResponseException {
        return listSubscriptionsRequestCreation(limit, offset, options);
    }
    /**
     * Retrieve Subscription
     * The response is the subscription represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param subscriptionId subscription Id.
     * @return Object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec retrieveSubscriptionRequestCreation(String subscriptionId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new RestClientResponseException("Missing the required parameter 'subscriptionId' when calling retrieveSubscription", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("subscriptionId", subscriptionId);

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

        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/v2/subscriptions/{subscriptionId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve Subscription
     * The response is the subscription represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param subscriptionId subscription Id.
     * @return Object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Object retrieveSubscription(String subscriptionId) throws RestClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<>() {};
        return retrieveSubscriptionRequestCreation(subscriptionId).body(localVarReturnType);
    }

    /**
     * Retrieve Subscription
     * The response is the subscription represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param subscriptionId subscription Id.
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> retrieveSubscriptionWithHttpInfo(String subscriptionId) throws RestClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<>() {};
        return retrieveSubscriptionRequestCreation(subscriptionId).toEntity(localVarReturnType);
    }

    /**
     * Retrieve Subscription
     * The response is the subscription represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>200</b> - 
     * @param subscriptionId subscription Id.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec retrieveSubscriptionWithResponseSpec(String subscriptionId) throws RestClientResponseException {
        return retrieveSubscriptionRequestCreation(subscriptionId);
    }
    /**
     * Update Subscription
     * Only the fields included in the request are updated in the subscription. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param subscriptionId subscription Id.
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateSubscriptionRequestCreation(String subscriptionId, String contentType, UpdateSubscriptionRequest body) throws RestClientResponseException {
        Object postBody = body;
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new RestClientResponseException("Missing the required parameter 'subscriptionId' when calling updateSubscription", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new RestClientResponseException("Missing the required parameter 'contentType' when calling updateSubscription", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new RestClientResponseException("Missing the required parameter 'body' when calling updateSubscription", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("subscriptionId", subscriptionId);

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
        return apiClient.invokeAPI("/v2/subscriptions/{subscriptionId}", HttpMethod.PATCH, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update Subscription
     * Only the fields included in the request are updated in the subscription. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param subscriptionId subscription Id.
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updateSubscription(String subscriptionId, String contentType, UpdateSubscriptionRequest body) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        updateSubscriptionRequestCreation(subscriptionId, contentType, body).body(localVarReturnType);
    }

    /**
     * Update Subscription
     * Only the fields included in the request are updated in the subscription. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param subscriptionId subscription Id.
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateSubscriptionWithHttpInfo(String subscriptionId, String contentType, UpdateSubscriptionRequest body) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateSubscriptionRequestCreation(subscriptionId, contentType, body).toEntity(localVarReturnType);
    }

    /**
     * Update Subscription
     * Only the fields included in the request are updated in the subscription. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * <p><b>204</b> - 
     * @param subscriptionId subscription Id.
     * @param contentType The contentType parameter
     * @param body The body parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateSubscriptionWithResponseSpec(String subscriptionId, String contentType, UpdateSubscriptionRequest body) throws RestClientResponseException {
        return updateSubscriptionRequestCreation(subscriptionId, contentType, body);
    }
}
