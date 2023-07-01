### git init
>  初始化本地仓库
### git add example.txt
> 添加指定文件到暂存区
### git add .
> 添加全部文件到暂存区
### git commit -m "描述信息"
> 添加文件到本地库
### git push notes master 
> 将本地的master分支推送到远程库的master分支
### git reflog 
> 查看日志
### git log 
> 查看详细日志
### git reset --hrad fea61be 
> 版本穿梭 fea61be是通过git reflog查看的版本号
### git branch -v 
> 查看分支
### git branch newmaster
> 创建一个分支
### git checkout newmaster
> 切换分支
### git remote add notes https://github.com/1648785/notes.git
> 给远程仓库添加别名
### git clone https://github.com/1648785/notes.git
> 克隆远程仓库
### git pull notes master
> 拉取远程仓库的代码
### git merge newmaster
> 合并分支
