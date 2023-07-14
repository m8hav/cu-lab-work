import { useState } from "react";
function Home(){
    var [color,updateColor] = useState("blue");
    return(
        <div>
            <h1>{color}</h1>            
            <button onClick={
                ()=>{
                    updateColor("Green")
                }
            }>Change Color</button>
        </div>
    )
}

export default Home;