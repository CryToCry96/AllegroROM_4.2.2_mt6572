.class Lcom/android/settings/deviceinfo/Memory$10;
.super Ljava/lang/Object;
.source "Memory.java"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/settings/deviceinfo/Memory;->initInstallLocationPreference([Landroid/os/storage/StorageVolume;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/settings/deviceinfo/Memory;


# direct methods
.method constructor <init>(Lcom/android/settings/deviceinfo/Memory;)V
    .locals 0
    .parameter

    .prologue
    .line 904
    iput-object p1, p0, Lcom/android/settings/deviceinfo/Memory$10;->this$0:Lcom/android/settings/deviceinfo/Memory;

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z
    .locals 2
    .parameter "preference"
    .parameter "newValue"

    .prologue
    .line 907
    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    .line 908
    .local v0, value:Ljava/lang/String;
    iget-object v1, p0, Lcom/android/settings/deviceinfo/Memory$10;->this$0:Lcom/android/settings/deviceinfo/Memory;

    invoke-virtual {v1, v0}, Lcom/android/settings/deviceinfo/Memory;->handleUpdateAppInstallLocation(Ljava/lang/String;)V

    .line 909
    const/4 v1, 0x0

    return v1
.end method
