

class Solution {
    
    private void dfs(int vertex, ArrayList<ArrayList<Integer>>adj, boolean[] visited, ArrayList<Integer>result){
        visited[vertex] = true;
        result.add(vertex);
        
        for(int neighbor:adj.get(vertex)){
            if(!visited[neighbor]){
                dfs(neighbor,adj,visited,result);
            }
        }
    }
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer>result = new ArrayList<>();
        boolean[] visited = new boolean[V];
        dfs(0,adj,visited,result);
        return result;
    }
}
