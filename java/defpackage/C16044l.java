package defpackage;

/* JADX INFO: renamed from: lٕۥً, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16044l extends AbstractC4072l implements InterfaceC17739l, InterfaceC0039l {
    public final C16044l[] Signature;
    public boolean ad;
    public final C6921l ads;
    public String advert;
    public String isVip;
    public final C13975l license;
    public final C17752l pro;
    public final AbstractC8237l subscription;
    public final EnumC4737l tapsense;

    public C16044l(C6921l c6921l, AbstractC8237l abstractC8237l, EnumC4737l enumC4737l, C16044l[] c16044lArr) {
        this.ads = c6921l;
        this.subscription = abstractC8237l;
        this.tapsense = enumC4737l;
        this.Signature = c16044lArr;
        this.license = abstractC8237l.loadAd;
        this.pro = abstractC8237l.yandex;
        int iOrdinal = enumC4737l.ordinal();
        if (c16044lArr != null) {
            C16044l c16044l = c16044lArr[iOrdinal];
            if (c16044l == null && c16044l == this) {
                return;
            }
            c16044lArr[iOrdinal] = this;
        }
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void adcel(long j) {
        if (this.ad) {
            subscription(String.valueOf(j));
        } else {
            this.ads.ads(j);
        }
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void admob(byte b) {
        if (this.ad) {
            subscription(String.valueOf((int) b));
        } else {
            this.ads.metrica(b);
        }
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC0039l
    public final boolean ads() {
        return this.pro.yandex;
    }

    @Override // defpackage.AbstractC4072l
    public final void advert(InterfaceC18035l interfaceC18035l, int i) {
        int iOrdinal = this.tapsense.ordinal();
        C6921l c6921l = this.ads;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!c6921l.f14494l) {
                c6921l.startapp(',');
            }
            c6921l.vip();
            return;
        }
        if (iOrdinal == 2) {
            if (c6921l.f14494l) {
                this.ad = true;
                c6921l.vip();
                return;
            }
            if (i % 2 == 0) {
                c6921l.startapp(',');
                c6921l.vip();
            } else {
                c6921l.startapp(':');
                c6921l.isVip();
                z = false;
            }
            this.ad = z;
            return;
        }
        if (iOrdinal != 3) {
            if (!c6921l.f14494l) {
                c6921l.startapp(',');
            }
            c6921l.vip();
            AbstractC3644l.amazon(this.subscription, interfaceC18035l);
            subscription(interfaceC18035l.admob(i));
            c6921l.startapp(':');
            c6921l.isVip();
            return;
        }
        if (i == 0) {
            this.ad = true;
        }
        if (i == 1) {
            c6921l.startapp(',');
            c6921l.isVip();
            this.ad = false;
        }
    }

    @Override // defpackage.InterfaceC17739l
    public final void amazon() {
        this.ads.subscription("null");
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void billing(double d) {
        if (this.ad) {
            subscription(String.valueOf(d));
        } else {
            ((InterfaceC17475l) this.ads.f14493l).mo1723throw(String.valueOf(d));
        }
        if (this.pro.subs || Math.abs(d) <= Double.MAX_VALUE) {
            return;
        }
        throw new C16768l(AbstractC2238l.subs(Double.valueOf(d), null), 2, null);
    }

    @Override // defpackage.InterfaceC17739l
    public final InterfaceC0039l crashlytics(InterfaceC18035l interfaceC18035l) {
        C16044l c16044l;
        AbstractC8237l abstractC8237l = this.subscription;
        EnumC4737l enumC4737lAdmob = AbstractC17541l.admob(abstractC8237l, interfaceC18035l);
        char c = enumC4737lAdmob.f9763l;
        C6921l c6921l = this.ads;
        c6921l.startapp(c);
        c6921l.f14494l = true;
        String str = this.advert;
        if (str != null) {
            String strYandex = this.isVip;
            if (strYandex == null) {
                strYandex = interfaceC18035l.yandex();
            }
            c6921l.vip();
            subscription(str);
            c6921l.startapp(':');
            subscription(strYandex);
            this.advert = null;
            this.isVip = null;
        }
        if (this.tapsense == enumC4737lAdmob) {
            return this;
        }
        C16044l[] c16044lArr = this.Signature;
        return (c16044lArr == null || (c16044l = c16044lArr[enumC4737lAdmob.ordinal()]) == null) ? new C16044l(c6921l, abstractC8237l, enumC4737lAdmob, c16044lArr) : c16044l;
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void firebase(float f) {
        if (this.ad) {
            subscription(String.valueOf(f));
        } else {
            ((InterfaceC17475l) this.ads.f14493l).mo1723throw(String.valueOf(f));
        }
        if (this.pro.subs || Math.abs(f) <= Float.MAX_VALUE) {
            return;
        }
        throw new C16768l(AbstractC2238l.subs(Float.valueOf(f), null), 2, null);
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final InterfaceC17739l isPro(InterfaceC18035l interfaceC18035l) {
        boolean zYandex = AbstractC5345l.yandex(interfaceC18035l);
        EnumC4737l enumC4737l = this.tapsense;
        AbstractC8237l abstractC8237l = this.subscription;
        C6921l c1670l = this.ads;
        if (zYandex) {
            if (!(c1670l instanceof C6941l)) {
                c1670l = new C6941l((InterfaceC17475l) c1670l.f14493l, this.ad);
            }
            return new C16044l(c1670l, abstractC8237l, enumC4737l, null);
        }
        if (interfaceC18035l.purchase() && interfaceC18035l.equals(AbstractC8358l.yandex)) {
            if (!(c1670l instanceof C1670l)) {
                c1670l = new C1670l((InterfaceC17475l) c1670l.f14493l, this.ad);
            }
            return new C16044l(c1670l, abstractC8237l, enumC4737l, null);
        }
        if (this.advert != null) {
            this.isVip = interfaceC18035l.yandex();
        }
        return this;
    }

    @Override // defpackage.InterfaceC17739l
    public final C13975l loadAd() {
        return this.license;
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void metrica(int i) {
        if (this.ad) {
            subscription(String.valueOf(i));
        } else {
            this.ads.adcel(i);
        }
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void mopub(short s) {
        if (this.ad) {
            subscription(String.valueOf((int) s));
        } else {
            this.ads.tapsense(s);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void purchase(InterfaceC16588l interfaceC16588l, Object obj) {
        String strLoadAd;
        InterfaceC16588l interfaceC16588lAmazon;
        AbstractC8237l abstractC8237l = this.subscription;
        boolean z = interfaceC16588l instanceof AbstractC13151l;
        int i = abstractC8237l.yandex.firebase;
        if (!z) {
            int iInmobi = AbstractC5020l.inmobi(i);
            if (iInmobi != 0) {
                if (iInmobi == 1) {
                    AbstractC2021l abstractC2021lBilling = interfaceC16588l.purchase().billing();
                    strLoadAd = (AbstractC8576l.yandex(abstractC2021lBilling, C16015l.amazon) || AbstractC8576l.yandex(abstractC2021lBilling, C16015l.purchase)) ? AbstractC9592l.loadAd(abstractC8237l, interfaceC16588l.purchase()) : null;
                } else if (iInmobi != 2) {
                    C18725l.billing();
                    return;
                }
            }
        } else if (i != 1) {
        }
        if (z) {
            AbstractC13151l abstractC13151l = (AbstractC13151l) interfaceC16588l;
            if (obj == null) {
                C10754l.license(abstractC13151l.purchase(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.", "Value for serializer ");
                return;
            }
            interfaceC16588lAmazon = AbstractC1762l.amazon(abstractC13151l, this, obj);
        } else {
            interfaceC16588lAmazon = interfaceC16588l;
        }
        if (strLoadAd != null) {
            InterfaceC18035l interfaceC18035lPurchase = interfaceC16588lAmazon.purchase();
            AbstractC3644l.amazon(abstractC8237l, interfaceC18035lPurchase);
            if (AbstractC16164l.crashlytics(interfaceC18035lPurchase).contains(strLoadAd)) {
                String strYandex = interfaceC16588l.purchase().yandex();
                String strYandex2 = interfaceC16588lAmazon.purchase().yandex();
                throw new C16768l(AbstractC0653l.ads(AbstractC14814l.license("Class '", strYandex2, "' cannot be serialized ", (abstractC8237l.yandex.firebase == 2 && AbstractC8576l.yandex(strYandex, strYandex2)) ? "in ALL_JSON_OBJECTS class discriminator mode" : AbstractC14814l.smaato('\'', "as base class '", strYandex), " because it has property name that conflicts with JSON class discriminator '"), strLoadAd, "'."), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
            }
            AbstractC2021l abstractC2021lBilling2 = interfaceC16588lAmazon.purchase().billing();
            if (abstractC2021lBilling2 instanceof C2374l) {
                C8339l.smaato("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                return;
            }
            if (abstractC2021lBilling2 instanceof C15358l) {
                C8339l.smaato("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                return;
            } else if (abstractC2021lBilling2 instanceof C0196l) {
                C8339l.smaato("Actual serializer for polymorphic cannot be polymorphic itself");
                return;
            } else {
                String strYandex3 = interfaceC16588lAmazon.purchase().yandex();
                this.advert = strLoadAd;
                this.isVip = strYandex3;
            }
        }
        interfaceC16588lAmazon.crashlytics(this, obj);
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void smaato(char c) {
        subscription(String.valueOf(c));
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC0039l
    public final void startapp(InterfaceC18035l interfaceC18035l, int i, InterfaceC16588l interfaceC16588l, Object obj) {
        if (obj != null || this.pro.purchase) {
            super.startapp(interfaceC18035l, i, interfaceC16588l, obj);
        }
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void subs(boolean z) {
        if (this.ad) {
            subscription(String.valueOf(z));
        } else {
            ((InterfaceC17475l) this.ads.f14493l).mo1723throw(String.valueOf(z));
        }
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void subscription(String str) {
        this.ads.Signature(str);
    }

    @Override // defpackage.InterfaceC17739l
    public final void vip(InterfaceC18035l interfaceC18035l, int i) {
        subscription(interfaceC18035l.admob(i));
    }

    @Override // defpackage.InterfaceC0039l
    public final void yandex(InterfaceC18035l interfaceC18035l) {
        C6921l c6921l = this.ads;
        c6921l.getClass();
        c6921l.f14494l = false;
        c6921l.startapp(this.tapsense.f9762l);
    }
}
