class Calculator {
  constructor(a, b, operation) {
    this.a = parseFloat(a);
    this.b = parseFloat(b);
    this.operation = operation;
  }

  getResult() {
    switch (this.operation) {
      case "add":
        return this.a + this.b;
      case "subtract":
        return this.a - this.b;
      case "multiply":
        return this.a * this.b;
      case "divide":
        if (this.b === 0) return "Error: Division by zero";
        return this.a / this.b;
      default:
        return "Invalid operation";
    }
  }
}

function calculate() {
  const a = document.getElementById("a").value;
  const b = document.getElementById("b").value;
  const operation = document.getElementById("operation").value;

  if (a === "" || b === "" || operation === "") {
    document.getElementById("result").innerText = "Please fill in all fields.";
    return;
  }

  const calc = new Calculator(a, b, operation);
  document.getElementById("result").innerText = `Result: ${calc.getResult()}`;
}
