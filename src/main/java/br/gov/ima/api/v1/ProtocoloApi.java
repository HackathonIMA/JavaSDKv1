package br.gov.ima.api.v1;

import br.gov.ima.api.v1.client.ApiException;
import br.gov.ima.api.v1.client.ApiClient;
import br.gov.ima.api.v1.client.Configuration;

import br.gov.ima.api.v1.model.*;

import java.util.*;

import br.gov.ima.api.v1.model.ProtocoloResponse;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class ProtocoloApi {

	private ApiClient apiClient;

	public ProtocoloApi() {
		this(Configuration.getDefaultApiClient());
	}

	public ProtocoloApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	
	/**
	 * Dados sobre protocolo
	 * O recurso de protocolo existe para fornecer informaÃ§Ãµes sobre protocolos gerados pela prefeitura.\n
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param offset ParÃ¢metro utilizado para indicar a posiÃ§Ã£o do registro inicial que serÃ¡ trazido. A primeira posiÃ§Ã£o Ã© sempre zero (0).
	 * @param limit ParÃ¢metro utilizado para indicar a quantidade de registros que deve ser trazido na consulta.
	 * @param nomeRegiao Filtra resultados por Ã¡rea regional. (Exemplo &gt; &#39;NORTE&#39;)
	 * @param codigoBairro Filtra resultados por cÃ³digo do bairro.
	 * @param siglaExpediente Filtra resultados pelo cÃ³digo da secretaria expediente.
	 * @param anoProcesso Filtra resultados pelo ano em que foram lanÃ§ados.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return List<ProtocoloResponse>
	 */
	public List<ProtocoloResponse> protocoloGet (String clientId, String offset, String limit, String nomeRegiao, Integer codigoBairro, String siglaExpediente, Integer anoProcesso, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling protocoloGet");
		}
		
		// verify the required parameter 'offset' is set
		if (offset == null) {
			throw new ApiException(400, "Missing the required parameter 'offset' when calling protocoloGet");
		}
		
		// verify the required parameter 'limit' is set
		if (limit == null) {
			throw new ApiException(400, "Missing the required parameter 'limit' when calling protocoloGet");
		}
		

		// create path and map variables
		String path = "/protocolo".replaceAll("\\{format\\}","json");

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (offset != null)
			queryParams.put("offset", apiClient.parameterToString(offset));
		if (limit != null)
			queryParams.put("limit", apiClient.parameterToString(limit));
		if (nomeRegiao != null)
			queryParams.put("nomeRegiao", apiClient.parameterToString(nomeRegiao));
		if (codigoBairro != null)
			queryParams.put("codigoBairro", apiClient.parameterToString(codigoBairro));
		if (siglaExpediente != null)
			queryParams.put("siglaExpediente", apiClient.parameterToString(siglaExpediente));
		if (anoProcesso != null)
			queryParams.put("anoProcesso", apiClient.parameterToString(anoProcesso));
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
				return (List<ProtocoloResponse>) apiClient.deserialize(response, "array", ProtocoloResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Dados sobre um protocolo especifico.
	 * 
	 * @param clientId Token disponibilizado na criaÃ§Ã£o da APP.
	 * @param id Identificador do protocolo.
	 * @param fields ParÃ¢metro utilizado para pesquisar campos especÃ­ficos
	 * @param filters ParÃ¢metro utilizado para pesquisar valores de campos especÃ­ficos, por exemplo, para pesquisar um id de valor 123, passar o valor id:123
	 * @return ProtocoloResponse
	 */
	public ProtocoloResponse protocoloIdGet (String clientId, Long id, List<String> fields, List<String> filters) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'clientId' is set
		if (clientId == null) {
			throw new ApiException(400, "Missing the required parameter 'clientId' when calling protocoloIdGet");
		}
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException(400, "Missing the required parameter 'id' when calling protocoloIdGet");
		}
		

		// create path and map variables
		String path = "/protocolo/{id}".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

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
				return (ProtocoloResponse) apiClient.deserialize(response, "", ProtocoloResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
}
