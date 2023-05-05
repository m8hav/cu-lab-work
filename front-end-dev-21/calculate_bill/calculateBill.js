function calculateBill(bill) {
    let totalBillAmount = 0;
    let billItems = [];

    // write your code here
    let menuBillItems = bill.billItems;
    menuBillItems.forEach((item) => {
        let itemId = item.id;
        let itemQuantity = item.quantity;
        let itemDiscountRate = item.discount.rate;
        let itemDiscountIsInPercent = item.discount.isInPercent;

        let menuItemObj = menu.filter((menuItem) => menuItem.id == itemId)[0];
        let itemName = menuItemObj.itemName;
        let itemRate = menuItemObj.rate;
        let itemTaxes = menuItemObj.taxes;

        // setting item amount to rate
        let itemAmount = 0;
        itemAmount = itemRate;

        // calculating discount
        if (itemDiscountIsInPercent)
            itemAmount -= itemAmount*itemDiscountRate/100;
        else itemAmount -= itemDiscountRate;

        // calculating taxes
        let totalItemTaxes = 0;
        itemTaxes.forEach((taxItem) => {
            let itemTaxRate = taxItem.rate;
            if (taxItem.isInPercent){
                totalItemTaxes += itemAmount*itemTaxRate/100;
            }
            else totalItemTaxes += itemTaxRate;
        })
        // adding taxes to item amount
        itemAmount += totalItemTaxes;

        // getting total amount for quantity
        itemAmount *= itemQuantity;

        // adding item amount to total bill
        totalBillAmount += itemAmount;

        // appending item string to billItems array
        let itemString = `${itemName}@${itemRate} x ${itemQuantity} = ${itemAmount.toFixed(2)}`;
        billItems.push(itemString);
    })
    return [totalBillAmount.toFixed(2), billItems];
}

let result = calculateBill(bill);
console.log(result[0]);
console.log(result[1]);