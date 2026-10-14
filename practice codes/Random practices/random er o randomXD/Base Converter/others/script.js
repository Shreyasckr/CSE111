function convert() {
    // Getting values from the UI
    let n = parseInt(document.getElementById("numInput").value);
    let b = parseInt(document.getElementById("baseInput").value);
    const resultDisplay = document.getElementById("result");

    // Basic validation
    if (isNaN(n) || isNaN(b) || b < 2 || b > 16) {
        resultDisplay.innerText = "Invalid Input";
        return;
    }

    let chars = "0123456789ABCDEF";
    let result = "";

    // If number is 0, the loop won't run, so we handle it manually
    if (n === 0) {
        result = "0";
    }

    // This is the logic from your Java code
    while (n > 0) {
        let remainder = n % b;
        result = chars.charAt(remainder) + result;
        n = Math.floor(n / b); // Math.floor is needed because JS numbers are decimals by default
    }

    // Displaying the output
    resultDisplay.innerText = result;
}