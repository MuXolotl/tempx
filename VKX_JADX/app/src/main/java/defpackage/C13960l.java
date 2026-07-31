package defpackage;

/* JADX INFO: renamed from: lٓؗٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13960l extends AbstractC13573l {
    public final int crashlytics;

    public C13960l(int i) {
        this.crashlytics = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13960l) && this.crashlytics == ((C13960l) obj).crashlytics;
    }

    public final int hashCode() {
        return this.crashlytics;
    }

    public final String toString() {
        return AbstractC0653l.adcel(new StringBuilder("TypeParameter(id="), this.crashlytics, ')');
    }
}
