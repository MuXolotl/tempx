package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؗٝٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5035l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17817l f10294l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C13305l f10295l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f10296l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f10297l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5035l(InterfaceC17817l interfaceC17817l, C13305l c13305l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f10296l = i;
        this.f10294l = interfaceC17817l;
        this.f10295l = c13305l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        int i = this.f10296l;
        int i2 = 2;
        C13305l c13305l = this.f10295l;
        InterfaceC17817l interfaceC17817l = this.f10294l;
        Object obj2 = EnumC9342l.f19165l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i3 = this.f10297l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f10297l = 1;
                    Object objFirebase = AbstractC10999l.firebase(AbstractC11463l.yandex, new C12393l(c13305l, interfaceC17817l, interfaceC14029l, i2), this);
                    if (objFirebase != obj2) {
                        objFirebase = Unit.INSTANCE;
                    }
                    if (objFirebase == obj2) {
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
                int i4 = this.f10297l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f10297l = 1;
                    Object objFirebase2 = AbstractC10999l.firebase(AbstractC11463l.yandex, new C12393l(c13305l, interfaceC17817l, interfaceC14029l, i2), this);
                    if (objFirebase2 != obj2) {
                        objFirebase2 = Unit.INSTANCE;
                    }
                    if (objFirebase2 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i4 != 1) {
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
        switch (this.f10296l) {
            case 0:
                return new C5035l(this.f10294l, this.f10295l, interfaceC14029l, 0);
            default:
                return new C5035l(this.f10294l, this.f10295l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f10296l) {
            case 0:
                break;
        }
        return ((C5035l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
