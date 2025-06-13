function Rform()
{
    return(
        <div>
        <h1 align="center">REGISTERATIONFORM</h1><br/><br/>
        <form>
         <fieldset>  
         <label>Name</label>
        <input type="text"/><br/><br/>
        <label>Date Of Birth</label>
        <input type="datetime-local" name="" id=""/><br/><br/>
        <label>Age</label>
        <input type="number"/><br/><br/>
        <label>Gender</label>
        <input type="radio" name="h" id=""/>
        <label>male</label>
        <input type="radio" name="h" id=""/>
        <label>female</label>
        <input type="radio" name="h" id=""/>
        <label>others</label><br/><br/>
        <label>EmailId<span style={{color:' orange'}}>*</span>:</label>                            
        <input type="email" name="" id=""autofocus required/><br/><br/>
        <label>password<span style={{color: 'orange'}}>*</span>:</label>
        <input type="password" name="" id="" placeholderpassword/><br/><br/>
        <label>MobileNumber</label>
        <input type="number"/><br/><br/>
        <input type="submit"/>
    </fieldset>
    </form>
        </div>
    );
}
export default Rform;