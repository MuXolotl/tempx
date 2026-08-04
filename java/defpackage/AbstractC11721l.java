package defpackage;

/* JADX INFO: renamed from: lٍِؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11721l extends AbstractC8831l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C2396l f23457l;

    public AbstractC11721l(boolean z, C2396l c2396l) {
        super(z);
        this.f23457l = c2396l;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC11721l)) {
            return false;
        }
        C2396l c2396l = ((AbstractC11721l) obj).f23457l;
        C2396l c2396l2 = this.f23457l;
        if (c2396l2 == null) {
            return c2396l == null;
        }
        return c2396l2.equals(c2396l);
    }

    public int hashCode() {
        int i = !this.f18137l ? 1 : 0;
        C2396l c2396l = this.f23457l;
        return c2396l != null ? c2396l.hashCode() ^ i : i;
    }
}
