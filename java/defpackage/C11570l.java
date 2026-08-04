package defpackage;

/* JADX INFO: renamed from: lِؒۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11570l implements InterfaceC5457l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static volatile C11570l f23243l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C2152l f23244l = new C2152l(1, 2);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String[] f23245l;

    public C11570l() {
        C2152l c2152l = f23244l;
        int i = c2152l.loadAd;
        int i2 = c2152l.yandex;
        String[] strArr = new String[(i - i2) + 1];
        this.f23245l = strArr;
        strArr[1 - i2] = "Absolute time using MPEG [MPEG] frames as unit";
        strArr[2 - i2] = "Absolute time using milliseconds as unit";
    }

    public static C11570l yandex() {
        if (f23243l == null) {
            synchronized (C11570l.class) {
                try {
                    if (f23243l == null) {
                        f23243l = new C11570l();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f23243l;
    }

    @Override // defpackage.InterfaceC5457l
    public final String getValue(int i) {
        C2152l c2152l = f23244l;
        if (c2152l.yandex(i)) {
            String str = this.f23245l[i - c2152l.yandex];
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    @Override // defpackage.InterfaceC5457l
    /* JADX INFO: renamed from: goto */
    public final boolean mo1044goto(int i) {
        return f23244l.yandex(i);
    }
}
