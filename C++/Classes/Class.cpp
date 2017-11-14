#include <iostream>
#include <sstream>
using namespace std;

/*
Enter code for class Student here.
Read statement for specification.
*/


class Student {
    private:
        int age, standard;
        string first_name, last_name;
    
    public:
        void set_age (int Age){
            age = Age;
        }
        int get_age (){
            return age;
        }
        
       void set_standard (int Standard){
            standard = Standard;
        }
        int get_standard (){
            return standard;
        }
    
    
       void set_first_name (string first){
            first_name = first;
        }
        string get_first_name (){
            return first_name;
        }
    
    
        void set_last_name (string last){
            last_name = last;
        }
        string get_last_name (){
            return last_name;
        }
    
        string to_string (){
            /*std::cout << get_age() << ",";
            std::cout << get_first_name() << ", " << get_last_name() << ",";
            std::cout << get_standard() << "\n";*/
                
           /* 
            std::stringstream buff;
            buff << age << ',' << first_name <<',' <<last_name<< ',' << standard;
            string str=buff.str();*/
            //return;
            
            stringstream ss;
            
            ss<<age<<','<<first_name<<','<<last_name<<','<<standard;
            string str = ss.str();
            return str;
            
            
        }
};

int main() {
    int age, standard;
    string first_name, last_name;
    
    cin >> age >> first_name >> last_name >> standard;
        
    Student st;
    st.set_age(age);
    st.set_standard(standard);
    st.set_first_name(first_name);
    st.set_last_name(last_name);
    
    cout << st.get_age() << "\n";
    cout << st.get_last_name() << ", " << st.get_first_name() << "\n";
    cout << st.get_standard() << "\n";
    cout << "\n";
    std::cout << st.to_string();
    
    return 0;
}