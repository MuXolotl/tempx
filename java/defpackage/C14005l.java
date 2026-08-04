package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؚٓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C14005l extends AbstractC0757l {
    public final Function1 loadAd;

    public C14005l(List list, Function1 function1) {
        super(list);
        this.loadAd = function1;
    }

    @Override // defpackage.AbstractC0757l
    public final AbstractC18041l yandex(InterfaceC11865l interfaceC11865l) {
        InterfaceC15234l interfaceC15234lPro;
        AbstractC18041l abstractC18041l = (AbstractC18041l) this.loadAd.invoke(interfaceC11865l);
        if (!AbstractC16860l.advert(abstractC18041l) && (((interfaceC15234lPro = abstractC18041l.mo1339native().pro()) == null || AbstractC16860l.ads(interfaceC15234lPro) == null) && !AbstractC16860l.premium(abstractC18041l, AbstractC3333l.f7101static.yandex) && !AbstractC16860l.premium(abstractC18041l, AbstractC3333l.f7086default.yandex) && !AbstractC16860l.premium(abstractC18041l, AbstractC3333l.f7089final.yandex))) {
            AbstractC16860l.premium(abstractC18041l, AbstractC3333l.f7097new.yandex);
        }
        return abstractC18041l;
    }
}
