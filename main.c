#include <stdio.h>
#include <stdlib.h>
int i,j,k,n;
int floydwarshall( int graph[n][n])
{
    int dist[n][n];
    for(i=0;i<n;i++)
        for(j=0;j<n;j++)
           dist[i][j]=graph[i][j];

    for(k=0;k<n;k++)
        for(i=0;i<n;i++)
           for(j=0;j<n;j++)
    {

        if(dist[i][k]+dist[k][j]< dist[i][j])
           dist[i][j]= dist[i][k]+dist[k][j];

    }

    printf("The shortest distance between every pair of vertices is : \n");
    for(i=0;i<n;i++)
    {


        for(j=0;j<n;j++)
    {
        if(dist[i][j]>999)
            printf("INF ");
        else
            printf("%d  ",dist[i][j]);
    }

     printf("\n");
    }
    return 0;

}
int main()
{

    printf("Enter the number of vertices:\n");
    scanf("%d",&n);
    int graph[n][n];
    printf("Enter the cost adjacency matrix (Enter 1000 if distance is INF):\n");
    for(i=0;i<n;i++)
        for(j=0;j<n;j++)
           scanf("%d",&graph[i][j]);
    floydwarshall(graph);
    return 0;
}
