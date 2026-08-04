package defpackage;

/* JADX INFO: renamed from: lْۥۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13795l extends AbstractC6119l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final char f26927l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final char f26928l;

    public C13795l(char c, char c2) {
        this.f26928l = c;
        this.f26927l = c2;
    }

    @Override // defpackage.AbstractC8791l
    public final boolean crashlytics(char c) {
        return c == this.f26928l || c == this.f26927l;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + AbstractC8791l.yandex(this.f26928l) + AbstractC8791l.yandex(this.f26927l) + "\")";
    }
}
