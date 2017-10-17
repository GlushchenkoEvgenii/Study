package HW6;

import HW6.DBExeption;
import HW6.HomeWork6;

public class HomeWork6Impl implements HomeWork6 {

    @Override
    public int getNumber() {
        try {
            throw  new DBExeption();
        } catch (DBExeption dbExeption) {
            dbExeption.printStackTrace();
        }
        return 0;
    }

    @Override
    public void TestMethod1() throws RuntimeException {
        throw new RuntimeException();

    }
}
