package defpackage;

/* JADX INFO: renamed from: lٔؓٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14638l extends C15230l {
    public final Throwable yandex;

    public C14638l(Throwable th) {
        this.yandex = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14638l) {
            return AbstractC8576l.yandex(this.yandex, ((C14638l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.yandex;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.C15230l
    public final String toString() {
        return "Closed(" + this.yandex + ')';
    }
}
