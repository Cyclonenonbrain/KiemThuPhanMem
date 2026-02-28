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

# 🚀 BÁO CÁO KIỂM THỬ HIỆU NĂNG VỚI JMETER

### 1. Mục tiêu

Kiểm thử hiệu năng trang web **baomoi.com** bằng Apache JMeter nhằm đánh giá:
- Thời gian phản hồi (Response Time) của website dưới các mức tải khác nhau
- Throughput (số request/giây) website có thể xử lý
- Tỷ lệ lỗi (Error Rate) khi tăng số lượng người dùng đồng thời

---

### 2. Môi trường thực hiện

- Hệ điều hành: Windows
- Công cụ: Apache JMeter 5.6.3
- Java: JDK (cài sẵn)
- Website kiểm thử: https://baomoi.com
- Chế độ chạy: Non-GUI (CLI)

---

### 3. Cấu hình kịch bản kiểm thử

| Tham số | Thread Group 1 (Cơ bản) | Thread Group 2 (Tải nặng) | Thread Group 3 (Tuỳ chỉnh) |
|---|---|---|---|
| Số users | 10 | 50 | 7 |
| Ramp-up | 10s | 30s | 30s |
| Loop/Duration | 5 loops | 1 loop | 60 giây |
| Hành vi | GET `/` | GET `/` + GET `/tin-moi.epi` | GET `/kham-pha-viet-nam-top335.epi` + GET `/the-thao.epi` |
| Timer | Không dùng | Không dùng | Uniform Random Timer (Delay Offset = 3000ms, Random Delay Maximum = 4000ms) |

---

### 4. Kết quả kiểm thử

#### Thread Group 1 — Kịch bản cơ bản (10 users)

| Chỉ số | Giá trị |
|---|---|
| Tổng requests | 50 |
| Response Time (Avg) | 294 ms |
| Response Time (Min) | 218 ms |
| Response Time (Max) | 579 ms |
| Error Rate | **0%** |
| Throughput | ~4.87 req/s |

#### Thread Group 2 — Kịch bản tải nặng (50 users)

| Chỉ số | GET `/` (Trang chủ) | GET `/tin-moi.epi` (Tin mới) |
|---|---|---|
| Tổng requests | 50 | 50 |
| Response Time (Avg) | 303 ms | 205 ms |
| Response Time (Min) | 228 ms | 138 ms |
| Response Time (Max) | 543 ms | 584 ms |
| Error Rate | **0%** | **0%** |

#### Thread Group 3 — Kịch bản tuỳ chỉnh (7 users, 60s, có Uniform Random Timer)

| Chỉ số | GET `/kham-pha-viet-nam-top335.epi` | GET `/the-thao.epi` |
|---|---|---|
| Tổng requests | 33 | 30 |
| Response Time (Avg) | 241 ms | 220 ms |
| Response Time (Min) | 134 ms | 183 ms |
| Response Time (Max) | 345 ms | 319 ms |
| Error Rate | **0%** | **0%** |
| Requests thành công | 33 | 30 |

> **Lưu ý:** Sau khi thêm Uniform Random Timer (3–7 giây/request), kịch bản TG3 không còn phát sinh mã lỗi 403 trong lần chạy cập nhật.

---

### 5. Phân tích kết quả kiểm thử

#### 5.1. So sánh giữa 3 Thread Groups

| Tiêu chí | TG1 (10 users) | TG2 (50 users) | TG3 (7 users, 60s + Timer) |
|---|---|---|---|
| Tổng requests | 50 | 100 | 63 |
| Error Rate (overall) | **0%** | **0%** | **0%** |
| Avg Response Time | 294 ms | 254 ms | 231 ms |
| Throughput (overall) | ~4.87 req/s | ~3.34 req/s | ~1.14 req/s |
| Nguyên nhân lỗi | Không có | Không có | Không có |

- **TG1** hoạt động ổn định, response time giữ trong khoảng 218–579ms, không có lỗi.
- **TG2** vẫn đạt 0% lỗi với 50 users đồng thời và 2 endpoint.
- **TG3** có tải thực tế hơn nhờ Timer 3–7 giây nên không còn burst request dồn dập và không còn lỗi 403.

#### 5.2. Nhận xét hiệu năng website

- **Trang chủ (`/`)** giữ mức phản hồi ổn định ở TG1/TG2, không có lỗi.
- **Trang `/tin-moi.epi`** có thời gian phản hồi trung bình thấp hơn trang chủ ở TG2 (205ms vs 303ms).
- **Trang `/the-thao.epi`** và **`/kham-pha-viet-nam-top335.epi`** đều trả về 200 OK toàn bộ trong cấu hình TG3 mới.
- Việc thêm Timer giúp mô phỏng hành vi người dùng thật hơn và giảm nguy cơ bị rate limiting.

#### 5.3. Đánh giá khả năng chịu tải

- Trong cấu hình hiện tại, cả 3 Thread Groups đều đạt **100% thành công**.
- TG3 đã chuyển sang mô hình tải "dịu hơn" (7 users + Timer 3–7 giây), nên kết quả phản ánh tốt hơn hành vi truy cập thực tế.
- Vì cấu hình TG3 mới giảm tải mạnh so với kịch bản cũ, chưa thể dùng kết quả này để kết luận ngưỡng rate limiting tối đa của hệ thống.

#### 5.4. Đề xuất cải thiện

1. **Giữ Timer ở TG3** cho các bài kiểm thử mô phỏng người dùng thật.
2. **Tăng tải theo nấc** (ví dụ 7 → 10 → 15 → 20 users) để tìm điểm bắt đầu xuất hiện 403.
3. **Theo dõi thêm percentile** (P90/P95/P99) ngoài trung bình để đánh giá độ ổn định latency.
4. **So sánh nhiều lần chạy** ở các khung giờ khác nhau để giảm sai số do biến động hạ tầng bên ngoài.

---

### 6. Bằng chứng thực thi

- File Test Plan: `jmeter/test-plan.jmx`
- Kết quả CSV:
  - `jmeter/results/all-results.csv`
  - `jmeter/results/thread-group-1/summary.csv`
  - `jmeter/results/thread-group-2/summary.csv`
  - `jmeter/results/thread-group-3/summary.csv`
- Log chạy CLI: `jmeter/results/jmeter.log` (có thể xoá sau khi hoàn tất báo cáo)
- Screenshot Summary Report: `images/jmeter-summary-tg1.png`, `images/jmeter-summary-tg2.png`, `images/jmeter-summary-tg3.png`

---
