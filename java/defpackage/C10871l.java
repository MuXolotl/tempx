package defpackage;

/* JADX INFO: renamed from: lؘُؙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10871l extends AbstractC17824l {
    public final C15089l adcel;
    public final C15089l startapp;

    public C10871l() {
        C15089l c15089l = C18450l.f36046l;
        this.startapp = c15089l;
        this.adcel = c15089l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10871l)) {
            return false;
        }
        C10871l c10871l = (C10871l) obj;
        return AbstractC8576l.yandex(this.startapp, c10871l.startapp) && AbstractC8576l.yandex(this.adcel, c10871l.adcel);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.adcel.yandex) + AbstractC9029l.mopub(38347, this.startapp.yandex, 31);
    }

    public final String toString() {
        return "Inside(isAlwaysMinimized=false, minimizedAlignment=" + this.startapp + ", expandedAlignment=" + this.adcel + ")";
    }
}
