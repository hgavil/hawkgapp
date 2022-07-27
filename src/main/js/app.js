'use strict';

const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');



class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = {units: []};
    }

    componentDidMount() {
        client({method: 'GET', path: '/api/units'}).done(response => {
            this.setState({units: response.entity._embedded.units});
        });
    }

    render() {
        return (
            <UnitList units={this.state.units}/>
        )
    }
}


class UnitList extends React.Component {
    render() {
        const units = this.props.units.map(unit =>
            <Unit key={unit._links.self.href} unit={unit}/>
        );
        return (
            <table>
                <tbody>
                <tr>
                    <th>Name</th>
                    <th>Class</th>
                </tr>
                {units}
                </tbody>
            </table>
        )
    }
}

class Unit extends React.Component {
    render() {
        return (
            <tr>
                <td>{this.props.unit.name}</td>
                <td>{this.props.unit.unitClass}</td>
            </tr>
        )
    }
}

ReactDOM.render(
    <App />,
    document.getElementById('react')
)