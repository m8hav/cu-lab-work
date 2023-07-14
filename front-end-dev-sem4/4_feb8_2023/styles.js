let menu = [
    {
        id: 'item1',
        name: 'Roti',
        rate: 5,
        taxes: [
            {
                name: 'Service Tax',
                rate: 50,
                isPercentage: false
            },
            {
                name: 'GST',
                rate: 18,
                isPercentage: true
            }
        ]
    }, {
        id: 'item2',
        name: 'Paneer Makhni',
        rate: 285,
        taxes: [

            {
                name: 'GST',
                rate: 18,
                isPercentage: true
            }
        ]
    }, {
        id: 'item3',
        name: 'Chicken Tandori',
        rate: 380,
        taxes: [
            {
                name: 'Service Tax',
                rate: 100,
                isPercentage: false
            },
            {
                name: 'GST',
                rate: 18,
                isPercentage: true
            }
        ]
    }
]

for (var item in menu) {
    console.log(`Name: ${menu[item].name}\nRate: ${menu[item].rate}`);
}
