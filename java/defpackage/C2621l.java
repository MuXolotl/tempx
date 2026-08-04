package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؔٔۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2621l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C5124l f5694l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f5695l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f5696l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2621l(C5124l c5124l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f5695l = i;
        this.f5694l = c5124l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        int i = this.f5695l;
        C5124l c5124l = this.f5694l;
        Object obj2 = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f5696l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f5696l = 1;
                    if (C5124l.m1692transient(c5124l, this) == obj2) {
                        return obj2;
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
                int i3 = this.f5696l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f5696l = 1;
                    if (C5124l.m1691protected(c5124l, this) == obj2) {
                        return obj2;
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
                int i4 = this.f5696l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C3086l c3086l = new C3086l(14, "common", null, null, null);
                    this.f5696l = 1;
                    Object objFirebase = AbstractC10999l.firebase(AbstractC11463l.yandex, new C12393l(C13305l.mopub, c3086l, (InterfaceC14029l) null, 2), this);
                    if (objFirebase != obj2) {
                        objFirebase = Unit.INSTANCE;
                    }
                    if (objFirebase == obj2) {
                        return obj2;
                    }
                } else {
                    if (i4 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                c5124l.m1697l(null);
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f5695l;
        C5124l c5124l = this.f5694l;
        switch (i) {
            case 0:
                return new C2621l(c5124l, interfaceC14029l, 0);
            case 1:
                return new C2621l(c5124l, interfaceC14029l, 1);
            default:
                return new C2621l(c5124l, interfaceC14029l, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f5695l) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C2621l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
