package springboot.myfirstapplicationtest.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ual.des.cbutils.Couchbaseutil;

import com.couchbase.client.core.config.ConfigurationException;
import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.document.JsonDocument;
import com.couchbase.client.java.document.RawJsonDocument;
import org.apache.log4j.Logger; 

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;

@RestController
public class testcontroller {
	
	public static final String CB_URL = "http://localhost";
    public static final String UCD_BUCKET = "UFD";
    public static final String UCD_BUCKET_PASS = "ufd123";
    private static Logger logger = Logger.getLogger(Couchbaseutil.class);

	@RequestMapping("")

	public String home() {
		
		 Couchbaseutil.init(CB_URL);
	        Couchbaseutil.initBucket(UCD_BUCKET,UCD_BUCKET_PASS);

	        String jsonStr = "{\"testsprintFlt\": \"test springbootvalue\"}";
	        String key = "testspringboot";
	        int expirationInSecs = 100;
	     //   Bucket bucket = Couchbaseutil.getBucket(UCD_BUCKET);

	       // Couchbaseutil.deleteDoc(bucket, key);

	       // RawJsonDocument doc = Couchbaseutil.getDoc(bucket, key, true);
	      //  assertThat(doc, is(equalTo(null)));
	        

		System.out.println(" Log section with out context or /");
		
		
		
	return "Spring boot is working! great !!";

	}
	
	@RequestMapping("/test")

	public String home1() {

		System.out.println(" Log section with  context /text");
	return "Spring boot is test working! great !!";

	}

	}
