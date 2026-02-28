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


#  BÁO CÁO THỰC HÀNH KIỂM THỬ TỰ ĐỘNG END-TO-END VỚI CYPRESS

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
| 1 | Login thành công | Đăng nhập với tài khoản hợp lệ | Điều hướng tới `/inventory.html` |  Pass |
| 2 | Login thất bại | Đăng nhập với tài khoản sai | Hiển thị thông báo lỗi |  Pass |
| 3 | Thêm sản phẩm vào giỏ | Thêm sản phẩm đầu tiên | Badge giỏ hàng hiển thị `1` |  Pass |
| 4 | Sắp xếp theo giá thấp đến cao | Chọn filter `Price (low to high)` | Sản phẩm đầu có giá thấp nhất | Pass |
| 5 | Xóa sản phẩm khỏi giỏ | Remove sản phẩm đã thêm | Badge giỏ hàng biến mất |  Pass |
| 6 | Quy trình thanh toán | Điền thông tin và Continue | Điều hướng tới `/checkout-step-two.html` |  Pass |

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

#  BÁO CÁO KIỂM THỬ HIỆU NĂNG VỚI JMETER

### 1. Mục tiêu

Kiểm thử hiệu năng trang web **baomoi.com** bằng Apache JMeter nhằm đánh giá:
- Thời gian phản hồi (Response Time) của website dưới các mức tải khác nhau
- Throughput (số request/giây) website có thể xử lý
- Tỷ lệ lỗi (Error Rate) khi tăng số lượng người dùng đồng thời

---

### 2. Môi trường thực hiện

- Hệ điều hành: Windows
- Công cụ: Apache JMeter 5.6.3
- Java: JDK 21
- Website kiểm thử: https://baomoi.com


---

### 3. Cấu hình kịch bản kiểm thử

| Tham số | Thread Group 1 (Cơ bản) | Thread Group 2 (Tải nặng) | Thread Group 3 (Tuỳ chỉnh) |
|---|---|---|---|
| Số users | 10 | 50 | 20 |
| Ramp-up | 10s | 30s | 10s |
| Loop/Duration | 5 loops | 1 loop | 60 giây |
| Hành vi | GET `/` | GET `/` + GET `/tin-moi.epi` | GET `/kham-pha-viet-nam-top335.epi` + GET `/the-thao.epi` |

---

### 4. Kết quả kiểm thử

#### Thread Group 1 — Kịch bản cơ bản (10 users)

| Chỉ số | Giá trị |
|---|---|
| Tổng requests | 50 |
| Response Time (Avg) | 302 ms |
| Response Time (Min) | 160 ms |
| Response Time (Max) | 695 ms |
| Error Rate | **0%** |
| Throughput | ~4.8 req/s |

#### Thread Group 2 — Kịch bản tải nặng (50 users)

| Chỉ số | GET `/` (Trang chủ) | GET `/tin-moi.epi` (Tin mới) |
|---|---|---|
| Tổng requests | 50 | 50 |
| Response Time (Avg) | 303 ms | 198 ms |
| Response Time (Min) | 205 ms | 117 ms |
| Response Time (Max) | 567 ms | 400 ms |
| Error Rate | **0%** | **0%** |

#### Thread Group 3 — Kịch bản tuỳ chỉnh (20 users, 60s)

| Chỉ số | GET `/kham-pha-viet-nam-top335.epi` | GET `/the-thao.epi` |
|---|---|---|
| Tổng requests | 48,294 | 48,284 |
| Response Time (Avg) | 12 ms | 11 ms |
| Error Rate | **99.45%** | **99.47%** |
| Requests thành công | 267 | 254 |


---

### 5. Phân tích kết quả kiểm thử

#### 5.1. So sánh giữa 3 Thread Groups

| Tiêu chí | TG1 (10 users) | TG2 (50 users) | TG3 (20 users, 60s) |
|---|---|---|---|
| Tổng requests | 50 | 100 | 96,578 |
| Error Rate (overall) | **0%** | **0%** | **99.46%** |
| Avg Response Time | 302 ms | 251 ms | 11 ms |
| Nguyên nhân lỗi | Không có | Không có | Rate Limiting |

- **TG1** hoạt động ổn định — trang chủ phản hồi tốt với 10 users, không có lỗi, throughput ~4.8 req/s.
- **TG2** cho thấy website chịu tải tốt với 50 users đồng thời (0% error) trên cả trang chủ và trang con `/tin-moi.epi`.
- **TG3** sinh ra hơn 96,000 requests trong 60 giây (do 20 users loop liên tục, ~1,600 req/s) → website kích hoạt **rate limiting** để tự bảo vệ.

#### 5.2. Nhận xét hiệu năng website

- **Trang chủ (`/`)** có hiệu năng tốt: thời gian phản hồi trung bình ~302-303ms, không có lỗi với cả 10 và 50 người dùng đồng thời.
- **Trang `/tin-moi.epi`** phản hồi nhanh hơn trang chủ (avg 198ms vs 303ms), có thể do nội dung nhẹ hơn.
- **Trang `/the-thao.epi`** và **`/kham-pha-viet-nam-top335.epi`** phản hồi bình thường ở tải thấp, nhưng bị chặn khi tải cao.
- Response Time khá ổn định giữa min (160ms) và max (695ms) ở TG1, cho thấy server xử lý đều.

#### 5.3. Đánh giá khả năng chịu tải

- Website **chịu tải tốt ở mức 10–50 users** đồng thời — tất cả requests thành công, response time ổn định.
- Website **có cơ chế rate limiting** hiệu quả: khi phát hiện quá nhiều request từ cùng IP (hơn ~500 req/s), server chặn các request tiếp theo.
- Điều này là **hành vi bảo mật bình thường** của một website lớn như baomoi.com — không phải lỗi server, mà là biện pháp chống DDoS.

---

### 6. Bằng chứng thực thi

- File Test Plan: `jmeter/test-plan.jmx`
- Kết quả :
  - `jmeter/results/thread-group-1/`
  - `jmeter/results/thread-group-2/`
  - `jmeter/results/thread-group-3/`


# BÁO CÁO BÀI TẬP KIỂM THỬ PHẦN MỀM (MANUAL TESTING) - WEBSITE E-COMMERCE

### 1. Giới thiệu
Bài tập thực hành Kiểm thử phần mềm thủ công (Manual Testing) cho hệ thống Website bán hàng trực tuyến (E-commerce) giả lập. Dự án được thiết kế đầy đủ quy trình QA từ đầu đến cuối nhằm đảm bảo chất lượng phần mềm.

---

### 2. Cấu trúc thư mục báo cáo (Deliverables)
Toàn bộ tài liệu đánh giá kỹ thuật số đã được tổ chức quy củ trong thư mục `E-Commerce_Manual_Testing`. Các bạn có thể trực tiếp truy cập vào hệ thống thư mục để xem tài liệu chi tiết:

- 📄 **[Kế hoạch kiểm thử (Test Plan)](./E-Commerce_Manual_Testing/Test%20Plan/Test_Plan.md)**: Xác định rõ ràng phạm vi, mức độ rủi ro, môi trường kiểm thử (In-scope/Out-of-scope).
- 📋 **[Ca kiểm thử (Test Cases)](./E-Commerce_Manual_Testing/Test%20Cases/Test_Cases.md)**: Bộ 45 Test cases (bao gồm Positive, Negative, Boundary, Security) phủ sóng 3 Module chính (Authentication, Product & Cart, Checkout).
- 🔗 **[Ma trận truy vết yêu cầu (RTM)](./E-Commerce_Manual_Testing/RTM/RTM.md)**: Đảm bảo độ bao phủ 16 Requirement đề bài cho đạt 100% (Requirement Coverage).
- 🐞 **[Báo cáo lỗi (Bug Reports)](./E-Commerce_Manual_Testing/Bug%20Reports/Bug_Reports.md)**: Tracking chi tiết 10 lỗi giả định với đẩy đủ thông số: Severity, Priority, Steps to reproduce, System environment...
- 📊 **[Báo cáo kiểm thử (Test Report)](./E-Commerce_Manual_Testing/Test%20Report/Test_Report.md)**: Phân tích số liệu và đưa ra quyết định "KHÔNG PHÁT HÀNH" (No-release) có căn cứ để bảo vệ điểm chất lượng cuối cùng.
- 📈 **[Chỉ số kiểm thử (Test Metrics)](./E-Commerce_Manual_Testing/Test%20Metrics/Test_Metrics.md)**: Đánh giá bằng 4 chỉ số cốt lõi QA: Execution rate, Pass rate, Defect Density, Severity Distribution,...

---

### 3. Tóm tắt kết quả
- **Tổng số lượng TC:** 45 TCs (Pass: 77.8%, Fail: 22.2%)
- **Tình trạng tổng quan:** Phát hiện 10 Bugs (Trong đó có 2 lỗi Critical cực kì nghiêm trọng liên quan tới lỗi hệ thống thanh toán và tính toán tiền tệ âm).
- **Quyết định Release:** `No-Release` (Do tỷ lệ pass chưa đạt kỳ vọng 95% và tồn đọng lỗi Critical cần bên khối Kỹ thuật fix gấp).
