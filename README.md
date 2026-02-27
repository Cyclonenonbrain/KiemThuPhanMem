# Kiểm thử phần mềm: Bài tập 0

![Cant Unsee](images/cantunsee.png)


# Kiểm thử phần mềm:BÀI TẬP THỰC HÀNH KIỂM THỬ ĐƠN VỊ VỚI JUNIT 5

## 1. Mô tả bài toán
Xây dựng lớp `StudentAnalyzer` với các chức năng:

### 1.1. Đếm số học sinh đạt loại Giỏi
- Điểm hợp lệ nằm trong khoảng **0 đến 10**
- Học sinh đạt loại Giỏi khi **điểm ≥ 8.0**
- Bỏ qua các giá trị không hợp lệ (điểm < 0 hoặc > 10)
- Nếu danh sách rỗng hoặc không có dữ liệu hợp lệ → trả về **0**

### 1.2. Tính điểm trung bình hợp lệ
- Chỉ tính trung bình các điểm hợp lệ (0–10)
- Bỏ qua các giá trị không hợp lệ
- Nếu không có điểm hợp lệ → trả về **0**


## 2. Cách chạy chương trình
Chương trình được viết bằng Java và không yêu cầu framework bổ sung.

### Bước 1: Chuẩn bị môi trường
- Cài đặt Java JDK 11 trở lên
- Mở Terminal tại thư mục `unit-test`

### Bước 2: Biên dịch mã nguồn (powershell / terminal)
 - Nhập lệnh "javac -d out src/StudentAnalyzer.java" để biên dịch mã nguồn

### Bước 3: Chạy chương trình
 - Nhập lệnh "java -cp out Main" để chạy chương trình

 Lưu ý: Lớp Main chỉ dùng để kiểm tra nhanh kết quả xử lý, không ảnh hưởng đến quá trình kiểm thử đơn vị.


## 3. Cách test chương trình
Chương trình được kiểm thử bằng JUnit 5 với các ca kiểm thử đơn vị.

### Bước 1: Kiểm tra thư viện JUnit
Đảm bảo file `junit-platform-console-standalone.jar` đã được đặt trong thư mục `lib/`.

### Bước 2: Biên dịch mã nguồn và test
Mở Terminal/PowerShell tại thư mục `unit-test` và chạy:

javac -cp "lib/junit-platform-console-standalone.jar" -d out src/StudentAnalyzer.java test/StudentAnalyzerTest.java 

### Bước 3: Chạy kiểm thử đơn vị
java -jar lib/junit-platform-console-standalone.jar -cp out --scan-classpath

Kết quả mong đợi:
    - Các ca kiểm thử được thực thi thành công
    - Không có test case thất bại


# 🧪 BÁO CÁO THỰC HÀNH KIỂM THỬ TỰ ĐỘNG END-TO-END VỚI CYPRESS

### 1. Mục tiêu

Thực hành xây dựng và thực thi các kịch bản kiểm thử tự động End-to-End (E2E) bằng Cypress cho website mẫu:  
https://www.saucedemo.com

Mục tiêu cụ thể:

- Kiểm tra chức năng đăng nhập (thành công & thất bại)
- Kiểm tra thêm sản phẩm vào giỏ hàng
- Kiểm tra chức năng sắp xếp sản phẩm
- Kiểm tra xóa sản phẩm khỏi giỏ hàng
- Kiểm tra quy trình thanh toán

---

### 2. Môi trường thực hiện

- Hệ điều hành: Windows
- Node.js
- Cypress
- Trình duyệt: Chrome
- Website kiểm thử: https://www.saucedemo.com

---

### 3. Phạm vi kiểm thử

Phạm vi kiểm thử bao gồm các chức năng chính:

- Authentication (Login)
- Product listing
- Cart management
- Checkout process

Không bao gồm:

- Kiểm thử hiệu năng
- Kiểm thử bảo mật
- Kiểm thử API

---

### 4. Danh sách Test Case

| STT | Tên Test Case | Mô tả | Kết quả mong đợi | Trạng thái |
|-----|---------------|--------|------------------|------------|
| 1 | Login thành công | Đăng nhập với tài khoản hợp lệ | Điều hướng tới `/inventory.html` | ✅ Pass |
| 2 | Login thất bại | Đăng nhập với tài khoản sai | Hiển thị thông báo lỗi | ✅ Pass |
| 3 | Thêm sản phẩm vào giỏ | Thêm sản phẩm đầu tiên | Badge giỏ hàng hiển thị `1` | ✅ Pass |
| 4 | Sắp xếp theo giá thấp đến cao | Chọn filter `Price (low to high)` | Sản phẩm đầu có giá thấp nhất | ✅ Pass |
| 5 | Xóa sản phẩm khỏi giỏ | Remove sản phẩm đã thêm | Badge giỏ hàng biến mất | ✅ Pass |
| 6 | Quy trình thanh toán | Điền thông tin và Continue | Điều hướng tới `/checkout-step-two.html` | ✅ Pass |

---

### 5. Kết quả thực thi

Tất cả các test case đều được thực thi thành công thông qua Cypress.

- Không phát hiện lỗi chức năng trong phạm vi kiểm thử.
- Các assertion đều đạt yêu cầu.

---

### 6. Bằng chứng thực thi (Video)

Video thực thi kiểm thử được lưu tại:
cypress-exercise/cypress/videos/

---

### 7. Coverage kiểm thử

Các chức năng chính của hệ thống đã được kiểm thử:

- Đăng nhập người dùng
- Thao tác với giỏ hàng
- Sắp xếp danh sách sản phẩm
- Quy trình thanh toán

Coverage hiện tại tập trung vào:

- Functional E2E testing
- UI flow validation
- User interaction validation

---