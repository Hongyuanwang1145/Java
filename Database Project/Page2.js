
let divison, info;

async function init(){ 
  let link = "https://bookish-pancake-g4rq9pwvvr7wcv6rj.github.dev";  
  let route = "/divison";

  info = await fetch(link + route);  
  division = await info.json();

  generateCards(divison);
}

function generateCards(division){  
  let output = document.getElementById("centerpanel");  
  let build = "";


  for (let i = 0; i < divison.length; i++){    
    let divison = divisons[i];  
    build += `<div class="card">`;
    build += `<h3>Division Name</h3>`;
    build += `<p>${divison.Division}</p>`; 
    build += `<div>Station Name</div>`;
    build += `<div>${divison.StationName}</div>`;    
    build += `<hr>`;
    build += `</div>`;
  }
  centerpanel.innerHTML = build; 
}

function filter(){
  let divisonDivison = document.getElementById("divison").value;
  console.log(divisonDivison);

  let divisionList = [];

  for(let i = 0; i<division.length; i++){
    let divison = divisons[i];
    if(divison.Subway == subway){
      divisionList.push(divison);
    }
  }
  console.log(`Subway stations found: ${divisionList.length}`)
    generateCards(divisionList);
}


