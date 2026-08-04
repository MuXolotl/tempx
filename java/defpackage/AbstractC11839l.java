package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lِّٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11839l {
    public static final List loadAd;
    public static final List yandex;

    static {
        List listRemoteconfig = AbstractC14055l.remoteconfig(new C9735l(AbstractC12953l.amazon(4283315315L)), new C9735l(AbstractC12953l.amazon(4286925759L)), new C9735l(AbstractC12953l.amazon(4287513561L)), new C9735l(AbstractC12953l.amazon(4290548185L)), new C9735l(AbstractC12953l.amazon(4285438661L)), new C9735l(AbstractC12953l.amazon(4280263359L)), new C9735l(AbstractC12953l.amazon(4279322252L)), new C9735l(AbstractC12953l.amazon(4279401638L)), new C9735l(AbstractC12953l.amazon(4279401638L)));
        yandex = listRemoteconfig;
        loadAd = AbstractC16901l.m4240super(listRemoteconfig);
    }

    public static final void loadAd(final AbstractC13264l abstractC13264l, final boolean z, final boolean z2, final EnumC11447l enumC11447l, final InterfaceC17242l interfaceC17242l, C6956l c6956l, final int i) {
        boolean z3;
        float f;
        float f2;
        boolean z4;
        Object c7641l;
        List<C10682l> list;
        Object obj;
        Function0 function0;
        InterfaceC14029l interfaceC14029l;
        Object obj2;
        c6956l.m2133new(-1331300783);
        int i2 = (i & 6) == 0 ? (c6956l.billing(abstractC13264l) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= c6956l.mopub(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.mopub(z2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.amazon(enumC11447l.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? 16384 : 8192;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z5 = z && enumC11447l == EnumC11447l.f23032l;
            C8896l c8896l = AbstractC11922l.yandex;
            C13315l c13315lAdmob = AbstractC0532l.admob(0.0f, 50.0f, new C14467l(0.4f), 1);
            C13315l c13315lAdmob2 = AbstractC0532l.admob(0.0f, 50.0f, null, 5);
            boolean z6 = z5;
            InterfaceC12244l interfaceC12244lYandex = AbstractC16245l.yandex(!z2 ? 75.0f : 200.0f, c13315lAdmob, null, c6956l, 0, 12);
            InterfaceC12244l interfaceC12244lLoadAd = AbstractC16245l.loadAd(!z2 ? 0.05f : 0.15f, c13315lAdmob2, null, null, c6956l, 48, 28);
            int i3 = z2 ? 250 : z6 ? 500 : 1000;
            Object objM2132native = c6956l.m2132native();
            Object obj3 = C1867l.yandex;
            if (objM2132native == obj3) {
                z3 = false;
                f = -0.25f;
                f2 = 1.25f;
                objM2132native = AbstractC14055l.remoteconfig(new C1187l((((long) Float.floatToRawIntBits(-0.25f)) << 32) | (((long) Float.floatToRawIntBits(-0.25f)) & 4294967295L)), new C1187l((((long) Float.floatToRawIntBits(-0.25f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.5f)) << 32)), new C1187l((((long) Float.floatToRawIntBits(-0.25f)) & 4294967295L) | (((long) Float.floatToRawIntBits(1.25f)) << 32)), new C1187l((((long) Float.floatToRawIntBits(-0.25f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L)), new C1187l((((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L)), new C1187l((((long) Float.floatToRawIntBits(1.25f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L)), new C1187l((((long) Float.floatToRawIntBits(-0.25f)) << 32) | (((long) Float.floatToRawIntBits(1.25f)) & 4294967295L)), new C1187l((((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(1.25f)) & 4294967295L)), new C1187l((((long) Float.floatToRawIntBits(1.25f)) << 32) | (((long) Float.floatToRawIntBits(1.25f)) & 4294967295L)));
                c6956l.m2147try(objM2132native);
            } else {
                z3 = false;
                f = -0.25f;
                f2 = 1.25f;
            }
            List list2 = (List) objM2132native;
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == obj3) {
                Object c15308l = new C15308l(((C15308l) abstractC13264l.amazon.f32506l).admob());
                c6956l.m2147try(c15308l);
                objM2132native2 = c15308l;
            }
            C15308l c15308l2 = (C15308l) objM2132native2;
            Object objM2132native3 = c6956l.m2132native();
            if (objM2132native3 == obj3) {
                z4 = false;
                objM2132native3 = new C13765l(0.0f);
                c6956l.m2147try(objM2132native3);
            } else {
                z4 = false;
            }
            C13765l c13765l = (C13765l) objM2132native3;
            Integer numValueOf = Integer.valueOf(((C15308l) abstractC13264l.amazon.f32506l).admob());
            boolean z7 = (i2 & 14) == 4 ? true : z3;
            Object objM2132native4 = c6956l.m2132native();
            if (z7 || objM2132native4 == obj3) {
                c7641l = new C7641l(abstractC13264l, c15308l2, c13765l, (InterfaceC14029l) null, 12);
                c6956l.m2147try(c7641l);
            } else {
                c7641l = objM2132native4;
            }
            AbstractC12311l.amazon(c6956l, numValueOf, (Function2) c7641l);
            List list3 = c15308l2.admob() == 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: TERNARY (r0v18 'list3' java.util.List) = ((wrap int:0x026d: INVOKE (r2v10 'c15308l2' l￙ﾔￛﾦ￘ﾙ) VIRTUAL call: l￙ﾔￛﾦ￘ﾙ.admob():int A[MD:():int (m), WRAPPED] (LINE:622)) == (r21v0 int)) ? (wrap ??:0x0273: SGET  A[WRAPPED] (LINE:628) l￙ﾐ￙ﾔ￙ﾑ.loadAd java.util.List) : (wrap ??:0x0276: SGET  A[WRAPPED] (LINE:631) l￙ﾐ￙ﾔ￙ﾑ.yandex java.util.List) in method: l￙ﾐ￙ﾔ￙ﾑ.loadAd(l￙ﾒ￙ﾎ￘ﾐ, boolean, boolean, l￙ﾏￛﾤ￘ﾓ, l￙ﾗ￙ﾛ￙ﾗ, l￘ﾚ￘ﾑ￙ﾐ, int):void, file: classes.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 int
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1395
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11839l.loadAd(lَْؐ, boolean, boolean, lُۤؓ, lٗٛٗ, lؚِؑ, int):void");
        }

        public static final void yandex(boolean z, EnumC11447l enumC11447l, AbstractC18082l abstractC18082l, Function2 function2, Function2 function3, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
            long j;
            C6956l c6956l2 = c6956l;
            c6956l2.m2133new(1490539596);
            int i2 = i | (c6956l2.mopub(z) ? 4 : 2) | (c6956l2.amazon(enumC11447l.ordinal()) ? 32 : 16) | (c6956l2.admob(function2) ? 2048 : 1024) | (c6956l2.admob(function3) ? 16384 : 8192);
            if (c6956l2.m2127for(i2 & 1, (74899 & i2) != 74898)) {
                Object objM2132native = c6956l2.m2132native();
                C13863l c13863l = C1867l.yandex;
                if (objM2132native == c13863l) {
                    objM2132native = new C9636l(15, abstractC18082l);
                    c6956l2.m2147try(objM2132native);
                }
                C2887l c2887lLoadAd = AbstractC10521l.loadAd(0, (Function0) objM2132native, c6956l2, 0, 3);
                Object objM2132native2 = c6956l2.m2132native();
                if (objM2132native2 == c13863l) {
                    objM2132native2 = AbstractC8020l.smaato(Boolean.FALSE);
                    c6956l2.m2147try(objM2132native2);
                }
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native2;
                long jLoadAd = C9735l.loadAd(0.25f, C9735l.mopub);
                C9946l c9946l = AbstractC16837l.yandex;
                InterfaceC17242l interfaceC17242lPurchase = AbstractC0080l.purchase(AbstractC0080l.amazon(AbstractC4927l.amazon(interfaceC17242l, jLoadAd, c9946l), 1.0f), 200.0f);
                InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
                long j2 = c6956l2.f14595continue;
                int i3 = (int) (j2 ^ (j2 >>> 32));
                InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lPurchase);
                InterfaceC8801l.firebase.getClass();
                C16395l c16395l = C3438l.loadAd;
                c6956l2.m2140super();
                if (c6956l2.f14603switch) {
                    c6956l2.firebase(c16395l);
                } else {
                    c6956l2.m2136protected();
                }
                C6415l c6415l = C3438l.mopub;
                AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, c6415l);
                C6415l c6415l2 = C3438l.billing;
                AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
                Integer numValueOf = Integer.valueOf(i3);
                C6415l c6415l3 = C3438l.isPro;
                AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
                C11192l c11192l = C3438l.firebase;
                AbstractC8182l.purchase(c6956l2, c11192l);
                C6415l c6415l4 = C3438l.amazon;
                AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
                boolean zBooleanValue = ((Boolean) interfaceC8714l.getValue()).booleanValue();
                C4346l c4346l = C4346l.f8873l;
                loadAd(c2887lLoadAd, z, zBooleanValue, enumC11447l, AbstractC0080l.crashlytics(c4346l, 1.0f), c6956l2, ((i2 << 3) & 112) | 24576 | ((i2 << 6) & 7168));
                AbstractC7252l.yandex(c2887lLoadAd, null, null, null, 0.0f, null, null, false, null, null, null, AbstractC14566l.amazon(882016083, new C15881l(abstractC18082l, function2, function3, 1), c6956l2), c6956l, 0, 24576, 16382);
                c6956l2 = c6956l;
                if (c2887lLoadAd.smaato() > 1) {
                    c6956l2.m2123default(-563163495);
                    InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(C16170l.yandex.yandex(c4346l, C18450l.f36042l), 16.0f, 0.0f, 2);
                    C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(6.0f, true, new C8339l(12)), C18450l.f36044l, c6956l2, 6);
                    long j3 = c6956l2.f14595continue;
                    int i4 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lVip);
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
                    c6956l2.m2123default(-1233736261);
                    int iSmaato = c2887lLoadAd.smaato();
                    for (int i5 = 0; i5 < iSmaato; i5++) {
                        if (((C15308l) c2887lLoadAd.amazon.f32506l).admob() == i5) {
                            c6956l2.m2123default(1273598502);
                            j = ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.adcel;
                            c6956l2.startapp(false);
                        } else {
                            c6956l2.m2123default(1273694943);
                            j = ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.subscription;
                            c6956l2.startapp(false);
                        }
                        AbstractC9383l.yandex(AbstractC0080l.purchase(AbstractC0080l.vip(AbstractC4927l.amazon(AbstractC0019l.crashlytics(c4346l, AbstractC7497l.yandex), ((C9735l) AbstractC0703l.yandex(j, null, null, null, c6956l2, 0, 14).getValue()).yandex, c9946l), 24.0f), 4.0f), c6956l2, 0);
                    }
                    AbstractC12900l.ads(c6956l2, false, true, false);
                } else {
                    c6956l2.m2123default(-567007216);
                    c6956l2.startapp(false);
                }
                c6956l2.startapp(true);
            } else {
                c6956l2.m2124else();
            }
            C4224l c4224lAds = c6956l2.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C2940l(z, enumC11447l, abstractC18082l, function2, function3, interfaceC17242l, i);
            }
        }
    }
