package com.test.selenium.scripts;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.apache.log4j.Logger;
import org.json.JSONException;

import com.test.selenium.testscript.TestDriver;

public class Pega_TestDriver {

	public static Logger APP_LOGS;

	public static void main(String[] args) throws NoSuchMethodException,
			IllegalAccessException, InvocationTargetException, IOException,
			NumberFormatException, InterruptedException, JSONException {
		Keywords kw = new Keywords();

			TestDriver ts = new TestDriver(kw,"C://workspace//SeleniumAutomation_v1.0//src//com//test//selenium//config//config.properties");
		
		ts.start();

		
	}
}
