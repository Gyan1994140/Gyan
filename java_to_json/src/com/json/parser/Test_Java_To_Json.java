package com.json.parser;

public class Test_Java_To_Json {
 public static void main(String[] args) {
	Student s = new Student("Anshu","mahadevpura",134);
	JsonParser parser = new JsonParser();
	parser.marshalling(s);
	System.out.println("pass");
  }
}
