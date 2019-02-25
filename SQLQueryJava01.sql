
go
create database SQLServerJava
go
drop database RWABaza;

use SQLServerJava
go
create table Contact(
IDContact int constraint PK_Contact primary key identity(1,1),
TelephoneWork nvarchar(50),
TelephoneHome nvarchar(50),
Mobile nvarchar(50),
Pager nvarchar(50),
Fax nvarchar(50),
Email nvarchar(50)
)
go
create table [Address](
IDAddress int constraint PK_Address primary key identity(1,1),
DoorNo int,
Street nvarchar(50),
Area nvarchar(50),
City nvarchar(50),
[State] nvarchar(50),
PINCode int
)
go
create table NextOfKin(
IDNextOfKin int constraint PK_NextOfKin primary key identity(1,1),
FirstName nvarchar(50),
MiddleName nvarchar(50),
Surname nvarchar(50),
RelationshipToOutpatient nvarchar(50),
AddressID int constraint FK_Address foreign key references [Address](IDAddress),
ContactID int constraint FK_Contact foreign key references Contact(IDContact)
)
go
create table LaboratoryTest(
IDLaboratoryTest int constraint PK_LaboratoryTest primary key identity(1,1),
Name nvarchar(200),
Price float
)
go
create table Checkup(
IDCheckup int constraint PK_Consultation primary key identity(1,1),
Name nvarchar(200),
Price float,
DateOfChekup date not null
)
go
create table Medication(
IDMedication int constraint PK_Medication primary key identity(1,1),
Name nvarchar(200),
Price float
)
go
create table Doctor(
IDDoctor int constraint PK_Name_Doctor primary key identity(1,1),
FirstName nvarchar(50) not null,
Surname nvarchar(50) not null,
)
go
create table Patient(
IDPatient int constraint PK_Patient primary key identity(1,1),
FirstName nvarchar(50),
MiddleName nvarchar(50),
Surname nvarchar(50),
Sex nvarchar(10),
DateOfBirth Date,
OIB nvarchar(20),
PermanentAddressID int constraint FK_PermanentAddressPatient foreign key references [Address](IDAddress),
NextOfKinID int constraint FK_NextOfKinPatient foreign key references NextOfKin(IDNextOfKin),
ContactID int constraint FK_ContactPatient foreign key references Contact(IDContact),
AddressID int constraint FK_AddressPatient foreign key references [Address](IDAddress)
)
go
create table Chart(
IDChart int constraint PK_ChartChart primary key identity(1,1),
PatientID int CONSTRAINT FK_PatientChart FOREIGN KEY REFERENCES Patient(IDPatient),
Diagnosis nvarchar(250) null

)
go
create table LaboratoryTestList(
IDLaboratoryTestList int constraint PK_LaboratoryTestList primary key identity(1,1),
LaboratoryTestID int constraint FK_LaboratoryTest foreign key references LaboratoryTest(IDLaboratoryTest),
ChartID int constraint FK_ChartZaLabTest foreign key references Chart(IDChart)
)

go
create table CheckupList(
IDCheckupList int constraint PK_CheckupList primary key identity(1,1),
CheckupID int constraint FK_Checkup foreign key references Checkup(IDCheckup),
ChartID int constraint FK_ChartZaCheckup foreign key references Chart(IDChart),
DateOfChekup date not null
)

go
create table MedicationList(
IDMedicationList int constraint PK_MedicationList primary key identity(1,1),
MedicationID int constraint FK_Medication foreign key references Medication(IDMedication),
ChartID int constraint FK_ChartZaMed foreign key references Chart(IDChart)
)
go
create table DoctorList(
IDDoctorList int constraint PK_DoctorList primary key identity(1,1),
DoctorID int constraint FK_Doctor foreign key references Doctor(IDDoctor),
ChartID int constraint FK_ChartZaDoktora foreign key references Chart(IDChart)
)


go
create table Record(
IDRecord int constraint PK_Record primary key identity(1,1),
RecordDate date,
PatientID int constraint FK_PatientRecord foreign key references Patient(IDPatient),
BriefStatementOfCompaint nvarchar(200),
ContactTelephoneNumber1 nvarchar(50),
ContactTelephoneNumber2 nvarchar(50),
MaritalStatus nvarchar(50),
NoOfDependents int,
Height float,
[Weight] float,
BloodTypeRH nvarchar(50),
Occupation nvarchar(50),
GrossAnnualIncome float,
VegetarianNonVegetarian nvarchar(50),
Smoker nvarchar(50),
AverageOfCigarettesDay float NULL,
ConsumeAlcoholicBeverage nvarchar(50),
AverageConsumeAlcoholicBeverageDay float NULL,
UseStimulants nvarchar(50),
ConsuptionOfCoffeeTeaDay float,
ConsumptionSoftDriksDay float,
RegularMeals nvarchar(100),
EatingHomeOutside nvarchar(50),
StatementOfCoplaint nvarchar(200),
HistoryOfPrevioustreatment nvarchar(200),
PhysicianHospitaltreated nvarchar(200),
Diabetic nvarchar(50),
Hypertensive nvarchar(50),
CardiacCondition nvarchar(50),
RespiratoryCondition nvarchar(50),
DigestiveCondition nvarchar(50),
OrthopedicCondition nvarchar(50),
MuscularCondition nvarchar(50),
NeurologicalCondition nvarchar(50),
KnownAllergies nvarchar(200),
KnownAdverseReactionToSpecificDrugs nvarchar(200),
MajorSurgeries nvarchar(200),

)

go
create table Appointment(
IDAppointment int constraint PK_Appointment primary key identity(1,1),
[Date] Date,
DoctorID int CONSTRAINT FK_DoctorAppointment FOREIGN KEY REFERENCES Doctor(IDDoctor),
PatientID int CONSTRAINT FK_PatientAppointment FOREIGN KEY REFERENCES Patient(IDPatient)

)


