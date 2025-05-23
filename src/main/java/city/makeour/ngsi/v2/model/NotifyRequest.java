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


package city.makeour.ngsi.v2.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * NotifyRequest
 */
@JsonPropertyOrder({
  NotifyRequest.JSON_PROPERTY_SUBSCRIPTION_ID,
  NotifyRequest.JSON_PROPERTY_DATA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-27T19:56:40.594359+09:00[Asia/Tokyo]", comments = "Generator version: 7.12.0")
public class NotifyRequest {
  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionId";
  @jakarta.annotation.Nonnull
  private String subscriptionId;

  public static final String JSON_PROPERTY_DATA = "data";
  @jakarta.annotation.Nonnull
  private List<Object> data = new ArrayList<>();

  public NotifyRequest() {
  }

  public NotifyRequest subscriptionId(@jakarta.annotation.Nonnull String subscriptionId) {
    
    this.subscriptionId = subscriptionId;
    return this;
  }

  /**
   * 
   * @return subscriptionId
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSubscriptionId() {
    return subscriptionId;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubscriptionId(@jakarta.annotation.Nonnull String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public NotifyRequest data(@jakarta.annotation.Nonnull List<Object> data) {
    
    this.data = data;
    return this;
  }

  public NotifyRequest addDataItem(Object dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * 
   * @return data
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Object> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(@jakarta.annotation.Nonnull List<Object> data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotifyRequest notifyRequest = (NotifyRequest) o;
    return Objects.equals(this.subscriptionId, notifyRequest.subscriptionId) &&
        Objects.equals(this.data, notifyRequest.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotifyRequest {\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

