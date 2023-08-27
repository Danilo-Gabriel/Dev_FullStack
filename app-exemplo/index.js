const express = require('express')
let app = express();

app.use(express.static("."));

app.get("/", (req,res)=>{
    res.sendFile(__dirname + '/index.html')
})


/* ORIGINAL 
app.listen("3000", ()=>{
    console.log("Server is listening on port 3000")
}
*/

//VARIAVEL DE AMBIENTE 
app.listen(process.env.PORT, ()=>{
    console.log("Server is listening on port 3000")
}

)