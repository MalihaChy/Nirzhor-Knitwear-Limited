create database NirzhorKnitwearManagement
use NirzhorKnitwearManagement

create table BuyingHouse(
	BuyingHouseId int primary key identity(1,1),
	BuyingHouseName varchar(300),
	BuyingHouseOwner varchar(200)
)

create table Buyer(
	BuyerId int primary key identity(1,1),
	BuyerName varchar(300),
	BuyingHouseId int foreign key references BuyingHouse(BuyingHouseId),
	Country varchar(50)
)

create table DailyReportInput(
	Date date,
	StyleNo varchar(500),
	Line_No int,
	StartTime int,
	EndTime int,
	ProducedQuantity int
)

create table OrderInput(
	OrderId int primary key identity(1,1),
	Date date,
	BuyingHouseName varchar(300),
	BuyerName varchar(300),
	StyleNo varchar(500),
	OrderQuantity int,
	UnitPrice decimal(15,10),
	CM decimal(15,10),
	CMperPiece decimal(15,10)
)

create table CompletedOrders(
	OrderId int foreign key references OrderInput(OrderId),
	IssueDate date,
	StyleNo varchar(500),
	OrderQuantity int,
	CompletingDate date,
	ProducedQuantity int
)

create table IncomeReport(
	SystemDate date,
	StyleNo varchar(500),
	ProducedQuantity int,
	CMperPiece decimal(15,10),
	Income decimal(15,10)
)

create table ProductionStatus(
	OrderId int foreign key references OrderInput(OrderId),
	SystemDate date,
	StyleNo varchar(500),
	OrderQuantity int,
	ProducedQuantity int,
	Remaining int,
	Status varchar(100) default('Not Yet Started')
)

create table LineTable(
	Line_No int,
	LineStatus varchar(100) default('Not Used')
)

