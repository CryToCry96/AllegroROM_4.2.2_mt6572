.class Lcom/mediatek/gemini/SimManagement$2;
.super Landroid/os/Handler;
.source "SimManagement.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mediatek/gemini/SimManagement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mediatek/gemini/SimManagement;


# direct methods
.method constructor <init>(Lcom/mediatek/gemini/SimManagement;)V
    .locals 0
    .parameter

    .prologue
    .line 196
    iput-object p1, p0, Lcom/mediatek/gemini/SimManagement$2;->this$0:Lcom/mediatek/gemini/SimManagement;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3
    .parameter "msg"

    .prologue
    const/4 v2, 0x1

    .line 199
    const/16 v0, 0x7d0

    iget v1, p1, Landroid/os/Message;->what:I

    if-ne v0, v1, :cond_1

    .line 200
    const-string v0, "SimManagementSettings"

    const-string v1, "reveive time out msg..."

    invoke-static {v0, v1}, Lcom/mediatek/xlog/Xlog;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 201
    iget-object v0, p0, Lcom/mediatek/gemini/SimManagement$2;->this$0:Lcom/mediatek/gemini/SimManagement;

    #calls: Lcom/mediatek/gemini/SimManagement;->removeProgDlg()V
    invoke-static {v0}, Lcom/mediatek/gemini/SimManagement;->access$100(Lcom/mediatek/gemini/SimManagement;)V

    .line 202
    iget-object v0, p0, Lcom/mediatek/gemini/SimManagement$2;->this$0:Lcom/mediatek/gemini/SimManagement;

    const/4 v1, 0x0

    #setter for: Lcom/mediatek/gemini/SimManagement;->mIsDataConnectActing:Z
    invoke-static {v0, v1}, Lcom/mediatek/gemini/SimManagement;->access$202(Lcom/mediatek/gemini/SimManagement;Z)Z

    .line 203
    iget-object v0, p0, Lcom/mediatek/gemini/SimManagement$2;->this$0:Lcom/mediatek/gemini/SimManagement;

    #calls: Lcom/mediatek/gemini/SimManagement;->updateDataConnPrefe()V
    invoke-static {v0}, Lcom/mediatek/gemini/SimManagement;->access$000(Lcom/mediatek/gemini/SimManagement;)V

    .line 216
    :cond_0
    :goto_0
    return-void

    .line 204
    :cond_1
    const/16 v0, 0x7d1

    iget v1, p1, Landroid/os/Message;->what:I

    if-ne v0, v1, :cond_2

    .line 205
    const-string v0, "SimManagementSettings"

    const-string v1, "handle abnormal progress dialog not showing"

    invoke-static {v0, v1}, Lcom/mediatek/xlog/Xlog;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 206
    iget-object v0, p0, Lcom/mediatek/gemini/SimManagement$2;->this$0:Lcom/mediatek/gemini/SimManagement;

    #calls: Lcom/mediatek/gemini/SimManagement;->dealWithSwtichComplete()V
    invoke-static {v0}, Lcom/mediatek/gemini/SimManagement;->access$300(Lcom/mediatek/gemini/SimManagement;)V

    goto :goto_0

    .line 207
    :cond_2
    const/16 v0, 0x7d2

    iget v1, p1, Landroid/os/Message;->what:I

    if-ne v0, v1, :cond_3

    .line 208
    const-string v0, "SimManagementSettings"

    const-string v1, "3G switch time out remove the progress dialog"

    invoke-static {v0, v1}, Lcom/mediatek/xlog/Xlog;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 209
    iget-object v0, p0, Lcom/mediatek/gemini/SimManagement$2;->this$0:Lcom/mediatek/gemini/SimManagement;

    #calls: Lcom/mediatek/gemini/SimManagement;->removeProgDlg()V
    invoke-static {v0}, Lcom/mediatek/gemini/SimManagement;->access$100(Lcom/mediatek/gemini/SimManagement;)V

    .line 210
    iget-object v0, p0, Lcom/mediatek/gemini/SimManagement$2;->this$0:Lcom/mediatek/gemini/SimManagement;

    #calls: Lcom/mediatek/gemini/SimManagement;->setStatusBarEnableStatus(Z)V
    invoke-static {v0, v2}, Lcom/mediatek/gemini/SimManagement;->access$400(Lcom/mediatek/gemini/SimManagement;Z)V

    .line 211
    iget-object v0, p0, Lcom/mediatek/gemini/SimManagement$2;->this$0:Lcom/mediatek/gemini/SimManagement;

    #calls: Lcom/mediatek/gemini/SimManagement;->updateVideoCallDefaultSIM()V
    invoke-static {v0}, Lcom/mediatek/gemini/SimManagement;->access$500(Lcom/mediatek/gemini/SimManagement;)V

    goto :goto_0

    .line 212
    :cond_3
    iget v0, p1, Landroid/os/Message;->what:I

    if-ne v2, v0, :cond_0

    .line 213
    const-string v0, "SimManagementSettings"

    const-string v1, "dual sim mode changed"

    invoke-static {v0, v1}, Lcom/mediatek/xlog/Xlog;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 214
    iget-object v0, p0, Lcom/mediatek/gemini/SimManagement$2;->this$0:Lcom/mediatek/gemini/SimManagement;

    #calls: Lcom/mediatek/gemini/SimManagement;->dealWithSwtichComplete()V
    invoke-static {v0}, Lcom/mediatek/gemini/SimManagement;->access$300(Lcom/mediatek/gemini/SimManagement;)V

    goto :goto_0
.end method
