import { NavLink } from "react-router-dom";
function Navbar(){
    return(
        <nav>
            <NavLink to='/'>Home</NavLink>
            <NavLink to='/about'>About Us</NavLink>
            <NavLink to="/contact">Contact Us</NavLink>
        </nav>
    )
}

export default Navbar;