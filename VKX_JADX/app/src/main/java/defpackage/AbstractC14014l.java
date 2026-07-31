package defpackage;

/* JADX INFO: renamed from: lًَٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14014l extends AbstractC8831l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C12425l f27323l;

    public AbstractC14014l(boolean z, C12425l c12425l) {
        super(z);
        this.f27323l = c12425l;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC14014l)) {
            return false;
        }
        C12425l c12425l = ((AbstractC14014l) obj).f27323l;
        C12425l c12425l2 = this.f27323l;
        if (c12425l2 == null) {
            return c12425l == null;
        }
        return c12425l2.equals(c12425l);
    }

    public int hashCode() {
        C12425l c12425l = this.f27323l;
        if (c12425l != null) {
            return c12425l.hashCode();
        }
        return 0;
    }
}
