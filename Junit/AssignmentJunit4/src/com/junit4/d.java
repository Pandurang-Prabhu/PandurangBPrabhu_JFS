package com.junit4;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class DatabaseApplicationTest {
	DatabaseApplication dbApp ;
	@BeforeAll
	static void beforeAllinit(){
		System.out.println("Started the Database Server");
	}
	@BeforeEach
	void createInstance()
	{
		dbApp =  new DatabaseApplication();
		System.out.println("Database Instance Created");
	}
	@AfterEach
	void commitChanges()
	{
		System.out.println("Changes Commited");
	}
	@AfterAll
	static void turnoffServer(){
		System.out.println("Database Server has been closed");
	}


	@Nested
	class dbAppTests{
		@Test
		@DisplayName("Checking addData Method - Test1")
		void addTest()
		{
			dbApp.addData();
		}
		@Test
		@DisplayName("Checking fetchData Method - Test2")
		void fetchTest()
		{
			dbApp.fetchData();
		}
		@Test
		@DisplayName("Checking updateData Method - Test3")
		void updateTest()
		{
			dbApp.updateData();
		}
		@Test
		@DisplayName("Checking DeleteData Method - Test4")
		void deleteTest()
		{
			dbApp.deleteData();
		}
	}
}
