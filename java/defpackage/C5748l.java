package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؘ٘ؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5748l implements Comparable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f12139l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f12140l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f12141l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Object f12142l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final long f12143l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final RuntimeException f12144l;

    public C5748l(long j, String str, int i, long j2, Object obj) {
        AbstractC12442l.admob(((j > 0L ? 1 : (j == 0L ? 0 : -1)) == 0) == (str != null));
        this.f12141l = j;
        this.f12140l = str;
        this.f12139l = i;
        this.f12143l = j2;
        this.f12142l = obj;
        if (i != 5) {
            this.f12144l = null;
            return;
        }
        if (obj == null) {
            this.f12144l = new NullPointerException("Null stringOrBytes");
        } else if ((obj instanceof byte[]) || (obj instanceof AbstractC15619l)) {
            this.f12144l = null;
        } else {
            this.f12144l = new RuntimeException("Wrong stringOrBytes type: ".concat(String.valueOf(obj.getClass())));
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C5748l c5748l = (C5748l) obj;
        long j = c5748l.f12141l;
        long j2 = this.f12141l;
        int iCompare = Long.compare(j2, j);
        if (iCompare != 0) {
            return iCompare;
        }
        if (j2 != 0) {
            return 0;
        }
        String str = this.f12140l;
        str.getClass();
        String str2 = c5748l.f12140l;
        str2.getClass();
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5748l)) {
            return false;
        }
        C5748l c5748l = (C5748l) obj;
        return this.f12141l == c5748l.f12141l && Objects.equals(this.f12140l, c5748l.f12140l);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12141l), this.f12140l);
    }

    public final String toString() {
        String string = this.f12140l;
        if (string == null) {
            string = Long.toString(this.f12141l);
        }
        String strValueOf = String.valueOf(yandex());
        return AbstractC9361l.ad(new StringBuilder(String.valueOf(string).length() + 1 + strValueOf.length()), string, ":", strValueOf);
    }

    public final Object yandex() {
        int i = this.f12139l;
        if (i == 0) {
            return Boolean.FALSE;
        }
        if (i == 1) {
            return Boolean.TRUE;
        }
        long j = this.f12143l;
        if (i == 2) {
            return Long.valueOf(j);
        }
        if (i == 3) {
            return Double.valueOf(Double.longBitsToDouble(j));
        }
        Object obj = this.f12142l;
        if (i == 4) {
            obj.getClass();
            return obj;
        }
        if (i != 5) {
            C8339l.subs("Impossible, this was validated when parsed or created");
            return null;
        }
        obj.getClass();
        try {
            return obj instanceof byte[] ? (byte[]) obj : ((AbstractC15619l) obj).ads();
        } catch (Throwable th) {
            RuntimeException runtimeException = this.f12144l;
            if (runtimeException != null) {
                th.addSuppressed(runtimeException);
            }
            throw th;
        }
    }
}
