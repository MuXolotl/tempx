package defpackage;

import java.util.Collection;

/* JADX INFO: renamed from: lؓؑۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1553l extends AbstractC1132l implements InterfaceC7760l {
    public final C2312l yandex;

    public C1553l(C2312l c2312l) {
        this.yandex = c2312l;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1553l) {
            return AbstractC8576l.yandex(this.yandex, ((C1553l) obj).yandex);
        }
        return false;
    }

    @Override // defpackage.InterfaceC7760l
    public final /* bridge */ /* synthetic */ Collection getAnnotations() {
        return C2580l.f5619l;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    @Override // defpackage.InterfaceC7760l
    public final C8673l loadAd(C2312l c2312l) {
        return null;
    }

    public final String toString() {
        return C1553l.class.getName() + ": " + this.yandex;
    }
}
