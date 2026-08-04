package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: l٘٘ؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17986l extends AbstractC5097l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public static final /* synthetic */ int f35164l = 0;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10086l f35165l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C10086l f35166l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final VKProfile f35167l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C10086l f35168l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final InterfaceC17069l f35169l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final C15308l f35170l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final C15308l f35171l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final /* synthetic */ C18662l f35172l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C10086l f35173l;

    public C17986l(InterfaceC17069l interfaceC17069l, VKProfile vKProfile) {
        super(false, 3);
        this.f35172l = AbstractC11990l.loadAd();
        this.f35169l = interfaceC17069l;
        this.f35167l = vKProfile;
        this.f35166l = AbstractC8020l.smaato(EnumC1649l.f3994l);
        Boolean bool = Boolean.FALSE;
        this.f35165l = AbstractC8020l.smaato(bool);
        this.f35173l = AbstractC8020l.smaato(bool);
        this.f35168l = AbstractC8020l.smaato(new C0639l(0L, 6, ""));
        this.f35170l = new C15308l(0);
        this.f35171l = new C15308l(0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object advert(C17986l c17986l, long j, int i, boolean z, AbstractC0283l abstractC0283l) {
        C4274l c4274l;
        int i2;
        ArrayList arrayList;
        c17986l.getClass();
        if (abstractC0283l instanceof C4274l) {
            c4274l = (C4274l) abstractC0283l;
            int i3 = c4274l.f8767l;
            if ((i3 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4274l.f8767l = i3 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4274l = new C4274l(c17986l, abstractC0283l);
            }
        } else {
            c4274l = new C4274l(c17986l, abstractC0283l);
        }
        Object obj = c4274l.f8770l;
        int i4 = c4274l.f8767l;
        if (i4 == 0) {
            AbstractC2829l.crashlytics(obj);
            ArrayList arrayList2 = new ArrayList();
            C16552l c16552l = AbstractC11463l.yandex;
            ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
            C16002l c16002l = new C16002l(z, i, j, arrayList2, c17986l, null);
            c4274l.f8768l = arrayList2;
            c4274l.f8769l = i;
            c4274l.f8767l = 1;
            Object objFirebase = AbstractC10999l.firebase(executorC6708l, c16002l, c4274l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objFirebase == enumC9342l) {
                return enumC9342l;
            }
            i2 = i;
            arrayList = arrayList2;
        } else {
            if (i4 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = c4274l.f8769l;
            arrayList = c4274l.f8768l;
            AbstractC2829l.crashlytics(obj);
        }
        return i2 > 0 ? AbstractC16901l.m4247try(arrayList, i2) : arrayList;
    }

    public final void ad(C6956l c6956l, int i) {
        C17986l c17986l;
        C10707l c10707l;
        float f;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-432648277);
        int i2 = i | (c6956l2.admob(this) ? 4 : 2);
        if (c6956l2.m2127for(i2 & 1, (i2 & 3) != 2)) {
            float fYandex = ((C15700l) c6956l2.isPro(AbstractC18678l.yandex)).yandex(c6956l2) + 16.0f;
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(c4346l, 16.0f, 0.0f, 16.0f, fYandex, 2);
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36034l, c6956l2, 48);
            long j = c6956l2.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
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
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            C6168l.f12997l.crashlytics(null, 0.0f, 0.0f, null, 0L, c6956l, 196608, 31);
            String strPurchase = AbstractC11999l.purchase(c6956l, R.string.cache_net_error);
            C10707l c10707l2 = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(strPurchase, AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l.isPro(c10707l2)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l2)).loadAd.purchase, c6956l, 48, 0, 130040);
            AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 16.0f));
            AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.cache_net_error_desc), AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l.isPro(c10707l2)).yandex.subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l2)).loadAd.firebase, c6956l, 48, 0, 130040);
            c6956l2 = c6956l;
            AbstractC9334l.yandex(c6956l2, AbstractC0080l.purchase(c4346l, 16.0f));
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36044l, c6956l2, 6);
            long j2 = c6956l2.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
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
            AbstractC11043l.isPro(i4, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
            boolean zAdmob = c6956l2.admob(this);
            Object objM2132native = c6956l2.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                c10707l = c10707l2;
                f = 1.0f;
                C13246l c13246l = new C13246l(0, this, C17986l.class, "dismiss", "dismiss()V", 0, 0, 27);
                c17986l = this;
                c6956l2.m2147try(c13246l);
                objM2132native = c13246l;
            } else {
                c10707l = c10707l2;
                c17986l = this;
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
                  (r2v3 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY])
                  (r2v3 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY])
                  (r2v3 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY])
                 A[MD:(float, float, float, float):void (m), WRAPPED] (LINE:491) call: l￙ﾗ￙ﾜ￘ﾚ.<init>(float, float, float, float):void type: CONSTRUCTOR)
                  (wrap l￙ﾕ￙ﾍ￘ﾚ:0x0207: SGET  A[WRAPPED] (LINE:520) l￙ﾕ￘ﾕ￘ﾑ.mopub l￙ﾕ￙ﾍ￘ﾚ)
                  (r9v6 'c6956l2' l￘ﾚ￘ﾑ￙ﾐ)
                  (817889280 int)
                  (372 int)
                 STATIC call: l￙ﾗￛﾠￛﾙ.loadAd(kotlin.jvm.functions.Function0, l￙ﾗ￙ﾛ￙ﾗ, boolean, l￘ﾙ￙ﾌ￙ﾕ, l￙ﾒ￙ﾖ￙ﾚ, l￘ﾓ￘ﾓ￙ﾟ, l￘ﾗ￙ﾝ￘ﾚ, l￙ﾐ￙ﾐ￙ﾟ, kotlin.jvm.functions.Function3, l￘ﾚ￘ﾑ￙ﾐ, int, int):void A[MD:(kotlin.jvm.functions.Function0, l￙ﾗ￙ﾛ￙ﾗ, boolean, l￘ﾙ￙ﾌ￙ﾕ, l￙ﾒ￙ﾖ￙ﾚ, l￘ﾓ￘ﾓ￙ﾟ, l￘ﾗ￙ﾝ￘ﾚ, l￙ﾐ￙ﾐ￙ﾟ, kotlin.jvm.functions.Function3, l￘ﾚ￘ﾑ￙ﾐ, int, int):void (m)] (LINE:522) in method: l￙ﾘ￙ﾘ￘ﾖ.ad(l￘ﾚ￘ﾑ￙ﾐ, int):void, file: classes.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v3 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 552
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C17986l.ad(lؚِؑ, int):void");
        }

        public final boolean isVip() {
            return ((Boolean) this.f35173l.getValue()).booleanValue();
        }

        @Override // defpackage.AbstractC5097l
        public final void license(C6956l c6956l, int i) {
            c6956l.m2133new(-938133416);
            int i2 = (c6956l.admob(this) ? 4 : 2) | i;
            int i3 = 1;
            if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
                InterfaceC8533l interfaceC8533l = (InterfaceC8533l) c6956l.isPro(AbstractC4751l.adcel);
                WeakHashMap weakHashMap = C12923l.pro;
                C9297l c9297l = C6760l.smaato(c6956l).crashlytics;
                InterfaceC13490l interfaceC13490l = (InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob);
                float fMo872static = interfaceC13490l.mo872static(c9297l.crashlytics(interfaceC13490l));
                float fYandex = ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).yandex(c6956l);
                C14467l c14467l = new C14467l(fMo872static + 16.0f);
                C14467l c14467l2 = new C14467l(fYandex);
                if (c14467l.compareTo(c14467l2) < 0) {
                    c14467l = c14467l2;
                }
                int iAdmob = AbstractC6363l.admob(0, 1, c6956l);
                Object objM2132native = c6956l.m2132native();
                if (objM2132native == C1867l.yandex) {
                    objM2132native = new C6523l();
                    c6956l.m2147try(objM2132native);
                }
                AbstractC3274l.yandex(C4346l.f8873l, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(-1667771107, new C16771l(this, iAdmob, c14467l.f28331l, (C6523l) objM2132native, interfaceC8533l), c6956l), c6956l, 12582918, 126);
            } else {
                c6956l.m2124else();
            }
            C4224l c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C0642l(this, i, i3);
            }
        }

        public final void pro(C6956l c6956l, int i) {
            c6956l.m2133new(-767149501);
            int i2 = (c6956l.amazon(R.drawable.ic_check) ? 4 : 2) | i;
            int i3 = 0;
            if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
                float fYandex = ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).yandex(c6956l) + 16.0f;
                C4346l c4346l = C4346l.f8873l;
                InterfaceC17242l interfaceC17242lMetrica = AbstractC3605l.metrica(c4346l, 16.0f, 16.0f, 16.0f, fYandex);
                C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36034l, c6956l, 48);
                long j = c6956l.f14595continue;
                int i4 = (int) (j ^ (j >>> 32));
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
                AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
                AbstractC8182l.purchase(c6956l, C3438l.firebase);
                AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check, i2 & 14, c6956l), null, AbstractC0080l.isPro(c4346l, 40.0f), 0L, c6956l, 440, 8);
                c6956l.startapp(true);
            } else {
                c6956l.m2124else();
            }
            C4224l c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C0642l(this, i, i3);
            }
        }

        @Override // defpackage.AbstractC2338l
        public final void purchase() {
            AbstractC11990l.billing(this, null);
            super.purchase();
        }

        public final boolean signatures() {
            return ((Boolean) this.f35165l.getValue()).booleanValue();
        }

        @Override // defpackage.InterfaceC2262l
        public final InterfaceC12932l vip() {
            return this.f35172l.f36440l;
        }
    }
