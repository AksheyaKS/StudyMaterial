import React, { Component } from 'react';
import CustomValidator from './CustomValidator';

export default class FormEg extends Component {
  constructor() {
    super();

    this.state = {
      userInfo: {
        username: '',
        password: '',
      }
    };

    // Set of validators for signin form
    this.validators = CustomValidator;
    
    // This resets our form when navigating between views
    this.resetValidators();

    // Correctly Bind class methods to reacts class instance
    this.handleInputChange = this.handleInputChange.bind(this);
    this.displayValidationErrors = this.displayValidationErrors.bind(this);
    this.updateValidators = this.updateValidators.bind(this);
    this.resetValidators = this.resetValidators.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
    this.isFormValid = this.isFormValid.bind(this);
  }
  
  /** 
   * This function is called whenever a form input is changed
   * Which in turn updates the state of this component and validators
   */
  handleInputChange(event, inputPropName) {
    const newState = Object.assign({}, this.state);
    newState.userInfo[inputPropName] = event.target.value;
    this.setState(newState);
    this.updateValidators(inputPropName, event.target.value);
  }
  
   /** 
   * This function handles the logic when submiting the form.
   * @TODO make an API request to authenticate the user
   */
  handleSubmit(e) {
    console.log(this.state.userInfo);
    console.log('Yepee! form submitted');
    e.preventDefault();
  }
  
   /** 
   * This function updates the state of the validator for the specified validator
   */
  updateValidators(fieldName, value) {
    this.validators[fieldName].errors = [];
    this.validators[fieldName].state = value;
    this.validators[fieldName].valid = true;
    this.validators[fieldName].rules.forEach((rule) => {
      if (rule.test instanceof RegExp) {
        if (!rule.test.test(value)) {
          this.validators[fieldName].errors.push(rule.message);
          this.validators[fieldName].valid = false;
        }
      } else if (typeof rule.test === 'function') {
        if (!rule.test(value)) {
          this.validators[fieldName].errors.push(rule.message);
          this.validators[fieldName].valid = false;
        }
      }
    });
  }
  
  // This function resets all validators for this form to the default state
  resetValidators() {
    Object.keys(this.validators).forEach((fieldName) => {
      this.validators[fieldName].errors = [];
      this.validators[fieldName].state = '';
      this.validators[fieldName].valid = false;
    });
  }
  
  // This function displays the validation errors for a given input field
  displayValidationErrors(fieldName) {
    const validator = this.validators[fieldName];
    const result = '';
    if (validator && !validator.valid) {
      const errors = validator.errors.map((info, index) => {
        return <span className="error" key={index}>* {info}</span>;
      });

      return (
        <div className="col s12 row">
          {errors}
        </div>
      );
    }
    return result;
  }
  
  // This method checks to see if the validity of all validators are true
  isFormValid() {
    let status = true;
    Object.keys(this.validators).forEach((field) => {
      if (!this.validators[field].valid) {
        status = false;
      }
    });
    return status;
  }
  
  // Renders the template
  render() {
    return (
      <div className="row">
        <div className="col s12 m8 l4 offset-m2 offset-l4 z-depth-4 card-panel login-form">
          <form className="col s12" onSubmit={this.handleSubmit}>
            <div className="row">
              <div className="input-field col s12">
                <h4 className="center login-form-text">Sign into your account</h4>
              </div>
            </div>
            <div className="row margin">
              <div className="input-field col s12">
                <i className="material-icons prefix">person</i>
                <input
                  id="username"
                  type="text"
                  value={this.state.userInfo.username}
                  onChange={event => this.handleInputChange(event, 'username')}
                />
                <label htmlFor="username" className="left-align">username</label>
              </div>
              { this.displayValidationErrors('username') }
            </div>
            <div className="row margin">
              <div className="input-field col s12">
                <i className="material-icons prefix">lock</i>
                <input
                  id="password"
                  type="password"
                  value={this.state.userInfo.password}
                  onChange={event => this.handleInputChange(event, 'password')}
                />
                <label htmlFor="password" className="left-align">Password</label>
              </div>
              { this.displayValidationErrors('password') }
            </div>
            <div className="row">
              <div className="input-field col s12 signup-btn">
                <button className={`btn waves-effect waves-light col s12 ${this.isFormValid() ? '' : 'disabled'}`}>
                  Login
                </button>
              </div>
            </div>
          </form>
        </div>
      </div>
    );
  }
}