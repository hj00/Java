package com.watson.visual_recognition;

import java.io.FileNotFoundException;

import com.ibm.watson.developer_cloud.visual_recognition.v3.VisualRecognition;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.ClassifyImagesOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.VisualClassification;

public class Visual_Recognition {
	public static void main(String[] args) throws FileNotFoundException {
		VisualRecognition service = new VisualRecognition(VisualRecognition.VERSION_DATE_2016_05_20);
		service.setApiKey("08dffc694368c011c87de5500fba4dcfd9859743");

		/*
		System.out.println("Classify an image");
		ClassifyOptions options = new ClassifyOptions.Builder()
		    .imagesFile(new File("C:/dev/img/d5598ad581ef4282f8f8276781bea001.jpg"))
		    .build();
		*/
		
		System.out.println("Classify an image");
		ClassifyImagesOptions options = new ClassifyImagesOptions.Builder()
				.url("https://ih0.redbubble.net/image.196445459.6126/flat,800x800,070,f.u1.jpg")
				.build();
		
		VisualClassification result = service.classify(options).execute();
		System.out.println(result);
	}

}
