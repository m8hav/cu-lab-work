import logo from './logo.svg';
import './App.css';
import Page3 from './page3'
import {Routes, Route } from 'react-router-dom';
import Home from './home';
import Page1 from './page1';
import NavBar from './components/NavBar';
import Form from './form';

function App() {
  return (
    <div>
        <NavBar/>
        <Routes>
          <Route path='/' element={<Home/>}></Route>
          <Route path="/Page3" element={<Page3/>}/>
          <Route path="/Page1" element={<Page1/>}>
            <Route path='/Page1/Form' element={<Form></Form>}></Route>
          </Route>
        </Routes>
    </div>
  );
}

export default App;
