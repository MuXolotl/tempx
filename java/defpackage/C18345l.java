package defpackage;

import java.util.List;

/* JADX INFO: renamed from: l٘ۥۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18345l extends AbstractC15096l implements InterfaceC3488l {
    public static final C18345l loadAd = new C18345l();

    @Override // defpackage.AbstractC15096l
    public final AbstractC7444l mopub(C5740l c5740l, int i) {
        InterfaceC9955l interfaceC9955l = (InterfaceC9955l) c5740l.f12124l;
        List list = (List) c5740l.f12126l;
        C11911l c11911l = AbstractC16896l.yandex;
        if (interfaceC9955l.getAttributes().loadAd(AbstractC16896l.yandex)) {
            return AbstractC7444l.purchase;
        }
        if (list.isEmpty()) {
            return AbstractC7444l.amazon;
        }
        if (i < AbstractC14055l.smaato(list)) {
            return AbstractC7444l.purchase;
        }
        if (i > AbstractC14055l.smaato(list)) {
            return AbstractC7444l.yandex;
        }
        if (((CharSequence) list.get(i)).length() > 0) {
            return AbstractC7444l.purchase;
        }
        return c5740l.f12122l ? AbstractC7444l.billing : AbstractC7444l.yandex;
    }

    public final String toString() {
        return "<slash>";
    }
}
