package defpackage;

/* JADX INFO: renamed from: lٌٙۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C8880l {
    public static final C18566l Companion = new C18566l();
    public final String loadAd;
    public final String yandex;

    public /* synthetic */ C8880l(String str, int i, String str2) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C17419l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8880l)) {
            return false;
        }
        C8880l c8880l = (C8880l) obj;
        return AbstractC8576l.yandex(this.yandex, c8880l.yandex) && AbstractC8576l.yandex(this.loadAd, c8880l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StorageGetDto(key=");
        sb.append(this.yandex);
        sb.append(", value=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }
}
