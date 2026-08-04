package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: lؘَؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5430l implements InterfaceC18129l {
    public final AbstractC8237l yandex;

    public C5430l(AbstractC8237l abstractC8237l) {
        this.yandex = abstractC8237l;
    }

    @Override // defpackage.InterfaceC18129l
    public final Object loadAd(C5254l c5254l, Charset charset, C11310l c11310l, Object obj, AbstractC0283l abstractC0283l) throws IOException {
        InterfaceC16588l interfaceC16588lAmazon;
        AbstractC8237l abstractC8237l = this.yandex;
        C13975l c13975l = abstractC8237l.loadAd;
        try {
            interfaceC16588lAmazon = AbstractC0135l.purchase(c13975l, c11310l);
        } catch (C14747l unused) {
            interfaceC16588lAmazon = AbstractC0135l.amazon(obj, c13975l);
        }
        C18476l c18476l = new C18476l();
        AbstractC10802l.crashlytics(abstractC8237l, new C13161l(c18476l), interfaceC16588lAmazon, obj);
        return new C4940l(new C13624l(c18476l, null, 20), c5254l, new Long(c18476l.f36079l), 4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC18129l
    public final Object yandex(Charset charset, C11310l c11310l, InterfaceC9354l interfaceC9354l, AbstractC0283l abstractC0283l) throws Throwable {
        C11993l c11993l;
        InterfaceC16588l interfaceC16588l;
        if (abstractC0283l instanceof C11993l) {
            c11993l = (C11993l) abstractC0283l;
            int i = c11993l.f23908l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c11993l.f23908l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c11993l = new C11993l(this, abstractC0283l);
            }
        } else {
            c11993l = new C11993l(this, abstractC0283l);
        }
        Object objPremium = c11993l.f23909l;
        int i2 = c11993l.f23908l;
        AbstractC8237l abstractC8237l = this.yandex;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objPremium);
            InterfaceC16588l interfaceC16588lPurchase = AbstractC0135l.purchase(abstractC8237l.loadAd, c11310l);
            c11993l.f23910l = interfaceC16588lPurchase;
            c11993l.f23908l = 1;
            objPremium = AbstractC10310l.premium(interfaceC9354l, c11993l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objPremium == enumC9342l) {
                return enumC9342l;
            }
            interfaceC16588l = interfaceC16588lPurchase;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC16588l = c11993l.f23910l;
            AbstractC2829l.crashlytics(objPremium);
        }
        try {
            return AbstractC10802l.loadAd(abstractC8237l, interfaceC16588l, new C6309l((InterfaceC14189l) objPremium, 0));
        } catch (Throwable th) {
            throw new C4843l(2, "Illegal input: " + th.getMessage(), th);
        }
    }
}
