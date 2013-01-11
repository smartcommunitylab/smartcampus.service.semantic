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

import it.sayservice.platform.core.common.exception.ServiceException;
import it.sayservice.platform.servicebus.test.DataFlowTestHelper;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import eu.trentorise.smartcampus.services.semantic.data.message.Semantic.Data;
import eu.trentorise.smartcampus.services.semantic.impl.CreateEntityDataFlow;

public class TestDataFlow {

	public static void main(String[] args) throws ServiceException,
			ClassNotFoundException, MalformedURLException {
		// URL[] urls = new URL[]{new File("tmp").toURI().toURL()};
		// ClassLoader cl = new URLClassLoader(urls,
		// Thread.currentThread().getContextClassLoader());
		// System.err.println(cl.loadClass("eu.trentorise.smartcampus.services.semantic.data.message.Semantic$Data"));
		DataFlowTestHelper helper = new DataFlowTestHelper();

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("actorId", 37L);
		Data data = Data.newBuilder().setName("test evento Università")
				.setType("event").build();

		params.put("data", data);

		Map<String, Object> out = helper.executeDataFlow(
				"eu.trentorise.smartcampus.services.semantic.SemanticService",
				"CreateEntity", new CreateEntityDataFlow(), params);
		System.err.println(out);
	}
}
