package defpackage;

/* JADX INFO: renamed from: lٍؙؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6240l extends IllegalStateException {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f13182l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f13183l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6240l(int i, int i2) {
        String strTapsense;
        if (i == 0) {
            strTapsense = AbstractC15560l.tapsense("Player stuck buffering and not loading for ", i2, " ms");
        } else if (i == 1) {
            strTapsense = AbstractC15560l.tapsense("Player stuck buffering with no progress for ", i2, " ms");
        } else if (i == 2) {
            strTapsense = AbstractC15560l.tapsense("Player stuck playing with no progress for ", i2, " ms");
        } else if (i == 3) {
            strTapsense = AbstractC15560l.tapsense("Player stuck playing without ending for ", i2, " ms");
        } else {
            if (i != 4) {
                C18073l.admob();
                throw null;
            }
            strTapsense = AbstractC15560l.tapsense("Player stuck suppressed for ", i2, " ms");
        }
        super(strTapsense);
        this.f13183l = i;
        this.f13182l = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6240l.class != obj.getClass()) {
            return false;
        }
        C6240l c6240l = (C6240l) obj;
        return this.f13183l == c6240l.f13183l && this.f13182l == c6240l.f13182l;
    }

    public final int hashCode() {
        return ((527 + this.f13183l) * 31) + this.f13182l;
    }
}
