package bt2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HinhTronTest {
    @Test
    @DisplayName("Hinh tron mac dinh co ban kinh = 1")
    public void bankinhmacdinh(){
        HinhTron ht = new HinhTron();
        // Gia tri dung
        double expected = 1.0;
        // Gia tri thuc te
        double actual = ht.getBanKinh();
        Assertions.assertEquals(expected, actual);
    }


}