package br.gov.ima.api.v1;

import br.gov.ima.api.v1.client.ApiException;
import br.gov.ima.api.v1.client.ApiClient;
import br.gov.ima.api.v1.client.Configuration;

import br.gov.ima.api.v1.model.*;

import java.util.*;

import br.gov.ima.api.v1.model.SolicitacaoResponse;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class AtendimentosApi {

	private ApiClient apiClient;

	public AtendimentosApi() {
		this(Configuration.getDefaultApiClient());
	}

	public AtendimentosApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	
	/**
	 * Dados sobre atendimentos
	 * O recurso 156 foi projetado para retornar todas as informaÃ§Ãµes sobre solicitaÃ§Ãµes e atendimentos realizados pela prefeitura de Campinas. Ã recomendado o uso de filtros passados na query param para retornar conjuntos de informaÃ§Ãµes especificas.\n
	 * @param accessToken Access Token com as permissÃµes de acesso.
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param nomeRegiao Filtra os resultados por Ã¡rea regional. (Exemplo &gt; &#39;LESTE&#39;)
	 * @param anoSolicitacao Filtra os resultados por ano em que a solicitaÃ§Ã£o foi feita.
	 * @param codigoCEP Filtra os resultados pelo CEP em que a solicitacao estÃ¡ cadastrada.
	 * @param descricaoStatus Filtra os resultados por status, passado o tipo de status referente. (Exemplo &gt; &#39;EXECUTADO&#39;)
	 * @return List<SolicitacaoResponse>
	 */
	public List<SolicitacaoResponse> 156Get (String accessToken, String clientId, String offset, String limit, String nomeRegiao, Integer anoSolicitacao, String codigoCEP, String descricaoStatus) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'accessToken' is set
		if (accessToken == null) {
			throw new ApiException(400, "Missing the required parameter 'accessToken' when calling 156Get");
		}
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling 156Get");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling 156Get");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling 156Get");
		}
		

		// create path and map variables
		String path = "/156".replaceAll("\\{format\\}","json");

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (nomeRegiao != null)
			queryParams.put("nomeRegiao", apiClient.parameterToString(nomeRegiao));
		if (anoSolicitacao != null)
			queryParams.put("anoSolicitacao", apiClient.parameterToString(anoSolicitacao));
		if (codigoCEP != null)
			queryParams.put("codigoCEP", apiClient.parameterToString(codigoCEP));
		if (descricaoStatus != null)
			queryParams.put("descricaoStatus", apiClient.parameterToString(descricaoStatus));
		

		if (accessToken != null)
			headerParams.put("access-token", apiClient.parameterToString(accessToken));
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
				return (List<SolicitacaoResponse>) apiClient.deserialize(response, "array", SolicitacaoResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Dado de um atendimento especifico.
	 * 
	 * @param accessToken Access Token com as permissÃµes de acesso.
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param id Identificador da solicitaÃ§Ã£o
	 * @return SolicitacaoResponse
	 */
	public SolicitacaoResponse 156IdGet (String accessToken, String clientId, String id) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'accessToken' is set
		if (accessToken == null) {
			throw new ApiException(400, "Missing the required parameter 'accessToken' when calling 156IdGet");
		}
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling 156IdGet");
		}
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException(400, "Missing the required parameter 'id' when calling 156IdGet");
		}
		

		// create path and map variables
		String path = "/156/{id}".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		

		if (accessToken != null)
			headerParams.put("access-token", apiClient.parameterToString(accessToken));
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
				return (SolicitacaoResponse) apiClient.deserialize(response, "", SolicitacaoResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
}
