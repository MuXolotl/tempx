package defpackage;

import android.media.MediaFormat;

/* JADX INFO: renamed from: lٌِٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC11992l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0713l f23906l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23907l;

    public /* synthetic */ RunnableC11992l(InterfaceC0713l interfaceC0713l, MediaFormat mediaFormat) {
        this.f23907l = 1;
        this.f23906l = interfaceC0713l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23907l) {
            case 0:
                this.f23906l.getClass();
                break;
            case 1:
                this.f23906l.mo671extends(new C18262l(7));
                break;
            default:
                this.f23906l.applovin();
                break;
        }
    }

    public /* synthetic */ RunnableC11992l(InterfaceC0713l interfaceC0713l, int i) {
        this.f23907l = i;
        this.f23906l = interfaceC0713l;
    }
}
