package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lۣٔۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15170l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C7136l f29762l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f29763l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f29764l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15170l(C7136l c7136l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f29763l = i;
        this.f29762l = c7136l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f29763l;
        C7136l c7136l = this.f29762l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f29764l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C5616l c5616l = c7136l.adcel;
                    Float f = new Float(1.0f);
                    this.f29764l = 1;
                    if (c5616l.billing(this, f) == enumC9342l) {
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
                int i3 = this.f29764l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C5616l c5616l2 = c7136l.startapp;
                    C5177l c5177l = new C5177l(0L);
                    this.f29764l = 1;
                    if (c5616l2.billing(this, c5177l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                c7136l.admob(0L);
                c7136l.mopub(false);
                return Unit.INSTANCE;
            case 2:
                int i4 = this.f29764l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C5616l c5616l3 = c7136l.startapp;
                    this.f29764l = 1;
                    if (c5616l3.mopub(this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i4 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 3:
                int i5 = this.f29764l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C5616l c5616l4 = c7136l.adcel;
                    this.f29764l = 1;
                    if (c5616l4.mopub(this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i5 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                int i6 = this.f29764l;
                if (i6 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C5616l c5616l5 = c7136l.adcel;
                    this.f29764l = 1;
                    if (c5616l5.mopub(this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i6 != 1) {
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
        int i = this.f29763l;
        C7136l c7136l = this.f29762l;
        switch (i) {
            case 0:
                return new C15170l(c7136l, interfaceC14029l, 0);
            case 1:
                return new C15170l(c7136l, interfaceC14029l, 1);
            case 2:
                return new C15170l(c7136l, interfaceC14029l, 2);
            case 3:
                return new C15170l(c7136l, interfaceC14029l, 3);
            default:
                return new C15170l(c7136l, interfaceC14029l, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f29763l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((C15170l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
