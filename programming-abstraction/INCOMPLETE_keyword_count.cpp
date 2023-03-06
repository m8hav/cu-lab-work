// February 26, 2023

// Given a string that contains lowercase and uppercase alphabets,
// along with the space character. Also given a word,
// count how many times the given word occurs in the given string.

// EXAMPLE:

// INPUT 1:
// 2                            // Test Cases
// abcd abc Xyz                 // string (TC-1)
// abc                          // word (TC-1)
// Code Quotient CoDE and CoDE  // string (TC-2)
// CoDE                         // word (TC-2)

// OUTPUT:
// 1
// 2

// INPUT 2:
// 2
//  
//  
// (try spaces in word for string)
// (CQ Test Case 4 in Mukesh sir's WhatsApp)

#include <iostream>
using namespace std;

// My Solution
// Works in all but Test Case 4 in CQ Module >> PA Pracitcal >> Week 3
int keywordCount(string str, string ogword) {
  
  int sl = str.length();
  int owl = ogword.length();

  // making new word after removing whitespaces before and after word in case present
  string word = "";
  for (int i = 0; i < owl; i++)
    if (ogword[i] != ' ') word += ogword[i];
  int wl = word.length();
  
  int count = 0;
  bool flag;
  for (int i = 0; i < sl-wl+1; i++){
    if (str[i] == word[0] and (str[i+wl] == ' ' or i+wl == sl)){
      flag = true;
      for (int j = 1; j < wl; j++){
        if (str[i+j] != word[j]){
          flag = false;
          break;
        }
      }
      if (flag) count++;
    }
  }
  return count;
}

// Disha's solution
// Works but probably copied since methods used haven't been taught yet 💀
// int keywordCount(string str, string word) {
//   // Write your code here
//   int n=str.length();
//   int m=word.length();
//   int ans=0;
//   string s;
//   for(int i=0;i<n;i++){
//     if(str[i]==' '){
//       if(s==word){
//         ans++;
//       }
//         s.erase();
//     }
//     else{
//       s=s+str[i];
//     }
//   }
//   if(s==word) ans++;
  
//   return ans;
// }

int main() {
  int t;
  string T;
  getline(cin, T);
  t = stoi(T);
  string str, word;
  while(t--)
  {
    getline(cin, str);
    getline(cin, word);
    cout << keywordCount(str, word) << endl;
  }
  return 0;
}