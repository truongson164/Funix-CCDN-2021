$(document).ready(function () {

    var stt = 1;

    // Ham them diem hoc sinh vao bang
    $("#add").click(function (e) {

        e.preventDefault();
        const sName = $("#Name").val();
        const math = $("#Math").val();
        const phy = $("#Physical").val();
        const che = $("#Chemistry").val();

        if (sName == "" || math == "" || phy == "" || che == "") {
            $("#alert").html("Không được để trống");
        }

        else if (isNaN(math) || isNaN(che) || isNaN(phy) || math > 10 || math < 0 || phy > 10 || phy < 0 || che > 10 || che < 0) {
            $("#alert").html("Nhập điểm không dung");
        }

        else {

            $("#alert").html("");

            const content = "<td>" + stt + "</td>" +
                "<td>" + sName + "</td>" +
                "<td>" + math + "</td>" +
                "<td>" + phy + "</td>" +
                "<td>" + che + "</td>" +
                "<td>?</td>";
            const row = $("#table").append("<tr>" + content + "</tr>");

            $("input").val("");
            stt++;
        }
    });

    // Ham tinh diem trung binh
    $("#calculateAvg").click(function (e) {
        e.preventDefault();
        $("#table tr").each(function () {
            const Math = Number($(this).find("td").eq(2).html());
            const Physical = Number($(this).find("td").eq(3).html());
            const Chemistry = Number($(this).find("td").eq(4).html());
            const Avg = ((Math + Physical + Chemistry) / 3).toFixed(1);
            $(this).find("td").eq(5).html(Avg);
        })
    });

    // Ham hien thi hoc sinh co diem trung binh >=8
    $("#show").click(function (e) {
        e.preventDefault();
        $("#table tr").each(function () {
            if ($(this).find("td").eq(5).html() >= 8.0) {
                $(this).addClass("redText");
            }
        })
    })


});