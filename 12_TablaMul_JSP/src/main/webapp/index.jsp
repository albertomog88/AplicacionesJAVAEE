<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio de Sesión</title>
    <!-- Tailwind CSS -->
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/styles.css">
</head>
<body class="bg-gray-900 flex items-center justify-center h-screen">
    <div class="max-w-md w-full bg-gray-800 rounded-lg shadow-md p-8">
        <h2 class="text-3xl font-bold text-white text-center mb-6">Tablas de multiplicar</h2>
        <form action="tabla" method="post">
            <div class="mb-4">
                <label for="username" class="block text-gray-400">Numero</label>
                <input type="text" id="numero" name="numero" required class="mt-1 block w-full px-3 py-2 bg-gray-700 text-white rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500">
            </div>
            
            <button type="submit" class="w-full bg-blue-500 text-white py-2 rounded-lg hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-500">Ver Tabla</button>
        </form>
    </div>
</body>
</html>
