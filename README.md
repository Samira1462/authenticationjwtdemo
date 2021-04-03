# authenticationjwtdemo
authentication with jwt and spring boot 
--------------------------------------------------------------------
curl --location --request POST 'http://localhost:8080/api/auth/signup' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name":"Samira",
    "username":"Samira1463",
    "email":"Samira1462@gmail.com",
    "password":"123456"
}'
--------------------------------------------------------------------
curl --location --request POST 'http://localhost:8080/api/auth/signin' \
--header 'Content-Type: application/json' \
--data-raw '{
    "usernameOrEmail":"Samira1462",
    "password":"123456"
}'
