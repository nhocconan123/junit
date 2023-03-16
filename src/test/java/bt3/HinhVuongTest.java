package bt3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HinhVuongTest {
    @Test
    @DisplayName("hinh vuong mac dinh co chu vi la")
    void testcase1(){
        HinhVuong hv=new HinhVuong();
        double expected =4;
        double actual=hv.chuVi();
        Assertions.assertEquals(expected,actual);
    }
    void testcase2(){
        HinhVuong hv=new HinhVuong();
        double expected =4;
        double actual=hv.dienTich();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    @DisplayName("hinh vuong mac dinh co chu vi la:")
    void testcase3(){
        HinhVuong hv=new HinhVuong(1.234);
        double expected =4.94;
        double actual=hv.chuVi();
        Assertions.assertEquals(expected,actual);
    }
}