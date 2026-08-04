package defpackage;

/* JADX INFO: renamed from: lٍؕۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3299l {
    public final int loadAd;
    public final EnumC14937l yandex;
    public static final C3299l crashlytics = new C3299l(EnumC14937l.f29394l, 0);
    public static final C3299l amazon = new C3299l(EnumC14937l.f29399l, 1);

    public C3299l(EnumC14937l enumC14937l, int i) {
        this.yandex = enumC14937l;
        this.loadAd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3299l.class != obj.getClass()) {
            return false;
        }
        C3299l c3299l = (C3299l) obj;
        return this.yandex == c3299l.yandex && this.loadAd == c3299l.loadAd;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.yandex);
        sb.append(" ");
        int i = this.loadAd;
        if (i != 1) {
            str = i != 2 ? "null" : "slice";
        } else {
            str = "meet";
        }
        sb.append(str);
        return sb.toString();
    }
}
