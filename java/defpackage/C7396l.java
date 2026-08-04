package defpackage;

import android.text.TextUtils;

/* JADX INFO: renamed from: lؚِٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7396l implements InterfaceC13232l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C7396l f15322l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C7396l f15323l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C7396l f15324l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f15325l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15326l;

    static {
        int i = 0;
        f15322l = new C7396l("TINK", i);
        f15324l = new C7396l("CRUNCHY", i);
        f15323l = new C7396l("NO_PREFIX", i);
    }

    public /* synthetic */ C7396l(String str, int i) {
        this.f15326l = i;
        this.f15325l = str;
    }

    @Override // defpackage.InterfaceC13232l
    public boolean mopub(CharSequence charSequence, int i, int i2, C2049l c2049l) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f15325l)) {
            return true;
        }
        c2049l.crashlytics = (c2049l.crashlytics & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.f15326l) {
            case 0:
                return this.f15325l;
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC13232l
    public Object loadAd() {
        return this;
    }
}
