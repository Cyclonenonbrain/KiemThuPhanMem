# BÁO CÁO KIỂM THỬ (TEST REPORT)

## 1. Tổng quan kiểm thử
- **Dự án:**  Website E-commerce giả lập
- **Thời gian thực hiện:** Giả lập 1 tuần
- **Các Module đã test:**  Authentication, Product & Cart, Checkout.
- **Tổng số TC thiết kế:** 45 TCs
- **Số TC thực thi:** 45 TCs

## 2. Kết quả thực thi (Test Execution Summary)
- **Tổng số TC thực thi:** 45
- **Pass:** 35 TCs (77.8%)
- **Fail:** 10 TCs (22.2%)
- **Blocked:** 0 TC (0%)

**Tỷ lệ thực thi (Execution rate):** 100%

## 3. Tình hình Lỗi (Bug Summary)
Tổng số bugs được phát hiện và log lên hệ thống: **10 Bugs**.
Phân loại theo Mức độ nghiêm trọng (Severity):
- **Critical:** 2 bugs
- **Major:** 4 bugs
- **Minor:** 4 bugs

**Top 5 lỗi nghiêm trọng nhất:**
1. **[BUG_CART_002] Tự do nhập số âm vào giỏ hàng làm tổng tiền bị âm (Critical)** - Ảnh hưởng nghiêm trọng hệ thống tài chính/thanh toán.
2. **[BUG_CHK_005] Crash trang 500 khi dùng thẻ visa lỗi (Critical)** - Gây gián đoạn hành trình mua sắm của khách.
3. **[BUG_CHK_004] Giỏ hàng không được clear sau khi thanh toán thành công (Major)** - Làm sai lệch đơn.
4. **[BUG_AUTH_001] Lỗi đăng nhập bị đứng im không báo lỗi (Major)** - Không thân thiện UX.
5. **[BUG_CART_003] Tổng giỏ hàng tính thiếu VAT (Major)**.

## 4. Nhận xét chất lượng hệ thống
- **Lõi nghiệp vụ Thanh toán & Giỏ hàng** chịu nhiều lỗi logic Boundary và Data Validation (như số âm). Lỗi trắng trang (500 Error server) cần được xử lý Exception handling.
- Giao diện UI đa phần khá ổn ngoại trừ xem trên Mobile.
- Các Bug Minor về sai chính tả, lỗi CSS nhỏ không đáng kể.

## 5. Quyết định Phát hành (Release Decision)
**Quyết định: KHÔNG CHO PHÉP RELEASE (NO-RELEASE)** ❌

**Lý do:**
1. Tỷ lệ Pass chưa đạt chuẩn 95% đầu ra như Kế hoạch test yêu cầu (Hiện chỉ 77.8% pass).
2. Tồn đọng lỗi Critical và Major liên quan tới luồng mua hàng và hệ thống tiền tệ. 
Hệ thống chỉ nên được xem xét Release khi toàn bộ các lỗi High Priority này được Dev xử lý xong.
