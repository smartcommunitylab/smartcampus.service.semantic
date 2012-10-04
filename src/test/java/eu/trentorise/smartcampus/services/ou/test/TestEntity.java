package eu.trentorise.smartcampus.services.ou.test;

import it.unitn.disi.sweb.webapi.client.WebApiException;
import it.unitn.disi.sweb.webapi.client.smartcampus.SCWebApiClient;
import it.unitn.disi.sweb.webapi.model.entity.Attribute;

import java.util.List;
import java.util.Locale;

public class TestEntity {

	/**
	 * @param args
	 * @throws WebApiException
	 */
	public static void main(String[] args) throws WebApiException {
		SCWebApiClient client = SCWebApiClient.getInstance(Locale.ENGLISH,
				"213.21.154.85", 8080);

		List<Attribute> attrs = client.readEntity(6734L, null).getAttributes();
		for (Attribute attr : attrs) {
			System.out.println(attr);
		}

	}

}
