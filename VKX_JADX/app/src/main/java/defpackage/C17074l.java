package defpackage;

/* JADX INFO: renamed from: lِۣٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17074l implements InterfaceC13937l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Class f33227l;

    public C17074l(Class cls) {
        this.f33227l = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17074l) {
            return AbstractC8576l.yandex(this.f33227l, ((C17074l) obj).f33227l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33227l.hashCode();
    }

    @Override // defpackage.InterfaceC13937l
    /* JADX INFO: renamed from: private */
    public final Class mo1730private() {
        return this.f33227l;
    }

    public final String toString() {
        return this.f33227l.toString() + " (Kotlin reflection is not available)";
    }
}
