package com.yukiame.mathutil.main;

import com.yukiame.mathutil.core.MathUtility;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TEST CASE #1
        int n = 0;//ham y kiem tra 0!
        long expected = 1; //hàm ý rằng, hy vọng rằng n = 0! phải trả về 1
        long actual =  MathUtility.getFactorial(n); // tlhực tế là mấy, gọi hàm là biết ngày ngay
        //So sánh giữa expected == actual hay không 
        System.out.println("TEST CASE #1 " + n + "! -> expected " + expected + " | actual: " + actual);
        
        
        n =5;
       expected = 120;
       actual = MathUtility.getFactorial(n);
               System.out.println("TEST CASE #2 " + n + "! -> expected " + expected + " | actual: " + actual);

        
        
        
    }

}

//Dân DEV VIẾT RA CODE: HÀM, CLASS ĐỒNG THỜI PHẢI CÓ TRÁCH NHIỆM TEST CODE CỦA MÌNH 
//TEST CODE CỦA CHÍNH MÌNH LÀM RA
//LMAF SAO TEST CODE CỦA CHÍNH MÌNH
//CÓ 3 CÁCH 
//CÁCH 1: IN RA MÀN HÌNH KẾT QUẢ XỬ LÍ CỦA HÀM
//CÁCH 2: IN RA LOG FILE
// CÁCH  3: DÙNG ĐÒO CHƠI BÊN NGOÀII ĐEM VÀO - THƯ VIỆN ĐEM VÀO!!!!!!!
// NHƯNG DÙ LÀ KIỂM THỬ KIỂU GÌ THÌ CŨNG GỒM 3 CÔNG VIỆC
// THIẾT KẾ TEST CASE 
//THỰC THI TEST CASE - TEST RUN
///GHI BUG NẾU CÓ = LOG BUG
//TEST CASE LÀ: BỌO DATA ĐƯA VÀO APP ĐỂ XEM APP HÀNH XỬ ĐÚNG HÔNG
//                         KÈM THÊM EXPECTED VALUE ĐỂ XEM APP TRẢ VỀ GIỐNG HÔNG 
//                            KÈM THÊM HƯỚNG DẪN SỬ DỤNG APPP VỚI DATA ĐƯA VÀO
//                             KÈM THÊM TRANG THÁI CỦA TEST CASE: APP ĐÚNG HAY SAI
// CẤU TRÚC CỦA 1 TEST CASE NHƯ SAU
// DÙNG TRONG THTUCWJ TẾ ĐI LÀM, VÀ DÙNG TRONG BÀI THI PE)
//MỘT TEST CASE GỒM NHỮNG IFO SAU:
//TEST CASE ID| TEST CASE DESCRIPTION | STEPS/PROCEDURES
//EXPECTED RESULT | STATUS (PASSED | FAILED)
//Test case là tình huống xài appp với bọo data đưa vào và giá trị kì vọng app phải trải về
//Giờ ta mún test hàm getF() ta phải thiết kế các test case coi xem hàm trả về đúng không
//TEST CASE #1: VERIFY getFactorial (with n = 0) check 0! corect or not?
//      1.Give n = 0
//      2. Call/invoke getFactorial(n = 0)
//EXPCTED RESULT:
//                  The method must return 1 as the result òf 0!
//STATUS: PASSED | FALLED, just waiting the method returns value
//Đoán xem

//Câu 3 bài thi PE viết ra khoảng 10 cái test case như trên
