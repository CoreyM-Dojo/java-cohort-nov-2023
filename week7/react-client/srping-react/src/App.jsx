/* eslint-disable no-unused-vars */
import { useEffect, useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
import "./App.css";
import axios from 'axios';

function App() {
    const [count, setCount] = useState(0);
    const [message, setMessage] = useState("Welcome to Spring React");

    useEffect(() => {
       axios.get("http://localhost:8080/api")
        .then(response => console.log(setMessage(response.data)))
        .catch(err => console.log(err))
    },[]);
    return <h1>{message}</h1>;
}

export default App;
