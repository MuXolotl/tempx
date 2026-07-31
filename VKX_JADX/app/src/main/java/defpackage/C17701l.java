package defpackage;

import java.io.Serializable;
import java.util.Vector;

/* JADX INFO: renamed from: lٍ٘ؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17701l implements Cloneable, Serializable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final transient Object f34486l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Vector f34487l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C17701l f34488l = null;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f34489l = true;

    public C17701l(C8117l c8117l) {
        this.f34486l = c8117l;
    }

    public final Object clone() {
        try {
            C17701l c17701l = (C17701l) super.clone();
            c17701l.f34487l = null;
            c17701l.f34488l = null;
            return c17701l;
        } catch (CloneNotSupportedException e) {
            throw new Error(e.toString());
        }
    }

    public final boolean crashlytics(C17701l c17701l) {
        Vector vector = this.f34487l;
        return (vector == null ? 0 : vector.size()) != 0 && c17701l.f34488l == this;
    }

    public final void loadAd(C17701l c17701l, int i) {
        if (!this.f34489l) {
            C8339l.smaato("node does not allow children");
            return;
        }
        C17701l c17701l2 = this;
        while (c17701l2 != c17701l) {
            c17701l2 = c17701l2.f34488l;
            if (c17701l2 == null) {
                C17701l c17701l3 = c17701l.f34488l;
                if (c17701l3 != null) {
                    if (!c17701l3.crashlytics(c17701l)) {
                        C8339l.metrica("argument is not a child");
                        return;
                    }
                    int iIndexOf = !c17701l3.crashlytics(c17701l) ? -1 : c17701l3.f34487l.indexOf(c17701l);
                    Vector vector = c17701l3.f34487l;
                    if (vector == null) {
                        throw new ArrayIndexOutOfBoundsException("node has no children");
                    }
                    C17701l c17701l4 = (C17701l) vector.elementAt(iIndexOf);
                    c17701l3.f34487l.removeElementAt(iIndexOf);
                    c17701l4.f34488l = null;
                }
                c17701l.f34488l = this;
                if (this.f34487l == null) {
                    this.f34487l = new Vector();
                }
                this.f34487l.insertElementAt(c17701l, i);
                return;
            }
        }
        C8339l.metrica("new child is an ancestor");
    }

    public final String toString() {
        Object obj = this.f34486l;
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public final void yandex(C17701l c17701l) {
        C17701l c17701l2 = c17701l.f34488l;
        Vector vector = this.f34487l;
        if (c17701l2 == this) {
            loadAd(c17701l, (vector != null ? vector.size() : 0) - 1);
        } else {
            loadAd(c17701l, vector != null ? vector.size() : 0);
        }
    }
}
