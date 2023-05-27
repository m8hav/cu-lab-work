products.forEach(val => {
    let mrp = val.mrp;
    let discount = val.discount.rate;
    if (val.discount.isPercentage) {
        mrp = mrp - (mrp*discount)/100;
    } else {
        mrp -= discount;
    }

    let output_str = `The price of ${val.name} after discount is Rs.${mrp}`;
    console.log(output_str);
})