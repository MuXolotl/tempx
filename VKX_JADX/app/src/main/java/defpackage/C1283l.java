package defpackage;

import android.media.AudioManager;

/* JADX INFO: renamed from: lؚؒۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1283l implements InterfaceC17302l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f3333l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C1080l f3334l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3335l;

    public /* synthetic */ C1283l(C1080l c1080l, int i, int i2) {
        this.f3335l = i2;
        this.f3334l = c1080l;
        this.f3333l = i;
    }

    @Override // defpackage.InterfaceC17302l
    public final Object apply(Object obj) {
        int i = this.f3335l;
        int i2 = this.f3333l;
        C1080l c1080l = this.f3334l;
        C12551l c12551l = (C12551l) obj;
        switch (i) {
            case 0:
                int i3 = c12551l.loadAd;
                int i4 = c12551l.yandex;
                if (i3 >= c12551l.purchase) {
                    return c12551l;
                }
                AudioManager audioManager = (AudioManager) c1080l.f2976l;
                audioManager.getClass();
                audioManager.adjustStreamVolume(i4, 1, i2);
                return c1080l.startapp(i4);
            case 1:
                int i5 = c12551l.loadAd;
                int i6 = c12551l.yandex;
                if (i5 <= c12551l.amazon) {
                    return c12551l;
                }
                AudioManager audioManager2 = (AudioManager) c1080l.f2976l;
                audioManager2.getClass();
                audioManager2.adjustStreamVolume(i6, -1, i2);
                return c1080l.startapp(i6);
            default:
                c1080l.getClass();
                return c12551l.yandex == i2 ? c12551l : c1080l.startapp(i2);
        }
    }
}
