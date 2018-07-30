/*******************************************************************************
 * Copyright 2018 Engineering Ing. Inf. S.p.A.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
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
