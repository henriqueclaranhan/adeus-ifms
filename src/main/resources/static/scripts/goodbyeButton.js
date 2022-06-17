const contentSayGoodbyeP = document.querySelector("content > p");
const sayGoodByeForm = document.querySelector("#say-goodbye-form");
const sayGoodByeButton = document.querySelector("#say-goodbye-button");

const userSaidGoodbye = localStorage.getItem("userSaidGoodbye");

if (userSaidGoodbye != null) {
	contentSayGoodbyeP.innerHTML = contentSaidGoodbyePText;
	sayGoodByeForm.remove()
}

sayGoodByeButton.addEventListener("click", () => {
	sayGoodByeButton.style.display = "none";
	localStorage.setItem("userSaidGoodbye", "yes");
}, false);