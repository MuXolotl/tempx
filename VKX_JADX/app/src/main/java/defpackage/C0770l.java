package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: lُؒؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0770l {
    public final C9747l yandex;

    public C0770l(C9747l c9747l) {
        Charset charset = AbstractC11565l.yandex;
        this.yandex = c9747l;
        c9747l.yandex = this;
    }

    public final void loadAd(int i, Object obj, InterfaceC12353l interfaceC12353l) {
        AbstractC1251l abstractC1251l = (AbstractC1251l) obj;
        C9747l c9747l = this.yandex;
        c9747l.metrica((i << 3) | 2);
        c9747l.metrica(abstractC1251l.loadAd(interfaceC12353l));
        interfaceC12353l.subs(abstractC1251l, c9747l.yandex);
    }

    public final void yandex(int i, Object obj, InterfaceC12353l interfaceC12353l) {
        C9747l c9747l = this.yandex;
        c9747l.remoteconfig(i, 3);
        interfaceC12353l.subs((AbstractC1251l) obj, c9747l.yandex);
        c9747l.remoteconfig(i, 4);
    }
}
