echo "欢迎使用gitcommit小工具"
read -p "您要commit什么呢?" COMMIT
git add .
git commit -m $COMMIT
git branch -M main
git remote add origin https://github.com/2catycm/VisualKnowledgeReview_for_Java.git
git push -u origin main