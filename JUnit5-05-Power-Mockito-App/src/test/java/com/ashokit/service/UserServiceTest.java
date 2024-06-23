package com.ashokit.service;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Any;
import org.powermock.api.mockito.PowerMockito;

import com.ashokit.dao.UserDao;
import com.ashokit.dao.UserDaoImpl;
import static org.junit.Assert.*;


public class UserServiceTest {
	
	@Test
	public void testGetNameByUserId() {
		UserDaoImpl mockDao =  PowerMockito.mock(UserDaoImpl.class);
		
		PowerMockito.when(mockDao.findNameById(101)).thenReturn("Nick");
		// To Call Real DAO method
//		PowerMockito.when(mockDao.findNameById(102)).thenCallRealMethod();
		
		UserService service = new UserService(mockDao);
		String name = service.getNameByUserId(101);
		
//		System.out.println("getNameByUserIdTest Method Call");
		System.out.println(name);
		assertEquals("Nick",name);
		
	}
//	
//	
//	
	@Test
	public void testGetEmailByUserId() {
		UserDaoImpl mockDao =  PowerMockito.mock(UserDaoImpl.class);
		
		PowerMockito.when(mockDao.findEmailById(101)).thenReturn("nick.green@gmail.com");
		
		
		UserService service =  new UserService(mockDao);
		String mail = service.getEmailByUserId(101);
		System.out.println(mail);
		assertEquals("nick.green@gmail.com",mail);
	}
	
	// Private Method Unit Testing
	@Test // To run below Mocking private method - Added '--add-opens java.base/java.lang=ALL-UNNAMED' in VM 
	public void testDoWorkWithPrivateMethodMock() throws Exception{
		
		UserService service =  new UserService();
		UserService spy =  PowerMockito.spy(service);
		PowerMockito.doReturn("TEST MSG").when(spy,"formatMsg","test msg");
		String formattedMsg = service.doWork("test msg");
		System.out.println(formattedMsg);
		assertEquals("TEST MSG",formattedMsg);
	}
	
	// Method With return type void
	@Test
	public void testDoProcess() {
		UserService mockService = PowerMockito.mock(UserService.class);
		
		try {
			PowerMockito.doNothing().when(mockService,"pushMsgToKafkaTopic",toString());
//			PowerMockito.doNothing().when(mockService,"pushMsgToKafkaTopic",anyString());
			mockService.doProcess();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
