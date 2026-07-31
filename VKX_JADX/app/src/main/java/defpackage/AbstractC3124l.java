package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٌؕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3124l {
    public static final C2351l yandex = new C2351l(19);

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static final defpackage.C11848l amazon(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
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
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public static final int crashlytics(InterfaceC9146l interfaceC9146l, boolean z) {
        int iVip;
        int iBilling;
        if (z) {
            iVip = interfaceC9146l.admob();
            iBilling = interfaceC9146l.firebase();
        } else {
            iVip = interfaceC9146l.vip();
            iBilling = interfaceC9146l.billing();
        }
        return iBilling + iVip;
    }

    public static C2343l loadAd(InterfaceC0207l interfaceC0207l, Function0 function0) {
        if (function0 != null) {
            return new C2343l(interfaceC0207l, function0);
        }
        C8339l.metrica("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
        return null;
    }

    public static final List purchase(int i, int i2, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return C2580l.f5619l;
        }
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC9146l interfaceC9146l = (InterfaceC9146l) arrayList.get(i3);
            int index = interfaceC9146l.getIndex();
            if (i <= index && index <= i2) {
                arrayList2.add(interfaceC9146l);
            }
        }
        AbstractC3826l.Signature(yandex, arrayList2);
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0043  */
    public static String yandex(C9192l c9192l) {
        int i;
        InterfaceC18382l interfaceC18382l = c9192l.yandex;
        C12881l c12881l = interfaceC18382l instanceof C12881l ? (C12881l) interfaceC18382l : null;
        int i2 = c12881l != null ? c12881l.yandex : 0;
        InterfaceC18382l interfaceC18382l2 = c9192l.loadAd;
        C12881l c12881l2 = interfaceC18382l2 instanceof C12881l ? (C12881l) interfaceC18382l2 : null;
        int iMax = Math.max(i2, c12881l2 != null ? c12881l2.yandex : 0);
        if (iMax >= 1200) {
            i = 5;
        } else if (iMax >= 600) {
            i = 4;
        } else if (iMax >= 300) {
            i = 3;
        } else if (iMax >= 270) {
            i = 2;
        } else if (iMax < 270) {
            i = 1;
        } else {
            i = 3;
        }
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return "vs";
        }
        if (iInmobi == 1) {
            return "s";
        }
        if (iInmobi == 2) {
            return "r";
        }
        if (iInmobi == 3) {
            return "m";
        }
        if (iInmobi == 4) {
            return "l";
        }
        C18725l.billing();
        return null;
    }
}
