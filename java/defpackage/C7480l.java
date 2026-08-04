package defpackage;

import android.content.Intent;
import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؚۘ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7480l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC11519l f15479l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15480l;

    public /* synthetic */ C7480l(AbstractC11519l abstractC11519l, int i) {
        this.f15480l = i;
        this.f15479l = abstractC11519l;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f15480l;
        AbstractC11519l abstractC11519l = this.f15479l;
        switch (i) {
            case 0:
                abstractC11519l.mo782this();
                break;
            case 1:
                abstractC11519l.mo782this();
                break;
            default:
                if (((InterfaceC5475l) abstractC11519l.f23162l.getValue()) instanceof C13974l) {
                    VKXApplication.Companion companion = VKXApplication.f36628l;
                    if (VKXApplication.Companion.crashlytics() || Build.VERSION.SDK_INT < 29) {
                        abstractC11519l.f23166l.invoke();
                    } else {
                        abstractC11519l.isVip().startActivity(new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY"));
                    }
                } else {
                    abstractC11519l.f23166l.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
