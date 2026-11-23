# Course Management API

**Course Management API** là dự án xây dựng RESTful API phục vụ quản lý khóa học, danh mục khóa học và tài khoản người dùng, sử dụng Java và Spring Boot.

Dự án tập trung vào việc thực hành xây dựng Backend từ đầu, áp dụng kiến trúc phân tầng (Layered Architecture), thiết kế cơ sở dữ liệu quan hệ và phát triển RESTful API theo các nguyên tắc lập trình tốt.

Mục tiêu là nâng cao kỹ năng phát triển Java Backend thông qua quá trình tự thiết kế, triển khai, kiểm thử và tối ưu hệ thống.

## 1. Tổng quan dự án

Hệ thống được xây dựng nhằm hỗ trợ quản lý thông tin khóa học và danh mục khóa học.

Dự án áp dụng kiến trúc phân tầng để tách biệt trách nhiệm giữa các thành phần, giúp mã nguồn dễ bảo trì, mở rộng và kiểm thử.

### Chức năng chính

- [x] Khởi tạo cấu trúc dự án và kiến trúc phân tầng
- [x] Thiết kế Entity và các mối quan hệ cơ sở dữ liệu
- [x] Xây dựng Repository với Spring Data JPA
- [x] Thiết kế Request DTO và Response DTO
- [x] Validation dữ liệu đầu vào
- [ ] Quản lý danh mục khóa học (CRUD)
- [ ] Quản lý khóa học (CRUD)
- [ ] Xác thực người dùng
- [ ] Xác thực và phân quyền bằng JWT
- [ ] Xử lý ngoại lệ toàn cục (Global Exception Handling)
- [ ] Phân trang, sắp xếp và lọc dữ liệu
- [ ] Kiểm thử Unit Test và Integration Test

_Trạng thái chức năng sẽ được cập nhật trong quá trình phát triển._

## 2. Công nghệ sử dụng

| Công nghệ         | Mục đích                                |
| ----------------- | --------------------------------------- |
| Java              | Ngôn ngữ lập trình chính                |
| Spring Boot       | Framework phát triển Backend            |
| Spring Data JPA   | Làm việc với cơ sở dữ liệu              |
| Hibernate         | ORM – ánh xạ đối tượng và cơ sở dữ liệu |
| SQL Server        | Hệ quản trị cơ sở dữ liệu               |
| Maven             | Quản lý thư viện và quá trình build     |
| Swagger / OpenAPI | Tài liệu và kiểm thử API                |
| Git & GitHub      | Quản lý phiên bản mã nguồn              |

## 3. Kiến trúc hệ thống

Dự án sử dụng mô hình kiến trúc phân tầng (Layered Architecture).

```text
Client / Swagger
       |
       v
   Controller
       |
       v
     Service
       |
       v
   Repository
       |
       v
    Database
```

### Cấu trúc thư mục

```text
src/main/java/com/example/
│
├── config/
│
├── controller/
│
├── dto/
│   ├── request/
│   └── response/
│
├── entity/
│
├── exception/
│
├── repository/
│
├── service/
│
└── Application.java
```

### Trách nhiệm của từng tầng

- **Controller:** Tiếp nhận HTTP Request và trả HTTP Response.
- **DTO:** Định nghĩa cấu trúc dữ liệu đầu vào và đầu ra của API.
- **Service:** Xử lý nghiệp vụ và chuyển đổi giữa DTO và Entity.
- **Repository:** Thực hiện các thao tác truy vấn và làm việc với Database.
- **Entity:** Đại diện cho các bảng và mối quan hệ trong Database.
- **Exception:** Quản lý và xử lý lỗi phát sinh trong hệ thống.

## 4. Thiết kế cơ sở dữ liệu

Phiên bản ban đầu gồm 3 Entity chính:

| Entity   | Mô tả                                             |
| -------- | ------------------------------------------------- |
| AppUser  | Lưu trữ thông tin tài khoản và vai trò người dùng |
| Category | Quản lý danh mục khóa học                         |
| Course   | Quản lý thông tin khóa học                        |

### Mối quan hệ giữa các Entity

```text
Category (1) -------- (N) Course

AppUser
  |
  └── Quản lý tài khoản và vai trò người dùng
```

Entity Course liên kết với Category thông qua khóa ngoại `category_id`.

## 5. Tài liệu API

Dự án sử dụng Swagger / OpenAPI để xây dựng tài liệu và hỗ trợ kiểm thử RESTful API.

Sau khi khởi chạy ứng dụng, truy cập:

```text
http://localhost:8080/swagger-ui/index.html
```

## 6. Hướng dẫn cài đặt và chạy dự án

### Yêu cầu môi trường

Cần cài đặt các công cụ sau:

- JDK 21 hoặc phiên bản tương thích với cấu hình dự án.
- Maven.
- SQL Server.
- IntelliJ IDEA hoặc Visual Studio Code.
- Git.

### Các bước cài đặt

**Bước 1: Clone repository**

```bash
git clone https://github.com/YOUR_USERNAME/course-management-api.git
```

**Bước 2: Di chuyển vào thư mục dự án**

```bash
cd course-management-api
```

**Bước 3: Cấu hình Database**

Cập nhật thông tin kết nối Database trong file `application.properties`.

Không đưa mật khẩu Database hoặc thông tin nhạy cảm lên GitHub.

**Bước 4: Khởi chạy ứng dụng**

```bash
mvn spring-boot:run
```

**Bước 5: Truy cập Swagger UI**

```text
http://localhost:8080/swagger-ui/index.html
```

## 7. Định hướng phát triển

Trong quá trình phát triển, dự án tập trung vào các nội dung:

- Thiết kế và triển khai RESTful API.
- Xây dựng quan hệ Entity bằng JPA/Hibernate.
- Thiết kế DTO và Validation.
- Sử dụng Derived Query với Spring Data JPA.
- Xử lý nghiệp vụ tại tầng Service.
- Triển khai xác thực và phân quyền.
- Kiểm thử và xử lý lỗi Backend.

## 8. Các tính năng dự kiến mở rộng

- Tích hợp Spring Security và JWT Authentication.
- Triển khai phân quyền theo vai trò (RBAC).
- Chuẩn hóa cơ chế xử lý lỗi API.
- Bổ sung Pagination và Filtering.
- Xây dựng Unit Test và Integration Test.
- Đóng gói ứng dụng bằng Docker.
- Triển khai ứng dụng lên môi trường thực tế.

## 9. Tác giả

NGUYỄN MINH PHÚC

Sinh viên ngành Kỹ thuật Phần mềm | Định hướng Java Backend Developer

---

_Được xây dựng với Java, Spring Boot và tinh thần học tập thông qua thực hành._
