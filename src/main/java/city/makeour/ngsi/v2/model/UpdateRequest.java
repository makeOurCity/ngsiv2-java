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
 * UpdateRequest
 */
@JsonPropertyOrder({
  UpdateRequest.JSON_PROPERTY_ACTION_TYPE,
  UpdateRequest.JSON_PROPERTY_ENTITIES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-27T19:56:40.594359+09:00[Asia/Tokyo]", comments = "Generator version: 7.12.0")
public class UpdateRequest {
  public static final String JSON_PROPERTY_ACTION_TYPE = "actionType";
  @jakarta.annotation.Nonnull
  private String actionType;

  public static final String JSON_PROPERTY_ENTITIES = "entities";
  @jakarta.annotation.Nonnull
  private List<Object> entities = new ArrayList<>();

  public UpdateRequest() {
  }

  public UpdateRequest actionType(@jakarta.annotation.Nonnull String actionType) {
    
    this.actionType = actionType;
    return this;
  }

  /**
   * 
   * @return actionType
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getActionType() {
    return actionType;
  }


  @JsonProperty(JSON_PROPERTY_ACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setActionType(@jakarta.annotation.Nonnull String actionType) {
    this.actionType = actionType;
  }

  public UpdateRequest entities(@jakarta.annotation.Nonnull List<Object> entities) {
    
    this.entities = entities;
    return this;
  }

  public UpdateRequest addEntitiesItem(Object entitiesItem) {
    if (this.entities == null) {
      this.entities = new ArrayList<>();
    }
    this.entities.add(entitiesItem);
    return this;
  }

  /**
   * 
   * @return entities
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Object> getEntities() {
    return entities;
  }


  @JsonProperty(JSON_PROPERTY_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntities(@jakarta.annotation.Nonnull List<Object> entities) {
    this.entities = entities;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRequest updateRequest = (UpdateRequest) o;
    return Objects.equals(this.actionType, updateRequest.actionType) &&
        Objects.equals(this.entities, updateRequest.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRequest {\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

