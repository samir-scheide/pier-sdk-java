package br.com.conductor.pier.api.v1.model;

import java.util.Objects;
import br.com.conductor.pier.api.v1.model.AuthToken;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class Body   {
  
  private AuthToken authToken = null;


  public enum ActionEnum {
    CREATED("CREATED"),
    UPDATED("UPDATED"),
    DELETED("DELETED");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ActionEnum action = null;
  private String user = null;

  
  /**
   **/
  public Body authToken(AuthToken authToken) {
    this.authToken = authToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("AuthToken")
  public AuthToken getAuthToken() {
    return authToken;
  }
  public void setAuthToken(AuthToken authToken) {
    this.authToken = authToken;
  }

  
  /**
   **/
  public Body action(ActionEnum action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }

  
  /**
   **/
  public Body user(String user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body body = (Body) o;
    return Objects.equals(this.authToken, body.authToken) &&
        Objects.equals(this.action, body.action) &&
        Objects.equals(this.user, body.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authToken, action, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body {\n");
    
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}



