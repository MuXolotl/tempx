package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِْؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11800l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C1253l f23623l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f23624l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f23625l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11800l(C1253l c1253l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f23624l = i;
        this.f23623l = c1253l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f23624l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C1253l c1253l = this.f23623l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i2 = this.f23625l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f23625l = 1;
                    if (C1253l.m858abstract(c1253l, this) == enumC9342l) {
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
                int i3 = this.f23625l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC6942l interfaceC6942lIsPro = AbstractC0622l.isPro(AbstractC0622l.subs(c1253l.f3284l, 300L));
                    C11800l c11800l = new C11800l(c1253l, interfaceC14029l, 0);
                    this.f23625l = 1;
                    if (AbstractC0622l.billing(interfaceC6942lIsPro, c11800l, this) == enumC9342l) {
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
                int i4 = this.f23625l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C16534l c16534l = new C16534l(AbstractC16901l.m4210case(c1253l.f3281l, ",", null, null, null, 62), 4);
                    this.f23625l = 1;
                    if (c16534l.ads(this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i4 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                c1253l.f3278l.setValue(Boolean.FALSE);
                c1253l.mo1143default();
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f23624l;
        C1253l c1253l = this.f23623l;
        switch (i) {
            case 0:
                return new C11800l(c1253l, interfaceC14029l, 0);
            case 1:
                return new C11800l(c1253l, interfaceC14029l, 1);
            default:
                return new C11800l(c1253l, interfaceC14029l, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23624l) {
            case 0:
                return ((C11800l) ads((InterfaceC14029l) obj2, (String) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C11800l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C11800l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
