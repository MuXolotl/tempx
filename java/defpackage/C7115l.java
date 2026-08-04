package defpackage;

import android.os.Handler;

/* JADX INFO: renamed from: lؚؚٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7115l implements InterfaceC12888l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f14897l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public InterfaceC9655l f14898l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C13281l f14899l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C17339l f14900l;

    public C7115l(C17339l c17339l, C13281l c13281l) {
        this.f14900l = c17339l;
        this.f14899l = c13281l;
    }

    @Override // defpackage.InterfaceC12888l
    public final void release() {
        Handler handler = this.f14900l.f33682l;
        handler.getClass();
        AbstractC15323l.m3966final(handler, new RunnableC16112l(22, this));
    }
}
