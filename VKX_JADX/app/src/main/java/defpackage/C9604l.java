package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٍُٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9604l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ int f19566l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ Object f19567l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f19568l = 0;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f19569l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f19570l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9604l(int i, InterfaceC14029l interfaceC14029l, List list) {
        super(3, interfaceC14029l);
        this.f19569l = list;
        this.f19566l = i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f19568l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        Object obj2 = this.f19569l;
        switch (i) {
            case 0:
                AbstractC12074l abstractC12074l = (AbstractC12074l) this.f19567l;
                int i2 = this.f19570l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C4543l c4543l = (C4543l) ((InterfaceC9955l) abstractC12074l.f24000l);
                    C14585l c14585l = new C14585l(new C17239l(c4543l));
                    C11911l c11911l = AbstractC11626l.yandex;
                    if (c4543l.adcel().smaato()) {
                        return Unit.INSTANCE;
                    }
                    Function2 function2 = (Function2) ((List) obj2).get(this.f19566l);
                    this.f19567l = null;
                    this.f19570l = 1;
                    if (function2.invoke(c14585l, this) == enumC9342l) {
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
            default:
                long j = ((C12051l) obj2).f23979l;
                InterfaceC9427l interfaceC9427l = (InterfaceC9427l) this.f19567l;
                int i3 = this.f19566l;
                int i4 = this.f19570l;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            AbstractC2829l.crashlytics(obj);
                            if (j > 0) {
                                this.f19567l = interfaceC9427l;
                                this.f19566l = i3;
                                this.f19570l = 3;
                                if (interfaceC9427l.isPro(EnumC0920l.f2594l, this) == enumC9342l) {
                                    return enumC9342l;
                                }
                                this.f19567l = interfaceC9427l;
                                this.f19566l = i3;
                                this.f19570l = 4;
                                if (AbstractC8532l.purchase(j, this) == enumC9342l) {
                                    return enumC9342l;
                                }
                            }
                        } else if (i4 == 3) {
                            AbstractC2829l.crashlytics(obj);
                            this.f19567l = interfaceC9427l;
                            this.f19566l = i3;
                            this.f19570l = 4;
                            if (AbstractC8532l.purchase(j, this) == enumC9342l) {
                                return enumC9342l;
                            }
                        } else if (i4 == 4) {
                            AbstractC2829l.crashlytics(obj);
                        } else if (i4 != 5) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this.f19567l = null;
                        this.f19566l = i3;
                        this.f19570l = 5;
                        if (interfaceC9427l.isPro(EnumC0920l.f2593l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                    AbstractC2829l.crashlytics(obj);
                } else {
                    AbstractC2829l.crashlytics(obj);
                    if (i3 > 0) {
                        this.f19567l = null;
                        this.f19566l = i3;
                        this.f19570l = 1;
                        if (interfaceC9427l.isPro(EnumC0920l.f2595l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        this.f19567l = interfaceC9427l;
                        this.f19566l = i3;
                        this.f19570l = 2;
                        if (AbstractC8532l.purchase(0L, this) == enumC9342l) {
                            return enumC9342l;
                        }
                        if (j > 0) {
                            this.f19567l = interfaceC9427l;
                            this.f19566l = i3;
                            this.f19570l = 3;
                            if (interfaceC9427l.isPro(EnumC0920l.f2594l, this) == enumC9342l) {
                                return enumC9342l;
                            }
                            this.f19567l = interfaceC9427l;
                            this.f19566l = i3;
                            this.f19570l = 4;
                            if (AbstractC8532l.purchase(j, this) == enumC9342l) {
                                return enumC9342l;
                            }
                        }
                        this.f19567l = null;
                        this.f19566l = i3;
                        this.f19570l = 5;
                        if (interfaceC9427l.isPro(EnumC0920l.f2593l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                }
                return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f19568l;
        Object obj4 = this.f19569l;
        switch (i) {
            case 0:
                C9604l c9604l = new C9604l(this.f19566l, (InterfaceC14029l) obj3, (List) obj4);
                c9604l.f19567l = (AbstractC12074l) obj;
                return c9604l.Signature(Unit.INSTANCE);
            default:
                int iIntValue = ((Number) obj2).intValue();
                C9604l c9604l2 = new C9604l((C12051l) obj4, (InterfaceC14029l) obj3);
                c9604l2.f19567l = (InterfaceC9427l) obj;
                c9604l2.f19566l = iIntValue;
                return c9604l2.Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9604l(C12051l c12051l, InterfaceC14029l interfaceC14029l) {
        super(3, interfaceC14029l);
        this.f19569l = c12051l;
    }
}
