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
