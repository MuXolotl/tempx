package defpackage;

/* JADX INFO: renamed from: lّٖٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12638l {
    public final Class loadAd;
    public final Class yandex;

    public C12638l(Class cls, Class cls2) {
        this.yandex = cls;
        this.loadAd = cls2;
    }

    public static C12638l yandex(Class cls) {
        return new C12638l(InterfaceC13642l.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12638l.class != obj.getClass()) {
            return false;
        }
        C12638l c12638l = (C12638l) obj;
        if (this.loadAd.equals(c12638l.loadAd)) {
            return this.yandex.equals(c12638l.yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode() + (this.loadAd.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.loadAd;
        Class cls2 = this.yandex;
        if (cls2 == InterfaceC13642l.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
