function validarTexto(input, max) {
    let contador = document.getElementById("contador" + input.id.charAt(0).toUpperCase() + input.id.slice(1));
    contador.innerText = input.value.length + "/" + max;

    if (input.value.length > max) {
        input.value = input.value.substring(0, max);
    }

    if (input.value.length === 0) {
        input.classList.add("error");
    } else {
        input.classList.remove("error");
    }
}

function validarCorreo() {
    let correo = document.getElementById("correo");
    let errorCorreo = document.getElementById("errorCorreo");
    let regex = /^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}$/i;

    correo.value = correo.value.toUpperCase();

    if (!regex.test(correo.value)) {
        correo.classList.add("error");
        errorCorreo.innerText = "El correo debe ser en mayúsculas, sin espacios, contener '@' y un dominio válido.";
    } else {
        correo.classList.remove("error");
        errorCorreo.innerText = "";
    }
}

function validarSemestre() {
    let semestre = document.getElementById("semestre");
    let errorSemestre = document.getElementById("errorSemestre");
    
    if(semestre.value < 0 || semestre.value > 16) {
        semestre.classList.add("error");
        errorSemestre.innerText = "El semestre tiene que estar entre 0 y 16";
    } else {
        semestre.classList.remove("error");
        errorSemestre.innerText = "";
    }
}

function validarFormulario() {
    let campos = document.querySelectorAll("input, textarea");
    let valido = true;

    campos.forEach(campo => {
        if (campo.value.trim() === "") {
            campo.classList.add("error");
            document.getElementById("error" + campo.id.charAt(0).toUpperCase() + campo.id.slice(1)).innerText = "Este campo es obligatorio.";
            valido = false;
        }
    });

    return valido;
}