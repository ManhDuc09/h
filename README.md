🚀 HƯỚNG DẪN SETUP DỰ ÁN
1️⃣ Frontend Setup
➤ Di chuyển vào thư mục frontend
cd react-vite-familyhealth

➤ Tạo file .env
cp .env.example .env

➤ Nội dung file .env
VITE_API_URL=http://localhost:8080/familyhealth/api/v1

➤ Cài đặt dependencies
npm install

➤ Chạy dự án Frontend
npm run dev

2️⃣ Backend Setup
➤ Di chuyển vào thư mục backend
cd familyhealth

➤ Tạo file .env
cp .env.example .env

➤ Nội dung file .env

(Thay bằng credentials thật của bạn)

GOOGLE_CLIENT_ID=your-google-client-id
GOOGLE_CLIENT_SECRET=your-google-secret
OPENAI_API_KEY=your-openai-api-key

➤ Cấu hình application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/medical_app
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

➤ Chạy Backend
mvn spring-boot:run
