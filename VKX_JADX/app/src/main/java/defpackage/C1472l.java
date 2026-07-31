package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؒۥٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1472l implements InterfaceC10835l {
    public final C10643l amazon;
    public final InterfaceC11780l billing;
    public final C10643l crashlytics;
    public final AbstractC17824l loadAd;
    public final float mopub;
    public final C10643l purchase;
    public final boolean yandex;

    public C1472l(boolean z, AbstractC17824l abstractC17824l, C10643l c10643l, C10643l c10643l2, C10643l c10643l3, InterfaceC11780l interfaceC11780l, float f) {
        this.yandex = z;
        this.loadAd = abstractC17824l;
        this.crashlytics = c10643l;
        this.amazon = c10643l2;
        this.purchase = c10643l3;
        this.billing = interfaceC11780l;
        this.mopub = f;
    }

    public static int admob(List list, int i, Function2 function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj7), "TextField")) {
                int iIntValue = ((Number) function2.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                InterfaceC6357l interfaceC6357l = (InterfaceC6357l) obj2;
                int iIntValue2 = interfaceC6357l != null ? ((Number) function2.invoke(interfaceC6357l, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                InterfaceC6357l interfaceC6357l2 = (InterfaceC6357l) obj3;
                int iIntValue3 = interfaceC6357l2 != null ? ((Number) function2.invoke(interfaceC6357l2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj4), "Prefix")) {
                        break;
                    }
                    i5++;
                }
                InterfaceC6357l interfaceC6357l3 = (InterfaceC6357l) obj4;
                int iIntValue4 = interfaceC6357l3 != null ? ((Number) function2.invoke(interfaceC6357l3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                InterfaceC6357l interfaceC6357l4 = (InterfaceC6357l) obj5;
                int iIntValue5 = interfaceC6357l4 != null ? ((Number) function2.invoke(interfaceC6357l4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj6), "Leading")) {
                        break;
                    }
                    i7++;
                }
                InterfaceC6357l interfaceC6357l5 = (InterfaceC6357l) obj6;
                int iIntValue6 = interfaceC6357l5 != null ? ((Number) function2.invoke(interfaceC6357l5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    Object obj8 = list.get(i8);
                    if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                }
                InterfaceC6357l interfaceC6357l6 = (InterfaceC6357l) obj;
                int i9 = iIntValue4 + iIntValue5;
                return AbstractC7563l.mopub(Math.max(iIntValue + i9, Math.max((interfaceC6357l6 != null ? ((Number) function2.invoke(interfaceC6357l6, Integer.valueOf(i))).intValue() : 0) + i9, iIntValue2)) + iIntValue6 + iIntValue3, AbstractC7563l.loadAd(0, 0, 0, 0, 15));
            }
        }
        AbstractC2066l.loadAd("Collection contains no element matching the predicate.");
        C17132l.firebase();
        return 0;
    }

    public static final int subs(C1472l c1472l, int i, int i2, AbstractC10113l abstractC10113l) {
        return c1472l.yandex ? Math.round(((i - abstractC10113l.f20591l) / 2.0f) * 1.0f) : i2;
    }

    @Override // defpackage.InterfaceC10835l
    public final int amazon(InterfaceC12822l interfaceC12822l, List list, int i) {
        return mopub(interfaceC12822l, list, i, new C14813l((byte) 0, 11));
    }

    public final int billing(InterfaceC12822l interfaceC12822l, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        InterfaceC11780l interfaceC11780l = this.billing;
        int iMo870l = interfaceC12822l.mo870l(interfaceC11780l.yandex() + interfaceC11780l.amazon());
        int[] iArr = {i7, i5, i6, AbstractC7572l.smaato(i2, f, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i = Math.max(i, iArr[i9]);
        }
        return AbstractC7563l.billing(Math.max(i3, Math.max(i4, iMo870l + (i2 > 0 ? Math.max(interfaceC12822l.mo870l(this.mopub * 2.0f), AbstractC7572l.smaato(0, AbstractC9528l.yandex.yandex(f), i2)) : 0) + i)) + i8, j);
    }

    @Override // defpackage.InterfaceC10835l
    public final int crashlytics(InterfaceC12822l interfaceC12822l, List list, int i) {
        return admob(list, i, new C14813l((byte) 0, 13));
    }

    @Override // defpackage.InterfaceC10835l
    public final InterfaceC17792l loadAd(final InterfaceC7448l interfaceC7448l, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        AbstractC10113l abstractC10113l;
        Object obj5;
        int i;
        Object obj6;
        Object obj7;
        AbstractC10113l abstractC10113l2;
        int i2;
        C10700l c10700l;
        int i3;
        float f;
        int i4;
        float fInvoke = this.crashlytics.invoke();
        InterfaceC11780l interfaceC11780l = this.billing;
        final int iMo870l = interfaceC7448l.mo870l(interfaceC11780l.amazon());
        int iMo870l2 = interfaceC7448l.mo870l(interfaceC11780l.yandex());
        long jYandex = C15519l.yandex(0, 0, 0, 0, 10, j);
        int size = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i5);
            if (AbstractC8576l.yandex(AbstractC14312l.subs((InterfaceC6357l) obj), "Leading")) {
                break;
            }
            i5++;
        }
        InterfaceC6357l interfaceC6357l = (InterfaceC6357l) obj;
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l != null ? interfaceC6357l.adcel(jYandex) : null;
        int i6 = abstractC10113lAdcel != null ? abstractC10113lAdcel.f20592l : 0;
        int iMax = Math.max(0, abstractC10113lAdcel != null ? abstractC10113lAdcel.f20591l : 0);
        int size2 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i7);
            if (AbstractC8576l.yandex(AbstractC14312l.subs((InterfaceC6357l) obj2), "Trailing")) {
                break;
            }
            i7++;
        }
        InterfaceC6357l interfaceC6357l2 = (InterfaceC6357l) obj2;
        AbstractC10113l abstractC10113lAdcel2 = interfaceC6357l2 != null ? interfaceC6357l2.adcel(AbstractC7563l.isPro(-i6, 0, 2, jYandex)) : null;
        int i8 = i6 + (abstractC10113lAdcel2 != null ? abstractC10113lAdcel2.f20592l : 0);
        int iMax2 = Math.max(iMax, abstractC10113lAdcel2 != null ? abstractC10113lAdcel2.f20591l : 0);
        int size3 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i9);
            if (AbstractC8576l.yandex(AbstractC14312l.subs((InterfaceC6357l) obj3), "Prefix")) {
                break;
            }
            i9++;
        }
        InterfaceC6357l interfaceC6357l3 = (InterfaceC6357l) obj3;
        AbstractC10113l abstractC10113lAdcel3 = interfaceC6357l3 != null ? interfaceC6357l3.adcel(AbstractC7563l.isPro(-i8, 0, 2, jYandex)) : null;
        int i10 = i8 + (abstractC10113lAdcel3 != null ? abstractC10113lAdcel3.f20592l : 0);
        int iMax3 = Math.max(iMax2, abstractC10113lAdcel3 != null ? abstractC10113lAdcel3.f20591l : 0);
        int size4 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i11);
            if (AbstractC8576l.yandex(AbstractC14312l.subs((InterfaceC6357l) obj4), "Suffix")) {
                break;
            }
            i11++;
        }
        InterfaceC6357l interfaceC6357l4 = (InterfaceC6357l) obj4;
        AbstractC10113l abstractC10113lAdcel4 = interfaceC6357l4 != null ? interfaceC6357l4.adcel(AbstractC7563l.isPro(-i10, 0, 2, jYandex)) : null;
        int i12 = i10 + (abstractC10113lAdcel4 != null ? abstractC10113lAdcel4.f20592l : 0);
        int iMax4 = Math.max(iMax3, abstractC10113lAdcel4 != null ? abstractC10113lAdcel4.f20591l : 0);
        int size5 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size5) {
                abstractC10113l = abstractC10113lAdcel4;
                obj5 = null;
                break;
            }
            obj5 = list.get(i13);
            abstractC10113l = abstractC10113lAdcel4;
            if (AbstractC8576l.yandex(AbstractC14312l.subs((InterfaceC6357l) obj5), "Label")) {
                break;
            }
            i13++;
            abstractC10113lAdcel4 = abstractC10113l;
        }
        InterfaceC6357l interfaceC6357l5 = (InterfaceC6357l) obj5;
        C10700l c10700l2 = new C10700l();
        int i14 = -i12;
        c10700l2.f21708l = interfaceC6357l5 != null ? interfaceC6357l5.adcel(AbstractC7563l.subs(i14, jYandex, -iMo870l2)) : null;
        int size6 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size6) {
                i = iMo870l2;
                obj6 = null;
                break;
            }
            obj6 = list.get(i15);
            i = iMo870l2;
            if (AbstractC8576l.yandex(AbstractC14312l.subs((InterfaceC6357l) obj6), "Supporting")) {
                break;
            }
            i15++;
            iMo870l2 = i;
        }
        InterfaceC6357l interfaceC6357l6 = (InterfaceC6357l) obj6;
        int iMo1460for = interfaceC6357l6 != null ? interfaceC6357l6.mo1460for(C15519l.isPro(j)) : 0;
        AbstractC10113l abstractC10113l3 = (AbstractC10113l) c10700l2.f21708l;
        int i16 = (abstractC10113l3 != null ? abstractC10113l3.f20591l : 0) + iMo870l;
        final AbstractC10113l abstractC10113l4 = abstractC10113lAdcel;
        AbstractC10113l abstractC10113l5 = abstractC10113l;
        float f2 = fInvoke;
        AbstractC10113l abstractC10113l6 = abstractC10113l5;
        long j2 = jYandex;
        InterfaceC6357l interfaceC6357l7 = interfaceC6357l6;
        long jSubs = AbstractC7563l.subs(i14, C15519l.yandex(0, 0, 0, 0, 11, j), ((-i16) - i) - iMo1460for);
        int size7 = list.size();
        int i17 = 0;
        while (i17 < size7) {
            InterfaceC6357l interfaceC6357l8 = (InterfaceC6357l) list.get(i17);
            if (AbstractC8576l.yandex(AbstractC14312l.subs(interfaceC6357l8), "TextField")) {
                AbstractC10113l abstractC10113lAdcel5 = interfaceC6357l8.adcel(jSubs);
                long jYandex2 = C15519l.yandex(0, 0, 0, 0, 14, jSubs);
                int size8 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i18);
                    if (AbstractC8576l.yandex(AbstractC14312l.subs((InterfaceC6357l) obj7), "Hint")) {
                        break;
                    }
                    i18++;
                }
                InterfaceC6357l interfaceC6357l9 = (InterfaceC6357l) obj7;
                AbstractC10113l abstractC10113lAdcel6 = interfaceC6357l9 != null ? interfaceC6357l9.adcel(jYandex2) : null;
                int iMax5 = Math.max(iMax4, Math.max(abstractC10113lAdcel5.f20591l, abstractC10113lAdcel6 != null ? abstractC10113lAdcel6.f20591l : 0) + i16 + i);
                int i19 = abstractC10113l4 != null ? abstractC10113l4.f20592l : 0;
                int i20 = abstractC10113lAdcel2 != null ? abstractC10113lAdcel2.f20592l : 0;
                int i21 = abstractC10113lAdcel3 != null ? abstractC10113lAdcel3.f20592l : 0;
                int i22 = abstractC10113l6 != null ? abstractC10113l6.f20592l : 0;
                int i23 = abstractC10113lAdcel5.f20592l;
                AbstractC10113l abstractC10113l7 = (AbstractC10113l) c10700l2.f21708l;
                int i24 = i21 + i22;
                final int iMopub = AbstractC7563l.mopub(Math.max(i23 + i24, Math.max((abstractC10113lAdcel6 != null ? abstractC10113lAdcel6.f20592l : 0) + i24, abstractC10113l7 != null ? abstractC10113l7.f20592l : 0)) + i19 + i20, j);
                AbstractC10113l abstractC10113lAdcel7 = interfaceC6357l7 != null ? interfaceC6357l7.adcel(C15519l.yandex(0, iMopub, 0, 0, 9, AbstractC7563l.isPro(0, -iMax5, 1, j2))) : null;
                int i25 = abstractC10113lAdcel7 != null ? abstractC10113lAdcel7.f20591l : 0;
                int i26 = abstractC10113lAdcel5.f20591l;
                AbstractC10113l abstractC10113l8 = (AbstractC10113l) c10700l2.f21708l;
                int i27 = abstractC10113l8 != null ? abstractC10113l8.f20591l : 0;
                int i28 = abstractC10113l4 != null ? abstractC10113l4.f20591l : 0;
                int i29 = abstractC10113lAdcel2 != null ? abstractC10113lAdcel2.f20591l : 0;
                int i30 = abstractC10113lAdcel3 != null ? abstractC10113lAdcel3.f20591l : 0;
                final AbstractC10113l abstractC10113l9 = abstractC10113lAdcel3;
                if (abstractC10113l6 != null) {
                    i2 = abstractC10113l6.f20591l;
                    abstractC10113l2 = abstractC10113lAdcel5;
                } else {
                    abstractC10113l2 = abstractC10113lAdcel5;
                    i2 = 0;
                }
                AbstractC10113l abstractC10113l10 = abstractC10113l2;
                if (abstractC10113lAdcel6 != null) {
                    i3 = abstractC10113lAdcel6.f20591l;
                    c10700l = c10700l2;
                } else {
                    c10700l = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02fe: MOVE (r1v7 'c10700l' l￙ﾎￛﾥￛﾚ) = (r2v7 l￙ﾎￛﾥￛﾚ) (LINE:767) in method: l￘ﾒￛﾥ￙ﾚ.loadAd(l￘ﾚￛﾖￛﾦ, java.util.List, long):l￙ﾘ￙ﾌ￙ﾟ, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v7 l￙ﾎￛﾥￛﾚ
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 966
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.C1472l.loadAd(lؚۖۦ, java.util.List, long):lٌٟ٘");
                }

                public final int mopub(InterfaceC12822l interfaceC12822l, List list, int i, Function2 function2) {
                    Object obj;
                    int i2;
                    int iIntValue;
                    int iMetrica;
                    Object obj2;
                    int iIntValue2;
                    Object obj3;
                    Object obj4;
                    int i3;
                    Object obj5;
                    int i4;
                    Object obj6;
                    Object obj7;
                    int size = list.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            obj = null;
                            break;
                        }
                        obj = list.get(i5);
                        if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj), "Leading")) {
                            break;
                        }
                        i5++;
                    }
                    InterfaceC6357l interfaceC6357l = (InterfaceC6357l) obj;
                    if (interfaceC6357l != null) {
                        i2 = i;
                        iMetrica = AbstractC1019l.metrica(i2, interfaceC6357l.metrica(Alert.DURATION_SHOW_INDEFINITELY));
                        iIntValue = ((Number) function2.invoke(interfaceC6357l, Integer.valueOf(i2))).intValue();
                    } else {
                        i2 = i;
                        iIntValue = 0;
                        iMetrica = i2;
                    }
                    int size2 = list.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size2) {
                            obj2 = null;
                            break;
                        }
                        obj2 = list.get(i6);
                        if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj2), "Trailing")) {
                            break;
                        }
                        i6++;
                    }
                    InterfaceC6357l interfaceC6357l2 = (InterfaceC6357l) obj2;
                    if (interfaceC6357l2 != null) {
                        iMetrica = AbstractC1019l.metrica(iMetrica, interfaceC6357l2.metrica(Alert.DURATION_SHOW_INDEFINITELY));
                        iIntValue2 = ((Number) function2.invoke(interfaceC6357l2, Integer.valueOf(i2))).intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    int size3 = list.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size3) {
                            obj3 = null;
                            break;
                        }
                        obj3 = list.get(i7);
                        if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj3), "Label")) {
                            break;
                        }
                        i7++;
                    }
                    InterfaceC6357l interfaceC6357l3 = (InterfaceC6357l) obj3;
                    int iIntValue3 = interfaceC6357l3 != null ? ((Number) function2.invoke(interfaceC6357l3, Integer.valueOf(iMetrica))).intValue() : 0;
                    int size4 = list.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size4) {
                            obj4 = null;
                            break;
                        }
                        obj4 = list.get(i8);
                        if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj4), "Prefix")) {
                            break;
                        }
                        i8++;
                    }
                    InterfaceC6357l interfaceC6357l4 = (InterfaceC6357l) obj4;
                    if (interfaceC6357l4 != null) {
                        int iIntValue4 = ((Number) function2.invoke(interfaceC6357l4, Integer.valueOf(iMetrica))).intValue();
                        iMetrica = AbstractC1019l.metrica(iMetrica, interfaceC6357l4.metrica(Alert.DURATION_SHOW_INDEFINITELY));
                        i3 = iIntValue4;
                    } else {
                        i3 = 0;
                    }
                    int size5 = list.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size5) {
                            obj5 = null;
                            break;
                        }
                        obj5 = list.get(i9);
                        if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj5), "Suffix")) {
                            break;
                        }
                        i9++;
                    }
                    InterfaceC6357l interfaceC6357l5 = (InterfaceC6357l) obj5;
                    if (interfaceC6357l5 != null) {
                        int iIntValue5 = ((Number) function2.invoke(interfaceC6357l5, Integer.valueOf(iMetrica))).intValue();
                        iMetrica = AbstractC1019l.metrica(iMetrica, interfaceC6357l5.metrica(Alert.DURATION_SHOW_INDEFINITELY));
                        i4 = iIntValue5;
                    } else {
                        i4 = 0;
                    }
                    int size6 = list.size();
                    for (int i10 = 0; i10 < size6; i10++) {
                        Object obj8 = list.get(i10);
                        if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj8), "TextField")) {
                            int iIntValue6 = ((Number) function2.invoke(obj8, Integer.valueOf(iMetrica))).intValue();
                            int size7 = list.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= size7) {
                                    obj6 = null;
                                    break;
                                }
                                obj6 = list.get(i11);
                                if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj6), "Hint")) {
                                    break;
                                }
                                i11++;
                            }
                            InterfaceC6357l interfaceC6357l6 = (InterfaceC6357l) obj6;
                            int iIntValue7 = interfaceC6357l6 != null ? ((Number) function2.invoke(interfaceC6357l6, Integer.valueOf(iMetrica))).intValue() : 0;
                            int size8 = list.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size8) {
                                    obj7 = null;
                                    break;
                                }
                                obj7 = list.get(i12);
                                if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj7), "Supporting")) {
                                    break;
                                }
                                i12++;
                            }
                            InterfaceC6357l interfaceC6357l7 = (InterfaceC6357l) obj7;
                            return billing(interfaceC12822l, iIntValue6, iIntValue3, iIntValue, iIntValue2, i3, i4, iIntValue7, interfaceC6357l7 != null ? ((Number) function2.invoke(interfaceC6357l7, Integer.valueOf(i2))).intValue() : 0, AbstractC7563l.loadAd(0, 0, 0, 0, 15), this.crashlytics.invoke());
                        }
                    }
                    AbstractC2066l.loadAd("Collection contains no element matching the predicate.");
                    C17132l.firebase();
                    return 0;
                }

                @Override // defpackage.InterfaceC10835l
                public final int purchase(InterfaceC12822l interfaceC12822l, List list, int i) {
                    return mopub(interfaceC12822l, list, i, new C14813l((byte) 0, 12));
                }

                @Override // defpackage.InterfaceC10835l
                public final int yandex(InterfaceC12822l interfaceC12822l, List list, int i) {
                    return admob(list, i, new C14813l((byte) 0, 14));
                }
            }
