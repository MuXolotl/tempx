package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lّؓ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12349l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f24452l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12349l(int i, InterfaceC14029l interfaceC14029l, int i2) {
        super(i, interfaceC14029l);
        this.f24452l = i2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        switch (this.f24452l) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                return Unit.INSTANCE;
            case 1:
                AbstractC2829l.crashlytics(obj);
                return Unit.INSTANCE;
            case 2:
                AbstractC2829l.crashlytics(obj);
                return Boolean.FALSE;
            default:
                AbstractC2829l.crashlytics(obj);
                return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        switch (this.f24452l) {
            case 0:
                long j = ((C1187l) obj2).yandex;
                new C12349l(i, (InterfaceC14029l) obj3, 0);
                Unit unit = Unit.INSTANCE;
                AbstractC2829l.crashlytics(unit);
                return unit;
            case 1:
                ((Number) obj2).floatValue();
                new C12349l(i, (InterfaceC14029l) obj3, 1);
                Unit unit2 = Unit.INSTANCE;
                AbstractC2829l.crashlytics(unit2);
                return unit2;
            case 2:
                ((Number) obj).intValue();
                new C12349l(i, (InterfaceC14029l) obj3, 2).Signature(Unit.INSTANCE);
                return Boolean.FALSE;
            default:
                long j2 = ((C1187l) obj2).yandex;
                new C12349l(i, (InterfaceC14029l) obj3, i);
                Unit unit3 = Unit.INSTANCE;
                AbstractC2829l.crashlytics(unit3);
                return unit3;
        }
    }
}
