function validarForma(forma){
    var usuario = forma.usuario;
    
    if(usuario.value=="" || usuario.value=="Escribir usuario"){
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    var password = forma.password;
    
    if(password.value=="" || password.value.length<3){
        alert("Debe proporcionar un password de almenos 3 carcateres");
        password.focus();
        password.select();
        return false;
    }
    
    var tecnologias = forma.tecnologia;
    var checkSeleccionado = false;
    
    for(var i=0; i<tecnologias.length; i++){
        if(tecnologias[i].checked){
            checkSeleccionado = true;
            break;
        }
    }
    
    if(!checkSeleccionado){
        alert("Debe seleccionar una tecnología");
        return false;
    }
    
    var generos = forma.genero;
    var radioSeleccionado = false;
    
    for(var i=0; i<generos.length; i++){
        if(generos[i].checked){
            radioSeleccionado = true;
            break;
        }
    }
    
    if(!radioSeleccionado){
        alert("Debe seleccionar un género");
        return false;
    }
    
    
    var ocupacion = forma.ocupacion;
    if(ocupacion.value==""){
        alert("Debe seleccionar una ocupación");
        return false;
    }
    
    alert("Datos validos. ¿Enviar al servidor?")
    return true;
}

