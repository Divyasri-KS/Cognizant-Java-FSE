package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        ExternalApi mockApi = mock(ExternalApi.class);  // Step 1: Create mock
        MyService service = new MyService(mockApi);     // Inject mock
        service.fetchData();                            // Step 2: Call method
        verify(mockApi).getData();                      // Step 3: Verify interaction
        System.out.println("Mocked method getData() was called!");

    }
}
