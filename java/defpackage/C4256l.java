package defpackage;

/* JADX INFO: renamed from: lٜٟؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4256l extends AbstractC6119l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final char f8732l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8733l;

    public /* synthetic */ C4256l(char c, int i) {
        this.f8733l = i;
        this.f8732l = c;
    }

    @Override // defpackage.AbstractC6119l, defpackage.AbstractC8791l
    public final AbstractC8791l amazon() {
        switch (this.f8733l) {
            case 0:
                return new C4256l(this.f8732l, 1);
            default:
                return new C4256l(this.f8732l, 0);
        }
    }

    @Override // defpackage.AbstractC8791l
    public final boolean crashlytics(char c) {
        switch (this.f8733l) {
            case 0:
                return c == this.f8732l;
            default:
                return c != this.f8732l;
        }
    }

    public final String toString() {
        int i = this.f8733l;
        char c = this.f8732l;
        switch (i) {
            case 0:
                return "CharMatcher.is('" + AbstractC8791l.yandex(c) + "')";
            default:
                return "CharMatcher.isNot('" + AbstractC8791l.yandex(c) + "')";
        }
    }
}
