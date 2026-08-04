package defpackage;

/* JADX INFO: renamed from: lؙۦِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6886l implements Comparable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C6886l f14418l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C6886l f14419l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C6886l f14420l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C6886l f14421l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C6886l f14422l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C6886l f14423l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C6886l f14424l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C6886l f14425l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f14426l;

    static {
        C6886l c6886l = new C6886l(100);
        C6886l c6886l2 = new C6886l(200);
        C6886l c6886l3 = new C6886l(300);
        C6886l c6886l4 = new C6886l(400);
        f14421l = c6886l4;
        C6886l c6886l5 = new C6886l(500);
        f14418l = c6886l5;
        C6886l c6886l6 = new C6886l(600);
        f14423l = c6886l6;
        C6886l c6886l7 = new C6886l(700);
        C6886l c6886l8 = new C6886l(800);
        C6886l c6886l9 = new C6886l(900);
        f14422l = c6886l3;
        f14425l = c6886l4;
        f14419l = c6886l5;
        f14420l = c6886l6;
        f14424l = c6886l7;
        AbstractC14055l.remoteconfig(c6886l, c6886l2, c6886l3, c6886l4, c6886l5, c6886l6, c6886l7, c6886l8, c6886l9);
    }

    public C6886l(int i) {
        this.f14426l = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        AbstractC1786l.yandex("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6886l) {
            return this.f14426l == ((C6886l) obj).f14426l;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14426l;
    }

    public final String toString() {
        return AbstractC15560l.tapsense("FontWeight(weight=", this.f14426l, ")");
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: yandex, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C6886l c6886l) {
        return AbstractC8576l.subs(this.f14426l, c6886l.f14426l);
    }
}
