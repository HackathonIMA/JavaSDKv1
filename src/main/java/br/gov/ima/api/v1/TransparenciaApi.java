package br.gov.ima.api.v1;

import br.gov.ima.api.v1.client.ApiException;
import br.gov.ima.api.v1.client.ApiClient;
import br.gov.ima.api.v1.client.Configuration;

import br.gov.ima.api.v1.model.*;

import java.util.*;

import br.gov.ima.api.v1.model.AcoesResponse;
import br.gov.ima.api.v1.model.CredorResponse;
import br.gov.ima.api.v1.model.DespesasResponse;
import br.gov.ima.api.v1.model.ElementoDespesaResponse;
import br.gov.ima.api.v1.model.EmpenhoResponse;
import br.gov.ima.api.v1.model.FontesResponse;
import br.gov.ima.api.v1.model.FonteDetalhadaResponse;
import br.gov.ima.api.v1.model.FuncoesResponse;
import br.gov.ima.api.v1.model.NaturezasResponse;
import br.gov.ima.api.v1.model.ProgramaResponse;
import br.gov.ima.api.v1.model.ProjetoAtividadeResponse;
import br.gov.ima.api.v1.model.ReceitaResponse;
import br.gov.ima.api.v1.model.SubItensContasResponse;
import br.gov.ima.api.v1.model.SubfuncoesResponse;
import br.gov.ima.api.v1.model.TipoLicitacoesResponse;
import br.gov.ima.api.v1.model.UnidadesResponse;
import br.gov.ima.api.v1.model.UnidadeGestoraResponse;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class TransparenciaApi {

	private ApiClient apiClient;

	public TransparenciaApi() {
		this(Configuration.getDefaultApiClient());
	}

	public TransparenciaApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	
	/**
	 * Consulta das aÃ§Ãµes da preifeitura.
	 * 
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return List<AcoesResponse>
	 */
	public List<AcoesResponse> queryfiltroAcao (String clientId, String offset, String limit, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling queryfiltroAcao");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling queryfiltroAcao");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling queryfiltroAcao");
		}
		

		// create path and map variables
		String path = "/transparencia/acoes".replaceAll("\\{format\\}","json");

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (List<AcoesResponse>) apiClient.deserialize(response, "array", AcoesResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta da aÃ§Ã£o da preifeitura.
	 * 
	 * @param id Identificador do registro.
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return AcoesResponse
	 */
	public AcoesResponse queryfiltroAcao2 (String id, String clientId, String offset, String limit, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException(400, "Missing the required parameter 'id' when calling queryfiltroAcao2");
		}
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling queryfiltroAcao2");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling queryfiltroAcao2");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling queryfiltroAcao2");
		}
		

		// create path and map variables
		String path = "/transparencia/acoes/{id}".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (AcoesResponse) apiClient.deserialize(response, "", AcoesResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta de credores.
	 * 
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return List<CredorResponse>
	 */
	public List<CredorResponse> ptrLkpCredor (String clientId, String offset, String limit, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpCredor");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpCredor");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpCredor");
		}
		

		// create path and map variables
		String path = "/transparencia/credores".replaceAll("\\{format\\}","json");

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (List<CredorResponse>) apiClient.deserialize(response, "array", CredorResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta de credor.
	 * 
	 * @param id Identificador do registro.
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return CredorResponse
	 */
	public CredorResponse ptrLkpCredor2 (String id, String clientId, String offset, String limit, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException(400, "Missing the required parameter 'id' when calling ptrLkpCredor2");
		}
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpCredor2");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpCredor2");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpCredor2");
		}
		

		// create path and map variables
		String path = "/transparencia/credores/{id}".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (CredorResponse) apiClient.deserialize(response, "", CredorResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta de despesas da prefeitura.
	 * 
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @param anoExercicio Ano de exercÃ­cio
	 * @param acao AÃ§Ã£o, lista disponÃ­vel em GET /transparencia/acoes
	 * @param mes MÃªs desejado
	 * @param orgao OrgÃ£os, lista disponÃ­vel em GET /transparencia/unidadesGestoras
	 * @param funcao FunÃ§Ã£o, lista disponÃ­vel em GET /transparencia/funcoes
	 * @param subfuncao Sub-funÃ§Ã£o, lista disponÃ­vel em GET /transparencia/subfuncoes
	 * @param programa Programa, lista disponÃ­vel em GET /transparencia/programas
	 * @param origemFonte Origem das fontes, lista disponÃ­vel em GET /transparencia/fontesDetalhadas
	 * @param fonte Fontes, lista disponÃ­vel em GET /transparencia/fontes
	 * @param naturezaDespesa Natureza da despesa, lista disponÃ­vel em GET /transparencia/subItensContas
	 * @param expand ParÃ¢metro utilizado para obter maiores detalhes sobre algum dos atributos do recurso. Podendo ser passados mÃºltiplos campos separados por vÃ­rgula
	 * @return List<DespesasResponse>
	 */
	public List<DespesasResponse> ptrFtDespesa (String clientId, String offset, String limit, List<String> fields, List<String> filters, String anoExercicio, String acao, String mes, String orgao, String funcao, String subfuncao, String programa, String origemFonte, String fonte, String naturezaDespesa, String expand) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrFtDespesa");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrFtDespesa");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrFtDespesa");
		}
		

		// create path and map variables
		String path = "/transparencia/despesas".replaceAll("\\{format\\}","json");

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		if (anoExercicio != null)
			queryParams.put("anoExercicio", apiClient.parameterToString(anoExercicio));
		if (acao != null)
			queryParams.put("acao", apiClient.parameterToString(acao));
		if (mes != null)
			queryParams.put("mes", apiClient.parameterToString(mes));
		if (orgao != null)
			queryParams.put("orgao", apiClient.parameterToString(orgao));
		if (funcao != null)
			queryParams.put("funcao", apiClient.parameterToString(funcao));
		if (subfuncao != null)
			queryParams.put("subfuncao", apiClient.parameterToString(subfuncao));
		if (programa != null)
			queryParams.put("programa", apiClient.parameterToString(programa));
		if (origemFonte != null)
			queryParams.put("origemFonte", apiClient.parameterToString(origemFonte));
		if (fonte != null)
			queryParams.put("fonte", apiClient.parameterToString(fonte));
		if (naturezaDespesa != null)
			queryParams.put("naturezaDespesa", apiClient.parameterToString(naturezaDespesa));
		if (expand != null)
			queryParams.put("expand", apiClient.parameterToString(expand));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (List<DespesasResponse>) apiClient.deserialize(response, "array", DespesasResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta de uma despesa da prefeitura.
	 * 
	 * @param id Identificador do registro.
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param expand ParÃ¢metro utilizado para obter maiores detalhes sobre algum dos atributos do recurso. Podendo ser passados mÃºltiplos campos separados por vÃ­rgula
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return DespesasResponse
	 */
	public DespesasResponse ptrFtDespesa2 (String id, String clientId, String expand, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException(400, "Missing the required parameter 'id' when calling ptrFtDespesa2");
		}
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrFtDespesa2");
		}
		

		// create path and map variables
		String path = "/transparencia/despesas/{id}".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (expand != null)
			queryParams.put("expand", apiClient.parameterToString(expand));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (DespesasResponse) apiClient.deserialize(response, "", DespesasResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta das despesas dos elementos da preifeitura.
	 * 
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return List<ElementoDespesaResponse>
	 */
	public List<ElementoDespesaResponse> ptrLkpElementoDespesa (String clientId, String offset, String limit, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpElementoDespesa");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpElementoDespesa");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpElementoDespesa");
		}
		

		// create path and map variables
		String path = "/transparencia/elementos".replaceAll("\\{format\\}","json");

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (List<ElementoDespesaResponse>) apiClient.deserialize(response, "array", ElementoDespesaResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta da despesa do elemento da preifeitura.
	 * 
	 * @param id Identificador do registro.
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return ElementoDespesaResponse
	 */
	public ElementoDespesaResponse ptrLkpElementoDespesa2 (String id, String clientId, String offset, String limit, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException(400, "Missing the required parameter 'id' when calling ptrLkpElementoDespesa2");
		}
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpElementoDespesa2");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpElementoDespesa2");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpElementoDespesa2");
		}
		

		// create path and map variables
		String path = "/transparencia/elementos/{id}".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (ElementoDespesaResponse) apiClient.deserialize(response, "", ElementoDespesaResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta das despesas dos elementos da preifeitura.
	 * 
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return List<EmpenhoResponse>
	 */
	public List<EmpenhoResponse> ptrLkpNe (String clientId, String offset, String limit, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpNe");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpNe");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpNe");
		}
		

		// create path and map variables
		String path = "/transparencia/empenhos".replaceAll("\\{format\\}","json");

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (List<EmpenhoResponse>) apiClient.deserialize(response, "array", EmpenhoResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta da despesa do elemento da preifeitura.
	 * 
	 * @param id Identificador do registro.
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return EmpenhoResponse
	 */
	public EmpenhoResponse ptrLkpNe2 (String id, String clientId, String offset, String limit, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException(400, "Missing the required parameter 'id' when calling ptrLkpNe2");
		}
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpNe2");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpNe2");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpNe2");
		}
		

		// create path and map variables
		String path = "/transparencia/empenhos/{id}".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (EmpenhoResponse) apiClient.deserialize(response, "", EmpenhoResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta de contas das fontes da prefeitura.
	 * 
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param expand ParÃ¢metro utilizado para obter maiores detalhes sobre algum dos atributos do recurso. Podendo ser passados mÃºltiplos campos separados por vÃ­rgula
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return List<FontesResponse>
	 */
	public List<FontesResponse> ptrLkpFonteDetalhada (String clientId, String offset, String limit, String expand, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpFonteDetalhada");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpFonteDetalhada");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpFonteDetalhada");
		}
		

		// create path and map variables
		String path = "/transparencia/fontes".replaceAll("\\{format\\}","json");

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (expand != null)
			queryParams.put("expand", apiClient.parameterToString(expand));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (List<FontesResponse>) apiClient.deserialize(response, "array", FontesResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta de conta da fonte da prefeitura.
	 * 
	 * @param id Identificador do registro.
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param expand ParÃ¢metro utilizado para obter maiores detalhes sobre algum dos atributos do recurso. Podendo ser passados mÃºltiplos campos separados por vÃ­rgula
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return FontesResponse
	 */
	public FontesResponse ptrLkpFonteDetalhada2 (String id, String clientId, String offset, String limit, String expand, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException(400, "Missing the required parameter 'id' when calling ptrLkpFonteDetalhada2");
		}
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpFonteDetalhada2");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpFonteDetalhada2");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpFonteDetalhada2");
		}
		

		// create path and map variables
		String path = "/transparencia/fontes/{id}".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (expand != null)
			queryParams.put("expand", apiClient.parameterToString(expand));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (FontesResponse) apiClient.deserialize(response, "", FontesResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta das receitas das fontes detalhadas da prefeitura.
	 * 
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return List<FonteDetalhadaResponse>
	 */
	public List<FonteDetalhadaResponse> ptrLkpFonte (String clientId, String offset, String limit, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpFonte");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpFonte");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpFonte");
		}
		

		// create path and map variables
		String path = "/transparencia/fontesDetalhadas".replaceAll("\\{format\\}","json");

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (List<FonteDetalhadaResponse>) apiClient.deserialize(response, "array", FonteDetalhadaResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta da receita da fonte detalhada da prefeitura.
	 * 
	 * @param id Identificador do registro.
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return FonteDetalhadaResponse
	 */
	public FonteDetalhadaResponse ptrLkpFonte2 (String id, String clientId, String offset, String limit, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException(400, "Missing the required parameter 'id' when calling ptrLkpFonte2");
		}
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpFonte2");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpFonte2");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpFonte2");
		}
		

		// create path and map variables
		String path = "/transparencia/fontesDetalhadas/{id}".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (FonteDetalhadaResponse) apiClient.deserialize(response, "", FonteDetalhadaResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta das funÃ§Ãµes da preifeitura.
	 * 
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return List<FuncoesResponse>
	 */
	public List<FuncoesResponse> ptrLkpFuncao (String clientId, String offset, String limit, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpFuncao");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpFuncao");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpFuncao");
		}
		

		// create path and map variables
		String path = "/transparencia/funcoes".replaceAll("\\{format\\}","json");

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (List<FuncoesResponse>) apiClient.deserialize(response, "array", FuncoesResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta da funÃ§Ã£o da preifeitura.
	 * 
	 * @param id Identificador do registro.
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return FuncoesResponse
	 */
	public FuncoesResponse ptrLkpFuncao2 (String id, String clientId, String offset, String limit, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException(400, "Missing the required parameter 'id' when calling ptrLkpFuncao2");
		}
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpFuncao2");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpFuncao2");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpFuncao2");
		}
		

		// create path and map variables
		String path = "/transparencia/funcoes/{id}".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (FuncoesResponse) apiClient.deserialize(response, "", FuncoesResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta de contas das naturezas das receitas da prefeitura.
	 * 
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param expand ParÃ¢metro utilizado para obter maiores detalhes sobre algum dos atributos do recurso. Podendo ser passados mÃºltiplos campos separados por vÃ­rgula
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return List<NaturezasResponse>
	 */
	public List<NaturezasResponse> ptrLkpSubalineaReceita (String clientId, String offset, String limit, String expand, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpSubalineaReceita");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpSubalineaReceita");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpSubalineaReceita");
		}
		

		// create path and map variables
		String path = "/transparencia/naturezas".replaceAll("\\{format\\}","json");

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (expand != null)
			queryParams.put("expand", apiClient.parameterToString(expand));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (List<NaturezasResponse>) apiClient.deserialize(response, "array", NaturezasResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta de conta da natureza da receita da prefeitura.
	 * 
	 * @param id Identificador do registro.
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param expand ParÃ¢metro utilizado para obter maiores detalhes sobre algum dos atributos do recurso. Podendo ser passados mÃºltiplos campos separados por vÃ­rgula
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return NaturezasResponse
	 */
	public NaturezasResponse ptrLkpSubalineaReceita2 (String id, String clientId, String offset, String limit, String expand, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException(400, "Missing the required parameter 'id' when calling ptrLkpSubalineaReceita2");
		}
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpSubalineaReceita2");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpSubalineaReceita2");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpSubalineaReceita2");
		}
		

		// create path and map variables
		String path = "/transparencia/naturezas/{id}".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (expand != null)
			queryParams.put("expand", apiClient.parameterToString(expand));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (NaturezasResponse) apiClient.deserialize(response, "", NaturezasResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta dos programas da preifeitura.
	 * 
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return List<ProgramaResponse>
	 */
	public List<ProgramaResponse> ptrLkpPrograma (String clientId, String offset, String limit, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpPrograma");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpPrograma");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpPrograma");
		}
		

		// create path and map variables
		String path = "/transparencia/programas".replaceAll("\\{format\\}","json");

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (List<ProgramaResponse>) apiClient.deserialize(response, "array", ProgramaResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta do programa da preifeitura.
	 * 
	 * @param id Identificador do registro.
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return ProgramaResponse
	 */
	public ProgramaResponse ptrLkpPrograma2 (String id, String clientId, String offset, String limit, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException(400, "Missing the required parameter 'id' when calling ptrLkpPrograma2");
		}
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpPrograma2");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpPrograma2");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpPrograma2");
		}
		

		// create path and map variables
		String path = "/transparencia/programas/{id}".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (ProgramaResponse) apiClient.deserialize(response, "", ProgramaResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta dos projetos e atividades da preifeitura.
	 * 
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param expand ParÃ¢metro utilizado para obter maiores detalhes sobre algum dos atributos do recurso. Podendo ser passados mÃºltiplos campos separados por vÃ­rgula
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return List<ProjetoAtividadeResponse>
	 */
	public List<ProjetoAtividadeResponse> ptrLkpProjetoAtividade (String clientId, String offset, String limit, String expand, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpProjetoAtividade");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpProjetoAtividade");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpProjetoAtividade");
		}
		

		// create path and map variables
		String path = "/transparencia/projetosAtividades".replaceAll("\\{format\\}","json");

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (expand != null)
			queryParams.put("expand", apiClient.parameterToString(expand));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (List<ProjetoAtividadeResponse>) apiClient.deserialize(response, "array", ProjetoAtividadeResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta do projeto e atividade da preifeitura.
	 * 
	 * @param id Identificador do registro.
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param expand ParÃ¢metro utilizado para obter maiores detalhes sobre algum dos atributos do recurso. Podendo ser passados mÃºltiplos campos separados por vÃ­rgula
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return ProjetoAtividadeResponse
	 */
	public ProjetoAtividadeResponse ptrLkpProjetoAtividade2 (String id, String clientId, String offset, String limit, String expand, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException(400, "Missing the required parameter 'id' when calling ptrLkpProjetoAtividade2");
		}
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpProjetoAtividade2");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpProjetoAtividade2");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpProjetoAtividade2");
		}
		

		// create path and map variables
		String path = "/transparencia/projetosAtividades/{id}".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (expand != null)
			queryParams.put("expand", apiClient.parameterToString(expand));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (ProjetoAtividadeResponse) apiClient.deserialize(response, "", ProjetoAtividadeResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta das receitas da prefeitura.
	 * 
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @param ano Ano de exercÃ­cio
	 * @param mes MÃªs desejado
	 * @param unidade Unidades, lista disponÃ­vel em GET /transparencia/unidades
	 * @param natureza Natureza das receitas, lista disponÃ­vel em GET /transparencia/naturezas
	 * @return List<ReceitaResponse>
	 */
	public List<ReceitaResponse> ptrFtReceita (String clientId, String offset, String limit, List<String> fields, List<String> filters, String ano, String mes, String unidade, String natureza) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrFtReceita");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrFtReceita");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrFtReceita");
		}
		

		// create path and map variables
		String path = "/transparencia/receitas".replaceAll("\\{format\\}","json");

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		if (ano != null)
			queryParams.put("ano", apiClient.parameterToString(ano));
		if (mes != null)
			queryParams.put("mes", apiClient.parameterToString(mes));
		if (unidade != null)
			queryParams.put("unidade", apiClient.parameterToString(unidade));
		if (natureza != null)
			queryParams.put("natureza", apiClient.parameterToString(natureza));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (List<ReceitaResponse>) apiClient.deserialize(response, "array", ReceitaResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta da receita da prefeitura.
	 * 
	 * @param id Identificador do registro.
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @param ano Ano de exercÃ­cio, lista disponÃ­vel em GET /transparencia/anosExercicioReceita
	 * @param mes MÃªs desejado
	 * @param unidade Unidades, lista disponÃ­vel em GET /transparencia/unidades
	 * @param natureza Natureza das receitas, lista disponÃ­vel em GET /transparencia/naturezas
	 * @return ReceitaResponse
	 */
	public ReceitaResponse ptrFtReceita2 (String id, String clientId, String offset, String limit, List<String> fields, List<String> filters, String ano, String mes, String unidade, String natureza) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException(400, "Missing the required parameter 'id' when calling ptrFtReceita2");
		}
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrFtReceita2");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrFtReceita2");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrFtReceita2");
		}
		

		// create path and map variables
		String path = "/transparencia/receitas/{id}".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		if (ano != null)
			queryParams.put("ano", apiClient.parameterToString(ano));
		if (mes != null)
			queryParams.put("mes", apiClient.parameterToString(mes));
		if (unidade != null)
			queryParams.put("unidade", apiClient.parameterToString(unidade));
		if (natureza != null)
			queryParams.put("natureza", apiClient.parameterToString(natureza));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (ReceitaResponse) apiClient.deserialize(response, "", ReceitaResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta dos sub-itens das contas.
	 * 
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return List<SubItensContasResponse>
	 */
	public List<SubItensContasResponse> ptrLkpSubitemConta (String clientId, String offset, String limit, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpSubitemConta");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpSubitemConta");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpSubitemConta");
		}
		

		// create path and map variables
		String path = "/transparencia/subItensContas".replaceAll("\\{format\\}","json");

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (List<SubItensContasResponse>) apiClient.deserialize(response, "array", SubItensContasResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta do sub-item das contas.
	 * 
	 * @param id Identificador do registro.
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return SubItensContasResponse
	 */
	public SubItensContasResponse ptrLkpSubitemConta2 (String id, String clientId, String offset, String limit, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException(400, "Missing the required parameter 'id' when calling ptrLkpSubitemConta2");
		}
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpSubitemConta2");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpSubitemConta2");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpSubitemConta2");
		}
		

		// create path and map variables
		String path = "/transparencia/subItensContas/{id}".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (SubItensContasResponse) apiClient.deserialize(response, "", SubItensContasResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta das sub-funÃ§Ãµes da preifeitura.
	 * 
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return List<SubfuncoesResponse>
	 */
	public List<SubfuncoesResponse> ptrLkpSubfuncao (String clientId, String offset, String limit, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpSubfuncao");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpSubfuncao");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpSubfuncao");
		}
		

		// create path and map variables
		String path = "/transparencia/subfuncoes".replaceAll("\\{format\\}","json");

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (List<SubfuncoesResponse>) apiClient.deserialize(response, "array", SubfuncoesResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta da sub-funÃ§Ã£o da preifeitura.
	 * 
	 * @param id Identificador do registro.
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return SubfuncoesResponse
	 */
	public SubfuncoesResponse ptrLkpSubfuncao2 (String id, String clientId, String offset, String limit, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException(400, "Missing the required parameter 'id' when calling ptrLkpSubfuncao2");
		}
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpSubfuncao2");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpSubfuncao2");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpSubfuncao2");
		}
		

		// create path and map variables
		String path = "/transparencia/subfuncoes/{id}".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (SubfuncoesResponse) apiClient.deserialize(response, "", SubfuncoesResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta dos tipos de licitaÃ§Ãµes.
	 * 
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return List<TipoLicitacoesResponse>
	 */
	public List<TipoLicitacoesResponse> ptrLkpTipoLicitacao (String clientId, String offset, String limit, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpTipoLicitacao");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpTipoLicitacao");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpTipoLicitacao");
		}
		

		// create path and map variables
		String path = "/transparencia/tipoLicitacoes".replaceAll("\\{format\\}","json");

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (List<TipoLicitacoesResponse>) apiClient.deserialize(response, "array", TipoLicitacoesResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta do tipo de licitaÃ§Ã£o.
	 * 
	 * @param id Identificador do registro.
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return TipoLicitacoesResponse
	 */
	public TipoLicitacoesResponse ptrLkpTipoLicitacao2 (String id, String clientId, String offset, String limit, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException(400, "Missing the required parameter 'id' when calling ptrLkpTipoLicitacao2");
		}
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpTipoLicitacao2");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpTipoLicitacao2");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpTipoLicitacao2");
		}
		

		// create path and map variables
		String path = "/transparencia/tipoLicitacoes/{id}".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (TipoLicitacoesResponse) apiClient.deserialize(response, "", TipoLicitacoesResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta das unidades da preifeitura.
	 * 
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return List<UnidadesResponse>
	 */
	public List<UnidadesResponse> ptrLkpUnidadeOrcamentaria (String clientId, String offset, String limit, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpUnidadeOrcamentaria");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpUnidadeOrcamentaria");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpUnidadeOrcamentaria");
		}
		

		// create path and map variables
		String path = "/transparencia/unidades".replaceAll("\\{format\\}","json");

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (List<UnidadesResponse>) apiClient.deserialize(response, "array", UnidadesResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta da unidade da preifeitura.
	 * 
	 * @param id Identificador do registro.
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return UnidadesResponse
	 */
	public UnidadesResponse ptrLkpUnidadeOrcamentaria2 (String id, String clientId, String offset, String limit, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException(400, "Missing the required parameter 'id' when calling ptrLkpUnidadeOrcamentaria2");
		}
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpUnidadeOrcamentaria2");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpUnidadeOrcamentaria2");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpUnidadeOrcamentaria2");
		}
		

		// create path and map variables
		String path = "/transparencia/unidades/{id}".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (UnidadesResponse) apiClient.deserialize(response, "", UnidadesResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta de contas das unidades gestoras da prefeitura.
	 * 
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param expand ParÃ¢metro utilizado para obter maiores detalhes sobre algum dos atributos do recurso. Podendo ser passados mÃºltiplos campos separados por vÃ­rgula
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return List<UnidadeGestoraResponse>
	 */
	public List<UnidadeGestoraResponse> ptrLkpUnidadeGestora (String clientId, String offset, String limit, String expand, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpUnidadeGestora");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpUnidadeGestora");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpUnidadeGestora");
		}
		

		// create path and map variables
		String path = "/transparencia/unidadesGestoras".replaceAll("\\{format\\}","json");

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (expand != null)
			queryParams.put("expand", apiClient.parameterToString(expand));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (List<UnidadeGestoraResponse>) apiClient.deserialize(response, "array", UnidadeGestoraResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Consulta de conta da unidade gestora da prefeitura.
	 * 
	 * @param id Identificador do registro.
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param expand ParÃ¢metro utilizado para obter maiores detalhes sobre algum dos atributos do recurso. Podendo ser passados mÃºltiplos campos separados por vÃ­rgula
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return UnidadeGestoraResponse
	 */
	public UnidadeGestoraResponse ptrLkpUnidadeGestora2 (String id, String clientId, String offset, String limit, String expand, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException(400, "Missing the required parameter 'id' when calling ptrLkpUnidadeGestora2");
		}
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling ptrLkpUnidadeGestora2");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling ptrLkpUnidadeGestora2");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling ptrLkpUnidadeGestora2");
		}
		

		// create path and map variables
		String path = "/transparencia/unidadesGestoras/{id}".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (expand != null)
			queryParams.put("expand", apiClient.parameterToString(expand));
		if (fields != null)
			queryParams.put("fields", apiClient.parameterToString(fields));
		if (filters != null)
			queryParams.put("filters", apiClient.parameterToString(filters));
		

		if (clientId != null)
			headerParams.put("client_id", apiClient.parameterToString(clientId));
		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] {  };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (UnidadeGestoraResponse) apiClient.deserialize(response, "", UnidadeGestoraResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
}
