int countBits(int num)
{
  // int n = 0;
  // while (num){
  //   n += num & 1;
  //   num = num >> 1;
  // }
  // return n;
  // or
  if (!num) return 0;
  return (num & 1) + countBits(num >> 1);
}