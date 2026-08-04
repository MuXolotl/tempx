package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؓۡ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2177l implements InterfaceC9840l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C11911l f4817l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Function1 f4818l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C6199l f4819l;

    public C2177l(String str, C6199l c6199l, Function1 function1) {
        InterfaceC13012l interfaceC13012lYandex;
        this.f4819l = c6199l;
        this.f4818l = function1;
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C7472l.class);
        try {
            interfaceC13012lYandex = AbstractC18202l.yandex(C7472l.class);
        } catch (Throwable unused) {
            interfaceC13012lYandex = null;
        }
        this.f4817l = new C11911l(str, new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex));
    }

    @Override // defpackage.InterfaceC9840l
    public final C11911l getKey() {
        return this.f4817l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC9840l
    public final Object purchase(AbstractC10598l abstractC10598l, Function1 function1) {
        C14187l c14187lYandex;
        C6731l c6731l = (C6731l) abstractC10598l;
        if (c6731l instanceof C2234l) {
            c14187lYandex = AbstractC5708l.yandex((InterfaceC11641l) c6731l);
        } else {
            if (!(c6731l instanceof C14187l)) {
                C11983l.advert(AbstractC18202l.yandex.loadAd(c6731l.getClass()), "Unsupported pipeline type: ");
                return null;
            }
            c14187lYandex = (C14187l) c6731l;
        }
        Object objInvoke = this.f4819l.f13073l.invoke();
        function1.invoke(objInvoke);
        C9970l c9970l = new C9970l(c14187lYandex, c6731l, objInvoke, this.f4817l);
        this.f4818l.invoke(c9970l);
        Iterator it = c9970l.loadAd.iterator();
        while (it.hasNext()) {
            ((C1278l) it.next()).yandex.invoke(c9970l.yandex());
        }
        Iterator it2 = c9970l.crashlytics.iterator();
        while (it2.hasNext()) {
            ((C1278l) it2.next()).yandex.invoke(c9970l.yandex().f14096l);
        }
        Iterator it3 = c9970l.amazon.iterator();
        while (it3.hasNext()) {
            ((C1278l) it3.next()).yandex.invoke(c9970l.yandex().f14097l);
        }
        Iterator it4 = c9970l.purchase.iterator();
        while (it4.hasNext()) {
            ((C1278l) it4.next()).yandex.invoke(c9970l.yandex().f14097l);
        }
        for (AbstractC3776l abstractC3776l : c9970l.billing) {
            C6731l c6731lYandex = c9970l.yandex();
            abstractC3776l.getClass();
            c6731lYandex.firebase(C6731l.f14091l, new C14995l(null, null));
        }
        return new C7472l(0);
    }
}
