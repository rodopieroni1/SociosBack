CREATE DEFINER=`root`@`localhost` PROCEDURE `EdadSP`()
BEGIN
Select socios.Nombre, count(*) from socios.socios where socios.Equipo='River' group by socios.Nombre order by count(*) desc limit 5;
END