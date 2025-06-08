# 🧩 Personel Yönetim Sistemi (Java CLI)

Basit, konsol tabanlı bir personel yönetim uygulaması. Java dilinde, OOP ve katmanlı mimari prensipleri kullanılarak geliştirilmiştir.

---

## 📌 Özellikler

- ✅ Yeni personel ekleme
- ✅ Personel listeleme
- ✅ Maaş güncelleme
- ✅ Personel silme
- ✅ Konsoldan kullanıcı girişi alma
- ✅ Katmanlı mimari (model-service-util)

---

## 📸 Uygulama Görselleri

### 🔹 Ana Menü

![ANA MENU](images/menu.png)

### 🔹 Yeni Personel Ekleme

![YENİ PERSONEL EKLEME](images/add_employee.png)

### 🔹 Personelleri Listeleme

![PERSONELLERİ LİSTELEME](images/list_employee.png)

### 🔹 Maaş Güncelleme

![MAAŞ GÜNCELLEME](images/update_employee.png)

### 🔹 Silme İşlemi

![PERSONEL SILME](images/delete_employee.png)

---

## 🛠️ Kullanılan Teknolojiler

- Java (JDK 17+ önerilir)
- IntelliJ IDEA (veya herhangi bir IDE)
- Git & GitHub

---

## 📁 Proje Yapısı

src/\
├── model/                # Veri modelleri (Person ve Employee sınıfları)\
│   ├── Person.java\
│   └── Employee.java\
├── service/              # İş mantığını içeren katman\
│   └── EmployeeService.java\
├── util/                 # Yardımcı sınıflar (konsol input işlemleri)\
│   └── InputUtil.java\
└── Main.java             # Uygulamanın giriş noktası, kullanıcı menüsü

---

## 🚀 Nasıl Çalıştırılır?

1. Projeyi indir:
```bash
git clone https://github.com/cinar-emre/Staff-Management-System.git

2. Projeyi indir:
3.Main.java dosyasını çalıştır
