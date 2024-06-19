<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tabla en JSP</title>
    <!-- Tailwind CSS -->
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>
<body class="bg-gray-900 text-white">
    <div class="container mx-auto p-8">
        <h1 class="text-3xl font-bold mb-6 text-center">Tabla de Multiplicar</h1>
        <table class="min-w-full bg-gray-800 rounded-lg shadow-lg">
            
            <tbody>
                <%-- Aquí puedes iterar sobre una lista de usuarios en el backend --%>
                <% for(int i = 1; i <= 10; i++) { %>
                    <tr class="border-b border-gray-700">
                        
                        <% for(int k = 1; k <= 10; k++) { %>
                        <td class="py-3 px-4"><%= i %>x<%= k %>=</td>
                        <td class="py-3 px-2"><%= i*k %></td>
                        
                        <% } %>
                    </tr>
                <% } %>
            </tbody>
        </table>
    </div>
</body>
</html>
