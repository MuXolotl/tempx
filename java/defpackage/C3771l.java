package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؕۦؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3771l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ Object f7852l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f7853l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f7854l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public Object f7855l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f7856l = 0;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f7857l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Object f7858l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f7859l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public Object f7860l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3771l(C5835l c5835l, String str, int i, int i2, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f7857l = c5835l;
        this.f7852l = str;
        this.f7853l = i;
        this.f7854l = i2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b8 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002c, B:46:0x0112, B:31:0x00b2, B:33:0x00b8, B:36:0x00c5, B:40:0x00ce, B:43:0x00ec, B:27:0x008f), top: B:61:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ec A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002c, B:46:0x0112, B:31:0x00b2, B:33:0x00b8, B:36:0x00c5, B:40:0x00ce, B:43:0x00ec, B:27:0x008f), top: B:61:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0111  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [lٍؓؕ] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [lٍؓؕ] */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        AbstractC7188l abstractC7188l;
        Object objSignature;
        C14451l c14451l;
        C14759l c14759l;
        int i;
        InterfaceC1601l interfaceC1601l;
        Object objFirebase;
        C14451l c14451l2;
        int i2;
        int i3;
        InterfaceC1601l interfaceC1601l2;
        AbstractC18643l abstractC18643l;
        int iIndexOf;
        C2975l c2975l;
        C15907l c15907l;
        int i4 = this.f7856l;
        Object obj2 = this.f7852l;
        Object obj3 = this.f7857l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i4) {
            case 0:
                InterfaceC16805l interfaceC16805l = (InterfaceC16805l) this.f7860l;
                int i5 = this.f7859l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    abstractC7188l = ((C5835l) obj3).loadAd;
                    int i6 = this.f7853l;
                    int i7 = this.f7854l;
                    this.f7860l = null;
                    this.f7858l = abstractC7188l;
                    this.f7855l = interfaceC16805l;
                    this.f7859l = 1;
                    objSignature = C11485l.f23075l.Signature((String) obj2, i6, i7, this);
                    if (objSignature == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i5 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    interfaceC16805l = (InterfaceC16805l) this.f7855l;
                    AbstractC7188l abstractC7188l2 = (AbstractC7188l) this.f7858l;
                    AbstractC2829l.crashlytics(obj);
                    abstractC7188l = abstractC7188l2;
                    objSignature = obj;
                }
                abstractC7188l.getClass();
                abstractC7188l.billing(new C3631l(interfaceC16805l), objSignature);
                return Unit.INSTANCE;
            default:
                ?? r1 = this.f7854l;
                int i8 = 0;
                int i9 = 2;
                try {
                    if (r1 != 0) {
                        if (r1 == 1) {
                            int i10 = this.f7859l;
                            C14451l c14451l3 = (C14451l) this.f7860l;
                            C14759l c14759l2 = (C14759l) this.f7855l;
                            InterfaceC1601l interfaceC1601l3 = (InterfaceC1601l) this.f7858l;
                            AbstractC2829l.crashlytics(obj);
                            i = i10;
                            interfaceC1601l = interfaceC1601l3;
                            c14759l = c14759l2;
                            c14451l = c14451l3;
                        } else if (r1 == 2) {
                            int i11 = this.f7853l;
                            int i12 = this.f7859l;
                            C14451l c14451l4 = (C14451l) this.f7860l;
                            c14759l = (C14759l) this.f7855l;
                            InterfaceC1601l interfaceC1601l4 = (InterfaceC1601l) this.f7858l;
                            try {
                                AbstractC2829l.crashlytics(obj);
                                c14451l2 = c14451l4;
                                i2 = i12;
                                i3 = i11;
                                interfaceC1601l2 = interfaceC1601l4;
                                objFirebase = obj;
                                C14759l c14759l3 = c14759l;
                                abstractC18643l = (AbstractC18643l) objFirebase;
                                if (abstractC18643l != null) {
                                    iIndexOf = c14451l2.f28630l.billing.indexOf(abstractC18643l);
                                } else {
                                    iIndexOf = -1;
                                }
                                if (abstractC18643l != null || c14759l3.yandex == EnumC11447l.f23033l || iIndexOf == -1) {
                                    int iIndexOf2 = c14451l2.f28630l.billing.indexOf(c14451l2.f28308l);
                                    C16552l c16552l = AbstractC11463l.yandex;
                                    c2975l = AbstractC17278l.yandex;
                                    c15907l = new C15907l(c14451l2, iIndexOf2, interfaceC14029l, i8);
                                    this.f7858l = interfaceC1601l2;
                                    this.f7855l = null;
                                    this.f7860l = null;
                                    this.f7859l = i2;
                                    this.f7853l = i3;
                                    this.f7854l = 3;
                                    r1 = interfaceC1601l2;
                                    if (AbstractC10999l.firebase(c2975l, c15907l, this) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                } else {
                                    C16552l c16552l2 = AbstractC11463l.yandex;
                                    C2975l c2975l2 = AbstractC17278l.yandex;
                                    C0932l c0932l = new C0932l(c14451l2, iIndexOf, c14759l3, abstractC18643l, (InterfaceC14029l) null);
                                    this.f7858l = interfaceC1601l2;
                                    this.f7855l = null;
                                    this.f7860l = null;
                                    this.f7859l = i2;
                                    this.f7853l = i3;
                                    this.f7854l = 4;
                                    if (AbstractC10999l.firebase(c2975l2, c0932l, this) == enumC9342l) {
                                        r1 = interfaceC1601l2;
                                        return enumC9342l;
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                r1 = interfaceC1601l4;
                                r1.billing(null);
                                throw th;
                            }
                        } else {
                            if (r1 != 3 && r1 != 4) {
                                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            InterfaceC1601l interfaceC1601l5 = (InterfaceC1601l) this.f7858l;
                            AbstractC2829l.crashlytics(obj);
                            r1 = interfaceC1601l5;
                        }
                        r1 = interfaceC1601l2;
                        Unit unit = Unit.INSTANCE;
                        r1.billing(null);
                        return Unit.INSTANCE;
                    }
                    AbstractC2829l.crashlytics(obj);
                    c14451l = (C14451l) obj3;
                    C4910l c4910l = c14451l.f28314l;
                    C14759l c14759l4 = (C14759l) obj2;
                    this.f7858l = c4910l;
                    this.f7855l = c14759l4;
                    this.f7860l = c14451l;
                    this.f7859l = 0;
                    this.f7854l = 1;
                    if (c4910l.yandex(this) == enumC9342l) {
                        return enumC9342l;
                    }
                    c14759l = c14759l4;
                    i = 0;
                    interfaceC1601l = c4910l;
                    C16552l c16552l3 = AbstractC11463l.yandex;
                    C2975l c2975l3 = AbstractC17278l.yandex;
                    C0071l c0071l = new C0071l(i9, interfaceC14029l, 12);
                    this.f7858l = interfaceC1601l;
                    this.f7855l = c14759l;
                    this.f7860l = c14451l;
                    this.f7859l = i;
                    this.f7853l = 0;
                    this.f7854l = 2;
                    objFirebase = AbstractC10999l.firebase(c2975l3, c0071l, this);
                    if (objFirebase == enumC9342l) {
                        return enumC9342l;
                    }
                    c14451l2 = c14451l;
                    i2 = i;
                    i3 = 0;
                    interfaceC1601l2 = interfaceC1601l;
                    C14759l c14759l5 = c14759l;
                    abstractC18643l = (AbstractC18643l) objFirebase;
                    if (abstractC18643l != null) {
                        iIndexOf = c14451l2.f28630l.billing.indexOf(abstractC18643l);
                    } else {
                        iIndexOf = -1;
                    }
                    if (abstractC18643l != null) {
                        int iIndexOf3 = c14451l2.f28630l.billing.indexOf(c14451l2.f28308l);
                        C16552l c16552l4 = AbstractC11463l.yandex;
                        c2975l = AbstractC17278l.yandex;
                        c15907l = new C15907l(c14451l2, iIndexOf3, interfaceC14029l, i8);
                        this.f7858l = interfaceC1601l2;
                        this.f7855l = null;
                        this.f7860l = null;
                        this.f7859l = i2;
                        this.f7853l = i3;
                        this.f7854l = 3;
                        r1 = interfaceC1601l2;
                        if (AbstractC10999l.firebase(c2975l, c15907l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        int iIndexOf4 = c14451l2.f28630l.billing.indexOf(c14451l2.f28308l);
                        C16552l c16552l5 = AbstractC11463l.yandex;
                        c2975l = AbstractC17278l.yandex;
                        c15907l = new C15907l(c14451l2, iIndexOf4, interfaceC14029l, i8);
                        this.f7858l = interfaceC1601l2;
                        this.f7855l = null;
                        this.f7860l = null;
                        this.f7859l = i2;
                        this.f7853l = i3;
                        this.f7854l = 3;
                        r1 = interfaceC1601l2;
                        if (AbstractC10999l.firebase(c2975l, c15907l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                    r1 = interfaceC1601l2;
                    Unit unit2 = Unit.INSTANCE;
                    r1.billing(null);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f7856l;
        Object obj2 = this.f7852l;
        Object obj3 = this.f7857l;
        switch (i) {
            case 0:
                C3771l c3771l = new C3771l((C5835l) obj3, (String) obj2, this.f7853l, this.f7854l, interfaceC14029l);
                c3771l.f7860l = obj;
                return c3771l;
            default:
                return new C3771l((C14451l) obj3, (C14759l) obj2, interfaceC14029l);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7856l) {
            case 0:
                return ((C3771l) ads((InterfaceC14029l) obj2, (InterfaceC16805l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C3771l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3771l(C14451l c14451l, C14759l c14759l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f7857l = c14451l;
        this.f7852l = c14759l;
    }
}
