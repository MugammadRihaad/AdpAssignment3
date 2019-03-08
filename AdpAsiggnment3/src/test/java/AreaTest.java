import org.junit.*;

import static org.junit.Assert.*;

public class AreaTest {
private Area area;
    @Before
    public void setUp() throws Exception {
        area=new Area();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void areaEquality() {
        int result=area.area(2,6);
        //Test  Object Equality
        Assert.assertEquals(12,result);

    }

    @Test
    public void areaIdentity(){
        int result=area.area(2,6);
        //Testing  Object Identify
         Assert.assertSame(12,result);
    }

    @Test
    public void areaFailingTest(){
        int result=area.area(2,6);
        //Testing  Failing Test
        Assert.fail("This a a Fail Test ");
    }
    //Testing  Timeouts
    @Test(timeout = 1000)
    public void areaTimeout(){
        int result=area.area(2,6);

        Assert.assertEquals(12,result);
    }
    //Testing Disabling Test
    @Ignore
    @Test
    public void areaDisablingTest(){
        int result=area.area(2,6);

        Assert.assertEquals(12,result);
    }
}