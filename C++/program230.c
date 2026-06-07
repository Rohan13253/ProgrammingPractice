#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
#include<unistd.h>

int main()
{
    char fname[20] = {'\0'};
    int fd = 0;

    printf("Enter the file name  to be created: ");
    scanf("%s",fname);

    fd = open(fname,O_RDWR);

    if(fd == -1 )
    {
        printf("Unable to open file \n");

    }
    else
    {
        printf("File is open sucessfully with fd %d ",fd);
        close(fd);
    }

    return 0;
}