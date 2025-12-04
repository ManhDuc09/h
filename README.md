1. Frontend Setup
Chuyển vào thư mục frontend
cd frontend

Tạo file .env
cp .env.example .env

Nội dung file .env
VITE_API_URL=http://localhost:8080/familyhealth/api/v1

Cài dependencies
npm install

Chạy frontend
npm run dev

2. Backend Setup
Chuyển vào thư mục backend
cd backend

Tạo file .env
cp .env.example .env

Nội dung file .env
GOOGLE_CLIENT_ID=your-google-client-id
GOOGLE_CLIENT_SECRET=your-google-secret
OPENAI_API_KEY=your-openai-api-key

Cập nhật file application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/medical_app
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

Chạy backend
mvn spring-boot:run
