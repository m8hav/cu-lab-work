import './App.css';
import Navbar from "./Navbar";
import Home from "./Home";
// import About from "./About";
// import Contact from "./Contact";
import { BrowserRouter, Routes, Route } from  "react-router-dom";
import Clock from "./Clock";

function App() {
  return (
    <BrowserRouter>
      <Clock />
      
      <Navbar />

      <Routes>
        <Route exact path="/" element={<Home />} />
        <Route exact path="/:page" element={<Home />} />
      </Routes>

    </BrowserRouter>
  );
}

export default App;