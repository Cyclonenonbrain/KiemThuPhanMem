# CHỈ SỐ KIỂM THỬ (TEST METRICS)

Để đo lường hiệu quả hoạt động kiểm thử trên phân hệ e-commerce giả lập, chúng ta áp dụng 4 nhóm chỉ số cơ bản. Dưới đây là kết quả phân tích:

## 1. Tỷ lệ thực thi test (Test Execution Rate)
- **Công thức:** `(Số lượng TC đã test / Tổng số TC đã lên kế hoạch) * 100`
- **Chỉ số ghi nhận:** `(45 / 45) * 100 = 100%`
- **Đánh giá:** QA đã thực hiện chạy toàn bộ tất cả kịch bản đã đề ra. Tuy nhiên pass rate chỉ đạt `35/45 = 77.8%`.

## 2. Mật độ lỗi theo module (Defect Density per module)
- **Module Auth:** 2 bugs / 15 TCs `(~0.13 bug/TC)`
- **Module Cart & Product:** 5 bugs / 20 TCs `(~0.25 bug/TC)`
- **Module Checkout:** 3 bugs / 10 TCs `(~0.30 bug/TC)`
- **Đánh giá:** Module Thanh Toán (Checkout) và Giỏ hàng (Cart) có mật độ lỗi tương đối cao. Cần tập trung Review Code và Unit Test kỹ hơn.

## 3. Phân bố mức độ nghiêm trọng (Severity Distribution)
Phân tích 10 bugs được ghi nhận:
- **Critical:** 2 (Chiếm 20%)
- **Major:** 4 (Chiếm 40%)
- **Minor:** 4 (Chiếm 40%)
- **Đánh giá:** Tỷ trọng lỗi làm tê liệt chức năng hoặc sai lệch logic quy trình chính (Critical + Major) lên đến 60%. Đây là con số tỷ lệ khá cao cho thấy độ ổn định hệ thống hiện đang kém.

## 4. Độ bao phủ yêu cầu (Requirement Coverage %)
- **Công thức:** `(Số Requirement đã cover bằng TCs / Tổng số req) * 100`
- **Chỉ số ghi nhận:** Theo thiết kế ma trận RTM, toàn bộ R1 đến R16 đều đã được map ít nhất >=2 Test cases. 
- **Kết quả:** `(16 / 16) * 100 = 100%`
- **Đánh giá:** Mức độ phủ sóng test tốt, đảm bảo không bị sót yêu cầu (missing requirement traceability).
