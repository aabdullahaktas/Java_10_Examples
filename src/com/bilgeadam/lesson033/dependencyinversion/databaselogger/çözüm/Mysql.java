package com.bilgeadam.lesson033.dependencyinversion.databaselogger.çözüm;

public class Mysql implements ILogger {

	@Override
	public void log(String ex) {
		System.out.println(ex + " ---> mysqle loglandı");

	}

}
