package defpackage;

/* JADX INFO: renamed from: lٖٟؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16192l extends AbstractC18121l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f31680l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f31681l;

    public C16192l(Object obj, boolean z) {
        this.f31681l = z;
        this.f31680l = obj.toString();
    }

    @Override // defpackage.AbstractC18121l
    public final String amazon() {
        return this.f31680l;
    }

    @Override // defpackage.AbstractC18121l
    public final boolean billing() {
        return this.f31681l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C16192l.class != obj.getClass()) {
            return false;
        }
        C16192l c16192l = (C16192l) obj;
        return this.f31681l == c16192l.f31681l && AbstractC8576l.yandex(this.f31680l, c16192l.f31680l);
    }

    public final int hashCode() {
        return this.f31680l.hashCode() + ((this.f31681l ? 1231 : 1237) * 31);
    }

    @Override // defpackage.AbstractC18121l
    public final String toString() {
        boolean z = this.f31681l;
        String str = this.f31680l;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        AbstractC4216l.yandex(str, sb);
        return sb.toString();
    }
}
