import React from "react";

class Counter extends React.Component{

        constructor(props){
            super(props)
            this.state={
                count:0
            }

            //this.handleClick=this.handleClick.bind(this);
        }

        handleClick(e){
            this.setState((prevState,{count})=>({
                count:prevState.count+1
            }))
        }

        render(){
            return (
                      <div>
                            <p> You clicked {this.state.count} times</p>
                            <button onClick={()=>{this.handleClick()}}>Count</button>

                      </div>
            );
        }
}

export default Counter;