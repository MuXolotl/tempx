package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَْؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13264l implements InterfaceC17955l {
    public final C1831l Signature;
    public final C10086l ad;
    public final C15308l adcel;
    public long admob;
    public final C15308l ads;
    public final C6188l advert;
    public final C16557l amazon;
    public final C10086l applovin;
    public final C10086l appmetrica;
    public int billing;
    public final C10086l crashlytics;
    public final C7239l firebase;
    public final C10086l inmobi;
    public float isPro;
    public final C16141l isVip;
    public final C5138l license;
    public C4685l loadAd;
    public int metrica;
    public long mopub;
    public final InterfaceC8714l premium;
    public final C3877l pro;
    public int purchase;
    public final C10086l remoteconfig;
    public final InterfaceC8714l signatures;
    public final boolean smaato;
    public final C2403l startapp;
    public float subs;
    public final C8610l subscription;
    public final C14541l tapsense;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final C10086l f26041throws;
    public InterfaceC13490l vip;
    public boolean yandex;

    public AbstractC13264l(int i, float f) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            AbstractC14825l.yandex("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.crashlytics = AbstractC8020l.smaato(new C1187l(0L));
        this.amazon = new C16557l(i, f, this);
        this.purchase = i;
        this.mopub = Long.MAX_VALUE;
        final int i2 = 0;
        this.firebase = new C7239l(new Function1(this) { // from class: lٟؔؔ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC13264l f5127l;

            {
                this.f5127l = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Long] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C4685l c4685l;
                int i3 = i2;
                C4685l c4685l2 = null;
                AbstractC13264l abstractC13264l = this.f5127l;
                switch (i3) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        long jLoadAd = AbstractC5518l.loadAd(abstractC13264l);
                        float f2 = abstractC13264l.subs + fFloatValue;
                        long jSubscription = AbstractC5573l.subscription(f2);
                        abstractC13264l.subs = f2 - jSubscription;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j = jLoadAd + jSubscription;
                            long jMopub = AbstractC8576l.mopub(j, abstractC13264l.admob, abstractC13264l.mopub);
                            ?? r0 = j != jMopub;
                            long j2 = jMopub - jLoadAd;
                            float f3 = j2;
                            abstractC13264l.isPro = f3;
                            if (Math.abs(j2) != 0) {
                                abstractC13264l.inmobi.setValue(Boolean.valueOf(f3 > 0.0f));
                                abstractC13264l.f26041throws.setValue(Boolean.valueOf(f3 < 0.0f));
                            }
                            int i4 = (int) j2;
                            int i5 = -i4;
                            C4685l c4685lAdmob = ((C4685l) abstractC13264l.remoteconfig.getValue()).admob(i5);
                            if (c4685lAdmob == null || (c4685l = abstractC13264l.loadAd) == null) {
                                c4685l2 = c4685lAdmob;
                            } else {
                                C4685l c4685lAdmob2 = c4685l.admob(i5);
                                if (c4685lAdmob2 != null) {
                                    abstractC13264l.loadAd = c4685lAdmob2;
                                    c4685l2 = c4685lAdmob;
                                }
                            }
                            if (c4685l2 != null) {
                                abstractC13264l.admob(c4685l2, abstractC13264l.yandex, true);
                                AbstractC11184l.metrica(abstractC13264l.signatures);
                            } else {
                                C16557l c16557l = abstractC13264l.amazon;
                                AbstractC13264l abstractC13264l2 = (AbstractC13264l) c16557l.f32502l;
                                C13765l c13765l = (C13765l) c16557l.f32505l;
                                c13765l.subs(c13765l.admob() + (abstractC13264l2.vip() != 0 ? i4 / abstractC13264l2.vip() : 0.0f));
                                C3654l c3654l = (C3654l) abstractC13264l.ad.getValue();
                                if (c3654l != null) {
                                    c3654l.smaato();
                                }
                            }
                            if (r0 != false) {
                                ValueOf = Long.valueOf(j2);
                            }
                            fFloatValue = ValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        C8929l c8929l = (C8929l) obj;
                        AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
                        Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
                        AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
                        try {
                            c8929l.yandex(abstractC13264l.purchase);
                            Unit unit = Unit.INSTANCE;
                            return Unit.INSTANCE;
                        } finally {
                            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                        }
                }
            }
        });
        final int i3 = 1;
        this.smaato = true;
        this.remoteconfig = new C10086l(AbstractC10521l.loadAd, C18450l.f36015l);
        this.vip = AbstractC10521l.yandex;
        this.startapp = new C2403l();
        this.adcel = new C15308l(-1);
        this.ads = new C15308l(i);
        C7472l c7472l = C7472l.f15463l;
        int i4 = 3;
        this.subscription = AbstractC8020l.billing(c7472l, new C4838l(this, i4));
        AbstractC8020l.billing(c7472l, new C4838l(this, 4));
        C14541l c14541l = new C14541l(new Function1(this) { // from class: lٟؔؔ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC13264l f5127l;

            {
                this.f5127l = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Long] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C4685l c4685l;
                int i5 = i3;
                C4685l c4685l2 = null;
                AbstractC13264l abstractC13264l = this.f5127l;
                switch (i5) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        long jLoadAd = AbstractC5518l.loadAd(abstractC13264l);
                        float f2 = abstractC13264l.subs + fFloatValue;
                        long jSubscription = AbstractC5573l.subscription(f2);
                        abstractC13264l.subs = f2 - jSubscription;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j = jLoadAd + jSubscription;
                            long jMopub = AbstractC8576l.mopub(j, abstractC13264l.admob, abstractC13264l.mopub);
                            ?? r0 = j != jMopub;
                            long j2 = jMopub - jLoadAd;
                            float f3 = j2;
                            abstractC13264l.isPro = f3;
                            if (Math.abs(j2) != 0) {
                                abstractC13264l.inmobi.setValue(Boolean.valueOf(f3 > 0.0f));
                                abstractC13264l.f26041throws.setValue(Boolean.valueOf(f3 < 0.0f));
                            }
                            int i6 = (int) j2;
                            int i7 = -i6;
                            C4685l c4685lAdmob = ((C4685l) abstractC13264l.remoteconfig.getValue()).admob(i7);
                            if (c4685lAdmob == null || (c4685l = abstractC13264l.loadAd) == null) {
                                c4685l2 = c4685lAdmob;
                            } else {
                                C4685l c4685lAdmob2 = c4685l.admob(i7);
                                if (c4685lAdmob2 != null) {
                                    abstractC13264l.loadAd = c4685lAdmob2;
                                    c4685l2 = c4685lAdmob;
                                }
                            }
                            if (c4685l2 != null) {
                                abstractC13264l.admob(c4685l2, abstractC13264l.yandex, true);
                                AbstractC11184l.metrica(abstractC13264l.signatures);
                            } else {
                                C16557l c16557l = abstractC13264l.amazon;
                                AbstractC13264l abstractC13264l2 = (AbstractC13264l) c16557l.f32502l;
                                C13765l c13765l = (C13765l) c16557l.f32505l;
                                c13765l.subs(c13765l.admob() + (abstractC13264l2.vip() != 0 ? i6 / abstractC13264l2.vip() : 0.0f));
                                C3654l c3654l = (C3654l) abstractC13264l.ad.getValue();
                                if (c3654l != null) {
                                    c3654l.smaato();
                                }
                            }
                            if (r0 != false) {
                                ValueOf = Long.valueOf(j2);
                            }
                            fFloatValue = ValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        C8929l c8929l = (C8929l) obj;
                        AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
                        Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
                        AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
                        try {
                            c8929l.yandex(abstractC13264l.purchase);
                            Unit unit = Unit.INSTANCE;
                            return Unit.INSTANCE;
                        } finally {
                            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                        }
                }
            }
        });
        this.tapsense = c14541l;
        this.Signature = new C1831l(new C5138l(22, this), c14541l, new C4838l(this, 5));
        this.license = new C5138l((byte) 0, 18);
        this.pro = new C3877l();
        this.ad = AbstractC8020l.smaato(null);
        this.advert = new C6188l(this, i4);
        AbstractC7563l.loadAd(0, 0, 0, 0, 15);
        this.isVip = new C16141l();
        this.signatures = AbstractC11184l.amazon();
        this.premium = AbstractC11184l.amazon();
        Boolean bool = Boolean.FALSE;
        this.applovin = AbstractC8020l.smaato(bool);
        this.appmetrica = AbstractC8020l.smaato(bool);
        this.inmobi = AbstractC8020l.smaato(bool);
        this.f26041throws = AbstractC8020l.smaato(bool);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (r9.loadAd(r7, r8, r0) == r5) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object ads(defpackage.AbstractC13264l r6, defpackage.EnumC11011l r7, kotlin.jvm.functions.Function2 r8, defpackage.InterfaceC14029l r9) {
        /*
            boolean r0 = r9 instanceof defpackage.C4408l
            if (r0 == 0) goto L13
            r0 = r9
            lؖۜٓ r0 = (defpackage.C4408l) r0
            int r1 = r0.f8940l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8940l = r1
            goto L18
        L13:
            lؖۜٓ r0 = new lؖۜٓ
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f8936l
            int r1 = r0.f8940l
            r2 = 0
            r3 = 2
            r4 = 1
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L40
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            lَْؐ r6 = r0.f8939l
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L7d
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            return r2
        L33:
            lٌؘۦ r6 = r0.f8941l
            r8 = r6
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            lًُْ r7 = r0.f8938l
            lَْؐ r6 = r0.f8939l
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L55
        L40:
            defpackage.AbstractC2829l.crashlytics(r9)
            r0.f8939l = r6
            r0.f8938l = r7
            r9 = r8
            lٌؘۦ r9 = (defpackage.AbstractC5563l) r9
            r0.f8941l = r9
            r0.f8940l = r4
            java.lang.Object r9 = r6.subs(r0)
            if (r9 != r5) goto L55
            goto L7c
        L55:
            lؚْ۟ r9 = r6.firebase
            boolean r9 = r9.yandex()
            if (r9 != 0) goto L6c
            lٖۖٔ r9 = r6.amazon
            java.lang.Object r9 = r9.f32506l
            lٔۦؙ r9 = (defpackage.C15308l) r9
            int r9 = r9.admob()
            lٔۦؙ r1 = r6.ads
            r1.subs(r9)
        L6c:
            lؚْ۟ r9 = r6.firebase
            r0.f8939l = r6
            r0.f8938l = r2
            r0.f8941l = r2
            r0.f8940l = r3
            java.lang.Object r7 = r9.loadAd(r7, r8, r0)
            if (r7 != r5) goto L7d
        L7c:
            return r5
        L7d:
            r7 = -1
            lٔۦؙ r6 = r6.adcel
            r6.subs(r7)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC13264l.ads(lَْؐ, lًُْ, kotlin.jvm.functions.Function2, lٌؚٓ):java.lang.Object");
    }

    public final boolean adcel() {
        return ((int) Float.intBitsToFloat((int) (startapp() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (startapp() & 4294967295L))) == 0;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0237  */
    /* JADX WARN: Code duplicated, block: B:153:0x023c  */
    /* JADX WARN: Code duplicated, block: B:156:0x0262  */
    /* JADX WARN: Code duplicated, block: B:158:0x0269 A[LOOP:1: B:157:0x0267->B:158:0x0269, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:189:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:190:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:195:0x0306  */
    /* JADX WARN: Code duplicated, block: B:198:0x0312  */
    /* JADX WARN: Code duplicated, block: B:201:0x031e  */
    /* JADX WARN: Code duplicated, block: B:213:0x0357 A[Catch: all -> 0x03d4, TryCatch #0 {all -> 0x03d4, blocks: (B:205:0x0335, B:208:0x033e, B:211:0x034b, B:213:0x0357, B:225:0x0392, B:219:0x0387, B:216:0x036f), top: B:240:0x0335 }] */
    /* JADX WARN: Code duplicated, block: B:215:0x036e  */
    /* JADX WARN: Code duplicated, block: B:216:0x036f A[Catch: all -> 0x03d4, TryCatch #0 {all -> 0x03d4, blocks: (B:205:0x0335, B:208:0x033e, B:211:0x034b, B:213:0x0357, B:225:0x0392, B:219:0x0387, B:216:0x036f), top: B:240:0x0335 }] */
    /* JADX WARN: Code duplicated, block: B:218:0x0386  */
    /* JADX WARN: Code duplicated, block: B:219:0x0387 A[Catch: all -> 0x03d4, TryCatch #0 {all -> 0x03d4, blocks: (B:205:0x0335, B:208:0x033e, B:211:0x034b, B:213:0x0357, B:225:0x0392, B:219:0x0387, B:216:0x036f), top: B:240:0x0335 }] */
    /* JADX WARN: Code duplicated, block: B:221:0x038d  */
    /* JADX WARN: Code duplicated, block: B:222:0x038e  */
    /* JADX WARN: Code duplicated, block: B:224:0x0391  */
    /* JADX WARN: Code duplicated, block: B:225:0x0392 A[Catch: all -> 0x03d4, TRY_LEAVE, TryCatch #0 {all -> 0x03d4, blocks: (B:205:0x0335, B:208:0x033e, B:211:0x034b, B:213:0x0357, B:225:0x0392, B:219:0x0387, B:216:0x036f), top: B:240:0x0335 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:231:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:234:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:240:0x0335 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r5v28, types: [int] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void admob(C4685l c4685l, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        Object obj;
        boolean z7;
        boolean z8;
        C10461l c10461l;
        List list;
        int size;
        int i2;
        ?? r5;
        boolean z9;
        ?? r11;
        ?? r12;
        float f;
        ?? r2;
        long jSubs;
        long jPurchase;
        long j;
        int i3;
        List list2 = c4685l.yandex;
        int i4 = c4685l.smaato;
        C10824l c10824l = c4685l.subs;
        C10824l c10824l2 = c4685l.isPro;
        float f2 = c4685l.firebase;
        this.tapsense.purchase = list2.size();
        int i5 = c4685l.loadAd;
        this.metrica = c4685l.crashlytics + i5;
        if (!z && this.yandex) {
            this.loadAd = c4685l;
            return;
        }
        boolean z10 = true;
        if (z) {
            this.yandex = true;
        }
        C1831l c1831l = this.Signature;
        boolean z11 = this.smaato;
        C16557l c16557l = this.amazon;
        if (!z2) {
            c16557l.getClass();
            c16557l.f32503l = c10824l2 != null ? c10824l2.amazon : null;
            if (c16557l.f32504l || !list2.isEmpty()) {
                c16557l.f32504l = true;
                int i6 = c10824l2 != null ? c10824l2.yandex : 0;
                ((C15308l) c16557l.f32506l).subs(i6);
                ((C0536l) c16557l.f32507l).crashlytics(i6);
                ((C13765l) c16557l.f32505l).subs(f2);
            }
            if (z11) {
                boolean z12 = z11;
                C0554l c0554l = c1831l.metrica;
                C16977l c16977l = c1831l.purchase;
                c0554l.f1957l = c4685l;
                c0554l.f1956l = c1831l.vip;
                C5138l c5138l = c1831l.yandex;
                int i7 = c1831l.mopub;
                float f3 = 0.0f;
                int i8 = -1;
                if (i7 != -1 && i7 != c0554l.m638private()) {
                    c1831l.smaato = true;
                    if (c0554l.m642synchronized()) {
                        int i9 = c1831l.admob;
                        if (i9 < 0) {
                            i9 = 0;
                        }
                        c1831l.admob = i9;
                        C4685l c4685l2 = (C4685l) c0554l.f1957l;
                        if (c4685l2 == null) {
                            c4685l2 = null;
                        }
                        int iM638private = c4685l2.yandex.isEmpty() ? -1 : c0554l.m638private() - 1;
                        if (iM638private != -1) {
                            int i10 = c1831l.subs;
                            if (i10 <= iM638private) {
                                iM638private = i10;
                            }
                            c1831l.subs = iM638private;
                        }
                        if (c1831l.billing <= 0.0f) {
                            c1831l.billing(c0554l.m640strictfp(), c1831l.remoteconfig - 1);
                        } else {
                            c1831l.billing(0, c0554l.m637package());
                        }
                    }
                }
                c1831l.remoteconfig = c0554l.m638private();
                if (c0554l.m642synchronized()) {
                    C4685l c4685l3 = (C4685l) c0554l.f1957l;
                    if (c4685l3 == null) {
                        c4685l3 = null;
                    }
                    int size2 = c4685l3.adcel.size();
                    C4685l c4685l4 = (C4685l) c0554l.f1957l;
                    if (c4685l4 == null) {
                        c4685l4 = null;
                    }
                    int size3 = c4685l4.yandex.size() + size2;
                    C4685l c4685l5 = (C4685l) c0554l.f1957l;
                    if (c4685l5 == null) {
                        c4685l5 = null;
                    }
                    int size4 = c4685l5.ads.size() + size3;
                    int i11 = 0;
                    while (i11 < size4) {
                        C4685l c4685l6 = (C4685l) c0554l.f1957l;
                        if (c4685l6 == null) {
                            c4685l6 = null;
                        }
                        int size5 = c4685l6.adcel.size();
                        float f4 = f3;
                        C4685l c4685l7 = (C4685l) c0554l.f1957l;
                        if (c4685l7 == null) {
                            c4685l7 = null;
                        }
                        int size6 = c4685l7.yandex.size();
                        if (i11 < size5) {
                            C4685l c4685l8 = (C4685l) c0554l.f1957l;
                            if (c4685l8 == null) {
                                c4685l8 = null;
                            }
                            i = ((C10824l) c4685l8.adcel.get(i11)).yandex;
                        } else if (i11 >= size5 && i11 < size5 + size6) {
                            C4685l c4685l9 = (C4685l) c0554l.f1957l;
                            if (c4685l9 == null) {
                                c4685l9 = null;
                            }
                            i = ((C10824l) c4685l9.yandex.get(i11 - size5)).yandex;
                        } else if (i11 >= size5 + size6) {
                            C4685l c4685l10 = (C4685l) c0554l.f1957l;
                            if (c4685l10 == null) {
                                c4685l10 = null;
                            }
                            i = ((C10824l) c4685l10.ads.get((i11 - size5) - size6)).yandex;
                        } else {
                            i = i8;
                        }
                        C4685l c4685l11 = (C4685l) c0554l.f1957l;
                        if (c4685l11 == null) {
                            c4685l11 = null;
                        }
                        int size7 = c4685l11.adcel.size();
                        C4685l c4685l12 = (C4685l) c0554l.f1957l;
                        if (c4685l12 == null) {
                            c4685l12 = null;
                        }
                        int size8 = c4685l12.yandex.size();
                        if (i11 < size7) {
                            C4685l c4685l13 = (C4685l) c0554l.f1957l;
                            if (c4685l13 == null) {
                                c4685l13 = null;
                            }
                            obj = ((C10824l) c4685l13.adcel.get(i11)).amazon;
                        } else if (i11 >= size7 && i11 < size7 + size8) {
                            C4685l c4685l14 = (C4685l) c0554l.f1957l;
                            if (c4685l14 == null) {
                                c4685l14 = null;
                            }
                            obj = ((C10824l) c4685l14.yandex.get(i11 - size7)).amazon;
                        } else if (i11 >= size7 + size8) {
                            C4685l c4685l15 = (C4685l) c0554l.f1957l;
                            if (c4685l15 == null) {
                                c4685l15 = null;
                            }
                            obj = ((C10824l) c4685l15.ads.get((i11 - size7) - size8)).amazon;
                        } else {
                            obj = C10461l.crashlytics;
                        }
                        C4685l c4685l16 = (C4685l) c0554l.f1957l;
                        if (c4685l16 == null) {
                            c4685l16 = null;
                        }
                        int i12 = c4685l16.loadAd;
                        if (i != -1) {
                            if (c16977l.yandex(i)) {
                                int i13 = ((C10461l) c16977l.loadAd(i)).loadAd;
                                z7 = z12;
                                Object obj2 = ((C10461l) c16977l.loadAd(i)).yandex;
                                if (i13 != i12 || !AbstractC8576l.yandex(obj2, obj)) {
                                    z8 = true;
                                    c1831l.smaato = true;
                                }
                                c10461l = (C10461l) c16977l.loadAd(i);
                                if (c10461l != null) {
                                    c10461l.loadAd = i12;
                                    c10461l.yandex = obj;
                                } else {
                                    c10461l = new C10461l();
                                    c10461l.yandex = obj;
                                    c10461l.loadAd = i12;
                                }
                                c16977l.subs(i, c10461l);
                                c1831l.admob = Math.min(c1831l.admob, i);
                                c1831l.subs = Math.max(c1831l.subs, i);
                                list = (List) c1831l.loadAd.mopub(i);
                                if (list != null) {
                                    size = list.size();
                                    for (i2 = 0; i2 < size; i2++) {
                                        ((InterfaceC13921l) list.get(i2)).cancel();
                                    }
                                }
                            } else {
                                z7 = z12;
                            }
                            z8 = true;
                            c10461l = (C10461l) c16977l.loadAd(i);
                            if (c10461l != null) {
                                c10461l.loadAd = i12;
                                c10461l.yandex = obj;
                            } else {
                                c10461l = new C10461l();
                                c10461l.yandex = obj;
                                c10461l.loadAd = i12;
                            }
                            c16977l.subs(i, c10461l);
                            c1831l.admob = Math.min(c1831l.admob, i);
                            c1831l.subs = Math.max(c1831l.subs, i);
                            list = (List) c1831l.loadAd.mopub(i);
                            if (list != null) {
                                size = list.size();
                                while (i2 < size) {
                                    ((InterfaceC13921l) list.get(i2)).cancel();
                                }
                            }
                        } else {
                            z7 = z12;
                            z8 = true;
                        }
                        i11++;
                        f3 = f4;
                        z10 = z8;
                        z12 = z7;
                        i8 = -1;
                    }
                    z3 = z12;
                    boolean z13 = z10;
                    float f5 = f3;
                    if (c1831l.smaato) {
                        boolean z14 = c1831l.billing <= f5 ? z13 ? 1 : 0 : false;
                        if (c0554l.m642synchronized()) {
                            C4685l c4685l17 = (C4685l) c0554l.f1957l;
                            if (c4685l17 == null) {
                                c4685l17 = null;
                            }
                            AbstractC4447l.loadAd(c4685l17);
                            C4685l c4685l18 = (C4685l) c0554l.f1957l;
                            if (c4685l18 == null) {
                                c4685l18 = null;
                            }
                            int i14 = c4685l18.tapsense != null ? ((AbstractC13264l) c5138l.f11181l).metrica : 0;
                            z6 = false;
                            c1831l.amazon(c0554l, c0554l.m637package(), c0554l.m640strictfp(), i14, c0554l.m644volatile(), c0554l.m636native(), 0.0f, z14);
                        } else {
                            z6 = false;
                        }
                        c1831l.smaato = z6;
                        z4 = z13;
                        z5 = z6;
                    } else {
                        z5 = false;
                        z4 = z13;
                    }
                } else {
                    z3 = z12;
                    z4 = true;
                    z5 = false;
                    c1831l.mopub();
                }
                c1831l.mopub = c0554l.m638private();
                z9 = z4;
                r5 = z5;
            }
            this.remoteconfig.setValue(c4685l);
            this.applovin.setValue(Boolean.valueOf(c4685l.remoteconfig));
            if (c10824l != null) {
                i3 = c10824l.yandex;
            } else {
                r11 = r5;
            }
            if (r11 == 0 || i4 != 0) {
                r11 = i3;
                r12 = z9 ? 1 : 0;
            } else {
                r12 = r5;
            }
            this.appmetrica.setValue(Boolean.valueOf((boolean) r12));
            if (c10824l != null) {
                this.purchase = c10824l.yandex;
            }
            this.billing = i4;
            AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
            Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
            AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
            if (z3) {
                try {
                    if (c4685l.admob < smaato() && Math.abs(this.isPro) > 0.5f) {
                        f = this.isPro;
                        if (firebase().purchase == EnumC7283l.f15126l) {
                            if (Math.signum(f) == Math.signum(-Float.intBitsToFloat((int) (startapp() & 4294967295L)))) {
                                if (adcel()) {
                                    r2 = r5;
                                }
                            }
                        } else if (Math.signum(f) == Math.signum(-Float.intBitsToFloat((int) (startapp() >> 32)))) {
                            if (adcel()) {
                                r2 = r5;
                            }
                        }
                        if (r2 == 0) {
                            r2 = z9;
                            r2 = z9;
                            r2 = z9;
                        } else {
                            r2 = z9;
                            r2 = z9;
                            r2 = z9;
                            c1831l.purchase(this.isPro, c4685l);
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                } catch (Throwable th) {
                    AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                    throw th;
                }
            }
            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
            this.mopub = AbstractC10521l.yandex(c4685l, smaato());
            smaato();
            if (c4685l.purchase == EnumC7283l.f15125l) {
                jSubs = c4685l.subs() >> 32;
            } else {
                jSubs = c4685l.subs() & 4294967295L;
            }
            int i15 = (int) jSubs;
            jPurchase = AbstractC8576l.purchase(c4685l.vip.purchase(i15, i5, -c4685l.billing, c4685l.amazon), r5, i15);
            j = this.mopub;
            if (jPurchase > j) {
                jPurchase = j;
            }
            this.admob = jPurchase;
        }
        ((C13765l) c16557l.f32505l).subs(f2);
        z9 = true;
        z3 = z11;
        r5 = 0;
        this.remoteconfig.setValue(c4685l);
        this.applovin.setValue(Boolean.valueOf(c4685l.remoteconfig));
        if (c10824l != null) {
            i3 = c10824l.yandex;
        } else {
            r11 = r5;
        }
        if (r11 == 0) {
            r11 = i3;
            r12 = z9 ? 1 : 0;
        } else {
            r11 = i3;
            r12 = z9 ? 1 : 0;
        }
        this.appmetrica.setValue(Boolean.valueOf((boolean) r12));
        if (c10824l != null) {
            this.purchase = c10824l.yandex;
        }
        this.billing = i4;
        AbstractC18620l abstractC18620lBilling2 = AbstractC7572l.billing();
        Function1 function1Purchase2 = abstractC18620lBilling2 != null ? abstractC18620lBilling2.purchase() : null;
        AbstractC18620l abstractC18620lRemoteconfig2 = AbstractC7572l.remoteconfig(abstractC18620lBilling2);
        if (z3) {
            if (c4685l.admob < smaato()) {
                f = this.isPro;
                if (firebase().purchase == EnumC7283l.f15126l) {
                    if (Math.signum(f) == Math.signum(-Float.intBitsToFloat((int) (startapp() & 4294967295L)))) {
                        if (adcel()) {
                            r2 = r5;
                        }
                    }
                } else if (Math.signum(f) == Math.signum(-Float.intBitsToFloat((int) (startapp() >> 32)))) {
                    if (adcel()) {
                        r2 = r5;
                    }
                }
                if (r2 == 0) {
                    r2 = z9;
                    r2 = z9;
                    r2 = z9;
                } else {
                    r2 = z9;
                    r2 = z9;
                    r2 = z9;
                    c1831l.purchase(this.isPro, c4685l);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
        AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase2);
        this.mopub = AbstractC10521l.yandex(c4685l, smaato());
        smaato();
        if (c4685l.purchase == EnumC7283l.f15125l) {
            jSubs = c4685l.subs() >> 32;
        } else {
            jSubs = c4685l.subs() & 4294967295L;
        }
        int i16 = (int) jSubs;
        jPurchase = AbstractC8576l.purchase(c4685l.vip.purchase(i16, i5, -c4685l.billing, c4685l.amazon), r5, i16);
        j = this.mopub;
        if (jPurchase > j) {
            jPurchase = j;
        }
        this.admob = jPurchase;
    }

    @Override // defpackage.InterfaceC17955l
    public final boolean amazon() {
        return ((Boolean) this.applovin.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        if (loadAd(defpackage.EnumC11011l.f22182l, r0, r6) == r9) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object billing(int r11, defpackage.C13315l r12, defpackage.InterfaceC14029l r13) {
        /*
            r10 = this;
            boolean r3 = r13 instanceof defpackage.C10748l
            if (r3 == 0) goto L14
            r3 = r13
            lُؐؔ r3 = (defpackage.C10748l) r3
            int r4 = r3.f21777l
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L14
            int r4 = r4 - r5
            r3.f21777l = r4
        L12:
            r6 = r3
            goto L1a
        L14:
            lُؐؔ r3 = new lُؐؔ
            r3.<init>(r10, r13)
            goto L12
        L1a:
            java.lang.Object r2 = r6.f21780l
            int r3 = r6.f21777l
            r7 = 0
            r4 = 0
            r8 = 2
            r5 = 1
            lٍؗؐ r9 = defpackage.EnumC9342l.f19165l
            if (r3 == 0) goto L3f
            if (r3 == r5) goto L35
            if (r3 != r8) goto L2f
            defpackage.AbstractC2829l.crashlytics(r2)
            goto L93
        L2f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r0)
            return r7
        L35:
            int r0 = r6.f21779l
            lِْۨ r3 = r6.f21778l
            defpackage.AbstractC2829l.crashlytics(r2)
            r2 = r4
            r4 = r3
            goto L74
        L3f:
            defpackage.AbstractC2829l.crashlytics(r2)
            lٖۖٔ r2 = r10.amazon
            java.lang.Object r3 = r2.f32506l
            lٔۦؙ r3 = (defpackage.C15308l) r3
            int r3 = r3.admob()
            if (r11 != r3) goto L5b
            java.lang.Object r2 = r2.f32505l
            lْۣۧ r2 = (defpackage.C13765l) r2
            float r2 = r2.admob()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L5b
            goto L61
        L5b:
            int r2 = r10.smaato()
            if (r2 != 0) goto L64
        L61:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L64:
            r6.f21778l = r12
            r6.f21779l = r11
            r6.f21777l = r5
            java.lang.Object r3 = r10.subs(r6)
            if (r3 != r9) goto L71
            goto L92
        L71:
            r0 = r11
            r2 = r4
            r4 = r12
        L74:
            int r0 = r10.isPro(r0)
            int r3 = r10.vip()
            float r3 = (float) r3
            float r3 = r3 * r2
            r2 = r0
            lّۛ۟ r0 = new lّۛ۟
            r5 = 0
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f21778l = r7
            r6.f21777l = r8
            lًُْ r2 = defpackage.EnumC11011l.f22182l
            java.lang.Object r0 = r10.loadAd(r2, r0, r6)
            if (r0 != r9) goto L93
        L92:
            return r9
        L93:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC13264l.billing(int, lِْۨ, lٌؚٓ):java.lang.Object");
    }

    @Override // defpackage.InterfaceC17955l
    public final boolean crashlytics() {
        return ((Boolean) this.appmetrica.getValue()).booleanValue();
    }

    public final C4685l firebase() {
        return (C4685l) this.remoteconfig.getValue();
    }

    public final int isPro(int i) {
        if (smaato() > 0) {
            return AbstractC8576l.purchase(i, 0, smaato() - 1);
        }
        return 0;
    }

    @Override // defpackage.InterfaceC17955l
    public final Object loadAd(EnumC11011l enumC11011l, Function2 function2, InterfaceC14029l interfaceC14029l) {
        return ads(this, enumC11011l, function2, interfaceC14029l);
    }

    public final int metrica() {
        return ((Number) this.subscription.getValue()).intValue();
    }

    @Override // defpackage.InterfaceC17955l
    public final float purchase(float f) {
        return this.firebase.purchase(f);
    }

    public final int remoteconfig() {
        return ((C4685l) this.remoteconfig.getValue()).loadAd;
    }

    public abstract int smaato();

    public final long startapp() {
        return ((C1187l) this.crashlytics.getValue()).yandex;
    }

    public final Object subs(AbstractC0283l abstractC0283l) {
        if (this.remoteconfig.getValue() != AbstractC10521l.loadAd) {
            return Unit.INSTANCE;
        }
        Object objIsPro = this.pro.isPro(abstractC0283l);
        return objIsPro == EnumC9342l.f19165l ? objIsPro : Unit.INSTANCE;
    }

    public final void subscription(float f, int i, boolean z) {
        C16557l c16557l = this.amazon;
        C15308l c15308l = (C15308l) c16557l.f32506l;
        C13765l c13765l = (C13765l) c16557l.f32505l;
        if (c15308l.admob() != i || c13765l.admob() != f) {
            this.Signature.mopub();
        }
        ((C15308l) c16557l.f32506l).subs(i);
        ((C0536l) c16557l.f32507l).crashlytics(i);
        c13765l.subs(f);
        c16557l.f32503l = null;
        if (!z) {
            AbstractC11184l.metrica(this.premium);
            return;
        }
        C3654l c3654l = (C3654l) this.ad.getValue();
        if (c3654l != null) {
            c3654l.smaato();
        }
    }

    public final int vip() {
        return ((C4685l) this.remoteconfig.getValue()).crashlytics + remoteconfig();
    }

    @Override // defpackage.InterfaceC17955l
    public final boolean yandex() {
        return this.firebase.yandex();
    }
}
