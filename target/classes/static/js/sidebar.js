let sidebar = document.querySelector(".sidebar");
let closeBtn = document.querySelector("#btn");
let mheader = document.querySelector("header");
closeBtn.addEventListener("click", () => {
    sidebar.classList.toggle("open");
    menuBtnChange();//calling the function(optional)
});

function menuBtnChange() {
    if (sidebar.classList.contains("open")) {
        closeBtn.classList.replace("bx-menu", "bx-menu-alt-right");
        mheader.classList.replace('header', 'barra_header');
    } else {
        mheader.classList.replace('barra_header', 'header');
        closeBtn.classList.replace("bx-menu-alt-right", "bx-menu");
    }
}

function limpiarCampos() {
    window.location='/views/computers/';
}