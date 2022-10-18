--Select
__ANSII
Select ContactName Adi,CompanyName SirketAdi,City Sehir from Customers

Select * from Customers where City = 'Berlin'

--case insensitive (büyük küçük harf duyarsız)
seLECt * from Products where CategoryID=1 or CategoryID=3

seLECt * from Products where CategoryID=1 and UnitPrice>=10

select * from Products order by UnitPrice asc --ascending (asc)    --descending (desc)

select * from Products where CategoryID=1 order by UnitPrice desc

select count(*) Adet from Products where CategoryID=2

select UnitPrice,COUNT(*) Adet from Products group by UnitPrice

select CategoryID,COUNT(*) from Products where UnitPrice>20 group by CategoryID having count(*)<10


select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName 
from Products inner join Categories
on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice>10


--DTO Data Transformation Object


select * from Products inner join[Order Details]  --tablo isminde boşluk olduğu için köşeli parantez aldık
on Products.ProductID = [Order Details].ProductID
inner join Orders
on Orders.OrderID = Orders.OrderID

select * from Customers left join Orders
on Customers.CustomerID = Orders.CustomerID
where Orders.CustomerID is null

