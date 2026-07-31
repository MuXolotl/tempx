package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚۖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7446l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f15421l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C4043l f15422l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f15423l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f15424l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7446l(C4043l c4043l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f15423l = i;
        this.f15422l = c4043l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f15423l;
        C4043l c4043l = this.f15422l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f15424l;
                if (i2 != 0) {
                    if (i2 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C2319l c2319l = (C2319l) this.f15421l;
                this.f15424l = 1;
                Object objLoadAd = c2319l.loadAd(c4043l, this);
                return objLoadAd == enumC9342l ? enumC9342l : objLoadAd;
            default:
                int i3 = this.f15424l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C2319l c2319l2 = (C2319l) this.f15421l;
                    String str = c4043l.yandex;
                    this.f15424l = 1;
                    C4043l c4043l2 = (C4043l) c2319l2.yandex.remove(str);
                    if (c4043l2 != null) {
                        c4043l2.amazon.crashlytics(null);
                        c4043l2.loadAd.set(false);
                        c4043l2.remoteconfig.ads(null);
                    }
                    if (Unit.INSTANCE == enumC9342l) {
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
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f15423l;
        C4043l c4043l = this.f15422l;
        switch (i) {
            case 0:
                C7446l c7446l = new C7446l(c4043l, interfaceC14029l, 0);
                c7446l.f15421l = obj;
                return c7446l;
            default:
                C7446l c7446l2 = new C7446l(c4043l, interfaceC14029l, 1);
                c7446l2.f15421l = obj;
                return c7446l2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C2319l c2319l = (C2319l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f15423l) {
            case 0:
                break;
        }
        return ((C7446l) ads(interfaceC14029l, c2319l)).Signature(Unit.INSTANCE);
    }
}
