# CA KIỂM THỬ (TEST CASES)

| TC_ID | Req | Tiêu đề (Title) | Điều kiện trước (Precondition) | Các bước thực hiện (Steps) | Kết quả mong đợi (Expected Result) | Mức độ ưu tiên | Loại test |
|---|---|---|---|---|---|---|---|
| TC_AUTH_001 | R1 | Đăng ký tải khoản hợp lệ | Chưa có tài khoản | 1. Vào /register<br>2. Nhập email/MK hợp lệ<br>3. Click | Đăng ký thành công | High | Positive |
| TC_AUTH_002 | R1 | Kiểm tra đăng ký email đã tồn tại | Đã có tài khoản | 1. Nhập email trùng lặp<br>2. Click Đăng ký | Hiện lỗi: Email đã dùng | Medium | Negative |
| TC_AUTH_003 | R2 | Đăng ký email thiếu @ (Negative) | Chưa có tài khoản | 1. Nhập 'usergmail.com' | Lỗi: Email sai định dạng | High | Negative |
| TC_AUTH_004 | R2 | Đăng ký email thiếu domain | Chưa có tài khoản | 1. Nhập 'user@' | Lỗi: Email sai định dạng | High | Negative |
| TC_AUTH_005 | R2 | Kiểm tra XSS Injection trong email (Security) | Chưa có tài khoản | 1. Nhập email script tag | Hệ thống chặn | High | Security |
| TC_AUTH_006 | R3 | Mật khẩu đúng 8 ký tự (Boundary) | Chưa có tài khoản | 1. Nhập pass '12345678' | Đăng ký thành công | High | Boundary |
| TC_AUTH_007 | R3 | Mật khẩu 7 ký tự (Boundary) | Chưa có tài khoản | 1. Nhập pass '1234567' | Lỗi: MK tối thiểu 8 ký tự | High | Boundary |
| TC_AUTH_008 | R3 | Mật khẩu trống (Negative) | Chưa có tài khoản | 1. Để trống pass | Lỗi: pass is required | High | Negative |
| TC_AUTH_009 | R4 | Đăng nhập hợp lệ | Tài khoản có sẵn | 1. Nhập email/pass đúng | Đăng nhập thành công | Critical | Positive |
| TC_AUTH_010 | R4 | Kiểm tra phiên tải lại trang | Đã đăng nhập | 1. Reload trang | Vẫn duy trì trạng thái | Medium | Positive |
| TC_AUTH_011 | R5 | Đăng nhập sai mật khẩu (Negative) | Có tài khoản | 1. Nhập sai pass | Cảnh báo: Sai mật khẩu | High | Negative |
| TC_AUTH_012 | R5 | Sai mật khẩu nhiều lần (Security) | Có tài khoản | 1. Nhập sai 5 lần | Khoá tạm thời | Medium | Security |
| TC_AUTH_013 | R6 | Quên MK gửi email | Có tài khoản | 1. Nhập mail quên MK | Báo đã gửi thư | High | Positive |
| TC_AUTH_014 | R6 | Quên MK với email ảo (Negative) | User ảo | 1. Nhập mail ảo | Báo lỗi email không tồn tại | Medium | Negative |
| TC_AUTH_015 | R4 | Đăng xuất thành công | Đang đăng nhập | 1. Click Đăng xuất | Xóa session, đăng xuất an toàn | High | Positive |
| TC_CART_016 | R7 | Tìm kiếm có kết quả | Có DB | 1. Nhập 'Laptop' | Hiển thị Laptop | High | Positive |
| TC_CART_017 | R7 | Tìm kiếm không kết quả | Có DB | 1. Nhập 'Kkkk' | Báo không tìm thấy | Medium | Positive |
| TC_CART_018 | R7 | SQL injection Search (Security) | Có DB | 1. Nhập ' OR 1=1 -- | Chặn | High | Security |
| TC_CART_019 | R7 | Từ khóa trống | Có DB | 1. Để trống Search | Báo nhập từ khoá | Medium | Negative |
| TC_CART_020 | R7 | Ký hiệu đặc biệt | Có DB | 1. Tìm '#1' | Kết quả đúng | Low | Positive |
| TC_CART_021 | R8 | Lọc giá trong khoảng | Có SP | 1. Lọc 1-5tr | Hiện đúng | High | Positive |
| TC_CART_022 | R8 | Min > Max (Validation) | Có SP | 1. Min 5tr, Max 1tr | Lỗi | Medium | Validation |
| TC_CART_023 | R8 | Giá min = 0 (Boundary) | Có SP | 1. Lọc min = 0 | Hiện đúng | Medium | Boundary |
| TC_CART_024 | R8 | Lọc danh mục | Có SP | 1. Chọn Điện thoại | Hiện đ.thoại | High | Positive |
| TC_CART_025 | R8 | Giá âm (Negative) | Có SP | 1. Nhập -100 | Báo lỗi | Medium | Negative |
| TC_CART_026 | R9 | Xem chi tiết | Có SP | 1. Click SP | Xem ảnh, thông tin | Critical | Positive |
| TC_CART_027 | R9 | Xem SP hết hàng | Hết SP | 1. Click SP hết | Hiện Hết hàng | High | Positive |
| TC_CART_028 | R10 | Thêm vào giỏ trống | Giỏ rỗng | 1. Add to cart | Thêm tc | Critical | Positive |
| TC_CART_029 | R10 | Thêm cùng SP nhiều lần | Giỏ có SP | 1. Add to cart 1 sp | Tăng Qty | High | Positive |
| TC_CART_030 | R10 | Thêm SP chua login | Chưa login | 1. Add | Lưu local hoặc bảo Login | Medium | Positive |
| TC_CART_031 | R11 | Tăng SL (+) | Giỏ có SP | 1. Bấm (+) | Qty = 2 | High | Positive |
| TC_CART_032 | R11 | Nhập trực tiếp Qty = 99 (Boundary) | Giỏ có SP | 1. Nhập 99 | Cập nhật giá | Medium | Boundary |
| TC_CART_033 | R11 | Nhập Qty = 0 (Boundary) | Giỏ có SP | 1. Nhập 0 | Báo Lỗi/XOá SP | High | Boundary |
| TC_CART_034 | R11 | Nhập ký tự chữ vào Qty | Giỏ có SP | 1. Nhập 'abc' | Chặn / Báo lỗi | Medium | Negative |
| TC_CART_035 | R12 | Xoá sp khỏi giỏ | Giỏ có SP | 1. Xoá SP | Giỏ rỗng | High | Positive |
| TC_CHK_036 | R13 | Checkout không địa chỉ | Giỏ có item | 1. Bỏ trống đ.chỉ | Lỗi: Bắt buộc đ.chỉ | High | Negative |
| TC_CHK_037 | R13 | Checkout địa chỉ hợp lệ | Giỏ có item | 1. Nhập 'HCM' | Cho qua Pay | High | Positive |
| TC_CHK_038 | R14 | Thanh toán COD | Có Đ.chỉ | 1. Chọn COD | Tạo đơn Pending | High | Positive |
| TC_CHK_039 | R14 | Visa giả lập | Có Đ.chỉ | 1. Nhập thẻ Visa giả | Tạo đơn Paid | High | Positive |
| TC_CHK_040 | R14 | Visa lỗi giả lập | Có Đ.chỉ | 1. Nhập mã Visa fail | Trả về giao dịch trượt | High | Negative |
| TC_CHK_041 | R15 | Tổng đơn hàng (Total Price) | Có item | 1. Total = A + B | Check total 150 | Critical | Positive |
| TC_CHK_042 | R15 | Clear giỏ hàng sau order | Có đơn hàng | 1. Vào lại cart sau order | Giỏ rỗng | High | Positive |
| TC_CHK_043 | R16 | Lịch sử mua hàng hiển thị order | Có đơn X | 1. Vào History | Thấy đơn X | High | Positive |
| TC_CHK_044 | R16 | Xem CT đơn | Có đơn XY | 1. Click CT Đơn | Đúng các item purchase | Medium | Positive |
| TC_CHK_045 | R16 | History khi chưa có đơn mua | Chưa mua gì | 1. Vào History | Báo Bạn chưa có đơn nào | Low | Positive |
