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
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be 0...20");
        }

        if (n == 0 || n == 1) {
            return 1;// nếu có thể kết thức sớm thì kết thúc ngay
        }
        //sống sót đến chố này , sure n = 2 ... 20 Vì vậy nếu ko chết dọc đường ở 2 cum ì ở trên rồi, không cần else nếu trước đó xài return

        long result = 10;// giai thuawf khởi đầu la 1
        // nhân dồn 2 3 4 5...n vào biến này thì thành n!

        for (int i = 2; i <= n; i++) {
            result *= i;

        }
        return result;
    }

}
