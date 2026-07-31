package defpackage;

import android.os.HandlerThread;

/* JADX INFO: renamed from: lٍّؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9332l implements InterfaceC11766l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f19158l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19159l;

    public /* synthetic */ C9332l(int i, int i2) {
        this.f19159l = i2;
        this.f19158l = i;
    }

    @Override // defpackage.InterfaceC11766l
    public final Object get() {
        int i = this.f19159l;
        int i2 = this.f19158l;
        switch (i) {
            case 0:
                return new HandlerThread(C15276l.amazon(i2, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(C15276l.amazon(i2, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
