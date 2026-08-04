package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lًٗٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8049l extends AbstractC15096l implements InterfaceC3488l {
    public static final C8049l loadAd = new C8049l();

    @Override // defpackage.AbstractC15096l
    public final AbstractC7444l mopub(C5740l c5740l, int i) {
        List list = (List) c5740l.f12126l;
        return (i >= list.size() || ((CharSequence) list.get(i)).length() <= 0) ? AbstractC7444l.yandex : AbstractC7444l.mopub;
    }

    public final String toString() {
        return "*";
    }
}
