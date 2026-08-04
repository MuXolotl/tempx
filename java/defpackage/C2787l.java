package defpackage;

/* JADX INFO: renamed from: lؔٞؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2787l implements Comparable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f6085l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f6086l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f6087l;

    static {
        new C2787l(C4995l.mopub.yandex);
        new C2787l(C4995l.admob.yandex);
    }

    public C2787l(int i, int i2, int i3) {
        this.f6087l = i;
        this.f6086l = i2;
        this.f6085l = i3;
        if (i < 0) {
            C8339l.metrica("Major version should be not less than 0");
            throw null;
        }
        if (i2 < 0) {
            C8339l.metrica("Minor version should be not less than 0");
            throw null;
        }
        if (i3 >= 0) {
            return;
        }
        C8339l.metrica("Patch version should be not less than 0");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C2787l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C2787l c2787l = (C2787l) obj;
        return this.f6087l == c2787l.f6087l && this.f6086l == c2787l.f6086l && this.f6085l == c2787l.f6085l;
    }

    public final int hashCode() {
        return (((this.f6087l * 31) + this.f6086l) * 31) + this.f6085l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6087l);
        sb.append('.');
        sb.append(this.f6086l);
        sb.append('.');
        sb.append(this.f6085l);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: yandex, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2787l c2787l) {
        int iSubs = AbstractC8576l.subs(this.f6087l, c2787l.f6087l);
        if (iSubs != 0) {
            return iSubs;
        }
        int iSubs2 = AbstractC8576l.subs(this.f6086l, c2787l.f6086l);
        return iSubs2 != 0 ? iSubs2 : AbstractC8576l.subs(this.f6085l, c2787l.f6085l);
    }

    public C2787l(int[] iArr) {
        this(iArr[0], iArr[1], iArr[2]);
    }
}
