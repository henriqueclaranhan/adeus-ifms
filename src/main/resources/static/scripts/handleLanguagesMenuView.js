const languageSelectorButton = document.querySelector("#language-selector-button");
const menuOptions = document.querySelector("#menu-options");
const backgroundClickContainer = document.querySelector("#background-click-container");

const showLanguagesMenu = () => {
	backgroundClickContainer.style = "z-index: 1; display: block;";
	menuOptions.style = "z-index: 2; display: block;";
}

const hideLanguagesMenu = () => {
	backgroundClickContainer.style = "z-index: -1; display: none;";
	menuOptions.style = "z-index: -1; display: none;";
}

languageSelectorButton.addEventListener("click", showLanguagesMenu, false);

backgroundClickContainer.addEventListener("click", hideLanguagesMenu, false);