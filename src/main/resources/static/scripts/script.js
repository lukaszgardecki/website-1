const logregBox = document.querySelector('.logreg-box');

const loginLinkNav = document.querySelector('.login-link-nav');
const loginLinkReg = document.querySelector('.login-link-reg');
const loginLinkForgot = document.querySelector('.login-link-forgot');

const registerLink = document.querySelector('.register-link');
const forgotLink = document.querySelector('.forgot-link');


loginLinkNav.addEventListener('click', () => {
    logregBox.classList.add('show-login');
    logregBox.classList. remove('show-reg', 'show-forgot');
});

loginLinkReg.addEventListener('click', () => {
    logregBox.classList.add('show-login');
    logregBox.classList.remove('show-reg', 'show-forgot');
});

loginLinkForgot.addEventListener('click', () => {
    logregBox.classList.add('show-login');
    logregBox.classList.remove('show-reg', 'show-forgot');
});


registerLink.addEventListener('click', () => {
    logregBox.classList.add('show-reg');
    logregBox.classList.remove('show-login', 'show-forgot');
});

forgotLink.addEventListener('click', () => {
    logregBox.classList.add('show-forgot');
    logregBox.classList.remove('show-login', 'show-reg');
});