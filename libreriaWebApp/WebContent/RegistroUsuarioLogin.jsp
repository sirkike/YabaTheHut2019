<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrarme</title>
</head>

<body>
	<h1>Formulario de registro</h1>
	<form action="Registrar" method="post">
		<label> Nombre y Apellido </label>
		<input type="text" name="NombreApellido" /><br>
		<label> Usuario </label>
		<input type="text" name="Usuario" /><br>
		<label> Contrase�a </label>
		<input type="password" name="Contrase�a" /><br>
		<input type="submit" value="Registrarme" />
	</form>
</body>
</html>