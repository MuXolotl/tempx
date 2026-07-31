package defpackage;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌؚٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8757l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C10086l f18021l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10086l f18022l;

    public C8757l() {
        SharedPreferences sharedPreferences;
        super(0);
        String string = null;
        if (!AbstractC4340l.loadAd) {
            C18073l.license("Scrobbler not initialized!");
            throw null;
        }
        SharedPreferences sharedPreferences2 = AbstractC4340l.yandex;
        if ((sharedPreferences2 != null ? sharedPreferences2.getString("sessionKey", null) : null) != null && (sharedPreferences = AbstractC4340l.yandex) != null) {
            string = sharedPreferences.getString("username", null);
        }
        this.f18021l = AbstractC8020l.smaato(string);
        this.f18022l = AbstractC8020l.smaato(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m2429import(C6956l c6956l, int i) {
        final C10178l c10178l;
        c6956l.m2133new(1305286932);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (objM2132native == obj) {
                C6523l c6523l = C6523l.loadAd;
                objM2132native = C7122l.yandex;
                c6956l.m2147try(objM2132native);
            }
            ((C7122l) objM2132native).getClass();
            final C6523l c6523l2 = new C6523l();
            final C6523l c6523l3 = new C6523l();
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == obj) {
                objM2132native2 = AbstractC12311l.isPro(c6956l);
                c6956l.m2147try(objM2132native2);
            }
            final InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native2;
            int i3 = 3;
            final C10178l c10178lMopub = AbstractC11173l.mopub(null, c6956l, 3);
            C10178l c10178lMopub2 = AbstractC11173l.mopub(null, c6956l, 3);
            final InterfaceC6497l interfaceC6497l = (InterfaceC6497l) c6956l.isPro(AbstractC4751l.subs);
            Object objM2132native3 = c6956l.m2132native();
            if (objM2132native3 == obj) {
                objM2132native3 = AbstractC8020l.smaato(Boolean.FALSE);
                c6956l.m2147try(objM2132native3);
            }
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native3;
            Object objM2132native4 = c6956l.m2132native();
            if (objM2132native4 == obj) {
                objM2132native4 = AbstractC8020l.smaato(Boolean.FALSE);
                c6956l.m2147try(objM2132native4);
            }
            final InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) objM2132native4;
            Object objM2132native5 = c6956l.m2132native();
            if (objM2132native5 == obj) {
                objM2132native5 = AbstractC8020l.smaato(Boolean.FALSE);
                c6956l.m2147try(objM2132native5);
            }
            final InterfaceC8714l interfaceC8714l3 = (InterfaceC8714l) objM2132native5;
            boolean zBilling = c6956l.billing(c10178lMopub) | c6956l.billing(c10178lMopub2) | c6956l.admob(interfaceC6497l) | c6956l.billing(c6523l2) | c6956l.billing(c6523l3) | c6956l.admob(interfaceC2262l) | c6956l.admob(this);
            Object objM2132native6 = c6956l.m2132native();
            if (zBilling || objM2132native6 == obj) {
                c10178l = c10178lMopub2;
                Object obj2 = new Function0() { // from class: lؖ۟ؐ
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        C10178l c10178l2 = c10178lMopub;
                        if (c10178l2.loadAd().f12057l.length() > 0) {
                            C10178l c10178l3 = c10178l;
                            if (c10178l3.loadAd().f12057l.length() > 0) {
                                AbstractC2812l.mopub(interfaceC6497l);
                                c6523l2.yandex();
                                c6523l3.yandex();
                                AbstractC10999l.mopub(interfaceC2262l, null, 0, new C0469l(this, c10178l2, c10178l3, interfaceC8714l2, interfaceC8714l3, null, 11), 3);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                c6523l2 = c6523l2;
                c6523l3 = c6523l3;
                c6956l.m2147try(obj2);
                objM2132native6 = obj2;
            } else {
                c10178l = c10178lMopub2;
            }
            Function0 function0 = (Function0) objM2132native6;
            boolean zAdmob = c6956l.admob(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00eb: INVOKE (r0v16 'zAdmob' boolean) = (r23v0 'c6956l' l￘ﾚ￘ﾑ￙ﾐ), (r7v0 'this' ?? I:??[OBJECT, ARRAY] A[IMMUTABLE_TYPE, THIS]) VIRTUAL call: l￘ﾚ￘ﾑ￙ﾐ.admob(java.lang.Object):boolean A[DECLARE_VAR, MD:(java.lang.Object):boolean (m)] (LINE:236) in method: l￙ﾌ￙ﾓ￘ﾚ.import(l￘ﾚ￘ﾑ￙ﾐ, int):void, file: classes.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r7v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 364
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C8757l.m2429import(lؚِؑ, int):void");
        }

        @Override // defpackage.AbstractC11801l
        /* JADX INFO: renamed from: new */
        public final void mo271new(C6956l c6956l, int i) {
            c6956l.m2133new(750175292);
            int i2 = 2;
            int i3 = (c6956l.admob(this) ? 4 : 2) | i;
            if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
                int i4 = 14;
                if (((Boolean) this.f18022l.getValue()).booleanValue()) {
                    c6956l.m2123default(1757353597);
                    m2429import(c6956l, i3 & 14);
                } else {
                    c6956l.m2123default(1754545958);
                }
                c6956l.startapp(false);
                boolean zAdmob = c6956l.admob(this);
                Object objM2132native = c6956l.m2132native();
                C13863l c13863l = C1867l.yandex;
                if (zAdmob || objM2132native == c13863l) {
                    C13246l c13246l = new C13246l(0, this, C8757l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 21);
                    c6956l.m2147try(c13246l);
                    objM2132native = c13246l;
                }
                Function0 function0 = (Function0) ((InterfaceC5059l) objM2132native);
                boolean zAdmob2 = c6956l.admob(this);
                Object objM2132native2 = c6956l.m2132native();
                if (zAdmob2 || objM2132native2 == c13863l) {
                    objM2132native2 = new C17015l(i4, this);
                    c6956l.m2147try(objM2132native2);
                }
                AbstractC7837l.yandex(AbstractC17824l.yandex, function0, null, (Function1) objM2132native2, c6956l, 6, 4);
            } else {
                c6956l.m2124else();
            }
            C4224l c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C16929l(this, i, i2);
            }
        }
    }
