package defpackage;

import android.hardware.camera2.CameraCaptureSession;

/* JADX INFO: renamed from: lؙؖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3950l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f8128l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f8129l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8130l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f8131l;

    public /* synthetic */ RunnableC3950l(int i, long j, Object obj, Object obj2) {
        this.f8130l = i;
        this.f8128l = obj;
        this.f8131l = obj2;
        this.f8129l = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f8130l;
        long j = this.f8129l;
        Object obj = this.f8131l;
        Object obj2 = this.f8128l;
        switch (i) {
            case 0:
                ((C18505l) obj2).yandex.onCaptureSequenceCompleted((CameraCaptureSession) obj, -1, j);
                break;
            case 1:
                ((InterfaceC9492l) obj2).adcel((InterfaceC10687l) obj, j);
                break;
            default:
                SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l = (SurfaceHolderCallbackC18330l) ((C13645l) obj2).f26670l;
                String str = AbstractC15323l.yandex;
                C17804l c17804l = surfaceHolderCallbackC18330l.yandex;
                C17505l c17505l = c17804l.f34701l;
                C5597l c5597lM4397goto = c17505l.m4397goto();
                c17505l.m4401super(c5597lM4397goto, 26, new C5131l(c5597lM4397goto, obj, j));
                if (c17804l.f34682l == obj) {
                    c17804l.f34677l.mopub(26, new C8876l(18));
                }
                break;
        }
    }
}
