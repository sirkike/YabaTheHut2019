
<!doctype html>
  <head>
    <link rel="canonical" href="https://getbootstrap.com/docs/4.3/examples/sign-in/">

    <!-- CSS -->
	<link rel="stylesheet" href="CSS/bootstrap.min.css" type="text/css" ><link>
	
	    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
    <!-- Custom styles for this template -->
    <link rel="stylesheet" href="CSS/signin.css" type="text/css" ><link>
  </head>
  
 <body class="text-center" >
    <form class="form-signin" action="Iniciar" method="post">
  		<img class="mb-4" src="IMG/BocaJrs.PNG" alt="" width="72" height="72">
  		<h1 class="h3 mb-3 font-weight-normal">Iniciar sesión </h1>
  		<label for="inputEmail" class="sr-only">Email address</label>
		<input type="text" class="form-control" placeholder="Usuario" name="Usuario" required autofocus>
		<label for="inputPassword" class="sr-only">Password</label>
   		<input type="password" class="form-control" placeholder="Contraseña" name="Contraseña" required>
		<div class="checkbox mb-3">
     		<label>
      			<input type="checkbox" value="remember-me"> Recordarme
     		</label>
   		</div>
   		<button class="btn btn-lg btn-primary btn-block" type="submit">Ingresar</button>
  		<a href="#">Perdiste tu contraseña?</a>
  		<br><br>
  		<h6>No tienes una cuenta...<a href="RegistroUsuarioLogin.jsp"> Registrarme </a> </h6>
 		 <p class="mt-5 mb-3 text-muted">&copy; 2019</p>
  	</form>
</body>


