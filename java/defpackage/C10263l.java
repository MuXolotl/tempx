package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَْۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10263l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C18449l f20892l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C7463l f20893l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f20894l = 0;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f20895l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10263l(C18449l c18449l, C7463l c7463l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f20892l = c18449l;
        this.f20893l = c7463l;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        Object objYandex;
        int i = this.f20894l;
        C7463l c7463l = this.f20893l;
        C18449l c18449l = this.f20892l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f20895l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C14970l c14970lMetrica = AbstractC8020l.metrica(new C13802l(14, c7463l));
                    C2354l c2354l = new C2354l(6, c18449l);
                    this.f20895l = 1;
                    if (c14970lMetrica.yandex(c2354l, this) == enumC9342l) {
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
                int i3 = this.f20895l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (!((C12606l) c18449l.f36009l).mopub) {
                        C6760l c6760l = C9658l.f19699l;
                        long jTapsense = AbstractC15918l.tapsense(3, EnumC16636l.SECONDS);
                        this.f20895l = 1;
                        if (AbstractC8532l.billing(jTapsense, this) == enumC9342l) {
                            return enumC9342l;
                        }
                        this.f20895l = 2;
                        C15389l c15389l = c7463l.yandex;
                        c15389l.getClass();
                        C5270l c5270l = new C5270l(c15389l, AbstractC2124l.yandex, null);
                        objYandex = c15389l.yandex(EnumC12805l.f25185l, EnumC11011l.f22182l, c5270l, this);
                        if (objYandex != enumC9342l) {
                            objYandex = Unit.INSTANCE;
                        }
                        if (objYandex != enumC9342l) {
                            objYandex = Unit.INSTANCE;
                        }
                        if (objYandex == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else if (i3 == 1) {
                    AbstractC2829l.crashlytics(obj);
                    this.f20895l = 2;
                    C15389l c15389l2 = c7463l.yandex;
                    c15389l2.getClass();
                    C5270l c5270l2 = new C5270l(c15389l2, AbstractC2124l.yandex, null);
                    objYandex = c15389l2.yandex(EnumC12805l.f25185l, EnumC11011l.f22182l, c5270l2, this);
                    if (objYandex != enumC9342l) {
                        objYandex = Unit.INSTANCE;
                    }
                    if (objYandex != enumC9342l) {
                        objYandex = Unit.INSTANCE;
                    }
                    if (objYandex == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 2) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f20894l;
        C7463l c7463l = this.f20893l;
        C18449l c18449l = this.f20892l;
        switch (i) {
            case 0:
                return new C10263l(c7463l, c18449l, interfaceC14029l);
            default:
                return new C10263l(c18449l, c7463l, interfaceC14029l);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f20894l) {
            case 0:
                break;
        }
        return ((C10263l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10263l(C7463l c7463l, C18449l c18449l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f20893l = c7463l;
        this.f20892l = c18449l;
    }
}
