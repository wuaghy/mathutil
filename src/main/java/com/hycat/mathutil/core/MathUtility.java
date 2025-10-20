package com.hycat.mathutil.core;

public class MathUtility {
    //class này chứa các hàm tiện ích dùng cho mọi nơi
    // có nghĩ là k lưu lại kết quả xử lý của nó bên trong, vậy nó sẽ đc thiết kế là static method
    // hàm tính n! = 1.2.3.....n; trong đó n phải >0
    // quy ước 0!= 1, 1! = 1, ....
    //20! vừa đủ kiểu long, 18 con số 0; 21! long chứa k nổi
    // k có âm giai thừa
    // bài này chỉ chứa 0-20, ngoài vùng này là k hợp lệ
    // 0...20 -> valid boundary validated boundary - vùng giá trị hợp lệ
    //0,20 -> boundary value - biên giới của tập giá trị
    //        xích thêm 1 xíu là vượt biên k tính đc
    // viết hàm theo phong cách đệ quy
    public static long getFactorial(int n){
        if(n<0 || n>20){
            throw new IllegalArgumentException("n must be between 0 and 20");
        }
        if(n==0 || n==1){return 1;}
        return n*getFactorial(n-1);

    }
}
