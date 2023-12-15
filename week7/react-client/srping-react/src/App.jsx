/* eslint-disable no-unused-vars */
import { useEffect, useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
import "./App.css";
import axios from 'axios';

function App() {
    const [count, setCount] = useState(0);
    const [message, setMessage] = useState("Welcome to Spring React");
    const [movieList, setMovieList] = useState([]);

    const movieData = {
        title: "Spider Man",
        genre: "Action",
        releaseYear: 2002,
        description: "Web sling go brrrrrrr"
    }

    const updatedMovieData = {
        id: 1,
        title: "Spider Man 2",
        genre: "Action",
        releaseYear: 2002,
        description: "Web sling go brrrrrrr again"
    }

    useEffect(() => {
       axios.get("http://localhost:8080/api")
        .then(response => console.log(setMessage(response.data)))
        .catch(err => console.log(err))
    },[]);

    useEffect(() => {
        axios.get("http://localhost:8080/api/movies")
            .then(response => setMovieList(response.data))
            .catch(err => console.log(err))
    },[])

    const createMovie = () =>  {
        axios.post("http://localhost:8080/api/movies", movieData )
            .then(response => console.log(response.data))
            .catch(err => console.log(err))
    }

    const updateMovie = () =>  {
        axios.put("http://localhost:8080/api/movies", updatedMovieData)
            .then(response => console.log(response.data))
            .catch(err => console.log(err))
    }

    const deleteMovie = (movieId) => {
        axios.delete("http://localhost:8080/api/movies/" + movieId)
            .then(response => {
                console.log(response.data)
                setMovieList(
                    movieList.filter(movie => movie.id !== movieId)
                )
            }).catch(err => console.log(err))
    }


    return (
        
        <>
            <h1>{message}</h1>
            <button>Get</button>
            <button onClick={createMovie}>Create</button>
            <button onClick={updateMovie}>Update</button>
            <button onClick={() => deleteMovie(1)}>Delete</button>

            {
                movieList.map((movie, idx) => (
                    <>
                        <p key={movie.id}>{movie.title}</p>
                        <button onClick={() => deleteMovie(movie.id)}>Delete</button>
                    </>
                ))
            }
        </>
    
    );
}

export default App;
