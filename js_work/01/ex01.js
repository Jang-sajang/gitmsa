function doA(){
    alert('click');
}

var heading = document.querySelector("#heading");
var btn = document.querySelector("#btn");

// alert(heading);
heading.onclick = function(){
     heading.style.color = "white";
    heading.innerHTML = "글자도바꿈";
    heading.style.backgroundColor="black";
    heading.style.textAlign="center";
    heading.style.fontSize="100px"        };

    btn.onclick = function(){
        var name = prompt('당신의 이름은?', '이름');
        alert(name);
    }