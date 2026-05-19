#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>


int main()
{
    int fd = 0;
    char Fname[20]  = {'\0'};

    printf("Enter the file name ");
    scanf("%s",Fname);

    fd = creat(Fname,0777);
    if(fd == -1)
    {
        printf("Unable to cerate fil \n");
        return -1;
    }

    printf("File is created with fd %d\n",fd);

    return 0;
}