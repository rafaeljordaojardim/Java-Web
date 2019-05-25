<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sistema Login</title>
<script type="text/javascript">
	function validarLogin(){
		if(document.formLogin.txtUsuario.value == ""){
			alert("Usuário não informado");
			return false;
		};
		if(document.formLogin.txtSenha.value == ""){
			alert("Senha não informada");
			return false;
		};
		
	}
</script>
</head>
<body>
	<form action="Login" method="post" name="formLogin">
			<p align="center">Sistema de Login</p>
			<table align="center">
				<tr>
					<td>Usuário</td>
					<td><input type="text" name="txtUsuario"/></td>
						
				</tr>
				<tr>
					<td>Senha</td>
					<td><input type="text" name="txtSenha"/></td>
						
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="logar" onClick="validarLogin();"></td>	
				</tr>
			</table>
	</form>
</body>
</html>