package defpackage;

/* JADX INFO: renamed from: lؚۘ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7475l implements CharSequence {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f15477l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final char[] f15478l;

    public C7475l(char[] cArr) {
        this.f15478l = cArr;
        this.f15477l = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f15478l[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f15477l;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return AbstractC16648l.startapp(this.f15478l, i, Math.min(i2, this.f15477l));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.f15477l;
        return AbstractC16648l.startapp(this.f15478l, 0, Math.min(i, i));
    }
}
