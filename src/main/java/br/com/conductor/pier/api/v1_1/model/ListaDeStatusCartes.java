package br.com.conductor.pier.api.v1_1.model;

import java.util.Objects;
import br.com.conductor.pier.api.v1_1.model.EstgioCarto;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





/**
 * Lista de Status Cart\u00C3\u00B5es
 **/

@ApiModel(description = "Lista de Status Cart\u00C3\u00B5es")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ListaDeStatusCartes   {
  
  private List<EstgioCarto> statusCartoes = new ArrayList<EstgioCarto>();

  
  /**
   * Lista de status cart\u00C3\u00B5es
   **/
  public ListaDeStatusCartes statusCartoes(List<EstgioCarto> statusCartoes) {
    this.statusCartoes = statusCartoes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lista de status cart\u00C3\u00B5es")
  @JsonProperty("statusCartoes")
  public List<EstgioCarto> getStatusCartoes() {
    return statusCartoes;
  }
  public void setStatusCartoes(List<EstgioCarto> statusCartoes) {
    this.statusCartoes = statusCartoes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListaDeStatusCartes listaDeStatusCartes = (ListaDeStatusCartes) o;
    return Objects.equals(this.statusCartoes, listaDeStatusCartes.statusCartoes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCartoes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListaDeStatusCartes {\n");
    
    sb.append("    statusCartoes: ").append(toIndentedString(statusCartoes)).append("\n");
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



