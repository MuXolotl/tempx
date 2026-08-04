package defpackage;

import android.media.AudioManager;

/* JADX INFO: renamed from: lِِؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11770l implements InterfaceC17302l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f23563l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f23564l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C1080l f23565l;

    public /* synthetic */ C11770l(C1080l c1080l, boolean z, int i) {
        this.f23565l = c1080l;
        this.f23564l = z;
        this.f23563l = i;
    }

    @Override // defpackage.InterfaceC17302l
    public final Object apply(Object obj) {
        C12551l c12551l = (C12551l) obj;
        boolean z = c12551l.crashlytics;
        int i = c12551l.yandex;
        boolean z2 = this.f23564l;
        if (z == z2) {
            return c12551l;
        }
        C1080l c1080l = this.f23565l;
        ((AudioManager) c1080l.f2976l).getClass();
        ((AudioManager) c1080l.f2976l).adjustStreamVolume(i, z2 ? -100 : 100, this.f23563l);
        return c1080l.startapp(i);
    }
}
