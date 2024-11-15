CREATE PROCEDURE `GetOfficeByCountry` (in country_name varchar(25))
BEGIN
select * from offices where country = country_name;
END
