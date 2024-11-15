CREATE PROCEDURE `GetOfficeForUSA` ()
BEGIN
select * from offices where country = 'USA';
END
