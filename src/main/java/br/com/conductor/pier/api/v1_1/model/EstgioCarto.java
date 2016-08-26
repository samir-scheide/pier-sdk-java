package br.com.conductor.pier.api.v1_1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do recurso Est\u00C3\u00A1gio Cart\u00C3\u00A3o
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do recurso Est\u00C3\u00A1gio Cart\u00C3\u00A3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class EstgioCarto   {
  
  private Long id = null;
  private String nome = null;

  
  /**
   * Id do est\u00C3\u00A1gio cart\u00C3\u00A3o
   **/
  public EstgioCarto id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id do est\u00C3\u00A1gio cart\u00C3\u00A3o")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome do est\u00C3\u00A1gio cart\u00C3\u00A3o
   **/
  public EstgioCarto nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Nome do est\u00C3\u00A1gio cart\u00C3\u00A3o")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstgioCarto estgioCarto = (EstgioCarto) o;
    return Objects.equals(this.id, estgioCarto.id) &&
        Objects.equals(this.nome, estgioCarto.nome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstgioCarto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
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



