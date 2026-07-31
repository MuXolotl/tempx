package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؔٓؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2603l extends AbstractC5097l {

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public static final /* synthetic */ int f5663l = 0;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10086l f5664l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C11362l f5665l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final Function0 f5666l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final Function0 f5667l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final InterfaceC6684l f5668l;

    public C2603l(InterfaceC6684l interfaceC6684l, Function0 function0, Function0 function1) {
        super(false, 3);
        this.f5668l = interfaceC6684l;
        this.f5667l = function0;
        this.f5666l = function1;
        this.f5665l = new C11362l();
        this.f5664l = AbstractC8020l.smaato(EnumC13633l.f26659l);
    }

    public static final void isVip(C2603l c2603l) {
        super.purchase();
        c2603l.f5666l.invoke();
    }

    public final void ad(Function1 function1, C6956l c6956l, int i) {
        Function1 function2;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-543054768);
        int i2 = i | (c6956l2.admob(function1) ? 4 : 2) | (c6956l2.admob(this) ? 32 : 16);
        if (c6956l2.m2127for(i2 & 1, (i2 & 19) != 18)) {
            float fYandex = ((C15700l) c6956l2.isPro(AbstractC18678l.yandex)).yandex(c6956l2);
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lSubscription = AbstractC2697l.subscription(AbstractC3605l.startapp(c4346l, 0.0f, 0.0f, 0.0f, fYandex, 7), AbstractC2697l.purchase);
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36034l, c6956l2, 48);
            long j = c6956l2.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lSubscription);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c1853lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            C6168l.f12997l.crashlytics(null, 0.0f, 0.0f, null, 0L, c6956l2, 196608, 31);
            String strPurchase = AbstractC11999l.purchase(c6956l2, R.string.mixes_v2_header);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(strPurchase, AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.purchase, c6956l, 48, 0, 130040);
            AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 16.0f));
            boolean zAdmob = c6956l.admob(this) | ((i2 & 14) == 4);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                function2 = function1;
                objM2132native = new C15575l(this, function2, 7);
                c6956l.m2147try(objM2132native);
            } else {
                function2 = function1;
            }
            AbstractC16336l.yandex(null, null, null, null, null, null, false, null, (Function1) objM2132native, c6956l, 0, 511);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
        } else {
            function2 = function1;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3666l(this, function2, i, 10);
        }
    }

    public final void advert(C6956l c6956l, int i) {
        C2603l c2603l;
        int i2;
        C10707l c10707l;
        float f;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-288072940);
        int i3 = i | (c6956l2.admob(this) ? 4 : 2);
        if (c6956l2.m2127for(i3 & 1, (i3 & 3) != 2)) {
            float fYandex = ((C15700l) c6956l2.isPro(AbstractC18678l.yandex)).yandex(c6956l2) + 16.0f;
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(c4346l, 16.0f, 0.0f, 16.0f, fYandex, 2);
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36034l, c6956l2, 48);
            long j = c6956l2.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lStartapp);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i4);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            C6168l.f12997l.crashlytics(null, 0.0f, 0.0f, null, 0L, c6956l, 196608, 31);
            String strPurchase = AbstractC11999l.purchase(c6956l, R.string.mixes_v2_empty);
            C10707l c10707l2 = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(strPurchase, AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l.isPro(c10707l2)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l2)).loadAd.purchase, c6956l, 48, 0, 130040);
            AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 16.0f));
            AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.mixes_v2_empty_text), AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l.isPro(c10707l2)).yandex.subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l2)).loadAd.firebase, c6956l, 48, 0, 130040);
            c6956l2 = c6956l;
            AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l, 16.0f));
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
            i2 = 1;
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36044l, c6956l2, 6);
            long j2 = c6956l2.f14595continue;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lAmazon);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c5062lYandex, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i5, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
            boolean zAdmob = c6956l2.admob(this);
            Object objM2132native = c6956l2.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                c10707l = c10707l2;
                f = 1.0f;
                C6814l c6814l = new C6814l(0, this, C2603l.class, "softDismiss", "softDismiss()V", 0, 0, 17);
                c2603l = this;
                c6956l2.m2147try(c6814l);
                objM2132native = c6814l;
            } else {
                c10707l = c10707l2;
                c2603l = this;
                f = 1.0f;
            }
            AbstractC17457l.loadAd((Function0) ((InterfaceC5059l) objM2132native), new C9247l(f, true), false, ((C14370l) c6956l2.isPro(c10707l)).crashlytics.crashlytics, null, null, null, new C17253l(16.0f, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0209: INVOKE 
                  (wrap kotlin.jvm.functions.Function0:0x01fd: CHECK_CAST (kotlin.jvm.functions.Function0) (wrap l￘ﾗ￙ﾟ￙ﾌ:0x01e6: CHECK_CAST (l￘ﾗ￙ﾟ￙ﾌ) (r4v26 'objM2132native' java.lang.Object)))
                  (wrap l￙ﾍ￘ﾑ￘ﾓ:0x01ef: CONSTRUCTOR (r11v4 'f' float), true A[MD:(float, boolean):void (m), WRAPPED] (LINE:496) call: l￙ﾍ￘ﾑ￘ﾓ.<init>(float, boolean):void type: CONSTRUCTOR)
                  false
                  (wrap l￘ﾙￛﾣ:0x01fa: IGET 
                  (wrap l￘ﾓ￙ﾙ￘ﾒ:0x01f8: IGET 
                  (wrap l￙ﾓￛﾘ￙ﾛ:0x01f6: CHECK_CAST (l￙ﾓￛﾘ￙ﾛ) (wrap java.lang.Object:0x01f2: INVOKE (r9v6 'c6956l2' l￘ﾚ￘ﾑ￙ﾐ), (r10v7 'c10707l' l￙ﾎￛﾦ￘ﾖ) VIRTUAL call: l￘ﾚ￘ﾑ￙ﾐ.isPro(l￘ﾗￛﾟￛﾜ):java.lang.Object A[MD:(l￘ﾗￛﾟￛﾜ):java.lang.Object (m), WRAPPED] (LINE:499)))
                 A[WRAPPED] (LINE:505) l￙ﾓￛﾘ￙ﾛ.crashlytics l￘ﾓ￙ﾙ￘ﾒ)
                 A[WRAPPED] (LINE:507) l￘ﾓ￙ﾙ￘ﾒ.crashlytics l￘ﾙￛﾣ)
                  (null l￙ﾒ￙ﾖ￙ﾚ)
                  (null l￘ﾓ￘ﾓ￙ﾟ)
                  (null l￘ﾗ￙ﾝ￘ﾚ)
                  (wrap l￙ﾗ￙ﾜ￘ﾚ:0x01ea: CONSTRUCTOR 
                  (16.0f float)
                  (r2v2 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY])
                  (r2v2 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY])
                  (r2v2 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY])
                 A[MD:(float, float, float, float):void (m), WRAPPED] (LINE:491) call: l￙ﾗ￙ﾜ￘ﾚ.<init>(float, float, float, float):void type: CONSTRUCTOR)
                  (wrap l￙ﾕ￙ﾍ￘ﾚ:0x0207: SGET  A[WRAPPED] (LINE:520) l￘ﾘ￙ﾑￛﾣ.yandex l￙ﾕ￙ﾍ￘ﾚ)
                  (r9v6 'c6956l2' l￘ﾚ￘ﾑ￙ﾐ)
                  (817889280 int)
                  (372 int)
                 STATIC call: l￙ﾗￛﾠￛﾙ.loadAd(kotlin.jvm.functions.Function0, l￙ﾗ￙ﾛ￙ﾗ, boolean, l￘ﾙ￙ﾌ￙ﾕ, l￙ﾒ￙ﾖ￙ﾚ, l￘ﾓ￘ﾓ￙ﾟ, l￘ﾗ￙ﾝ￘ﾚ, l￙ﾐ￙ﾐ￙ﾟ, kotlin.jvm.functions.Function3, l￘ﾚ￘ﾑ￙ﾐ, int, int):void A[MD:(kotlin.jvm.functions.Function0, l￙ﾗ￙ﾛ￙ﾗ, boolean, l￘ﾙ￙ﾌ￙ﾕ, l￙ﾒ￙ﾖ￙ﾚ, l￘ﾓ￘ﾓ￙ﾟ, l￘ﾗ￙ﾝ￘ﾚ, l￙ﾐ￙ﾐ￙ﾟ, kotlin.jvm.functions.Function3, l￘ﾚ￘ﾑ￙ﾐ, int, int):void (m)] (LINE:522) in method: l￘ﾔ￙ﾓ￘ﾐ.advert(l￘ﾚ￘ﾑ￙ﾐ, int):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v2 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 552
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C2603l.advert(lؚِؑ, int):void");
        }

        @Override // defpackage.AbstractC5097l
        public final void license(C6956l c6956l, int i) {
            c6956l.m2133new(-255985346);
            int i2 = (c6956l.admob(this) ? 4 : 2) | i;
            if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
                Object objM2132native = c6956l.m2132native();
                C13863l c13863l = C1867l.yandex;
                if (objM2132native == c13863l) {
                    objM2132native = AbstractC12311l.isPro(c6956l);
                    c6956l.m2147try(objM2132native);
                }
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
                int iAdmob = AbstractC6363l.admob(0, 1, c6956l);
                Unit unit = Unit.INSTANCE;
                boolean zAdmob = c6956l.admob(this) | c6956l.admob(interfaceC2262l);
                Object objM2132native2 = c6956l.m2132native();
                if (zAdmob || objM2132native2 == c13863l) {
                    objM2132native2 = new C12393l(this, interfaceC2262l, (InterfaceC14029l) null, 5);
                    c6956l.m2147try(objM2132native2);
                }
                AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native2);
                AbstractC3274l.yandex(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(-771502909, new C0741l(this, iAdmob, interfaceC2262l, 24), c6956l), c6956l, 12582912, 127);
            } else {
                c6956l.m2124else();
            }
            C4224l c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C1674l(this, i, 20);
            }
        }

        public final void pro(C6956l c6956l, int i) {
            c6956l.m2133new(-426626690);
            int i2 = i & 1;
            if (c6956l.m2127for(i2, i2 != 0)) {
                InterfaceC17242l interfaceC17242lMetrica = AbstractC3605l.metrica(C4346l.f8873l, 16.0f, 32.0f, 16.0f, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).yandex(c6956l) + 16.0f);
                C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36034l, c6956l, 48);
                long j = c6956l.f14595continue;
                int i3 = (int) (j ^ (j >>> 32));
                InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lMetrica);
                InterfaceC8801l.firebase.getClass();
                C16395l c16395l = C3438l.loadAd;
                c6956l.m2140super();
                if (c6956l.f14603switch) {
                    c6956l.firebase(c16395l);
                } else {
                    c6956l.m2136protected();
                }
                AbstractC8182l.billing(c6956l, c1853lYandex, C3438l.mopub);
                AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
                AbstractC8182l.purchase(c6956l, C3438l.firebase);
                AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                AbstractC4332l.amazon(null, 0L, 0L, 0, 0.0f, c6956l, 0, 31);
                c6956l.startapp(true);
            } else {
                c6956l.m2124else();
            }
            C4224l c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C0723l(this, i, 0);
            }
        }

        @Override // defpackage.AbstractC2338l
        public final void purchase() {
            super.purchase();
            this.f5667l.invoke();
        }
    }
