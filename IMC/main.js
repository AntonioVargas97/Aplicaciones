function calcularIMC() {
    const nombre = document.getElementById("nombre").value;
    const edad = document.getElementById("edad").value;
    const peso = parseFloat(document.getElementById("peso").value);
    const altura = parseFloat(document.getElementById("altura").value);

    if (!nombre || !edad || !peso || !altura) {
        alert("Completa todos los campos");
        return;
    }

    const imc = (peso / (altura * altura)).toFixed(2);

    document.getElementById("resultado").innerText =
        `IMC: ${imc}`;

    guardarRegistro(nombre, peso, altura, imc);
}

function guardarRegistro(nombre, peso, altura, imc) {
    let registros = localStorage.getItem("registros");

    registros = registros ? JSON.parse(registros) : [];

    registros.push({
        nombre,
        peso,
        altura,
        imc
    });

    localStorage.setItem("registros", JSON.stringify(registros));
}

function verRegistros() {
    let registros = localStorage.getItem("registros");

    if (!registros) {
        document.getElementById("registros").innerText = "No hay registros";
        return;
    }

    registros = JSON.parse(registros);

    let texto = "";

    registros.forEach((r, i) => {
        texto += `${i + 1}. Nombre: ${r.nombre}, Peso: ${r.peso}, Altura: ${r.altura}, IMC: ${r.imc}\n`;
    });

    document.getElementById("registros").innerText = texto;
}

const { app, BrowserWindow } = require('electron');
const path = require('path');

function createWindow() {
    const win = new BrowserWindow({
        width: 800,
        height: 600,
        webPreferences: {
            nodeIntegration: true,
            contextIsolation: false
        }
    });

    win.loadFile('index.html');
}

app.whenReady().then(() => {
    console.log("App lista");
    createWindow();
});

app.on('window-all-closed', () => {
    if (process.platform !== 'darwin') {
        app.quit();
    }
});

app.on('activate', () => {
    if (BrowserWindow.getAllWindows().length === 0) {
        createWindow();
    }
});