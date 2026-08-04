package defpackage;

/* JADX INFO: renamed from: lًؙۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C6331l implements InterfaceC9265l {
    public static final C8213l Companion = new C8213l();
    public final long loadAd;
    public final long yandex;

    public /* synthetic */ C6331l(int i, long j, long j2) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C9642l.yandex.purchase());
            throw null;
        }
        this.yandex = j;
        this.loadAd = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6331l)) {
            return false;
        }
        C6331l c6331l = (C6331l) obj;
        return this.yandex == c6331l.yandex && this.loadAd == c6331l.loadAd;
    }

    public final int hashCode() {
        long j = this.yandex;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.loadAd;
        return i + ((int) ((j2 >>> 32) ^ j2));
    }

    @Override // defpackage.InterfaceC9265l
    public final long loadAd() {
        return this.loadAd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interlude(beginMs=");
        sb.append(this.yandex);
        sb.append(", endMs=");
        return AbstractC12900l.smaato(sb, this.loadAd, ')');
    }

    @Override // defpackage.InterfaceC9265l
    public final long yandex() {
        return this.yandex;
    }

    public C6331l(long j, long j2) {
        this.yandex = j;
        this.loadAd = j2;
    }
}
