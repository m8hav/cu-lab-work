import React from "react";

class Btn extends React.Component{
    render(){
        return <button onClick={this.props.handleClick}>Click Me</button>;
    }
}

Btn.defaultProps={
    handleClick:()=>{alert("This is default event handler")}
}


export default Btn;