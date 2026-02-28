# KẾ HOẠCH KIỂM THỬ (TEST PLAN)

## 1. Giới thiệu (Introduction)
Tài liệu này xác định các mục tiêu, phạm vi, chiến lược và tài nguyên cần thiết cho việc kiểm thử hệ thống Website E-Commerce giả lập. 
Mục đích là đảm bảo các module chính như Xác thực người dùng (Auth), Sản phẩm & Giỏ hàng (Product & Cart), Thanh toán (Checkout) hoạt động đúng theo yêu cầu (R1 - R16), nhằm mang đến một sản phẩm ổn định, chất lượng cao trước khi phát hành.

## 2. Phạm vi kiểm thử (Scope)
**Trong phạm vi (In-scope):**
- **Module 1 – Authentication (Xác thực):** Đăng ký tài khoản, đăng nhập, quên mật khẩu, đăng xuất.
- **Module 2 – Product & Cart (Sản phẩm & Giỏ hàng):** Tìm kiếm sản phẩm, lọc theo giá/danh mục, xem chi tiết, thêm sản phẩm vào giỏ, cập nhật số lượng, xóa sản phẩm khỏi giỏ.
- **Module 3 – Checkout (Thanh toán):** Nhập địa chỉ giao hàng, lựa chọn phương thức thanh toán (COD / Visa giả lập), đặt hàng, lưu & xem lịch sử đơn hàng.

**Ngoài phạm vi (Out-of-scope):**
- Kiểm thử hiệu năng (Performance Testing)
- Kiểm thử tự động hóa (Automation Testing)
- Kiểm thử khả năng chịu tải (Load Testing), Kiểm thử bảo mật chuyên sâu.

## 3. Phương pháp kiểm thử (Test Approach)
- **Kiểm thử chức năng (Functional testing):** Kiểm tra các yêu cầu kinh doanh, logic nghiệp vụ (Happy flows, Alternate flows, Error flows).
- **Kiểm thử giao diện cơ bản (UI testing – basic):** Xác nhận UI hiển thị đúng chuẩn, input form và thông báo lỗi hiển thị rõ ràng.
- **Kiểm thử hồi quy (Regression – smoke):** Đảm bảo việc sửa các lỗi không làm ảnh hưởng tính năng khác.

## 4. Môi trường kiểm thử (Test Environment)
- **Thiết bị:** PC/Laptop cá nhân
- **Trình duyệt:** Google Chrome (phiên bản mới nhất)
- **Hệ điều hành:** Windows 10/11
- **Dữ liệu test:** Tài khoản giả lập đã được chuẩn bị sẵn (hợp lệ và không hợp lệ, thông tin thanh toán giả).

## 5. Điều kiện vào / ra (Entry / Exit Criteria)
**Điều kiện vào (Entry Criteria):**
- Môi trường test sẵn sàng. Tài liệu cấu trúc R1-R16 đầy đủ.
- Kế hoạch kiểm thử và Bộ Test Case đã hoàn thành và được duyệt.
**Điều kiện ra (Exit Criteria):**
- Đã thực thi 100% các Test Case trong kế hoạch (45+ TCs).
- Không có lỗi mức độ Critical hoặc Major chưa giải quyết.
- Tỷ lệ Pass của Test Case đạt >= 95%.

## 6. Rủi ro & biện pháp giảm thiểu (Risks & Mitigation)
| Rủi ro | Mức độ | Biện pháp giảm thiểu |
| ------ | ------ | -------------------- |
| **Yêu cầu thay đổi** trong lúc test | Cao | Cập nhật lại Test Case và RTM ngay khi có thay đổi. |
| **Trễ tiến độ do có nhiều lỗi** | Trung bình | Ưu tiên kiểm thử các luồng chính trước, thực hiện báo lỗi hằng ngày để fix ngay. |
| **Môi trường test bị gián đoạn** | Thấp | Báo cáo Ops/Dev khôi phục, tận dụng thời gian review lại Test case/Bug. |

## 7. Vai trò & trách nhiệm (Roles & Responsibilities)
- **QA Lead:** Lập kế hoạch, theo dõi tiến độ, viết Test Report, ra quyết định Release.
- **Manual QA:** Viết Test Case, tạo RTM, thực thi kiểm thử và báo cáo lỗi (Bug Report).

## 8. Lịch trình kiểm thử (Test Schedule)
- **Giai đoạn 1:** Phân tích test basis & lập Kế hoạch (Test Plan).
- **Giai đoạn 2:** Thiết kế Test Cases và RTM.
- **Giai đoạn 3:** Thực thi kiểm thử (Execution) và ghi nhận Bug.
- **Giai đoạn 4:** Kiểm thử hồi quy và Viết Báo cáo tổng kết (Test metrics & report).
