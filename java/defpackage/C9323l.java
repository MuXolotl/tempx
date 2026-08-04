package defpackage;

/* JADX INFO: renamed from: lٍؕۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C9323l implements InterfaceC3997l {
    public static final C18561l Companion = new C18561l();
    public final String yandex;

    public /* synthetic */ C9323l(int i, String str) {
        if (1 == (i & 1)) {
            this.yandex = str;
        } else {
            AbstractC11036l.isPro(i, 1, C2506l.yandex.purchase());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9323l) && AbstractC8576l.yandex(this.yandex, ((C9323l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return AbstractC2812l.tapsense(new StringBuilder("FailVersionMismatch(targetVersionName="), this.yandex, ')');
    }

    public C9323l() {
        this.yandex = "8.14.1_pub";
    }
}
