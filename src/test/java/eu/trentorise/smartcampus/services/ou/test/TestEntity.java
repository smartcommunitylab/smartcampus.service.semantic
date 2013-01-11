/*******************************************************************************
 * Copyright 2012-2013 Trento RISE
 * 
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 * 
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 ******************************************************************************/
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
