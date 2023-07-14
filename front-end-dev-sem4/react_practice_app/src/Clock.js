import React from "react";

class Clock extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            time: new Date()
        }
    }

    render () {
        return (<h1>
            {this.state.time.toString()}
        </h1>);
    }

    componentDidMount() {
        this.interval = setInterval( () => {
            this.setState({
                time: new Date()
            })
        }, 1000);
    }

    componentDidUpdate() {
        console.log("Component updated");
    }

    componentWillUnmount() {
        clearInterval(this.interval);
    }
}

export default Clock;