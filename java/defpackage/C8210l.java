package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًۗٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8210l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0290l f17105l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ long f17106l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f17107l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ boolean f17108l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8210l(boolean z, AbstractC0290l abstractC0290l, long j, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f17108l = z;
        this.f17105l = abstractC0290l;
        this.f17106l = j;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f17107l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            C17110l c17110l = this.f17105l.f1319l;
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (this.f17108l) {
                this.f17107l = 2;
                Object objYandex = c17110l.yandex(this.f17106l, 0L, this);
                if (objYandex != enumC9342l) {
                    obj = objYandex;
                    ((C12121l) obj).getClass();
                }
            } else {
                this.f17107l = 1;
                Object objYandex2 = c17110l.yandex(0L, this.f17106l, this);
                if (objYandex2 != enumC9342l) {
                    obj = objYandex2;
                    ((C12121l) obj).getClass();
                }
            }
            return enumC9342l;
        }
        if (i == 1) {
            AbstractC2829l.crashlytics(obj);
            ((C12121l) obj).getClass();
        } else {
            if (i != 2) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
            ((C12121l) obj).getClass();
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C8210l(this.f17108l, this.f17105l, this.f17106l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C8210l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
