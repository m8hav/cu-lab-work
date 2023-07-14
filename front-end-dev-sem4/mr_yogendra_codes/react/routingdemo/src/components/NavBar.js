import { NavLink } from "react-router-dom";

function NavBar(){
    return(
    <nav>
        <ul>
        <li>
          <NavLink to="/">Home</NavLink>
        </li>
        <li>
          <NavLink to="/Page3">Page3</NavLink>
        </li>
        <li>
          <NavLink to="/Page1">Page1</NavLink>
        </li>
      </ul>
    </nav>

    )
}

export default NavBar;