<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- CSS only -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	
	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
	
	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

<title>Productos</title>
</head>
<body>
		<div class="container">
				<form class="well form-horizontal" action="/producto" method="POST">
				<fieldset>
		
				<!-- Form Name -->
				<legend><center><h2><b>REGISTRO DE PRODUCTOS</b></h2></center></legend><br>
				
				<!-- Text input-->
		
				<div class="form-group">
				  <label class="col-md-4 control-label">Nombre</label>  
				  <div class="col-md-4 inputGroupContainer">
				  	<div class="input-group">
				  		<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
				 		 <input  type="text" id="name" name="name" placeholder="Nombre del Producto" class="form-control">
				    </div>
				  </div>
				</div>
		
				<!-- Text input-->
		
			   <div class="form-group">
				  <label class="col-md-4 control-label" >Marca</label> 
				    <div class="col-md-4 inputGroupContainer">
				   	 	<div class="input-group">
				  			<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
				  			<input type="text" id="marca" name="marca" placeholder="Marca" class="form-control">
				    	</div>
				    </div>
				</div>
		
				<!-- Text input-->
				
				<div class="form-group">
				  <label class="col-md-4 control-label" >Rut</label> 
				    <div class="col-md-4 inputGroupContainer">
				       <div class="input-group">
						  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
						  <input type="number" id="precio" name="precio" placeholder="Precio" class="form-control">
				       </div>
				    </div>
			    </div>
			  <br>
			  <input class="btn btn-success" type="submit" value="Guardar">
			  </form> <br><br>  
			 <form action="/tabla_productos">
				 <input  class="btn btn-warning" type="submit" value="Lista de Productos">
			 </form>
			 <form action="/usuario">
				 <input  class="btn btn-warning" type="submit" value="Agregar Usuarios">
			 </form>
			
	</div> <!-- Cierre container-->
</body>
</html>