/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #33: PS4_Ex33_Knob.java
 * 
 * A four-way knob has 4 positions: "up", "right", "down" and "left".
 * It has an attached device which has two states: "on" or "off".
 * 
 * Haowei
 */

class Knob {
  
  private String[] positions = {"up", "right", "down", "left"};
  private String[] states = {"on", "off"};
  private int position;
  private int state;
  
  public Knob(String initialPosition, String initialState) {
    switch (initialPosition) {
      case "up" :
        this.position = 0;
        break;
      case "right" :
        this.position = 1;
        break;
      case "down" :
        this.position = 2;
        break;
      case "left" :
        this.position = 3;
        break;
    }

    if(initialState.equals("on")) {
      this.state = 0;
    } else {
      this.state = 1;
    }
  }
  
  // Turn a knob object 'stops' times
  public void turnKnob(int stops) {

    this.position = (this.position+stops)%4;
    this.state = (this.state+stops)%2;
  }
  
  // Return position of a knob object
  public String getPos() {
    
    return this.positions[this.position];
  }
  
  // Return position of the attached device
  public String getDevStat() {
    
    return this.states[this.state];
  }
}