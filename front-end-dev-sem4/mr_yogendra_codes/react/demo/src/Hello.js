import react from 'react'

function Hello(props){
    console.log(props);
    return(
       <div>
         {
            props.name.map(function(element){
                return(<h1>Hello! {element}</h1>);
            })
         }        
       </div>
    )
}

export default Hello;