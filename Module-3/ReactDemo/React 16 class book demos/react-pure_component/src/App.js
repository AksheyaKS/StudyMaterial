import { PureComponent } from 'react';
import React from 'react';
import ReactDOM from 'react-dom';

export default class EmployeeInfo extends React.PureComponent {

  constructor(props) {
      super(props);
      this.state = { 
          emps: [
              { name: 'Ajay', status: false, designation: 'Consultant'},
              { name: 'Vinoth', status: true, designation: 'Sr. Consultant' },
              { name: 'avinash', status: false, designation: 'Trainee'},
          ]
      };
  }

  componentDidMount() {
      setInterval(() => {
          this.setState((oldState) => {
              return { emps: [...oldState.emps] }
          });
      }, 5000);
  }

  render() {
      console.log('EmployeeInfo render called');
      return (<div>
          {this.state.emps.map((todo, i) => {
            return (<TodoItem
              key={i}
              name={todo.name}
              status={todo.status}
              designation={todo.designation}
            />);
          })}
        </div>);
  }
}

class TodoItem extends React.PureComponent {

  render() {
      console.log('TodoItem render called');
      return (<div>
              {this.props.status ? '✓': '▢'} {this.props.name}--->{this.props.designation}
              
          </div>);
  }
}

