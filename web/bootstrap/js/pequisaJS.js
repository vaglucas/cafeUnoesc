/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
function marca_desmarca(){
    var x = document.getElementById("texto");
    var e = document.getElementsByTagName("input");
    var master = document.getElementById("check_master");
    var bool;   
                
    if (x.innerHTML == "Marcar Todos"){
        bool = true;
        x.innerHTML = "Desmarcar Todos";
    }else{
        x.innerHTML = "Marcar Todos"
    }
    for (var i = 1; i<e.length; i++){
        if(e[i].type=="checkbox"){
                                    
            e[i].checked = bool;
        }
    }
    master.checked = false;
}        
function marca_desmarca_varios(){
    var x = document.getElementById("marca_vda");
    var e = document.getElementsByName("varios");
    var master = document.getElementById("check_vda");
    var bool;   
                
    if (x.innerHTML == "Marcar Todos VDA/HDO/CNO/XXE"){
        bool = true;
        x.innerHTML = "Desmarcar Todos VDA/HDO/CNO/XXE";
    }else{
        x.innerHTML = "Marcar Todos VDA/HDO/CNO/XXE"
    }
    for (var i = 0; i<e.length; i++){
        if(e[i].type=="checkbox"){
                                    
            e[i].checked = bool;
        }
    }
    master.checked = false;
}             
function marca_desmarca_cpz(){
    var x = document.getElementById("marca_cpz");
    var e = document.getElementsByName("CPZ");
    var master = document.getElementById("check_cpz");
    var bool;   
                
    if (x.innerHTML == "Marcar Todos CPZ"){
        bool = true;
        x.innerHTML = "Desmarcar Todos CPZ";
    }else{
        x.innerHTML = "Marcar Todos CPZ"
    }
    for (var i = 0; i<e.length; i++){
        if(e[i].type=="checkbox"){
                                    
            e[i].checked = bool;
        }
    }
    master.checked = false;
}
function marca_desmarca_cpo(){
    var x = document.getElementById("marca_cpo");
    var e = document.getElementsByName("CPO");
    var master = document.getElementById("check_cpo");
    var bool;   
                
    if (x.innerHTML == "Marcar Todos CPO"){
        bool = true;
        x.innerHTML = "Desmarcar Todos CPO";
    }else{
        x.innerHTML = "Marcar Todos CPO"
    }
    for (var i = 0; i<e.length; i++){
        if(e[i].type=="checkbox"){
                                    
            e[i].checked = bool;
        }
    }
    master.checked = false;
}
function marca_desmarca_cnc(){
    var x = document.getElementById("marca_cnc");
    var e = document.getElementsByName("CNC");
    var master = document.getElementById("check_cnc");
    var bool;   
                
    if (x.innerHTML == "Marcar Todos CNC"){
        bool = true;
        x.innerHTML = "Desmarcar Todos CNC";
    }else{
        x.innerHTML = "Marcar Todos CNC"
    }
    for (var i = 0; i<e.length; i++){
        if(e[i].type=="checkbox"){
                                    
            e[i].checked = bool;
        }
    }
    master.checked = false;
}
function write_to_excel() {
    str = "";
    var mytable = document.getElementById("tabCTV");
    var rowCount = mytable.rows.length;
    var colCount = mytable.getElementsByTagName("tr")[0].getElementsByTagName("th").length;
    var ExcelApp = new ActiveXObject("Excel.Application");
    var ExcelSheet = new ActiveXObject("Excel.Application");
    ExcelSheet.Application.Visible = true;
    for (var i = 0; i < rowCount; i++) {
        for (var j = 0; j < colCount; j++) {
            if (i == 0) {
                str = mytable.getElementsByTagName("tr")[i].getElementsByTagName("th")[j].innerText;
            }
            else {
                str = mytable.getElementsByTagName("tr")[i].getElementsByTagName("td")[j].innerText;
            }
            ExcelSheet.ActiveSheet.Cells(i + 1, j + 1).Value = str;
        }
    }
    ExcelSheet.autofit;
    ExcelSheet.Application.Visible = true;
    DisplayAlerts = true;
    CollectGarbage();
}    
            
      
