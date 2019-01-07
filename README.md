Maven ? JDK
Structure projet Spring boot et son starter template

JPA ? Java Bean ? switcher d'un type de db a un autre  ?
Mysql engine isam par defaut, changer pour innodb (foreign key etc)
afficher shema depuis workbench

Annotations ?

IOC ? Autowired ?

Test unitaires ?

Se dépetrer avec les exceptions de Spring

Liens vers docs JPA, boot , core et maven


requetes
select personne.nom, personne.prenom from personne inner join pays on personne.pays_id=pays.id where pays.nom ='France';



Si probleme de timezone avec JDBC et mysql


dans la section [mysqld]
de C:\ProgramData\MySQL\MySQL Server 8.0\my.ini
ou un autre chemin où se trouverait my.ini

ajouter ou remplacer
default_time_zone='+01:00'