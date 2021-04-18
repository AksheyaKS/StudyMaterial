import Radium,{StyleRoot} from 'radium';
import React from 'react';
import color from 'color';
import PropTypes from 'prop-types';

Button = Radium(Button);
export default class Button extends React.Component {
  static propTypes = {
    kind: PropTypes.oneOf(['primary', 'warning']).isRequired
  };

  render() {
    // Radium extends the style attribute to accept an array. It will merge
    // the styles in order. We use this feature here to apply the primary
    // or warning styles depending on the value of the `kind` prop. Since its
    // all just JavaScript, you can use whatever logic you want to decide which
    // styles are applied (props, state, context, etc).
    return (
      <StyleRoot><div>
      <button 
        style={[
          styles.base,
          styles[this.props.kind]
        ]}>
        hi , hello
        {this.props.children}
      </button>
      </div>
      </StyleRoot>
    );
  }
}

var styles = {
  base: {
    color: '#fff',
    '@media screen and (orientation: landscape)': {
      width: '20%',
      textAlign: 'center',
      paddingBottom: '200px',
    },
    // Adding interactive state couldn't be easier! Add a special key to your
    // style object (:hover, :focus, :active, or @media) with the additional rules.
    ':hover': {
      background: color('red')//.lighten(0.2).hexString()
    }
  },

  primary: {
    background: 'green'
  },

  warning: {
    background: 'yellow'
  }
};