#include <sstream>
#include <vector>
#include <iostream>

using namespace std;



vector<int> parseInts(string str) {
   // Complete this function
   // return stringstream (str);
    vector <int> vt;
   // int i;
    stringstream ss (str);
    int i;
    
    while (ss >> i){
        vt.push_back(i);
        if (ss.peek() == ',')
            ss.ignore();
    }
    
    return vt;
}

int main() {
    string str;
    cin >> str;
    vector<int> integers = parseInts(str);
    for(int i = 0; i < integers.size(); i++) {
        cout << integers[i] << "\n";
    }
    
    return 0;
}