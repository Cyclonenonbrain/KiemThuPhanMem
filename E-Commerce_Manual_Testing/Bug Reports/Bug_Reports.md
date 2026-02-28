# BÁO CÁO LỖI (BUG REPORTS)

| Bug ID | Tóm tắt (Summary) | Các bước tái hiện (Steps) | Kết quả mong đợi (Expected) | Kết quả thực tế (Actual) | Mức độ nghiêm trọng (Severity) | Độ ưu tiên (Priority) | Môi trường |
|---|---|---|---|---|---|---|---|
| BUG_AUTH_001 | Đăng nhập lỗi nhưng không hiện cảnh báo nào | 1. Vào đăng nhập<br>2. Nhập sai MK<br>3. Bấm Đăng nhập | Hiển thị lỗi 'Sai MK' | Không hiện lỗi gì, màn hình đứng yên | Major | High | Chrome / Win 10 |
| BUG_CART_002 | Nhập dấu trừ (số âm) vào ô số lượng vẫn được hệ thống chấp nhận | 1. Vào Giỏ hàng<br>2. Nhập -2 ô Qty | Hệ thống báo lỗi Không nhận số âm | Hệ thống cập nhật tổng tiền thành số âm!! | Critical | High | Edge / Win 11 |
| BUG_CART_003 | Tổng tiền giỏ hàng hiển thị sai khi áp dụng filter | 1. Lọc sản phẩm<br>2. Bấm Add<br>3. Check Total | Tổng = Giá SP x SL | Thiếu VAT | Major | Medium | Chrome / MacOS |
| BUG_CHK_004 | Đặt hàng thành công nhưng giỏ hàng vẫn còn nguyên sản phẩm | 1. Đặt hàng với COD<br>2. Back lại cart | Giỏ hàng phải trống (qty=0) | Giỏ hàng vẫn giữ nguyên các SP vừa mua | Major | High | Chrome / Win 10 |
| BUG_CHK_005 | Crash màn hình trắng khi thanh toán bằng thẻ Visa hết hạn | 1. Chọn Visa<br>2. Quẹt thẻ lỗi<br>3. Pay | Hiển thị popup Thẻ lỗi | Màn hình crash (500 Error) | Critical | High | Chrome / Win 10 |
| BUG_CART_006 | Nút Xóa Item giỏ hàng không click được trên mobile | 1. Thu nhỏ trình duyệt<br>2. Click nút Xóa | Click xoá OK | Bị đè layout, click ko đc | Major | Medium | Mobile |
| BUG_AUTH_007 | Title popup Quên MK sai font-weight | 1. Bấm quên MK | Title hiển thị đậm | Title bị in thường | Minor | Low | Chrome |
| BUG_CART_008 | Mô tả SP bị tràn khuông | 1. SP có đoạn mô tả dài | Có scrollbar | Chữ tràn HTML element bên ngoài | Minor | Low | Firefox |
| BUG_CHK_009 | Chữ Placeholder trong ô Địa chỉ sai chính tả | 1. Vào Checkout | Nhập địa chỉ của bạn | Nhập đại chỉ của bặn | Minor | Low | All |
| BUG_AUTH_010 | Loading lúc Signup lag | 1. Submit Signup | Load nhanh | Lag xoay vòng | Minor | Low | Chrome |
