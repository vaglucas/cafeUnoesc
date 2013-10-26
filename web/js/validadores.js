function verificarCPF(c) {
    var i;
    s = c;
    var c = s.substr(0, 9);
    var dv = s.substr(9, 2);
    var d1 = 0;
    var v = false;
    for (i = 0; i < 9; i++) {
        d1 += c.charAt(i) * (10 - i);
    }
    if (d1 == 0) {
        alert("CPF Inválido")
        v = true;
        return false;
    }
    d1 = 11 - (d1 % 11);
    if (d1 > 9)
        d1 = 0;
    if (dv.charAt(0) != d1) {
        alert("CPF Inválido")
        v = true;
        return false;
    }

    d1 *= 2;
    for (i = 0; i < 9; i++) {
        d1 += c.charAt(i) * (11 - i);
    }
    d1 = 11 - (d1 % 11);
    if (d1 > 9)
        d1 = 0;
    if (dv.charAt(1) != d1) {
        alert("CPF Inválido")
        v = true;
        return false;
    }
    if (!v) {
        alert("Válido")
    }
}
function mascara(src, mask) {
    var i = src.value.length;
    var saida = mask.substring(0, 1);
    var texto = mask.substring(i)

    if (texto.substring(0, 1) != saida)
    {
        src.value += texto.substring(0, 1);
    }

}
function ValidaCNPJ(cnpj) {

    var i = 0;
    var l = 0;
    var strNum = "";
    var strMul = "6543298765432";
    var character = "";
    var iValido = 1;
    var iSoma = 0;
    var strNum_base = "";
    var iLenNum_base = 0;
    var iLenMul = 0;
    var iSoma = 0;
    var strNum_base = 0;
    var iLenNum_base = 0;

    if (cnpj == "")
        return ("Preencha o campo CNPJ.");

    l = cnpj.length;
    for (i = 0; i < l; i++) {
        caracter = cnpj.substring(i, i + 1)
        if ((caracter >= '0') && (caracter <= '9'))
            strNum = strNum + caracter;
    }
    ;

    if (strNum.length != 14)
        return ("CNPJ deve conter 14 caracteres.");

    strNum_base = strNum.substring(0, 12);
    iLenNum_base = strNum_base.length - 1;
    iLenMul = strMul.length - 1;
    for (i = 0; i < 12; i++)
        iSoma = iSoma +
                parseInt(strNum_base.substring((iLenNum_base - i), (iLenNum_base - i) + 1), 10) *
                parseInt(strMul.substring((iLenMul - i), (iLenMul - i) + 1), 10);

    iSoma = 11 - (iSoma - Math.floor(iSoma / 11) * 11);
    if (iSoma == 11 || iSoma == 10)
        iSoma = 0;

    strNum_base = strNum_base + iSoma;
    iSoma = 0;
    iLenNum_base = strNum_base.length - 1
    for (i = 0; i < 13; i++)
        iSoma = iSoma +
                parseInt(strNum_base.substring((iLenNum_base - i), (iLenNum_base - i) + 1), 10) *
                parseInt(strMul.substring((iLenMul - i), (iLenMul - i) + 1), 10)

    iSoma = 11 - (iSoma - Math.floor(iSoma / 11) * 11);
    if (iSoma == 11 || iSoma == 10)
        iSoma = 0;
    strNum_base = strNum_base + iSoma;
    if (strNum != strNum_base)
        return ("CNPJ inválido.");

    return ("CNPJ vlido");

}
function ativarCnpjCpf(tipo) {
    if (tipo === "fisica") {
        document.getElementById("cpf").disabled = false;
        document.getElementById("rg").disabled = false;
        document.getElementById("cnpj").disabled = true;
        document.getElementById("ie").disabled = true;

    }    if (tipo === "juridica") {
        document.getElementById("cnpj").disabled = false;
        document.getElementById("ie").disabled = false;
        document.getElementById("cpf").disabled = true;
        document.getElementById("rg").disabled = true;

    }

}
function ativarValoresRurais(tipo){
        if (tipo === "rural") {
                    document.getElementById("capacidadeEstovagem").disabled = false;
                    document.getElementById("capacidadeAlojamento").disabled = false;
                    document.getElementById("quantidadeSilos").disabled = false;
                    document.getElementById("sistemaProdutor").disabled = false;
         }
          if (tipo === "urbano") {
                    document.getElementById("capacidadeEstovagem").disabled = true;
                    document.getElementById("capacidadeAlojamento").disabled = true;
                    document.getElementById("quantidadeSilos").disabled = true;
                    document.getElementById("sistemaProdutor").disabled = true;
         }
   
}
function ativaGlaneleiro(tipo){
    if(tipo === "glaneleiro"){
        document.getElementById("quantidadeDivisao").disabled = false;
    }else{
        document.getElementById("quantidadeDivisao").disabled = true;
    }
}
