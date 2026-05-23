export function decodedValue(colors:string[]):number {
  const colourCode: {[key:string]:number}= {
    "black": 0,
    "brown": 1,
    "red": 2,
    "orange": 3,
    "yellow": 4,
    "green": 5,
    "blue": 6,
    "violet": 7,
    "grey": 8,
    "white": 9
  };
  return colourCode[colors[0]]*10 + colourCode[colors[1]];

}
