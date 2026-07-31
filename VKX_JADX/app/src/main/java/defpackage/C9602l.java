package defpackage;

import android.media.AudioManager;

/* JADX INFO: renamed from: lٍٗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9602l implements InterfaceC17302l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f19563l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f19564l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C1080l f19565l;

    public /* synthetic */ C9602l(C1080l c1080l, int i, int i2) {
        this.f19565l = c1080l;
        this.f19564l = i;
        this.f19563l = i2;
    }

    @Override // defpackage.InterfaceC17302l
    public final Object apply(Object obj) {
        C12551l c12551l = (C12551l) obj;
        int i = c12551l.loadAd;
        int i2 = c12551l.yandex;
        int i3 = this.f19564l;
        if (i3 == i || i3 < c12551l.amazon || i3 > c12551l.purchase) {
            return c12551l;
        }
        C1080l c1080l = this.f19565l;
        AudioManager audioManager = (AudioManager) c1080l.f2976l;
        audioManager.getClass();
        audioManager.setStreamVolume(i2, i3, this.f19563l);
        return c1080l.startapp(i2);
    }
}
