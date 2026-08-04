package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lُْٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13475l implements InterfaceC8180l {
    public static final C13047l crashlytics;
    public static final long loadAd;
    public static final C13475l yandex = new C13475l();

    static {
        C6760l c6760l = C9658l.f19699l;
        loadAd = AbstractC15918l.tapsense(7, EnumC16636l.DAYS);
        crashlytics = AbstractC9549l.yandex(new C18334l(29));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    public static long loadAd(C18010l c18010l) {
        float fFloatValue;
        Float fMetrica;
        C18010l c18010lPurchase = AbstractC1788l.purchase(c18010l, "time");
        if (c18010lPurchase == null) {
            fFloatValue = 0.0f;
        } else {
            AbstractC18121l abstractC18121lBilling = AbstractC1788l.billing(c18010lPurchase, "total");
            if (abstractC18121lBilling != null) {
                C11474l c11474l = AbstractC8358l.yandex;
                fMetrica = AbstractC12673l.metrica(abstractC18121lBilling.amazon());
            } else {
                fMetrica = null;
            }
            if (fMetrica != null) {
                fFloatValue = fMetrica.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
        }
        return (long) (fFloatValue * 1000.0f);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0167  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
    
        if (r2 == r10) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object amazon(defpackage.C16864l r21, defpackage.AbstractC18643l r22, defpackage.AbstractC0283l r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13475l.amazon(lٗؓ۟, lۡۨ, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object crashlytics(C16864l c16864l, AbstractC0283l abstractC0283l) throws Throwable {
        C17287l c17287l;
        InterfaceC15829l interfaceC15829l;
        Object obj;
        if (abstractC0283l instanceof C17287l) {
            c17287l = (C17287l) abstractC0283l;
            int i = c17287l.f33548l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c17287l.f33548l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c17287l = new C17287l(this, abstractC0283l);
            }
        } else {
            c17287l = new C17287l(this, abstractC0283l);
        }
        Object objFirebase = c17287l.f33551l;
        int i2 = c17287l.f33548l;
        Object obj2 = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objFirebase);
            InterfaceC6942l interfaceC6942lYandex = ((InterfaceC15829l) AbstractC16584l.crashlytics().f3603l).yandex();
            c17287l.f33550l = c16864l;
            c17287l.f33548l = 1;
            objFirebase = AbstractC0622l.firebase(interfaceC6942lYandex, c17287l);
            if (objFirebase != obj2) {
            }
            return obj2;
        }
        if (i2 == 1) {
            c16864l = c17287l.f33550l;
            AbstractC2829l.crashlytics(objFirebase);
        } else {
            if (i2 == 2) {
                AbstractC2829l.crashlytics(objFirebase);
                interfaceC15829l = (InterfaceC15829l) AbstractC16584l.crashlytics().f3603l;
                c17287l.f33550l = null;
                c17287l.f33549l = objFirebase;
                c17287l.f33548l = 3;
                if (interfaceC15829l.loadAd(new C0588l((String) objFirebase, null, 0), c17287l) != obj2) {
                    obj = objFirebase;
                }
                return obj2;
            }
            if (i2 != 3) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = c17287l.f33549l;
            AbstractC2829l.crashlytics(objFirebase);
        }
        return (String) obj;
        C7814l c7814l = (C7814l) objFirebase;
        if (c7814l.f16327l.length() != 0) {
            if (C9658l.amazon(loadAd) + c7814l.f16332l > System.currentTimeMillis()) {
                return c7814l.f16327l;
            }
        }
        c17287l.f33550l = null;
        c17287l.f33548l = 2;
        objFirebase = purchase(c16864l, c17287l);
        if (objFirebase != obj2) {
            interfaceC15829l = (InterfaceC15829l) AbstractC16584l.crashlytics().f3603l;
            c17287l.f33550l = null;
            c17287l.f33549l = objFirebase;
            c17287l.f33548l = 3;
            if (interfaceC15829l.loadAd(new C0588l((String) objFirebase, null, 0), c17287l) != obj2) {
                obj = objFirebase;
                return (String) obj;
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        if (r6 == r3) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object purchase(defpackage.C16864l r7, defpackage.AbstractC0283l r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C1118l
            if (r0 == 0) goto L13
            r0 = r8
            lٕؒ٘ r0 = (defpackage.C1118l) r0
            int r1 = r0.f3069l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3069l = r1
            goto L18
        L13:
            lٕؒ٘ r0 = new lٕؒ٘
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r6 = r0.f3068l
            int r8 = r0.f3069l
            r1 = 2
            r2 = 1
            lٍؗؐ r3 = defpackage.EnumC9342l.f19165l
            if (r8 == 0) goto L35
            if (r8 == r2) goto L31
            if (r8 != r1) goto L2a
            defpackage.AbstractC2829l.crashlytics(r6)
            goto L79
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            r6 = 0
            return r6
        L31:
            defpackage.AbstractC2829l.crashlytics(r6)
            goto L6c
        L35:
            defpackage.AbstractC2829l.crashlytics(r6)
            lؙ۠ۗ r6 = new lؙ۠ۗ
            r6.<init>()
            java.lang.String r8 = "https://apic-desktop.musixmatch.com/ws/1.1/token.get"
            defpackage.AbstractC12323l.yandex(r6, r8)
            lْؑ٘ r8 = r6.yandex
            lؙۨ٘ r8 = r8.isPro
            java.lang.String r4 = "app_id"
            java.lang.String r5 = "web-desktop-app-v1.0"
            r8.mo214l(r4, r5)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            java.lang.String r8 = "User-Agent"
            java.lang.String r4 = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/70.0.3538.77 Chrome/70.0.3538.77 Safari/537.36"
            lؑؕٚ r5 = r6.crashlytics
            r5.mo214l(r8, r4)
            lًؘ٘ r8 = defpackage.C17721l.loadAd
            r6.loadAd = r8
            lؕۧٚ r8 = new lؕۧٚ
            r4 = 26
            r8.<init>(r6, r7, r4)
            r0.f3069l = r2
            java.lang.Object r6 = r8.advert(r0)
            if (r6 != r3) goto L6c
            goto L78
        L6c:
            lَؑۥ r6 = (defpackage.AbstractC10022l) r6
            r0.f3069l = r1
            java.nio.charset.Charset r7 = defpackage.AbstractC9050l.yandex
            java.lang.Object r6 = defpackage.AbstractC3474l.loadAd(r6, r7, r0)
            if (r6 != r3) goto L79
        L78:
            return r3
        L79:
            java.lang.String r6 = (java.lang.String) r6
            lْؐۤ r7 = defpackage.C13475l.crashlytics
            r7.getClass()
            lؘؒٝ r8 = defpackage.C18010l.Companion
            lؘٖۘ r8 = r8.serializer()
            lؘٖۘ r8 = (defpackage.InterfaceC16588l) r8
            java.lang.Object r6 = r7.loadAd(r8, r6)
            l٘ٙۥ r6 = (defpackage.C18010l) r6
            java.lang.String r7 = "message"
            l٘ٙۥ r6 = defpackage.AbstractC1788l.purchase(r6, r7)
            if (r6 == 0) goto La7
            java.lang.String r7 = "body"
            l٘ٙۥ r6 = defpackage.AbstractC1788l.purchase(r6, r7)
            if (r6 == 0) goto La7
            java.lang.String r7 = "user_token"
            java.lang.String r6 = defpackage.AbstractC1788l.isPro(r6, r7)
            if (r6 == 0) goto La7
            return r6
        La7:
            java.lang.String r6 = "220215b052d6aeaa3e9a410986f6c3ae7ea9f5238731cb918d05ea"
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13475l.purchase(lٗؓ۟, lّؑۧ):java.lang.Object");
    }

    @Override // defpackage.InterfaceC8180l
    public final Object yandex(C16864l c16864l, AbstractC18643l abstractC18643l, InterfaceC14029l interfaceC14029l) {
        return amazon(c16864l, abstractC18643l, (AbstractC0283l) interfaceC14029l);
    }
}
