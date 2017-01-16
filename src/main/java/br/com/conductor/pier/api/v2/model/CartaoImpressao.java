package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





/**
 * Objeto Cart\u00C3\u00A3o para Impresso
 **/

@ApiModel(description = "Objeto Cart\u00C3\u00A3o para Impresso")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoImpressao   {
  
  private Long idConta = null;
  private Long idPessoa = null;
  private Long idCartao = null;
  private Long idBandeira = null;
  private Long idTipoCartao = null;
  private String numeroCartao = null;
  private String nomePlastico = null;
  private String cvv2 = null;
  private Date dataGeracao = null;
  private Date dataValidade = null;
  private String nomeOrigemComercial = null;
  private String nomeEmpresa = null;
  private Integer numeroAgencia = null;
  private String numeroContaCorente = null;
  private String nomeEmpresaBeneficio = null;
  private String cpf = null;
  private String tipoPortador = null;
  private String nomeEmpregador = null;
  private String trilha1 = null;
  private String trilha2 = null;
  private String trilhaCVV1 = null;
  private String trilhaCVV2 = null;

  
  /**
   * Apresenta o C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta (id) a qual o cart\u00C3\u00A3o gerado pertence.
   **/
  public CartaoImpressao idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta (id) a qual o cart\u00C3\u00A3o gerado pertence.")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Apresenta o C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa (id) portadora do cart\u00C3\u00A3o gerado.
   **/
  public CartaoImpressao idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa (id) portadora do cart\u00C3\u00A3o gerado.")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Apresenta o C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id) que foi gerado.
   **/
  public CartaoImpressao idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id) que foi gerado.")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Apresenta o C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Bandeira (id) a qual o Cart\u00C3\u00A3o pertence, quando bandeirado.
   **/
  public CartaoImpressao idBandeira(Long idBandeira) {
    this.idBandeira = idBandeira;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Bandeira (id) a qual o Cart\u00C3\u00A3o pertence, quando bandeirado.")
  @JsonProperty("idBandeira")
  public Long getIdBandeira() {
    return idBandeira;
  }
  public void setIdBandeira(Long idBandeira) {
    this.idBandeira = idBandeira;
  }

  
  /**
   * Apresenta o C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo do Cart\u00C3\u00A3o (id) atribu\u00C3\u00ADdo ao Cart\u00C3\u00A3o.
   **/
  public CartaoImpressao idTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo do Cart\u00C3\u00A3o (id) atribu\u00C3\u00ADdo ao Cart\u00C3\u00A3o.")
  @JsonProperty("idTipoCartao")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
  }

  
  /**
   * Apresenta o n\u00C3\u00BAmero do cart\u00C3\u00A3o.
   **/
  public CartaoImpressao numeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o n\u00C3\u00BAmero do cart\u00C3\u00A3o.")
  @JsonProperty("numeroCartao")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * Apresenta o nome do Portador do Cart\u00C3\u00A3o.
   **/
  public CartaoImpressao nomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome do Portador do Cart\u00C3\u00A3o.")
  @JsonProperty("nomePlastico")
  public String getNomePlastico() {
    return nomePlastico;
  }
  public void setNomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
  }

  
  /**
   * Apresenta o n\u00C3\u00BAmero do CVV a ser impresso no Cart\u00C3\u00A3o
   **/
  public CartaoImpressao cvv2(String cvv2) {
    this.cvv2 = cvv2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o n\u00C3\u00BAmero do CVV a ser impresso no Cart\u00C3\u00A3o")
  @JsonProperty("cvv2")
  public String getCvv2() {
    return cvv2;
  }
  public void setCvv2(String cvv2) {
    this.cvv2 = cvv2;
  }

  
  /**
   * Apresenta a data de emiss\u00C3\u00A3o do Cart\u00C3\u00A3o.
   **/
  public CartaoImpressao dataGeracao(Date dataGeracao) {
    this.dataGeracao = dataGeracao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data de emiss\u00C3\u00A3o do Cart\u00C3\u00A3o.")
  @JsonProperty("dataGeracao")
  public Date getDataGeracao() {
    return dataGeracao;
  }
  public void setDataGeracao(Date dataGeracao) {
    this.dataGeracao = dataGeracao;
  }

  
  /**
   * Apresenta a data de Validade do Cart\u00C3\u00A3o.
   **/
  public CartaoImpressao dataValidade(Date dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data de Validade do Cart\u00C3\u00A3o.")
  @JsonProperty("dataValidade")
  public Date getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(Date dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * Apresenta o nome da Origem Comercial que realizou o cadastro do Titular da Conta a qual o Cart\u00C3\u00A3o pertence.
   **/
  public CartaoImpressao nomeOrigemComercial(String nomeOrigemComercial) {
    this.nomeOrigemComercial = nomeOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome da Origem Comercial que realizou o cadastro do Titular da Conta a qual o Cart\u00C3\u00A3o pertence.")
  @JsonProperty("nomeOrigemComercial")
  public String getNomeOrigemComercial() {
    return nomeOrigemComercial;
  }
  public void setNomeOrigemComercial(String nomeOrigemComercial) {
    this.nomeOrigemComercial = nomeOrigemComercial;
  }

  
  /**
   * Apresenta o nome da Empresa (Pessoa Jur\u00C3\u00ADdica) titular do Cart\u00C3\u00A3o, quando aplic\u00C3\u00A1vel.
   **/
  public CartaoImpressao nomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome da Empresa (Pessoa Jur\u00C3\u00ADdica) titular do Cart\u00C3\u00A3o, quando aplic\u00C3\u00A1vel.")
  @JsonProperty("nomeEmpresa")
  public String getNomeEmpresa() {
    return nomeEmpresa;
  }
  public void setNomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
  }

  
  /**
   * Apresenta o n\u00C3\u00BAmero da Ag\u00C3\u00AAncia a ser impresso no Cart\u00C3\u00A3o, quando aplic\u00C3\u00A1vel.
   **/
  public CartaoImpressao numeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o n\u00C3\u00BAmero da Ag\u00C3\u00AAncia a ser impresso no Cart\u00C3\u00A3o, quando aplic\u00C3\u00A1vel.")
  @JsonProperty("numeroAgencia")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * Apresenta o n\u00C3\u00BAmero da Conta Corrente a ser impresso no Cart\u00C3\u00A3o, quando aplic\u00C3\u00A1vel.
   **/
  public CartaoImpressao numeroContaCorente(String numeroContaCorente) {
    this.numeroContaCorente = numeroContaCorente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o n\u00C3\u00BAmero da Conta Corrente a ser impresso no Cart\u00C3\u00A3o, quando aplic\u00C3\u00A1vel.")
  @JsonProperty("numeroContaCorente")
  public String getNumeroContaCorente() {
    return numeroContaCorente;
  }
  public void setNumeroContaCorente(String numeroContaCorente) {
    this.numeroContaCorente = numeroContaCorente;
  }

  
  /**
   * Apresenta o nome da Pessoa F\u00C3\u00ADsica ou Jur\u00C3\u00ADdica que contratou servi\u00C3\u00A7os de benef\u00C3\u00ADcio para o portador do cart\u00C3\u00A3o, quando aplic\u00C3\u00A1vel.
   **/
  public CartaoImpressao nomeEmpresaBeneficio(String nomeEmpresaBeneficio) {
    this.nomeEmpresaBeneficio = nomeEmpresaBeneficio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome da Pessoa F\u00C3\u00ADsica ou Jur\u00C3\u00ADdica que contratou servi\u00C3\u00A7os de benef\u00C3\u00ADcio para o portador do cart\u00C3\u00A3o, quando aplic\u00C3\u00A1vel.")
  @JsonProperty("nomeEmpresaBeneficio")
  public String getNomeEmpresaBeneficio() {
    return nomeEmpresaBeneficio;
  }
  public void setNomeEmpresaBeneficio(String nomeEmpresaBeneficio) {
    this.nomeEmpresaBeneficio = nomeEmpresaBeneficio;
  }

  
  /**
   * Apresenta o CPF do Portador do Cart\u00C3\u00A3o.
   **/
  public CartaoImpressao cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o CPF do Portador do Cart\u00C3\u00A3o.")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Apresenta o tipo do Portador do cart\u00C3\u00A3o, sendo: ('T': Titular, 'A': Adicional).
   **/
  public CartaoImpressao tipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o tipo do Portador do cart\u00C3\u00A3o, sendo: ('T': Titular, 'A': Adicional).")
  @JsonProperty("tipoPortador")
  public String getTipoPortador() {
    return tipoPortador;
  }
  public void setTipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
  }

  
  /**
   * Apresenta o nome da Pessoa F\u00C3\u00ADsica ou Jur\u00C3\u00ADdica a ser impresso no cart\u00C3\u00A3o, quando aplic\u00C3\u00A1vel.
   **/
  public CartaoImpressao nomeEmpregador(String nomeEmpregador) {
    this.nomeEmpregador = nomeEmpregador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome da Pessoa F\u00C3\u00ADsica ou Jur\u00C3\u00ADdica a ser impresso no cart\u00C3\u00A3o, quando aplic\u00C3\u00A1vel.")
  @JsonProperty("nomeEmpregador")
  public String getNomeEmpregador() {
    return nomeEmpregador;
  }
  public void setNomeEmpregador(String nomeEmpregador) {
    this.nomeEmpregador = nomeEmpregador;
  }

  
  /**
   * Apresenta os dados da Trilha1, seguindo as regras de trilha do emissor.
   **/
  public CartaoImpressao trilha1(String trilha1) {
    this.trilha1 = trilha1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta os dados da Trilha1, seguindo as regras de trilha do emissor.")
  @JsonProperty("trilha1")
  public String getTrilha1() {
    return trilha1;
  }
  public void setTrilha1(String trilha1) {
    this.trilha1 = trilha1;
  }

  
  /**
   * Apresenta os dados da Trilha2, seguindo as regras de trilha do emissor.
   **/
  public CartaoImpressao trilha2(String trilha2) {
    this.trilha2 = trilha2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta os dados da Trilha2, seguindo as regras de trilha do emissor.")
  @JsonProperty("trilha2")
  public String getTrilha2() {
    return trilha2;
  }
  public void setTrilha2(String trilha2) {
    this.trilha2 = trilha2;
  }

  
  /**
   * Apresenta os dados da TrilhaCVV01, seguindo as regras de trilha do emissor.
   **/
  public CartaoImpressao trilhaCVV1(String trilhaCVV1) {
    this.trilhaCVV1 = trilhaCVV1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta os dados da TrilhaCVV01, seguindo as regras de trilha do emissor.")
  @JsonProperty("trilhaCVV1")
  public String getTrilhaCVV1() {
    return trilhaCVV1;
  }
  public void setTrilhaCVV1(String trilhaCVV1) {
    this.trilhaCVV1 = trilhaCVV1;
  }

  
  /**
   * Apresenta os dados da TrilhaCVV02, seguindo as regras de trilha do emissor.
   **/
  public CartaoImpressao trilhaCVV2(String trilhaCVV2) {
    this.trilhaCVV2 = trilhaCVV2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta os dados da TrilhaCVV02, seguindo as regras de trilha do emissor.")
  @JsonProperty("trilhaCVV2")
  public String getTrilhaCVV2() {
    return trilhaCVV2;
  }
  public void setTrilhaCVV2(String trilhaCVV2) {
    this.trilhaCVV2 = trilhaCVV2;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartaoImpressao cartaoImpressao = (CartaoImpressao) o;
    return Objects.equals(this.idConta, cartaoImpressao.idConta) &&
        Objects.equals(this.idPessoa, cartaoImpressao.idPessoa) &&
        Objects.equals(this.idCartao, cartaoImpressao.idCartao) &&
        Objects.equals(this.idBandeira, cartaoImpressao.idBandeira) &&
        Objects.equals(this.idTipoCartao, cartaoImpressao.idTipoCartao) &&
        Objects.equals(this.numeroCartao, cartaoImpressao.numeroCartao) &&
        Objects.equals(this.nomePlastico, cartaoImpressao.nomePlastico) &&
        Objects.equals(this.cvv2, cartaoImpressao.cvv2) &&
        Objects.equals(this.dataGeracao, cartaoImpressao.dataGeracao) &&
        Objects.equals(this.dataValidade, cartaoImpressao.dataValidade) &&
        Objects.equals(this.nomeOrigemComercial, cartaoImpressao.nomeOrigemComercial) &&
        Objects.equals(this.nomeEmpresa, cartaoImpressao.nomeEmpresa) &&
        Objects.equals(this.numeroAgencia, cartaoImpressao.numeroAgencia) &&
        Objects.equals(this.numeroContaCorente, cartaoImpressao.numeroContaCorente) &&
        Objects.equals(this.nomeEmpresaBeneficio, cartaoImpressao.nomeEmpresaBeneficio) &&
        Objects.equals(this.cpf, cartaoImpressao.cpf) &&
        Objects.equals(this.tipoPortador, cartaoImpressao.tipoPortador) &&
        Objects.equals(this.nomeEmpregador, cartaoImpressao.nomeEmpregador) &&
        Objects.equals(this.trilha1, cartaoImpressao.trilha1) &&
        Objects.equals(this.trilha2, cartaoImpressao.trilha2) &&
        Objects.equals(this.trilhaCVV1, cartaoImpressao.trilhaCVV1) &&
        Objects.equals(this.trilhaCVV2, cartaoImpressao.trilhaCVV2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, idPessoa, idCartao, idBandeira, idTipoCartao, numeroCartao, nomePlastico, cvv2, dataGeracao, dataValidade, nomeOrigemComercial, nomeEmpresa, numeroAgencia, numeroContaCorente, nomeEmpresaBeneficio, cpf, tipoPortador, nomeEmpregador, trilha1, trilha2, trilhaCVV1, trilhaCVV2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoImpressao {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    idBandeira: ").append(toIndentedString(idBandeira)).append("\n");
    sb.append("    idTipoCartao: ").append(toIndentedString(idTipoCartao)).append("\n");
    sb.append("    numeroCartao: ").append(toIndentedString(numeroCartao)).append("\n");
    sb.append("    nomePlastico: ").append(toIndentedString(nomePlastico)).append("\n");
    sb.append("    cvv2: ").append(toIndentedString(cvv2)).append("\n");
    sb.append("    dataGeracao: ").append(toIndentedString(dataGeracao)).append("\n");
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
    sb.append("    nomeOrigemComercial: ").append(toIndentedString(nomeOrigemComercial)).append("\n");
    sb.append("    nomeEmpresa: ").append(toIndentedString(nomeEmpresa)).append("\n");
    sb.append("    numeroAgencia: ").append(toIndentedString(numeroAgencia)).append("\n");
    sb.append("    numeroContaCorente: ").append(toIndentedString(numeroContaCorente)).append("\n");
    sb.append("    nomeEmpresaBeneficio: ").append(toIndentedString(nomeEmpresaBeneficio)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    tipoPortador: ").append(toIndentedString(tipoPortador)).append("\n");
    sb.append("    nomeEmpregador: ").append(toIndentedString(nomeEmpregador)).append("\n");
    sb.append("    trilha1: ").append(toIndentedString(trilha1)).append("\n");
    sb.append("    trilha2: ").append(toIndentedString(trilha2)).append("\n");
    sb.append("    trilhaCVV1: ").append(toIndentedString(trilhaCVV1)).append("\n");
    sb.append("    trilhaCVV2: ").append(toIndentedString(trilhaCVV2)).append("\n");
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



