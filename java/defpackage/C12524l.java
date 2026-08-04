package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lَّۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12524l implements Comparable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f24675l;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC8576l.subs(this.f24675l ^ RecyclerView.UNDEFINED_DURATION, ((C12524l) obj).f24675l ^ RecyclerView.UNDEFINED_DURATION);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12524l) {
            return this.f24675l == ((C12524l) obj).f24675l;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24675l;
    }

    public final String toString() {
        return String.valueOf(((long) this.f24675l) & 4294967295L);
    }
}
