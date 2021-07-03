var studentList = new Array;

function testScore(name, math, physical, chemistry) {
    this.name = name;
    this.math = math;
    this.physical = physical;
    this.chemistry = chemistry;
};

// Ham them diem hoc sinh
function add() {
    const sName = document.getElementById("Name").value;
    const math = document.getElementById("Math").value;
    const phy = document.getElementById("Physical").value;
    const che = document.getElementById("Chemistry").value;
   
    if(sName == "" || math == "" || phy == "" || che == ""){

        document.getElementById("alert").innerHTML = "Không được để trống";    

    } 
     else if(isNaN(math) || isNaN(che) || isNaN(phy) ||math>10 || math<0 || phy>10 || phy<0 || che>10 || che<0){
        
        document.getElementById("alert").innerHTML = "Nhập điểm không dung";

    } else {

        document.getElementById("alert").innerHTML = "";

        const TestScore = new testScore(sName, Number(math), Number(phy), Number(che));
        studentList.push(TestScore);
        
        let table = document.getElementById("table");
        let row = table.insertRow(studentList.length);
        row.insertCell(0).innerHTML = studentList.length;
        row.insertCell(1).innerHTML = TestScore.name;
        row.insertCell(2).innerHTML = TestScore.math;
        row.insertCell(3).innerHTML = TestScore.physical;
        row.insertCell(4).innerHTML = TestScore.chemistry;
        row.insertCell(5).innerHTML = "?";
        
        clear();
    }
};

// Ham xoa noi dung form
function clear(){
    document.getElementById("Name").value = "";
    document.getElementById("Math").value = "";
    document.getElementById("Physical").value = "";
    document.getElementById("Chemistry").value = "";
};

// Ham tinh diem trung binh
function calculateAvg(){
    for (let i = 0; i < studentList.length; i++) {
        let avg = (studentList[i].math + studentList[i].physical + studentList[i].chemistry) / 3;
        document.getElementById("table").rows[i + 1].cells[5].innerHTML = avg.toFixed(1);
    };
};

// Ham hien thi hoc sinh co diem TB >=8
function show(){
    for (let i = 0; i < studentList.length; i++) {
        if(document.getElementById("table").rows[i + 1].cells[5].innerHTML >= 8.0) {
            document.getElementById("table").rows[i + 1].style.color = "red";
        };
    };
};