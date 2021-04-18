import firebase from "firebase/app";
import "firebase/auth"

const fire =firebase.initializeApp({
    apiKey: "AIzaSyBtXQbMhiNogse4tFa039VB90IMK9pPNFc",
    authDomain: "auth-react-5f8c4.firebaseapp.com",
    projectId: "auth-react-5f8c4",
    storageBucket: "auth-react-5f8c4.appspot.com",
    messagingSenderId: "796863177645",
    appId: "1:796863177645:web:8d84fa6584e60afdbdf724",
    measurementId: "G-F6BEN3E3NX"
})
export const auth =fire.auth()
export default fire;
