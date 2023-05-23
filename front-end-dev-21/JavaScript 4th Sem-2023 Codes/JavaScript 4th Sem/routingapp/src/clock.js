import {React,Component} from 'react';

class Clock extends Component{
  constructor(){
    super();
    this.state={
      time:new Date()
    }
  }

  render(){
    return <h1>{this.state.time.toLocaleTimeString()}</h1>
  }

  componentDidMount(){
    this.interval = setInterval(
      ()=>{
        this.setState({time:new Date()})
      },1000
    )
  }

  componentWillUnmount(){
    clearInterval(this.interval);
  }

  componentDidUpdate(){
    console.log("Component Updated");
  }

}

export default Clock;