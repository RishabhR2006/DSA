import java.util.*;
public class Digraph{
    static class Graph{
        int n;
        List<Integer>[] adj;
        Graph(int v){
            n=v;
            adj=new ArrayList[v];
            for(int i=0;i<v;i++)adj[i]=new ArrayList<>();
        }
        void addVertex(){
            n++;
            adj=Arrays.copyOf(adj,n);
            adj[n-1]=new ArrayList<>();
        }
        void removeVertex(int v){
            if(v<0||v>=n)return;
            for(int i=0;i<n;i++)adj[i].removeIf(x->x==v);
            List<Integer>[] newAdj=new ArrayList[n-1];
            for(int i=0,j=0;i<n;i++){
                if(i==v)continue;
                newAdj[j]=new ArrayList<>();
                for(int x:adj[i])newAdj[j].add(x>v?x-1:x);
                j++;
            }
            adj=newAdj;
            n--;
        }
        void addEdge(int u,int v){
            if(u<n&&v<n&&!adj[u].contains(v))adj[u].add(v);
        }
        void removeEdge(int u,int v){
            if(u<n&&v<n)adj[u].remove(Integer.valueOf(v));
        }
        boolean edgeExists(int u,int v){
            return u<n&&v<n&&adj[u].contains(v);
        }
        int outDegree(int v){
            return v<n?adj[v].size():-1;
        }
        int inDegree(int v){
            int c=0;
            for(int i=0;i<n;i++)if(adj[i].contains(v))c++;
            return c;
        }
        void printGraph(){
            System.out.println("Adjacency List (Directed):");
            for(int i=0;i<n;i++){
                System.out.print(i+" -> ");
                for(int w:adj[i])System.out.print(w+" ");
                System.out.println();
            }
        }
        void bfs(int s){
            boolean[] vis=new boolean[n];
            Deque<Integer> q=new ArrayDeque<>();
            vis[s]=true;
            q.addLast(s);
            System.out.print("BFS: ");
            while(!q.isEmpty()){
                int u=q.removeFirst();
                System.out.print(u+" ");
                for(int w:adj[u])if(!vis[w]){vis[w]=true;q.addLast(w);}
            }
            System.out.println();
        }
        void dfsUtil(int u,boolean[] vis){
            vis[u]=true;
            System.out.print(u+" ");
            for(int w:adj[u])if(!vis[w])dfsUtil(w,vis);
        }
        void dfs(int s){
            boolean[] vis=new boolean[n];
            System.out.print("DFS: ");
            dfsUtil(s,vis);
            System.out.println();
        }
    }
    public static void main(String[] args){
        Graph g=new Graph(6);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(3,4);
        g.addEdge(2,5);
        g.printGraph();
        g.bfs(0);
        g.dfs(0);
        System.out.println("Edge 1->3 exists: "+g.edgeExists(1,3));
        System.out.println("Out-degree of 1: "+g.outDegree(1));
        System.out.println("In-degree of 3: "+g.inDegree(3));
        g.removeEdge(1,3);
        System.out.println("After removing edge 1->3:");
        g.printGraph();
        g.addVertex();
        System.out.println("Added vertex "+(g.n-1));
        g.addEdge(4,g.n-1);
        g.printGraph();
        g.removeVertex(2);
        System.out.println("After removing vertex 2:");
        g.printGraph();
    }
}