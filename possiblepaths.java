

class Solution {
    // Function to count paths between two vertices in a directed graph.
    int count=0;
    public int countPaths(int V, ArrayList<ArrayList<Integer>> adj, int source,
                   int destination) {
        // Code here
        dfs(source,destination,adj);
        return count;
    }
    void dfs(int node, int destination, ArrayList<ArrayList<Integer>>adj){
        if(node==destination){
            count++;
        }
        for(int nbr:adj.get(node)){
            dfs(nbr, destination, adj);
        }
    }
}
