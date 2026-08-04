package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: lؘؙٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6293l implements InterfaceC15725l {
    public final long yandex;

    public C6293l(long j) {
        this.yandex = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6293l) && C9735l.crashlytics(this.yandex, ((C6293l) obj).yandex);
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return C10882l.yandex(this.yandex);
    }

    public final String toString() {
        return "FixedColorProvider(color=" + ((Object) C9735l.subs(this.yandex)) + ')';
    }

    @Override // defpackage.InterfaceC15725l
    public final long yandex(Context context) {
        return this.yandex;
    }
}
