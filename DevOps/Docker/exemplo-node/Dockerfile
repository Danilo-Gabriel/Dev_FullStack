#Imagem node versão 14 no docker hub
FROM node:14
#Pasta criada com a imagem
WORKDIR /app-node
#Argumento passado para o parametro em index.js
#O ARG no Docker é usado para passar variáveis durante a construção da imagem
ARG PORT_BUILD=6000
#O ENV no Docker é usado para definir variáveis de ambiente dentro de um contêiner Docker.
ENV PORT=$PORT_BUILD
#VARIAVEL DE AMBIENTE PASSADA
EXPOSE $PORT_BUILD
#Onde eu irei copiar para criar a imagem
COPY . .
RUN npm install
ENTRYPOINT npm start