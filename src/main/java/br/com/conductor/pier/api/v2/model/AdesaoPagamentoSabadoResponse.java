package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de resposta para ades\u00E3o de pagamento no s\u00E1bado
 **/

@ApiModel(description = "Objeto de resposta para ades\u00E3o de pagamento no s\u00E1bado")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AdesaoPagamentoSabadoResponse   {
  
  private String dataCadastro = null;
  private String dataVencimento = null;
  private Long id = null;
  private Long idConta = null;

  
  /**
   * Data do cadastro da ades\u00E3o
   **/
  public AdesaoPagamentoSabadoResponse dataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ", value = "Data do cadastro da ades\u00E3o")
  @JsonProperty("dataCadastro")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * Data de vencimento para ades\u00E3o
   **/
  public AdesaoPagamentoSabadoResponse dataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "Data de vencimento para ades\u00E3o")
  @JsonProperty("dataVencimento")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * Id do registro de ades\u00E3o
   **/
  public AdesaoPagamentoSabadoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id do registro de ades\u00E3o")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Id da conta
   **/
  public AdesaoPagamentoSabadoResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdesaoPagamentoSabadoResponse adesaoPagamentoSabadoResponse = (AdesaoPagamentoSabadoResponse) o;
    return Objects.equals(this.dataCadastro, adesaoPagamentoSabadoResponse.dataCadastro) &&
        Objects.equals(this.dataVencimento, adesaoPagamentoSabadoResponse.dataVencimento) &&
        Objects.equals(this.id, adesaoPagamentoSabadoResponse.id) &&
        Objects.equals(this.idConta, adesaoPagamentoSabadoResponse.idConta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataCadastro, dataVencimento, id, idConta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdesaoPagamentoSabadoResponse {\n");
    
    sb.append("    dataCadastro: ").append(toIndentedString(dataCadastro)).append("\n");
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
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

