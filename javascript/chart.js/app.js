var ctx = document.getElementById("myChart").getContext("2d");
        var myChart = new Chart(ctx, {
            type: 'line',
            data: {
                labels: [1,2,3,4,5,6,7,8,9,10],
                datasets: [
                    {
                        label: "My First dataset",
                        data: [1,2,3,2,1,2,3,4,5,4],
                        borderColor: "#3e95cd",
                    }
                ]
            },
            options: {
                responsive: true,
            }
        });