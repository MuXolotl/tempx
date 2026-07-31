package defpackage;

/* JADX INFO: renamed from: lٗٞٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17294l extends AbstractC8791l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC8791l f33563l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC8791l f33564l;

    public C17294l(AbstractC8791l abstractC8791l, AbstractC8791l abstractC8791l2) {
        abstractC8791l.getClass();
        this.f33564l = abstractC8791l;
        abstractC8791l2.getClass();
        this.f33563l = abstractC8791l2;
    }

    @Override // defpackage.InterfaceC0629l
    public final boolean apply(Object obj) {
        return crashlytics(((Character) obj).charValue());
    }

    @Override // defpackage.AbstractC8791l
    public final boolean crashlytics(char c) {
        return this.f33564l.crashlytics(c) && this.f33563l.crashlytics(c);
    }

    public final String toString() {
        return "CharMatcher.and(" + this.f33564l + ", " + this.f33563l + ")";
    }
}
