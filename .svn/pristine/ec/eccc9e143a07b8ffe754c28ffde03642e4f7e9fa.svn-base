package ers.test;

import java.util.Map;

import io.swagger.client.ApiException;
import io.swagger.client.api.CardiacRehabilitationProgrammeApi;
import io.swagger.client.api.PathwayhdmisessionApi;
import io.swagger.client.model.CardiacRehabilitationProgrammeSection;
import io.swagger.client.model.CreatePatientSessionData;
import io.swagger.client.model.GenericPostputResult;

public class ERSTest {

	public static void main(String[] args) {

//		System.setProperty("http.proxyHost", "localhost");
//		System.setProperty("http.proxyPort", "13128");

		try {
			PathwayhdmisessionApi loginapi = new PathwayhdmisessionApi();
			CreatePatientSessionData data=new CreatePatientSessionData();
			data.setUserName("1236");
			data.setPassword("1236");
			GenericPostputResult result=loginapi.pathwayHdmiSessionPostPatientSession(data);
			System.out.println(result);
			System.out.println(result.getResult());
			
			String xSessionId = result.getUid();
			
			CardiacRehabilitationProgrammeApi api=new CardiacRehabilitationProgrammeApi();
			System.out.println("Connecting to... "+api.getApiClient().getBasePath());
			
			CardiacRehabilitationProgrammeSection res=new CardiacRehabilitationProgrammeSection();
			res=api.cardiacRehabilitationProgrammeGetCRProgramme("1236", xSessionId);
			
			System.out.println(res);
		} catch (ApiException e) {
			String msg=e.getMessage();
			Map<String, String> resp=Utility.createMap(msg);
			String toPrint=resp.getOrDefault("Message", "ERROR: No message Available");
			System.out.println(toPrint);
//			e.printStackTrace();
		}

	}

}
