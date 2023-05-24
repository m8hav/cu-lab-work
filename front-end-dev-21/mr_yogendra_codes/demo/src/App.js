import logo from './logo.svg';
import './App.css';
import React from 'react';
import ReactDOM from 'react-dom'
import Users from './users';
import Page1 from './components/page1';
import Page2 from './components/page2';
import Navbar from './components/navbar';
import Greet from './components/greet';

import { BrowserRouter, Routes, Route,Link } from 'react-router-dom';


function App() { 
  var users = [1,2,3,4,5,6]; 
  return (
   <div>
      <BrowserRouter>
       <Link to='/'>Home</Link>
      {
          users.map((ele)=>{
             return <Link to={`/user/${ele}`}>User {ele}</Link>
          })
      }
        <Routes>
          <Route path="/" element={<Greet/>}></Route>
          <Route path="/user/:userId" element={<Users></Users>}/>         
        </Routes>
      </BrowserRouter>
   </div>
  );
}

export default App;
