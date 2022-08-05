#cantidad Total
SELECT COUNT(*) FROM socios.socios;
#Promedio de edades de los hinchas de Racing
SELECT AVG(socios.Edad) From socios.socios where socios.Equipo = "Racing";
#Un listado con las 100 primeras personas casadas, 
#con estudios Universitarios,
#ordenadas de menor a mayor según su edad. 
#Por cada persona, mostrar: nombre, edad y equipo.
SELECT   Nombre, Edad, Equipo From socios where EstadoCivil = "Casado" and Estudios="Universitario" order by Edad ASC Limit 100;
#Listado de nombres mas comunes entre los hinchas de River
Select socios.Nombre,  count(*) Cantidad from socios.socios where socios.Equipo='River' group by socios.Nombre order by count(*) desc limit 5;
#Un listado, ordenado de mayor a menor según la cantidad de socios, que enumere, junto con cada equipo, 
#el promedio de edad de sus socios, la menor edad registrada y la mayor edad registrada.
Select AVG(socios.Edad) 'Edad', count(*)'Cantidad de Socios', Equipo, max(socios.Edad)'Max Edad', min(socios.edad)'Min Edad' From socios.socios group by Equipo order by count(*) Desc