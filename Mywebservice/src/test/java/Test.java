import javax.xml.namespace.QName;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;


public class Test {
     public static void main(String[] args) throws Exception {
		JaxWsDynamicClientFactory dcf=JaxWsDynamicClientFactory.newInstance();
		Client client=dcf.createClient("http://localhost:8181/Mywebservice/cxf/UserService?wsdl");
		
		QName name= new QName("http://webservice.swd/com","getUerName");
		
		String xmlStr="333";
		Object[] objects=client.invoke(name,xmlStr);
		
		System.out.println(objects[0].toString());
	}
}
