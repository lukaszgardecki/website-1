const logregBox = document.querySelector('.logreg-box');
const loginLink = document.querySelector('.login-link');
const loginLinkForgot = document.querySelector('.login-link-forgot');
const registerLink = document.querySelector('.register-link');
const forgotLink = document.querySelector('.forgot-link');

registerLink.addEventListener('click', () => {
    logregBox.classList.add('active');
});

loginLink.addEventListener('click', () => {
    logregBox.classList.remove('active');
});

forgotLink.addEventListener('click', () => {
    logregBox.classList.add('active2');
});

loginLinkForgot.addEventListener('click', () => {
    logregBox.classList.remove('active2');
});