import './App.css';
import Sviet from './sviet.js'; 
function App() {
  return (
    <div className="App">
      {<header className="App-header">
        <img src={"https://www.sviet.edu.in/wp-content/uploads/2023/06/SVIET-LOGO-Edited-1.png"} className="App-logo" alt="logo" />
        <p>
          Sri Vasavi Institute Of Engineering And Technology
        </p>
        <a
          className="App-link"
          href="https://www.sviet.edu.in/"
          target="_blank"
          rel="noopener noreferrer"
        >
          SVIET
        </a>
        <Sviet title="Empowering Minds"></Sviet>
        </header> }
    </div>
  );
}
export default App;

export default function Sviet(props)
{
    return(
<div>
    <h1>
        {props.title}
    </h1>
</div>
    );
}