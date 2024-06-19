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
        <h2 class="text-3xl font-bold text-white text-center mb-6">Logeado</h2>
       <h1 class="text-3xl font-bold text-white text-center mb-6">Bienvenido <%=request.getParameter("username") %></h1>
    </div>
</body>
</html>
