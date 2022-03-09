$(document).ready(function () {
    alert("Hola");
    cargarEquipos();
})

async function cargarEquipos() {
    const request = await fetch('/', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });
    const computers = await request.json();

    console.log(computers);

    let computer = '<tr>\n' +
        '                <th>\n' +
        '                <td>ddd</td>\n' +
        '                <td></td>\n' +
        '                <td></td>\n' +
        '                <td></td>\n' +
        '                <td></td>\n' +
        '                <td></td>\n' +
        '                <td></td>\n' +
        '                <td></td>\n' +
        '                <td></td>\n' +
        '                <td></td>\n' +
        '                <td></td>\n' +
        '                <td></td>\n' +
        '                </th>\n' +
        '            </tr>'

    document.querySelector('#computersTable tbody').outerHTML = computer;
}