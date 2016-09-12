<!DOCTYPE html>
<html>
<head>
<style>
table {
   font-family: arial, sans-serif;
   border-collapse: collapse;
   width: 100%;
}

td, th {
   border: 1px solid #dddddd;
   text-align: left;
   padding: 8px;
}

tr:nth-child(even) {
   background-color: #dddddd;
}

</style>
</head>
<body>
    <h2>ZipCode RESTful Web Application!</h2>
    <p>This web service was tested using POSTMAN client with the following resource end points</p>

<table>
 <tr>
   <th>Resource</th>
   <th>URL</th>
   <th>Resource Role</th>
 </tr>
 <tr>
   <td>INSERT</td>
   <td>https://&ltserver&gt/zipcode/webapi/insert/&ltzipcode_number&gt</td>
   <td>Inserts the given zipcode</td>
 </tr>
 <tr>
   <td>HAS</td>
   <td>https://&ltserver&gt/zipcode/webapi/has/&ltzipcode_number&gt </td>
   <td>Checks whether the resource exists</td>
 </tr>
 <tr>
   <td>DISPLAY</td>
   <td>https://&ltserver&gt/zipcode/webapi/display</td>
   <td>Displays all the zipcode in contiguous range group</td>
 </tr>
 <tr>
   <td>DELETE</td>
   <td>https://&ltserver&gt/zipcode/webapi/delete/&ltzipcode_number&gt </td>
   <td>Deletes the given zipcode</td>
 </tr>
</table>

<br/>

<table>
 <tr>
   <th>Tools & API's used</th>
 </tr>
 <tr>
   <td>Eclipse Mars</td>
 </tr>
 <tr>
   <td>Apache Tomcat Server 7.0</td>
 </tr>
<tr>
   <td>JAVA JDK 7.0</td>
</tr>
<tr>
   <td>POST MAN</td>
</tr>


 
</table>
</body>
</html>