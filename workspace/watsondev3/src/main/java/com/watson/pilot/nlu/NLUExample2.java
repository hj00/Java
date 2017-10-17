package com.watson.pilot.nlu;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.NaturalLanguageUnderstanding;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalysisResults;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalyzeOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.ConceptsOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.Features;

public class NLUExample2 {
	private static String username = "d164188f-41e4-4109-9da9-40e7cd87c1c5";
	private static String password = "o348NXleBlfY";
	private static String text = "One of the most disturbing proposals is putting an end to cost sharing reduction (CSR) payments that help low-income Americans pay for health insurance. " + 
								"Health insurers and hospitals have long pleaded the President to maintain the subsidies so that health insurers can function on the exchanges. " + 
								"Without these subsidies it would be uneconomical for insurers to sell policies on exchanges.";
	
	public static void main(String[] args) {
		NaturalLanguageUnderstanding service = 
				new NaturalLanguageUnderstanding(NaturalLanguageUnderstanding.VERSION_DATE_2017_02_27);
		service.setUsernameAndPassword(username, password);
		
		ConceptsOptions concepts = new ConceptsOptions.Builder().limit(20).build();
		Features features = new Features.Builder().concepts(concepts).build();
		AnalyzeOptions parameters = 
				new AnalyzeOptions.Builder().text(text).features(features).build();
		AnalysisResults response = service.analyze(parameters).execute();
		System.out.println(response);
		
	}

}
