package defpackage;

/* JADX INFO: renamed from: lٗۜۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17424l {
    public int amazon;
    public Object billing;
    public int crashlytics;
    public boolean loadAd;
    public Object purchase;
    public boolean yandex;

    public static void loadAd(AbstractC1091l abstractC1091l) {
        if (abstractC1091l.f3010l == 2) {
            AbstractC12442l.subscription(abstractC1091l.f3010l == 2);
            abstractC1091l.f3010l = 1;
            abstractC1091l.tapsense();
        }
    }

    public static void remoteconfig(AbstractC1091l abstractC1091l, long j) {
        abstractC1091l.f3023l = true;
        if (abstractC1091l instanceof C1945l) {
            C1945l c1945l = (C1945l) abstractC1091l;
            AbstractC12442l.subscription(c1945l.f3023l);
            c1945l.f4433l = j;
        }
    }

    public static boolean subs(AbstractC1091l abstractC1091l) {
        return abstractC1091l.f3010l != 0;
    }

    public boolean admob() {
        int i = this.amazon;
        if (i == 0 || i == 2 || i == 4) {
            return subs((AbstractC1091l) this.purchase);
        }
        AbstractC1091l abstractC1091l = (AbstractC1091l) this.billing;
        abstractC1091l.getClass();
        return subs(abstractC1091l);
    }

    public AbstractC1091l amazon(C12212l c12212l) {
        InterfaceC11759l interfaceC11759l;
        if (c12212l != null && (interfaceC11759l = c12212l.crashlytics[this.crashlytics]) != null) {
            AbstractC1091l abstractC1091l = (AbstractC1091l) this.purchase;
            if (abstractC1091l.f3020l == interfaceC11759l) {
                return abstractC1091l;
            }
            AbstractC1091l abstractC1091l2 = (AbstractC1091l) this.billing;
            if (abstractC1091l2 != null && abstractC1091l2.f3020l == interfaceC11759l) {
                return abstractC1091l2;
            }
        }
        return null;
    }

    public boolean billing(C12212l c12212l, AbstractC1091l abstractC1091l) {
        int i = this.crashlytics;
        if (abstractC1091l == null) {
            return true;
        }
        InterfaceC11759l interfaceC11759l = c12212l.crashlytics[i];
        InterfaceC11759l interfaceC11759l2 = abstractC1091l.f3020l;
        if (interfaceC11759l2 == null) {
            return true;
        }
        if (interfaceC11759l2 == interfaceC11759l) {
            if (interfaceC11759l == null || abstractC1091l.firebase()) {
                return true;
            }
            C12212l c12212l2 = c12212l.remoteconfig;
            if (c12212l.mopub.admob && c12212l2 != null && c12212l2.purchase && ((abstractC1091l instanceof C1945l) || (abstractC1091l instanceof C5431l) || abstractC1091l.f3007l >= c12212l2.purchase())) {
                return true;
            }
        }
        C12212l c12212l3 = c12212l.remoteconfig;
        return c12212l3 != null && c12212l3.crashlytics[i] == abstractC1091l.f3020l;
    }

    public int crashlytics() {
        boolean zSubs = subs((AbstractC1091l) this.purchase);
        AbstractC1091l abstractC1091l = (AbstractC1091l) this.billing;
        return (zSubs ? 1 : 0) + ((abstractC1091l == null || !subs(abstractC1091l)) ? 0 : 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int firebase(AbstractC1091l abstractC1091l, C12212l c12212l, C9598l c9598l, C16990l c16990l) {
        int i;
        AbstractC1091l abstractC1091l2 = (AbstractC1091l) this.purchase;
        int i2 = this.crashlytics;
        if (abstractC1091l == null || !subs(abstractC1091l) || (abstractC1091l == abstractC1091l2 && ((i = this.amazon) == 2 || i == 4))) {
            return 1;
        }
        if (abstractC1091l == ((AbstractC1091l) this.billing) && this.amazon == 3) {
            return 1;
        }
        byte b = abstractC1091l.f3020l != c12212l.crashlytics[i2];
        boolean zPremium = c9598l.premium(i2);
        if (!zPremium || b != false) {
            if (!abstractC1091l.f3023l) {
                InterfaceC10376l interfaceC10376l = ((InterfaceC10376l[]) c9598l.f19553l)[i2];
                int length = interfaceC10376l != null ? interfaceC10376l.length() : 0;
                C5978l[] c5978lArr = new C5978l[length];
                for (int i3 = 0; i3 < length; i3++) {
                    interfaceC10376l.getClass();
                    c5978lArr[i3] = interfaceC10376l.metrica(i3);
                }
                InterfaceC11759l interfaceC11759l = c12212l.crashlytics[i2];
                interfaceC11759l.getClass();
                abstractC1091l.advert(c5978lArr, interfaceC11759l, c12212l.purchase(), c12212l.startapp, c12212l.mopub.yandex);
                return 3;
            }
            if (!abstractC1091l.smaato()) {
                return 0;
            }
            yandex(abstractC1091l, c16990l);
            if (!zPremium || mopub()) {
                isPro(abstractC1091l == abstractC1091l2);
                return 1;
            }
        }
        return 1;
    }

    public void isPro(boolean z) {
        if (z) {
            if (this.yandex) {
                AbstractC1091l abstractC1091l = (AbstractC1091l) this.purchase;
                AbstractC12442l.subscription(abstractC1091l.f3010l == 0);
                abstractC1091l.f3008l.Signature();
                abstractC1091l.ads();
                this.yandex = false;
                return;
            }
            return;
        }
        if (this.loadAd) {
            AbstractC1091l abstractC1091l2 = (AbstractC1091l) this.billing;
            abstractC1091l2.getClass();
            AbstractC12442l.subscription(abstractC1091l2.f3010l == 0);
            abstractC1091l2.f3008l.Signature();
            abstractC1091l2.ads();
            this.loadAd = false;
        }
    }

    public boolean mopub() {
        int i = this.amazon;
        return i == 2 || i == 4 || i == 3;
    }

    public int purchase() {
        return ((AbstractC1091l) this.purchase).f3012l;
    }

    public void smaato() {
        if (!subs((AbstractC1091l) this.purchase)) {
            isPro(true);
        }
        AbstractC1091l abstractC1091l = (AbstractC1091l) this.billing;
        if (abstractC1091l == null || subs(abstractC1091l)) {
            return;
        }
        isPro(false);
    }

    public void vip() {
        int i;
        AbstractC1091l abstractC1091l = (AbstractC1091l) this.purchase;
        int i2 = abstractC1091l.f3010l;
        if (i2 == 1 && this.amazon != 4) {
            AbstractC12442l.subscription(i2 == 1);
            abstractC1091l.f3010l = 2;
            abstractC1091l.subscription();
            return;
        }
        AbstractC1091l abstractC1091l2 = (AbstractC1091l) this.billing;
        if (abstractC1091l2 == null || (i = abstractC1091l2.f3010l) != 1 || this.amazon == 3) {
            return;
        }
        AbstractC12442l.subscription(i == 1);
        abstractC1091l2.f3010l = 2;
        abstractC1091l2.subscription();
    }

    public void yandex(AbstractC1091l abstractC1091l, C16990l c16990l) {
        AbstractC12442l.subscription(((AbstractC1091l) this.purchase) == abstractC1091l || ((AbstractC1091l) this.billing) == abstractC1091l);
        if (subs(abstractC1091l)) {
            if (abstractC1091l == ((AbstractC1091l) c16990l.f33120l)) {
                c16990l.f33122l = null;
                c16990l.f33120l = null;
                c16990l.f33119l = true;
            }
            loadAd(abstractC1091l);
            AbstractC12442l.subscription(abstractC1091l.f3010l == 1);
            abstractC1091l.f3008l.Signature();
            abstractC1091l.f3010l = 0;
            abstractC1091l.f3020l = null;
            abstractC1091l.f3015l = null;
            abstractC1091l.f3023l = false;
            abstractC1091l.vip();
            abstractC1091l.f3014l = null;
        }
    }
}
