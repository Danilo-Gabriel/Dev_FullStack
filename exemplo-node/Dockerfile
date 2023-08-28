#Imagem node versão 14 no docker hub
FROM node:14
#Pasta criada com a imagem
WORKDIR /app-node
#Onde eu irei copiar para criar a imagem
COPY . .
RUN npm install
ENTRYPOINT npm start