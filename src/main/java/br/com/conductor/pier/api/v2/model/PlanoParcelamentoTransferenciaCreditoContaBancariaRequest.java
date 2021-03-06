package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Transfer\u00EAncia cr\u00E9dito conta banc\u00E1ria request
 **/

@ApiModel(description = "Transfer\u00EAncia cr\u00E9dito conta banc\u00E1ria request")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PlanoParcelamentoTransferenciaCreditoContaBancariaRequest   {
  
  private Long idCartao = null;
  private BigDecimal valorTransacao = null;
  private Integer numeroMesesCarencia = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaRequest idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Valor da transa\u00E7\u00E3o com duas casas decimais para os centavos
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaRequest valorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "0.0", required = true, value = "Valor da transa\u00E7\u00E3o com duas casas decimais para os centavos")
  @JsonProperty("valorTransacao")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * Representa o N\u00FAmero de Meses concedido como car\u00EAncia
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaRequest numeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Representa o N\u00FAmero de Meses concedido como car\u00EAncia")
  @JsonProperty("numeroMesesCarencia")
  public Integer getNumeroMesesCarencia() {
    return numeroMesesCarencia;
  }
  public void setNumeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanoParcelamentoTransferenciaCreditoContaBancariaRequest planoParcelamentoTransferenciaCreditoContaBancariaRequest = (PlanoParcelamentoTransferenciaCreditoContaBancariaRequest) o;
    return Objects.equals(this.idCartao, planoParcelamentoTransferenciaCreditoContaBancariaRequest.idCartao) &&
        Objects.equals(this.valorTransacao, planoParcelamentoTransferenciaCreditoContaBancariaRequest.valorTransacao) &&
        Objects.equals(this.numeroMesesCarencia, planoParcelamentoTransferenciaCreditoContaBancariaRequest.numeroMesesCarencia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCartao, valorTransacao, numeroMesesCarencia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoParcelamentoTransferenciaCreditoContaBancariaRequest {\n");
    
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    valorTransacao: ").append(toIndentedString(valorTransacao)).append("\n");
    sb.append("    numeroMesesCarencia: ").append(toIndentedString(numeroMesesCarencia)).append("\n");
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

