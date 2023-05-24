// Function to make a POST request using the CORS Anywhere proxy
function postRequest(url, data) {
	return fetch("https://cors-anywhere.herokuapp.com/" + url, {
		method: "POST",
		headers: {
			"Content-Type": "application/json"
		},
		body: JSON.stringify(data)
	})
		.then(response => response.json());
}

// Function to make a GET request using the CORS Anywhere proxy
function getRequest(url) {
	return fetch("https://cors-anywhere.herokuapp.com/" + url)
		.then(response => response.json());
}

// Compile button click event handler
document.getElementById("compile").addEventListener("click", function () {
	var code = document.getElementById("code").value;
	var langId = document.getElementById("languages").value;

	var requestData = {
		code: code,
		langId: langId
	};

	postRequest("https://codequotient.com/api/executeCode", requestData)
		.then(response => {
			if (response.error) {
				console.log("Error:", response.error);
				return;
			}

			var codeId = response.codeId;
			clearInterval(intervalId);

			var intervalId = setInterval(function () {
				getRequest("https://codequotient.com/api/codeResult/" + codeId)
					.then(response => {
						if (response.data) {
							clearInterval(intervalId);
							if (response.data.output) {
								document.getElementById("output").textContent = response.data.output;
							} else if (response.data.errors) {
								document.getElementById("output").textContent = "Errors: " + response.data.errors;
							} else {
								document.getElementById("output").textContent = "No output or errors found.";
							}
						}
					});
			}, 2000);
		});
});