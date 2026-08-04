package defpackage;

/* JADX INFO: renamed from: lٖؗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4919l implements InterfaceC16588l {
    public final C16413l loadAd;
    public final InterfaceC1388l yandex;

    public C4919l() {
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(InterfaceC7493l.class);
        this.yandex = interfaceC1388lLoadAd;
        this.loadAd = AbstractC16814l.purchase("JsonContentPolymorphicSerializer<" + interfaceC1388lLoadAd.license() + '>', C0196l.purchase, new InterfaceC18035l[0]);
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        interfaceC17739l.loadAd().getClass();
        InterfaceC1388l interfaceC1388l = this.yandex;
        if (interfaceC1388l.mo886strictfp(obj)) {
            AbstractC9464l.firebase(1, null);
        }
        Class<?> cls = obj.getClass();
        C2336l c2336l = AbstractC18202l.yandex;
        InterfaceC16588l interfaceC16588lBilling = AbstractC7280l.billing(c2336l.loadAd(cls));
        if (interfaceC16588lBilling != null) {
            interfaceC16588lBilling.crashlytics(interfaceC17739l, obj);
            return;
        }
        InterfaceC1388l interfaceC1388lLoadAd = c2336l.loadAd(obj.getClass());
        String strLicense = interfaceC1388lLoadAd.license();
        if (strLicense == null) {
            strLicense = String.valueOf(interfaceC1388lLoadAd);
        }
        C6541l.firebase(AbstractC14814l.ads("Class '", strLicense, "' is not registered for polymorphic serialization ", "in the scope of '" + interfaceC1388l.license() + '\'', ".\nMark the base class as 'sealed' or register the serializer explicitly."));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC16588l interfaceC16588lSerializer;
        InterfaceC17487l interfaceC17487lStartapp = AbstractC7470l.startapp(interfaceC10726l);
        AbstractC9914l abstractC9914lFirebase = interfaceC17487lStartapp.firebase();
        AbstractC9914l abstractC9914l = (AbstractC9914l) AbstractC8358l.mopub(abstractC9914lFirebase).get("error");
        if (abstractC9914l == null) {
            interfaceC16588lSerializer = C17889l.Companion.serializer();
        } else if (abstractC9914l instanceof C18010l) {
            interfaceC16588lSerializer = C1245l.Companion.serializer();
        } else {
            String strAmazon = AbstractC8358l.admob(abstractC9914l).amazon();
            int iHashCode = strAmazon.hashCode();
            if (iHashCode != -632018157) {
                if (iHashCode != 96713681) {
                    if (iHashCode == 304348098 && strAmazon.equals("need_validation")) {
                        interfaceC16588lSerializer = C12462l.Companion.serializer();
                    } else {
                        interfaceC16588lSerializer = C3721l.Companion.serializer();
                    }
                } else if (strAmazon.equals("need_captcha")) {
                    interfaceC16588lSerializer = C9923l.Companion.serializer();
                } else {
                    interfaceC16588lSerializer = C3721l.Companion.serializer();
                }
            } else if (strAmazon.equals("invalid_client")) {
                interfaceC16588lSerializer = C12419l.Companion.serializer();
            } else {
                interfaceC16588lSerializer = C3721l.Companion.serializer();
            }
        }
        return interfaceC17487lStartapp.advert().yandex(interfaceC16588lSerializer, abstractC9914lFirebase);
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return this.loadAd;
    }
}
