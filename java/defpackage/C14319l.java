package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٟٓؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14319l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public float f28046l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f28047l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f28048l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public /* synthetic */ Object f28049l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f28050l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14319l(Object obj, float f, InterfaceC1489l interfaceC1489l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f28048l = i;
        this.f28049l = obj;
        this.f28046l = f;
        this.f28047l = interfaceC1489l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        float fIsPro;
        InterfaceC2262l interfaceC2262l;
        int i = this.f28048l;
        Object obj2 = this.f28047l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f28050l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f28050l = 1;
                    if (C5616l.loadAd(((C18723l) this.f28049l).f36494l, new Float(this.f28046l), (InterfaceC1489l) obj2, null, null, this, 12) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 1:
                int i3 = this.f28050l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f28050l = 1;
                    if (C5616l.loadAd((C5616l) ((C18480l) this.f28049l).f36088l, new Float(this.f28046l), (InterfaceC1489l) obj2, null, null, this, 12) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                int i4 = this.f28050l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) this.f28049l;
                    fIsPro = AbstractC18719l.isPro(interfaceC2262l2.vip());
                    interfaceC2262l = interfaceC2262l2;
                } else {
                    if (i4 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fIsPro = this.f28046l;
                    interfaceC2262l = (InterfaceC2262l) this.f28049l;
                    AbstractC2829l.crashlytics(obj);
                }
                while (AbstractC11990l.smaato(interfaceC2262l)) {
                    C5724l c5724l = new C5724l((C18656l) obj2, fIsPro, 4);
                    this.f28049l = interfaceC2262l;
                    this.f28046l = fIsPro;
                    this.f28050l = 1;
                    if (AbstractC1789l.amazon(this.f1295l).mo1226super(c5724l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f28048l;
        Object obj2 = this.f28047l;
        switch (i) {
            case 0:
                return new C14319l((C18723l) this.f28049l, this.f28046l, (InterfaceC1489l) obj2, interfaceC14029l, 0);
            case 1:
                return new C14319l((C18480l) this.f28049l, this.f28046l, (InterfaceC1489l) obj2, interfaceC14029l, 1);
            default:
                C14319l c14319l = new C14319l((C18656l) obj2, interfaceC14029l);
                c14319l.f28049l = obj;
                return c14319l;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f28048l) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C14319l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14319l(C18656l c18656l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f28048l = 2;
        this.f28047l = c18656l;
    }
}
