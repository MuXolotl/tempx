package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘْؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13067l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ Object f25583l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f25584l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f25585l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public Object f25586l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f25587l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f25588l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Object f25589l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f25590l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public Object f25591l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13067l(C12324l c12324l, InterfaceC2262l interfaceC2262l, C15764l c15764l, String str, String str2, Function1 function1, C10507l c10507l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f25587l = 7;
        this.f25585l = c12324l;
        this.f25588l = interfaceC2262l;
        this.f25589l = c15764l;
        this.f25586l = str;
        this.f25591l = str2;
        this.f25584l = function1;
        this.f25583l = c10507l;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0095 -> B:10:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13067l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f25587l;
        Object obj2 = this.f25583l;
        Object obj3 = this.f25588l;
        switch (i) {
            case 0:
                C13067l c13067l = new C13067l((InterfaceC2262l) obj3, (C11644l) this.f25589l, (C9879l) obj2, interfaceC14029l);
                c13067l.f25584l = obj;
                return c13067l;
            case 1:
                return new C13067l((C11567l) this.f25585l, (C10700l) this.f25589l, (C10700l) this.f25586l, (C7819l) this.f25591l, this.f25584l, (C10700l) obj3, (C5346l) obj2, interfaceC14029l, 1);
            case 2:
                return new C13067l((C11567l) this.f25585l, (C7819l) this.f25589l, this.f25584l, (C15106l) this.f25586l, (C5346l) this.f25591l, (C1791l) obj3, (C13218l) obj2, interfaceC14029l);
            case 3:
                return new C13067l((C15399l) this.f25585l, (String) this.f25589l, (C0657l) this.f25586l, (C9173l) this.f25591l, (Map) this.f25584l, (C6028l) obj3, (C9987l) obj2, interfaceC14029l, 3);
            case 4:
                C13067l c13067l2 = new C13067l((C5616l) this.f25586l, (List) this.f25591l, (C15308l) obj3, (C13765l) obj2, interfaceC14029l);
                c13067l2.f25584l = obj;
                return c13067l2;
            case 5:
                C13067l c13067l3 = new C13067l((EnumC11011l) this.f25591l, (C16801l) obj3, (Function1) obj2, interfaceC14029l);
                c13067l3.f25586l = obj;
                return c13067l3;
            case 6:
                C13067l c13067l4 = new C13067l((C15764l) this.f25585l, (String) this.f25589l, (String) this.f25586l, (Function1) this.f25591l, (C10507l) obj3, (C12324l) obj2, interfaceC14029l);
                c13067l4.f25584l = obj;
                return c13067l4;
            case 7:
                return new C13067l((C12324l) this.f25585l, (InterfaceC2262l) obj3, (C15764l) this.f25589l, (String) this.f25586l, (String) this.f25591l, (Function1) this.f25584l, (C10507l) obj2, interfaceC14029l);
            case 8:
                C13067l c13067l5 = new C13067l((C0203l) obj3, (Function1) obj2, interfaceC14029l);
                c13067l5.f25584l = obj;
                return c13067l5;
            default:
                C13067l c13067l6 = new C13067l((ContentResolver) this.f25589l, (Uri) this.f25586l, (C5848l) this.f25591l, (C7119l) obj3, (Context) obj2, interfaceC14029l);
                c13067l6.f25584l = obj;
                return c13067l6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f25587l) {
            case 0:
                return ((C13067l) ads((InterfaceC14029l) obj2, (AbstractC18643l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C13067l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C13067l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C13067l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 4:
                ((C13067l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
                return EnumC9342l.f19165l;
            case 5:
                return ((C13067l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 6:
                return ((C13067l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 7:
                return ((C13067l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 8:
                return ((C13067l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C13067l) ads((InterfaceC14029l) obj2, (InterfaceC9427l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13067l(InterfaceC2262l interfaceC2262l, C11644l c11644l, C9879l c9879l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f25587l = 0;
        this.f25588l = interfaceC2262l;
        this.f25589l = c11644l;
        this.f25583l = c9879l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13067l(C11567l c11567l, C7819l c7819l, Object obj, C15106l c15106l, C5346l c5346l, C1791l c1791l, C13218l c13218l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f25587l = 2;
        this.f25585l = c11567l;
        this.f25589l = c7819l;
        this.f25584l = obj;
        this.f25586l = c15106l;
        this.f25591l = c5346l;
        this.f25588l = c1791l;
        this.f25583l = c13218l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13067l(EnumC11011l enumC11011l, C16801l c16801l, Function1 function1, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f25587l = 5;
        this.f25591l = enumC11011l;
        this.f25588l = c16801l;
        this.f25583l = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13067l(C15764l c15764l, String str, String str2, Function1 function1, C10507l c10507l, C12324l c12324l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f25587l = 6;
        this.f25585l = c15764l;
        this.f25589l = str;
        this.f25586l = str2;
        this.f25591l = function1;
        this.f25588l = c10507l;
        this.f25583l = c12324l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13067l(C0203l c0203l, Function1 function1, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f25587l = 8;
        this.f25588l = c0203l;
        this.f25583l = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13067l(C5616l c5616l, List list, C15308l c15308l, C13765l c13765l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f25587l = 4;
        this.f25586l = c5616l;
        this.f25591l = list;
        this.f25588l = c15308l;
        this.f25583l = c13765l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13067l(ContentResolver contentResolver, Uri uri, C5848l c5848l, C7119l c7119l, Context context, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f25587l = 9;
        this.f25589l = contentResolver;
        this.f25586l = uri;
        this.f25591l = c5848l;
        this.f25588l = c7119l;
        this.f25583l = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13067l(Object obj, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f25587l = i;
        this.f25585l = obj;
        this.f25589l = serializable;
        this.f25586l = obj2;
        this.f25591l = obj3;
        this.f25584l = obj4;
        this.f25588l = obj5;
        this.f25583l = obj6;
    }
}
