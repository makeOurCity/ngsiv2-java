/*
 * FIWARE-NGSI v2 Specification
 * TODO: Add a description
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package city.makeour.ngsi.v2.api;

import city.makeour.ngsi.v2.model.GetAttributeDataResponse;
import city.makeour.ngsi.v2.model.UpdateAttributeDataRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for AttributesApi
 */
@Disabled
public class AttributesApiTest {

    private final AttributesApi api = new AttributesApi();

    
    /**
     * Get attribute data
     *
     * Returns a JSON object with the attribute data of the attribute. The object follows the JSON representation for attributes (described in \&quot;JSON Attribute Representation\&quot; section). Response: * Successful operation uses 200 OK. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     */
    @Test
    public void getAttributeDataTest()  {
        String entityId = null;
        String attrName = null;
        String type = null;
        String metadata = null;
        GetAttributeDataResponse response = api.getAttributeData(entityId, attrName, type, metadata);

        // TODO: test validations
    }
    
    /**
     * Remove a Single Attribute
     *
     * Removes an entity attribute. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     */
    @Test
    public void removeASingleAttributeTest()  {
        String entityId = null;
        String attrName = null;
        String type = null;
        api.removeASingleAttribute(entityId, attrName, type);

        // TODO: test validations
    }
    
    /**
     * Update Attribute Data
     *
     * The request payload is an object representing the new attribute data. Previous attribute data is replaced by the one in the request. The object follows the JSON representation for attributes (described in \&quot;JSON Attribute Representation\&quot; section). Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     */
    @Test
    public void updateAttributeDataTest()  {
        String entityId = null;
        String attrName = null;
        String contentType = null;
        UpdateAttributeDataRequest body = null;
        String type = null;
        api.updateAttributeData(entityId, attrName, contentType, body, type);

        // TODO: test validations
    }
    
}