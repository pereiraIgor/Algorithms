#include <bits/stdc++.h>
 
using namespace std;
 
vector<int> v[100010];
int vis[100010],dist[100010],maior;
int m=0;
 
void bfs(int no){
    queue<int> q;
    q.push(no);
    vis[no] = true;
    dist[no] = 0;
    while(!q.empty()){
        int top = q.front();
        q.pop();
        for(int i=0;i<v[top].size();i++){
            int visinho = v[top][i];
            if(!vis[visinho]){
                vis[visinho] = true;
                dist[visinho] = dist[top]+1;
                q.push(visinho);
                if(dist[visinho]>maior) maior = dist[visinho];
            }
        }
    }
}
 
int main(){
    int n,a, x,y;
    cin>>n>>a;
    for(int i=0;i<n-1; i++){
        cin>>x>>y;
        v[x].push_back(y);
        v[y].push_back(x);
    }
    bfs(a);
    cout<<maior+1<<endl;
    return 0;