var http = require("http");

function randomInteger(low, high) {
    return Math.floor(Math.random() * (high - low) + low);
}

http.createServer(function (req, res) {
    console.log('The Requested url is ' + req.url);
    res.writeHeader(200, { "Content-Type": "application/json" });
    switch (req.url) {
        case '/temperature':
            res.write('{"Temperature" : ' + randomInteger(30, 40) + '}');
            break;
        case '/light':
            res.write('{"light" : ' + randomInteger(1, 100) + '}');
            break;
        case '/pressure':
            res.write('{"Pressure " : ' + randomInteger(10, 80) + '}');
            break;
        default:
            res.write('{"Hello":"World"}');
    }
    res.end();
}).listen(9797);
console.log("Server is started at http://localhost:9797");
