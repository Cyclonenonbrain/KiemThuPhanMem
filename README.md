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