function functionDeclaration() {
  return "Function created using 'Function Declaration' is invoked.";
}

var anonymousFunction = function () {
  return "Anonymous Function invoked";
};

var arrowFunction = () => {
  return "Arrow Function invoked";
};
function functionInvoker1() {
  document.getElementById("functionDeclaration").innerHTML =
    functionDeclaration();
}

function functionInvoker2() {
  document.getElementById("anonymousFunction").innerHTML = anonymousFunction();
}
function functionInvoker3() {
  document.getElementById("arrowFunction").innerHTML = arrowFunction();
}
