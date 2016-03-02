package br.gov.ima.api.v1;

import br.gov.ima.api.v1.client.ApiException;
import br.gov.ima.api.v1.client.ApiClient;
import br.gov.ima.api.v1.client.Configuration;

import br.gov.ima.api.v1.model.*;

import java.util.*;

import br.gov.ima.api.v1.model.SaudeResponse;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class SadeApi {

	private ApiClient apiClient;

	public SadeApi() {
		this(Configuration.getDefaultApiClient());
	}

	public SadeApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	
	/**
	 * Dados sobre sÃ¡ude
	 * O recurso sÃ¡ude tem a funÃ§Ã£o de mostrar os dados sobre atendimentos hospitalares realizados em hospitais da Ã¡rea de Campinas.\n
	 * @param accessToken Access Token com as permissÃµes de acesso.
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param uf Filtra resultados por UF.
	 * @param municipio Filtra resultados por cidade.
	 * @param codigoProcedimentoSUS Filtra resultados por cÃ³digo de procedimento.
	 * @param codigoAtividadeProfissional Filtra resultados pelo cÃ³digo do profissional.
	 * @param distritoAtendimento Filtra resultados por distrito de atendimento.
	 * @return List<SaudeResponse>
	 */
	public List<SaudeResponse> saudeGet (String accessToken, String clientId, String offset, String limit, String uf, String municipio, Long codigoProcedimentoSUS, Integer codigoAtividadeProfissional, String distritoAtendimento) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'accessToken' is set
		if (accessToken == null) {
			throw new ApiException(400, "Missing the required parameter 'accessToken' when calling saudeGet");
		}
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling saudeGet");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling saudeGet");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling saudeGet");
		}
		

		// create path and map variables
		String path = "/saude".replaceAll("\\{format\\}","json");

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (uf != null)
			queryParams.put("uf", apiClient.parameterToString(uf));
		if (municipio != null)
			queryParams.put("municipio", apiClient.parameterToString(municipio));
		if (codigoProcedimentoSUS != null)
			queryParams.put("codigoProcedimentoSUS", apiClient.parameterToString(codigoProcedimentoSUS));
		if (codigoAtividadeProfissional != null)
			queryParams.put("codigoAtividadeProfissional", apiClient.parameterToString(codigoAtividadeProfissional));
		if (distritoAtendimento != null)
			queryParams.put("distritoAtendimento", apiClient.parameterToString(distritoAtendimento));
		

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
				return (List<SaudeResponse>) apiClient.deserialize(response, "array", SaudeResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Retorna um dado hospitalar especÃ­fico.
	 * 
	 * @param accessToken Access Token com as permissÃµes de acesso.
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param id Identificador do protocolo.
	 * @return SaudeResponse
	 */
	public SaudeResponse saudeIdGet (String accessToken, String clientId, Long id) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'accessToken' is set
		if (accessToken == null) {
			throw new ApiException(400, "Missing the required parameter 'accessToken' when calling saudeIdGet");
		}
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling saudeIdGet");
		}
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException(400, "Missing the required parameter 'id' when calling saudeIdGet");
		}
		

		// create path and map variables
		String path = "/saude/{id}".replaceAll("\\{format\\}","json")
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
				return (SaudeResponse) apiClient.deserialize(response, "", SaudeResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
}