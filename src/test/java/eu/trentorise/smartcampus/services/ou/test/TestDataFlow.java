package eu.trentorise.smartcampus.services.ou.test;

import it.sayservice.platform.core.common.exception.ServiceException;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class TestDataFlow {

	public static void main(String[] args) throws ServiceException, ClassNotFoundException, MalformedURLException {
		URL[] urls = new URL[]{new File("tmp").toURI().toURL()};
		ClassLoader cl = new URLClassLoader(urls, Thread.currentThread().getContextClassLoader());
		System.err.println(cl.loadClass("eu.trentorise.smartcampus.services.semantic.data.message.Semantic$Data"));
//		DataFlowTestHelper helper = new DataFlowTestHelper();
//		Map<String, Object> out = helper.executeDataFlow(
//				"eu.trentorise.smartcampus.services.ou.OperaUniService", 
//				"GetLocations", 
//				new CreateEntityDataFlow(), 
//				new HashMap<String, Object>());
//		System.err.println(out);
	}
}
