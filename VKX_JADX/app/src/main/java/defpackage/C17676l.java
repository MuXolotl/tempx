package defpackage;

import androidx.work.CoroutineWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: l٘ؕۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17676l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ CoroutineWorker f34448l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f34449l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f34450l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17676l(CoroutineWorker coroutineWorker, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f34449l = i;
        this.f34448l = coroutineWorker;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        switch (this.f34449l) {
            case 0:
                int i = this.f34450l;
                if (i == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f34450l = 1;
                    C8339l.smaato("Not implemented");
                } else {
                    if (i == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                int i2 = this.f34450l;
                if (i2 != 0) {
                    if (i2 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                this.f34450l = 1;
                Object objCrashlytics = this.f34448l.crashlytics(this);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                return objCrashlytics == enumC9342l ? enumC9342l : objCrashlytics;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f34449l;
        CoroutineWorker coroutineWorker = this.f34448l;
        switch (i) {
            case 0:
                return new C17676l(coroutineWorker, interfaceC14029l, 0);
            default:
                return new C17676l(coroutineWorker, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f34449l) {
            case 0:
                C17676l c17676l = (C17676l) ads(interfaceC14029l, interfaceC2262l);
                Unit unit = Unit.INSTANCE;
                c17676l.Signature(unit);
                return unit;
            default:
                return ((C17676l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
        }
    }
}
