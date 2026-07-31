package defpackage;

/* JADX INFO: renamed from: lٝٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18461l implements InterfaceC0718l {
    public final Exception yandex;

    public C18461l(Exception exc) {
        this.yandex = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18461l) && this.yandex.equals(((C18461l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "Error(throwable=" + this.yandex + ')';
    }
}
