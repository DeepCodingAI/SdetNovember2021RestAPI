package testApi;

import employee.resources.AllEmployeeResources;
import org.testng.annotations.Test;

public class TestAllEmployeeResources extends AllEmployeeResources {

    @Test
    public void testAllEmployee(){
        getAllEmployeeResources();
    }
}
