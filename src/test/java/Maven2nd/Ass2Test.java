package Maven2nd;

import org.junit.*;

import static org.junit.Assert.*;

public class Ass2Test {

    Ass2 ass2=new Ass2();


     @Before
    public void setUp() throws Exception {
    }

    @Test
    public void Emile() {
        String liz=ass2.Emile();
        Assert.assertEquals(liz,"Lubangi");
    }

    @Test
    public void ObjectIdentity()
    {

    }

    @Test
    public void FailingTest()
    {
        String name ="Emile";
        System.out.println(name);
        assertEquals("Emile","Lubangi");

    }

    @Test(timeout = 1000)
    public void Timeout()
    {
        String score  = "2";
        System.out.println(score);
        assertEquals("score","2","2");
        while (true);

    }

    @Test
    @Ignore
    public void Disabling()
    {

    }



}