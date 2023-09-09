mysql> create database vishwa;
Query OK, 1 row affected (0.22 sec)

mysql> use vishwa;
Database changed
mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| account            |
| b'sample'          |
| information_schema |
| mysql              |
| performance_schema |
| sample             |
| security           |
| sys                |
| vishwa             |
+--------------------+
9 rows in set (0.12 sec)

mysql> drop database vishwa;
Query OK, 0 rows affected (0.23 sec)

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| account            |
| b'sample'          |
| information_schema |
| mysql              |
| performance_schema |
| sample             |
| security           |
| sys                |
+--------------------+
8 rows in set (0.00 sec)

mysql>