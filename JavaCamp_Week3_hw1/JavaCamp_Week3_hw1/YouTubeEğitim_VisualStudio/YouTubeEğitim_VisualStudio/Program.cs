/*
int sayi1 = 10;
int sayi2 = 20;
sayi1 = sayi2;
sayi2 = 100;
Console.WriteLine(sayi1); */

/*
int[] sayilar1 = new[] { 1, 2, 3 };
int[] sayilar2 = new[] { 10, 20, 30 };
sayilar1 = sayilar2;
sayilar2[0] = 1000;
Console.WriteLine(sayilar1[0]); */



CreditManager creditManager = new CreditManager();
creditManager.Calculate();
creditManager.Calculate();
creditManager.Save();

Customer customer = new Customer(); //örneğini oluşturmak, instance oluşturmak, instance creation
customer.Id = 1;
customer.City = "Ankara";


CustomerManager customerManager = new CustomerManager(customer);
customerManager.Save();
customerManager.Delete();

Company company = new Company();
company.TaxNumber = "1000000";
company.CompanyName = "Arçelik";
company.Id = 100;

CustomerManager customerManager2 = new CustomerManager(new Person());

Person person = new Person();
person.NationalIdentity = "1234567";
person.FirstName = "Berfin";

Customer c1=new Customer();
Customer c2=new Person();
Customer c3=new Company();

Console.ReadLine();


class CreditManager
{
    public void Calculate()
    {
        Console.WriteLine("Hesaplandı");
    }
    public void Save()
    {
        Console.WriteLine("Kredi verildi");
    }
}
//SOLID
class Customer
{
    public Customer()
    {
        Console.WriteLine("Müşteri nesnesi başlatıldı");
    }

    public int Id { get; set; }
    public string City { get; set; }

}

class Person : Customer   //kişi müşteriden miras alır
{
    public string FirstName { get; set; }
    public string LastName { get; set; }
    public string NationalIdentity { get; set; }    //kişiye özel
}
class Company:Customer     //şirket müşteriden miras alır(inharitance)
{
    public string CompanyName { get; set; }    //şirkete özel
    public string TaxNumber { get; set; } 
}


//Katmalı Mimariler
class CustomerManager
{
    private Customer _customer;
    public CustomerManager(Customer customer)
    {
        _customer = customer;
    }
    public void Save()
    {
        Console.WriteLine("Müşteri kaydedildi :" + _customer.Id);
    }
    public void Delete()
    {
        Console.WriteLine("Müşteri silindi :" + _customer.Id);
    }
}