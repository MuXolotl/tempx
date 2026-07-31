package defpackage;

/* JADX INFO: renamed from: lٌؚۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8637l extends AbstractC4072l {
    public boolean Signature;
    public final AbstractC14790l ads;
    public final C6129l subscription;
    public boolean tapsense;

    public AbstractC8637l(AbstractC14790l abstractC14790l, C6129l c6129l) {
        this.ads = abstractC14790l;
        this.subscription = c6129l;
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void adcel(long j) {
        AbstractC18323l.purchase(mo1863throws(), j);
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void admob(byte b) {
        AbstractC18323l.purchase(mo1863throws(), b);
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC0039l
    public final boolean ads() {
        return false;
    }

    @Override // defpackage.AbstractC4072l
    public final void advert(InterfaceC18035l interfaceC18035l, int i) {
        long[] jArrMopub;
        long[] jArrPurchase;
        C16215l c16215l = this.ads.yandex;
        C6129l c6129lMo1863throws = mo1863throws();
        this.tapsense = AbstractC8576l.yandex(interfaceC18035l.isPro(i).billing(), C16015l.amazon);
        this.Signature = AbstractC1295l.subs(interfaceC18035l, i);
        String strAdmob = interfaceC18035l.admob(i);
        if (!AbstractC1295l.admob(interfaceC18035l)) {
            if (c16215l.loadAd && (jArrPurchase = AbstractC1295l.purchase(interfaceC18035l, i)) != null) {
                int i2 = 0;
                while (true) {
                    if (!(i2 < jArrPurchase.length)) {
                        break;
                    }
                    if (i2 >= jArrPurchase.length) {
                        C1759l.firebase(String.valueOf(i2));
                        return;
                    } else {
                        AbstractC18323l.loadAd(c6129lMo1863throws, new C10882l(jArrPurchase[i2]).f21996l, 192);
                        i2++;
                    }
                }
            }
            if (!(interfaceC18035l.billing() instanceof C9164l) && !(interfaceC18035l.billing() instanceof C2861l) && !(interfaceC18035l.billing() instanceof C0196l)) {
                Long lAmazon = AbstractC1295l.amazon(interfaceC18035l, i);
                if (!c16215l.subs || lAmazon == null) {
                    byte[] bytes = strAdmob.getBytes(AbstractC9050l.yandex);
                    AbstractC18323l.loadAd(c6129lMo1863throws, bytes.length, 96);
                    C6129l.subs(c6129lMo1863throws, bytes, 0, 6);
                } else {
                    AbstractC18323l.purchase(c6129lMo1863throws, lAmazon.longValue());
                }
            }
        }
        if (c16215l.crashlytics && (jArrMopub = AbstractC1295l.mopub(interfaceC18035l, i)) != null) {
            int i3 = 0;
            while (true) {
                if (!(i3 < jArrMopub.length)) {
                    break;
                }
                if (i3 >= jArrMopub.length) {
                    C1759l.firebase(String.valueOf(i3));
                    return;
                } else {
                    AbstractC18323l.loadAd(c6129lMo1863throws, new C10882l(jArrMopub[i3]).f21996l, 192);
                    i3++;
                }
            }
        }
        mo1862package();
    }

    @Override // defpackage.InterfaceC17739l
    public final void amazon() {
        if (this.tapsense) {
            mo1863throws().admob(160);
        } else {
            mo1863throws().admob(246);
        }
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void billing(double d) {
        C6129l c6129lMo1863throws = mo1863throws();
        c6129lMo1863throws.admob(251);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d);
        for (int i = 0; i < 8; i++) {
            c6129lMo1863throws.admob((int) ((jDoubleToRawLongBits >> (56 - (i * 8))) & 255));
        }
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void firebase(float f) {
        C6129l c6129lMo1863throws = mo1863throws();
        c6129lMo1863throws.admob(250);
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        for (int i = 0; i < 4; i++) {
            c6129lMo1863throws.admob((iFloatToRawIntBits >> (24 - (i * 8))) & 255);
        }
    }

    @Override // defpackage.InterfaceC17739l
    public final C13975l loadAd() {
        return this.ads.loadAd;
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void metrica(int i) {
        AbstractC18323l.purchase(mo1863throws(), i);
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void mopub(short s) {
        AbstractC18323l.purchase(mo1863throws(), s);
    }

    /* JADX INFO: renamed from: package */
    public abstract void mo1862package();

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void purchase(InterfaceC16588l interfaceC16588l, Object obj) {
        boolean z = false;
        if (this.Signature && AbstractC8576l.yandex(interfaceC16588l.purchase(), C7235l.crashlytics.loadAd)) {
            C6129l c6129lMo1863throws = mo1863throws();
            byte[] bArr = (byte[]) obj;
            AbstractC18323l.loadAd(c6129lMo1863throws, bArr.length, 64);
            C6129l.subs(c6129lMo1863throws, bArr, 0, 6);
            return;
        }
        if (this.Signature) {
            z = true;
        } else {
            InterfaceC18035l interfaceC18035lPurchase = interfaceC16588l.purchase();
            if (interfaceC18035lPurchase.purchase() && AbstractC1295l.subs(interfaceC18035lPurchase, 0)) {
                z = true;
            }
        }
        this.Signature = z;
        interfaceC16588l.crashlytics(this, obj);
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void smaato(char c) {
        AbstractC18323l.purchase(mo1863throws(), c);
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void subs(boolean z) {
        mo1863throws().admob(z ? 245 : 244);
    }

    @Override // defpackage.AbstractC4072l, defpackage.InterfaceC17739l
    public final void subscription(String str) {
        C6129l c6129lMo1863throws = mo1863throws();
        byte[] bytes = str.getBytes(AbstractC9050l.yandex);
        AbstractC18323l.loadAd(c6129lMo1863throws, bytes.length, 96);
        C6129l.subs(c6129lMo1863throws, bytes, 0, 6);
    }

    /* JADX INFO: renamed from: throws */
    public abstract C6129l mo1863throws();

    @Override // defpackage.InterfaceC17739l
    public final void vip(InterfaceC18035l interfaceC18035l, int i) {
        C6129l c6129lMo1863throws = mo1863throws();
        byte[] bytes = interfaceC18035l.admob(i).getBytes(AbstractC9050l.yandex);
        AbstractC18323l.loadAd(c6129lMo1863throws, bytes.length, 96);
        C6129l.subs(c6129lMo1863throws, bytes, 0, 6);
    }
}
