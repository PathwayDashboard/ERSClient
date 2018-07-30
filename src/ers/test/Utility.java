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

import java.util.HashMap;
import java.util.Map;

import io.swagger.client.ApiException;

public class Utility {
	
	private static String APICI="\"";
	
	public static Map<String,String> createMap(String resp){
//		ipotizzato per risposte del tipo: 
//		"Message": "Invalid username/password"
		HashMap<String, String> result=new HashMap<String, String>();
		int last=resp.indexOf(APICI);
		int next=0;
		int size=resp.length();
		String key,value;
		if (last>0 && last<size){
				next=resp.indexOf(APICI, last+1);
				key=resp.substring(last+1, next);
				last=resp.indexOf(APICI,next+1);
				next=resp.indexOf(APICI, last+1);
				value=resp.substring(last+1,next);
				result.put(key, value);
		}
		return result;
	}
	
	public static String getMessage(ApiException e){
		Map<String, String> resp=createMap(e.getMessage());
//		String toPrint=resp.getOrDefault("Message", "No message available");
		
		String toPrint=resp.get("Message");
		if (toPrint==null)
			toPrint="Not possible to interact with HDMS";
		
		return toPrint;
	}
	

}
