<html lang="en">

<body>
<h1>JDBC Simple Demo</h1>
<p>Very simple demo of using JDBC to connecting to PostgresSQL from Java project.</p>
<p>You will need some things:</p>
<ul>
<li>PostgresSQL on localhost (in this example will use 14 version of PostgresSQL)</li>
<li>Some database (in this example will use database "first_db")</li>
<li>Some table in your database (in this example will use table "product"), like as:</li>


<p><b>CREATE TABLE IF NOT EXIST</b> product (<br>
product_id <b>int GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY</b>,<br>
product_name <b>varchar (100) NOT NULL UNIQUE,</b><br>
product_price <b>int check ( produc_price > 0 )</b><br>
);</p>
<li>Add some records to the table, for example:</li>
<p><b>INSERT INTO</b> product (product_name, product_price) <b>VALUES</b> ('Smartphone', 9500)</p>
<p><b>INSERT INTO</b> product (product_name, product_price) <b>VALUES</b> ('Book', 1300)</p>
<p><b>INSERT INTO</b> product (product_name, product_price) <b>VALUES</b> ('Laptop', 39500)</p>
</ul>
<li>Congratulation, now you create sample data for use JDBC in Java!</li>
</body>
</html>