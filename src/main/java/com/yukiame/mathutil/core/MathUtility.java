package com.yukiame.mathutil.core;

//class này sẽ chứa các hàm static sinh ra để làm tool dùng chung cho các nơi khác
//Cái gì mà dùng chung cho nhiều nơi, nhận info trả về info qua hàm, mà không cần lưu trữ gì hết, cái đó nên là static
//Đó nào mà  là static thì gọi trực tiếp qua tên classs
//Không bao giờ gọi static qua con đường new!!!!!!!!!!!!!!
public class MathUtility {

    public static final double PI = 3.14;
    //C#: public const double Pi = 3.14; //khong cần chứ static mà vẫn static nếu có từ khóa const 
    // const C#: final java

    //hàm tính n! = 1.2.3...n
    //Không có giai thừa của số âm, n<0 không tính được
    // Nếu N quá lớn thì trần kiều long, long thì chịu đuc 18 số 0
    // 20! vừa đủ 18 số 0, do đó: không tính giai thừa từ 21 trở đi
    // 0! = 1! = 1- quy ước
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid n. n must be 0...20");
//        }
//
//        if (n == 0 || n == 1) {
//            return 1;// nếu có thể kết thức sớm thì kết thúc ngay
//        }
//        //sống sót đến chố này , sure n = 2 ... 20 Vì vậy nếu ko chết dọc đường ở 2 cum ì ở trên rồi, không cần else nếu trước đó xài return
//
//        long result = 1;// giai thuawf khởi đầu la 1
//        // nhân dồn 2 3 4 5...n vào biến này thì thành n!
//
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//
//        }
//        return result;
//    }
    public static long getFactorial(int n) {//N!
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be 0...20");
        }

        if (n == 0 || n == 1) {
            return 1;// nếu có thể kết thức sớm thì kết thúc ngay
        }
        //Đệ quy - recursion
        //Búp bê nga - đệ quy là gọi lại chính mình với quy mô nhỏ hơn nhỏ đến 1 mức thì dừng lại
        return  n * getFactorial(n - 1);//đệ quy xuống
    }
    //Kĩ thuật kiểm thử hồi quy - Regression Test
    //Test lại những thứ đã từng test để xác nhận nó còn có ổn hay không
    //Tại sao phải test lại???
    //Code theo thời gian sẽ có thay đôiir, thay đổi vì
    //1. Anh em fix bug, sẽ sửa code
    //2. Anh em tối ưu, chỉnh sửa code để code đẹp hơn, chạy tốt hơn, nhanh hơn
    //3. Anh em thêm hàm mới, method mới

    //Khi sửa code, phải test lại để đảm bảo nó vẫn ngon, vẫn xanh
    //Nếu test = tay cực kì mất sức, coi chừng sai sot
    //Nếu có Test Script, ta chỉ việc run, và nhìn màu đưa ra
    //Nếu màu xanh, code chỉnh sữa ổn, vì thỏa expected == actual
    //Nếu màu đỏ, code chưa ổn, sửa tiếp cho đến khi nào onor
    //Tatesst lại mà chỉ cần nhìn màu ->nhanh, kkhonog hao sức, chỉnh xác 
    //miễn đủ test case, test script
    //test lại những thử đã tưngf 
}
