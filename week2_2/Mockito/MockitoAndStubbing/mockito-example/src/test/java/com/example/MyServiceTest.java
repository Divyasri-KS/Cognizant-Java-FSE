package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Inject into service
        MyService service = new MyService(mockApi);

        // Call method and assert
        String result = service.fetchData();
         System.out.println("Mocked result: " + result);

        assertEquals("Mock Data", result);
    }
}
