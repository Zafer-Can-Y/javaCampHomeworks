--Select
--ANSII

Select ContactName Adi,Address Adres,City Sehir from Customers
Select * from Customers where City = 'Berlin'

--Case insesitives
select * from Products where categoryId = 1 or categoryId = 3
select * from Products where categoryId = 1 and Price >=10

select * from Products order by Price asc --ascending
select * from Products where categoryId=1 order by Price desc --descending

select count(*) from Products
select count (*) Adet from Products where CategoryID=2

select categoryId,count(*) Adet from products group by categoryId
select categoryId,count(*) Adet from products group by categoryId having count(*)<10
select categoryId,count(*) Adet from products where Price>20 group by categoryId having count(*)<10
select * from Products inner join Categories on Products.CategoryID = Categories.CategoryId

select Products.ProductID, Products.ProductName, Products.Price, Categories.CategoryName
from Products inner join Categories 
on Products.CategoryID = Categories.CategoryId

select Products.ProductID, Products.ProductName, Products.Price, Categories.CategoryName
from Products inner join Categories 
on Products.CategoryID = Categories.CategoryId
where Products.Price>10 

--DTO Data Transformation object

select * from Products p inner join OrderDetails od
on p.ProductID = od.ProductID

select * from Products p left join OrderDetails od
on p.ProductID = od.ProductID

select * from Customers c inner join Orders o
on c.CustomerID = o.CustomerID

select * from Customers c left join Orders o
on c.CustomerID = o.CustomerID
where o.CustomerID is null

select * from Products p inner join OrderDetails od
on p.ProductID = od.ProductID
inner join Orders o
on o.OrderID = od.OrderID


