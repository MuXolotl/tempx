package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lْٟٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13359l {
    public static final C15578l yandex = new C15578l(-885150361, false, new C5974l(5));
    public static final C15578l loadAd = new C15578l(-969311258, false, new C5974l(6));

    /* JADX WARN: Multi-variable type inference failed */
    public static final void admob(InterfaceC11189l interfaceC11189l, Function1 function1) {
        C18289l c18289l;
        boolean z;
        AbstractC14971l abstractC14971l = (AbstractC14971l) interfaceC11189l;
        if (!abstractC14971l.f29454l.f29462l) {
            AbstractC0081l.crashlytics("visitAncestors called on an unattached node");
        }
        AbstractC14971l abstractC14971l2 = abstractC14971l.f29454l.f29456l;
        C3654l c3654lMetrica = AbstractC5573l.metrica(interfaceC11189l);
        while (c3654lMetrica != null) {
            if ((((AbstractC14971l) c3654lMetrica.f7703l.mopub).f29457l & 262144) != 0) {
                while (abstractC14971l2 != null) {
                    if ((abstractC14971l2.f29450l & 262144) != 0) {
                        AbstractC14971l abstractC14971lLoadAd = abstractC14971l2;
                        C17893l c17893l = null;
                        while (abstractC14971lLoadAd != null) {
                            if (abstractC14971lLoadAd instanceof InterfaceC11189l) {
                                InterfaceC11189l interfaceC11189l2 = (InterfaceC11189l) abstractC14971lLoadAd;
                                if (!((AbstractC8576l.yandex(interfaceC11189l.adcel(), interfaceC11189l2.adcel()) && interfaceC11189l.getClass() == interfaceC11189l2.getClass()) ? ((Boolean) function1.invoke(interfaceC11189l2)).booleanValue() : true)) {
                                    return;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                if (((abstractC14971lLoadAd.f29450l & 262144) != 0) && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                                    int i = 0;
                                    for (AbstractC14971l abstractC14971l3 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l3 != null; abstractC14971l3 = abstractC14971l3.f29460l) {
                                        if ((abstractC14971l3.f29450l & 262144) != 0) {
                                            i++;
                                            if (i == 1) {
                                                abstractC14971lLoadAd = abstractC14971l3;
                                            } else {
                                                if (c17893l == null) {
                                                    c17893l = new C17893l(0, new AbstractC14971l[16]);
                                                }
                                                if (abstractC14971lLoadAd != null) {
                                                    c17893l.crashlytics(abstractC14971lLoadAd);
                                                    abstractC14971lLoadAd = null;
                                                }
                                                c17893l.crashlytics(abstractC14971l3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l);
                        }
                    }
                    abstractC14971l2 = abstractC14971l2.f29456l;
                }
            }
            c3654lMetrica = c3654lMetrica.license();
            abstractC14971l2 = (c3654lMetrica == null || (c18289l = c3654lMetrica.f7703l) == null) ? null : (C13924l) c18289l.billing;
        }
    }

    public static final void amazon(InterfaceC13349l interfaceC13349l, C12870l c12870l, InterfaceC16031l interfaceC16031l, long j, long j2, AbstractC9544l abstractC9544l) {
        AbstractC9544l abstractC9544l2 = c12870l.crashlytics;
        if (abstractC9544l2 != null) {
            if (abstractC9544l != null) {
                AbstractC3586l.mopub(interfaceC16031l, new C1040l(interfaceC13349l, j, c12870l, abstractC9544l));
                return;
            } else {
                AbstractC9361l.vip(interfaceC13349l, abstractC9544l2, j, interfaceC13349l.admob(), 0.0f, null, null, c12870l.loadAd, 56);
                return;
            }
        }
        if (abstractC9544l != null) {
            AbstractC9361l.vip(interfaceC13349l, abstractC9544l, j, interfaceC13349l.admob(), 0.0f, null, new C0534l(c12870l.yandex, 5), 0, 88);
        } else {
            AbstractC9361l.metrica(interfaceC13349l, c12870l.yandex, 0L, j2, 0.0f, null, null, c12870l.loadAd, 58);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0083 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:27:0x007b, B:29:0x0083, B:24:0x006a, B:30:0x0090, B:23:0x0064), top: B:45:0x0021, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0078 -> B:27:0x007b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object billing(defpackage.AbstractC0283l r9) {
        /*
            boolean r0 = r9 instanceof defpackage.C13051l
            if (r0 == 0) goto L13
            r0 = r9
            lْؑؒ r0 = (defpackage.C13051l) r0
            int r1 = r0.f25562l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25562l = r1
            goto L18
        L13:
            lْؑؒ r0 = new lْؑؒ
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f25559l
            lٍؗؐ r1 = defpackage.EnumC9342l.f19165l
            int r2 = r0.f25562l
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 != r4) goto L33
            l٘ؓؐ r2 = r0.f25558l
            lِٔؐ r6 = r0.f25563l
            lِؗؐ r7 = r0.f25560l
            java.util.concurrent.atomic.AtomicBoolean r8 = r0.f25561l
            defpackage.AbstractC2829l.crashlytics(r9)     // Catch: java.lang.Throwable -> L31
            goto L7b
        L31:
            r9 = move-exception
            goto L9d
        L33:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r9)
            return r5
        L39:
            defpackage.AbstractC2829l.crashlytics(r9)
            r9 = 6
            lؚؚۖ r6 = defpackage.AbstractC12098l.yandex(r4, r3, r5, r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = new java.util.concurrent.atomic.AtomicBoolean
            r9.<init>(r3)
            lۣؔۧ r2 = new lۣؔۧ
            r7 = 15
            r2.<init>(r9, r6, r7)
            java.lang.Object r7 = defpackage.AbstractC9620l.crashlytics
            monitor-enter(r7)
            java.util.List r8 = defpackage.AbstractC9620l.subs     // Catch: java.lang.Throwable -> La7
            java.util.ArrayList r8 = defpackage.AbstractC16901l.m4218final(r2, r8)     // Catch: java.lang.Throwable -> La7
            defpackage.AbstractC9620l.subs = r8     // Catch: java.lang.Throwable -> La7
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> La7
            monitor-exit(r7)
            defpackage.AbstractC9620l.yandex()
            lِؗؐ r7 = new lِؗؐ
            r8 = 3
            r7.<init>(r8, r2)
            l٘ؓؐ r2 = new l٘ؓؐ     // Catch: java.lang.Throwable -> L31
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L31
            r8 = r9
        L6a:
            r0.f25561l = r8     // Catch: java.lang.Throwable -> L31
            r0.f25560l = r7     // Catch: java.lang.Throwable -> L31
            r0.f25563l = r6     // Catch: java.lang.Throwable -> L31
            r0.f25558l = r2     // Catch: java.lang.Throwable -> L31
            r0.f25562l = r4     // Catch: java.lang.Throwable -> L31
            java.lang.Object r9 = r2.yandex(r0)     // Catch: java.lang.Throwable -> L31
            if (r9 != r1) goto L7b
            return r1
        L7b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L31
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r9 == 0) goto L90
            java.lang.Object r9 = r2.crashlytics()     // Catch: java.lang.Throwable -> L31
            kotlin.Unit r9 = (kotlin.Unit) r9     // Catch: java.lang.Throwable -> L31
            r8.set(r3)     // Catch: java.lang.Throwable -> L31
            defpackage.AbstractC7572l.adcel()     // Catch: java.lang.Throwable -> L31
            goto L6a
        L90:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L31
            r6.ads(r5)     // Catch: java.lang.Throwable -> L9b
            r7.crashlytics()
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L9b:
            r9 = move-exception
            goto La3
        L9d:
            throw r9     // Catch: java.lang.Throwable -> L9e
        L9e:
            r0 = move-exception
            defpackage.AbstractC0676l.loadAd(r6, r9)     // Catch: java.lang.Throwable -> L9b
            throw r0     // Catch: java.lang.Throwable -> L9b
        La3:
            r7.crashlytics()
            throw r9
        La7:
            r9 = move-exception
            monitor-exit(r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC13359l.billing(lّؑۧ):java.lang.Object");
    }

    public static final void crashlytics(InterfaceC13349l interfaceC13349l, long j, long j2, boolean z, Function1 function1) {
        float fMax = Math.max(Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L));
        C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
        long jM4551private = c18449lMo2065break.m4551private();
        c18449lMo2065break.m4555synchronized().mopub();
        try {
            C16543l c16543l = (C16543l) c18449lMo2065break.f36010l;
            if (z) {
                c16543l.remoteconfig(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
            }
            if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0 || C1187l.loadAd(j, 0L)) {
                C18449l c18449lMo2065break2 = interfaceC13349l.mo2065break();
                long jM4551private2 = c18449lMo2065break2.m4551private();
                c18449lMo2065break2.m4555synchronized().mopub();
                try {
                    ((C16543l) c18449lMo2065break2.f36010l).isVip(fMax, fMax, 0L);
                    function1.invoke(interfaceC13349l);
                    c18449lMo2065break2.m4555synchronized().ads();
                    c18449lMo2065break2.m4534abstract(jM4551private2);
                } catch (Throwable th) {
                    c18449lMo2065break2.m4555synchronized().ads();
                    c18449lMo2065break2.m4534abstract(jM4551private2);
                    throw th;
                }
            } else {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
                ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(fIntBitsToFloat3, fIntBitsToFloat4);
                try {
                    C18449l c18449lMo2065break3 = interfaceC13349l.mo2065break();
                    long jM4551private3 = c18449lMo2065break3.m4551private();
                    c18449lMo2065break3.m4555synchronized().mopub();
                    try {
                        ((C16543l) c18449lMo2065break3.f36010l).isVip(fMax, fMax, 0L);
                        function1.invoke(interfaceC13349l);
                        c18449lMo2065break3.m4555synchronized().ads();
                        c18449lMo2065break3.m4534abstract(jM4551private3);
                        ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(-fIntBitsToFloat3, -fIntBitsToFloat4);
                    } catch (Throwable th2) {
                        c18449lMo2065break3.m4555synchronized().ads();
                        c18449lMo2065break3.m4534abstract(jM4551private3);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(-fIntBitsToFloat3, -fIntBitsToFloat4);
                    throw th3;
                }
            }
            AbstractC0653l.license(c18449lMo2065break, jM4551private);
        } catch (Throwable th4) {
            AbstractC0653l.license(c18449lMo2065break, jM4551private);
            throw th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, lُٝٔ] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void isPro(InterfaceC11189l interfaceC11189l, Function1 function1) {
        AbstractC14971l abstractC14971l = (AbstractC14971l) interfaceC11189l;
        if (!abstractC14971l.f29454l.f29462l) {
            AbstractC0081l.crashlytics("visitSubtreeIf called on an unattached node");
        }
        C17893l c17893l = new C17893l(0, new AbstractC14971l[16]);
        AbstractC14971l abstractC14971l2 = abstractC14971l.f29454l;
        AbstractC14971l abstractC14971l3 = abstractC14971l2.f29460l;
        if (abstractC14971l3 == null) {
            AbstractC5573l.yandex(c17893l, abstractC14971l2);
        } else {
            c17893l.crashlytics(abstractC14971l3);
        }
        while (true) {
            int i = c17893l.f34846l;
            if (i == 0) {
                return;
            }
            AbstractC14971l abstractC14971l4 = (AbstractC14971l) c17893l.vip(i - 1);
            if ((abstractC14971l4.f29457l & 262144) != 0) {
                AbstractC14971l abstractC14971l5 = abstractC14971l4;
                while (true) {
                    if (abstractC14971l5 != null && abstractC14971l5.f29462l) {
                        if ((abstractC14971l5.f29450l & 262144) != 0) {
                            ?? LoadAd = abstractC14971l5;
                            ?? c17893l2 = 0;
                            while (LoadAd != 0) {
                                if (LoadAd instanceof InterfaceC11189l) {
                                    InterfaceC11189l interfaceC11189l2 = (InterfaceC11189l) LoadAd;
                                    EnumC8647l enumC8647l = (AbstractC8576l.yandex(interfaceC11189l.adcel(), interfaceC11189l2.adcel()) && interfaceC11189l.getClass() == interfaceC11189l2.getClass()) ? (EnumC8647l) function1.invoke(interfaceC11189l2) : EnumC8647l.f17806l;
                                    if (enumC8647l != EnumC8647l.f17804l) {
                                        if (enumC8647l == EnumC8647l.f17805l) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((LoadAd.f29450l & 262144) != 0 && (LoadAd instanceof AbstractC11340l)) {
                                    AbstractC14971l abstractC14971l6 = ((AbstractC11340l) LoadAd).f22875l;
                                    int i2 = 0;
                                    LoadAd = LoadAd;
                                    c17893l2 = c17893l2;
                                    while (abstractC14971l6 != null) {
                                        if ((abstractC14971l6.f29450l & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                c17893l2 = c17893l2;
                                                LoadAd = abstractC14971l6;
                                            } else {
                                                if (c17893l2 == 0) {
                                                    c17893l2 = new C17893l(0, new AbstractC14971l[16]);
                                                }
                                                if (LoadAd != 0) {
                                                    c17893l2.crashlytics(LoadAd);
                                                    LoadAd = 0;
                                                }
                                                c17893l2.crashlytics(abstractC14971l6);
                                            }
                                        }
                                        abstractC14971l6 = abstractC14971l6.f29460l;
                                        LoadAd = LoadAd;
                                        c17893l2 = c17893l2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                LoadAd = AbstractC5573l.loadAd(c17893l2);
                            }
                        }
                        abstractC14971l5 = abstractC14971l5.f29460l;
                    }
                }
            }
            AbstractC5573l.yandex(c17893l, abstractC14971l4);
        }
    }

    public static final C11925l loadAd(C6742l c6742l, C11183l c11183l, float f, long j, long j2) {
        long jPurchase = AbstractC14707l.purchase(C14174l.admob(f, j));
        if (((int) (jPurchase >> 32)) <= 0 || ((int) (4294967295L & jPurchase)) <= 0) {
            return null;
        }
        C11925l c11925lCrashlytics = ((InterfaceC3685l) AbstractC13402l.loadAd(c11183l, AbstractC4751l.mopub)).crashlytics();
        c6742l.subscription(jPurchase, c11925lCrashlytics, new C16914l(c11183l, f, j2, 0));
        return c11925lCrashlytics;
    }

    public static final void mopub(InterfaceC8605l interfaceC8605l, Object obj, Function1 function1) {
        C18289l c18289l;
        boolean z;
        if (!((AbstractC14971l) interfaceC8605l).f29454l.f29462l) {
            AbstractC0081l.crashlytics("visitAncestors called on an unattached node");
        }
        AbstractC14971l abstractC14971l = ((AbstractC14971l) interfaceC8605l).f29454l.f29456l;
        C3654l c3654lMetrica = AbstractC5573l.metrica(interfaceC8605l);
        while (c3654lMetrica != null) {
            if ((((AbstractC14971l) c3654lMetrica.f7703l.mopub).f29457l & 262144) != 0) {
                while (abstractC14971l != null) {
                    if ((abstractC14971l.f29450l & 262144) != 0) {
                        AbstractC14971l abstractC14971lLoadAd = abstractC14971l;
                        C17893l c17893l = null;
                        while (abstractC14971lLoadAd != null) {
                            if (abstractC14971lLoadAd instanceof InterfaceC11189l) {
                                InterfaceC11189l interfaceC11189l = (InterfaceC11189l) abstractC14971lLoadAd;
                                if (!(obj.equals(interfaceC11189l.adcel()) ? ((Boolean) function1.invoke(interfaceC11189l)).booleanValue() : true)) {
                                    return;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                if (((abstractC14971lLoadAd.f29450l & 262144) != 0) && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                                    int i = 0;
                                    for (AbstractC14971l abstractC14971l2 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l2 != null; abstractC14971l2 = abstractC14971l2.f29460l) {
                                        if ((abstractC14971l2.f29450l & 262144) != 0) {
                                            i++;
                                            if (i == 1) {
                                                abstractC14971lLoadAd = abstractC14971l2;
                                            } else {
                                                if (c17893l == null) {
                                                    c17893l = new C17893l(0, new AbstractC14971l[16]);
                                                }
                                                if (abstractC14971lLoadAd != null) {
                                                    c17893l.crashlytics(abstractC14971lLoadAd);
                                                    abstractC14971lLoadAd = null;
                                                }
                                                c17893l.crashlytics(abstractC14971l2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l);
                        }
                    }
                    abstractC14971l = abstractC14971l.f29456l;
                }
            }
            c3654lMetrica = c3654lMetrica.license();
            abstractC14971l = (c3654lMetrica == null || (c18289l = c3654lMetrica.f7703l) == null) ? null : (C13924l) c18289l.billing;
        }
    }

    public static final InterfaceC11189l purchase(AbstractC14971l abstractC14971l, Object obj) {
        C18289l c18289l;
        if (!abstractC14971l.f29454l.f29462l) {
            AbstractC0081l.crashlytics("visitAncestors called on an unattached node");
        }
        AbstractC14971l abstractC14971l2 = abstractC14971l.f29454l.f29456l;
        C3654l c3654lMetrica = AbstractC5573l.metrica(abstractC14971l);
        while (c3654lMetrica != null) {
            if ((((AbstractC14971l) c3654lMetrica.f7703l.mopub).f29457l & 262144) != 0) {
                while (abstractC14971l2 != null) {
                    if ((abstractC14971l2.f29450l & 262144) != 0) {
                        AbstractC14971l abstractC14971lLoadAd = abstractC14971l2;
                        C17893l c17893l = null;
                        while (abstractC14971lLoadAd != null) {
                            if (abstractC14971lLoadAd instanceof InterfaceC11189l) {
                                InterfaceC11189l interfaceC11189l = (InterfaceC11189l) abstractC14971lLoadAd;
                                if (obj.equals(interfaceC11189l.adcel())) {
                                    return interfaceC11189l;
                                }
                            }
                            if ((abstractC14971lLoadAd.f29450l & 262144) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                                int i = 0;
                                for (AbstractC14971l abstractC14971l3 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l3 != null; abstractC14971l3 = abstractC14971l3.f29460l) {
                                    if ((abstractC14971l3.f29450l & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            abstractC14971lLoadAd = abstractC14971l3;
                                        } else {
                                            if (c17893l == null) {
                                                c17893l = new C17893l(0, new AbstractC14971l[16]);
                                            }
                                            if (abstractC14971lLoadAd != null) {
                                                c17893l.crashlytics(abstractC14971lLoadAd);
                                                abstractC14971lLoadAd = null;
                                            }
                                            c17893l.crashlytics(abstractC14971l3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l);
                        }
                    }
                    abstractC14971l2 = abstractC14971l2.f29456l;
                }
            }
            c3654lMetrica = c3654lMetrica.license();
            abstractC14971l2 = (c3654lMetrica == null || (c18289l = c3654lMetrica.f7703l) == null) ? null : (C13924l) c18289l.billing;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [lٟٔٙ] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [lْ٘ۖ] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public static final void subs(AbstractC14971l abstractC14971l, String str, Function1 function1) {
        if (!abstractC14971l.f29454l.f29462l) {
            AbstractC0081l.crashlytics("visitSubtreeIf called on an unattached node");
        }
        C17893l c17893l = new C17893l(0, new AbstractC14971l[16]);
        AbstractC14971l abstractC14971l2 = abstractC14971l.f29454l;
        AbstractC14971l abstractC14971l3 = abstractC14971l2.f29460l;
        if (abstractC14971l3 == null) {
            AbstractC5573l.yandex(c17893l, abstractC14971l2);
        } else {
            c17893l.crashlytics(abstractC14971l3);
        }
        while (true) {
            int i = c17893l.f34846l;
            if (i == 0) {
                return;
            }
            AbstractC14971l abstractC14971l4 = (AbstractC14971l) c17893l.vip(i - 1);
            if ((abstractC14971l4.f29457l & 262144) != 0) {
                AbstractC14971l abstractC14971l5 = abstractC14971l4;
                while (true) {
                    if (abstractC14971l5 != null && abstractC14971l5.f29462l) {
                        if ((abstractC14971l5.f29450l & 262144) != 0) {
                            ?? LoadAd = abstractC14971l5;
                            ?? c17893l2 = 0;
                            while (LoadAd != 0) {
                                if (LoadAd instanceof InterfaceC11189l) {
                                    InterfaceC11189l interfaceC11189l = (InterfaceC11189l) LoadAd;
                                    EnumC8647l enumC8647l = str.equals(interfaceC11189l.adcel()) ? (EnumC8647l) function1.invoke(interfaceC11189l) : EnumC8647l.f17806l;
                                    if (enumC8647l != EnumC8647l.f17804l) {
                                        if (enumC8647l == EnumC8647l.f17805l) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((LoadAd.f29450l & 262144) != 0 && (LoadAd instanceof AbstractC11340l)) {
                                    AbstractC14971l abstractC14971l6 = ((AbstractC11340l) LoadAd).f22875l;
                                    int i2 = 0;
                                    LoadAd = LoadAd;
                                    c17893l2 = c17893l2;
                                    while (abstractC14971l6 != null) {
                                        if ((abstractC14971l6.f29450l & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                c17893l2 = c17893l2;
                                                LoadAd = abstractC14971l6;
                                            } else {
                                                if (c17893l2 == 0) {
                                                    c17893l2 = new C17893l(0, new AbstractC14971l[16]);
                                                }
                                                if (LoadAd != 0) {
                                                    c17893l2.crashlytics(LoadAd);
                                                    LoadAd = 0;
                                                }
                                                c17893l2.crashlytics(abstractC14971l6);
                                            }
                                        }
                                        abstractC14971l6 = abstractC14971l6.f29460l;
                                        LoadAd = LoadAd;
                                        c17893l2 = c17893l2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                LoadAd = AbstractC5573l.loadAd(c17893l2);
                            }
                        }
                        abstractC14971l5 = abstractC14971l5.f29460l;
                    }
                }
            }
            AbstractC5573l.yandex(c17893l, abstractC14971l4);
        }
    }

    public static final boolean yandex(C11090l c11090l) {
        C4361l c4361l;
        C10891l c10891l = c11090l.crashlytics;
        C8405l c8405l = (c10891l == null || (c4361l = c10891l.loadAd) == null) ? null : new C8405l(c4361l.loadAd);
        boolean z = false;
        if (c8405l != null && c8405l.yandex == 1) {
            z = true;
        }
        return !z;
    }
}
