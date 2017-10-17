package com.watson.pilot.nlu;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.NaturalLanguageUnderstanding;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalysisResults;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalyzeOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.ConceptsOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.Features;

public class NLUExample {
	private static String username = "d164188f-41e4-4109-9da9-40e7cd87c1c5";
	private static String password = "o348NXleBlfY";
	private static String url = "https://tensorflow.blog/5-%ED%85%90%EC%84%9C%ED%94%8C%EB%A1%9C%EC%9A%B0-%EB%8B%A4%EC%A4%91-%EB%A0%88%EC%9D%B4%EC%96%B4-%EB%89%B4%EB%9F%B4-%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC-first-contact-with-tensorflow/";
	
	public static void main(String[] args) {
		NaturalLanguageUnderstanding service = 
				new NaturalLanguageUnderstanding(NaturalLanguageUnderstanding.VERSION_DATE_2017_02_27);
		service.setUsernameAndPassword(username, password);
		
		ConceptsOptions concepts = new ConceptsOptions.Builder().limit(20).build();
		Features features = new Features.Builder().concepts(concepts).build();
		AnalyzeOptions parameters = 
				new AnalyzeOptions.Builder().url(url).features(features).build();
		AnalysisResults response = service.analyze(parameters).execute();
		System.out.println(response);
		
	}

}
