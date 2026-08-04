package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘّ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12420l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ long f24522l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24523l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f24524l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ int f24525l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C5835l f24526l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12420l(int i, int i2, long j, InterfaceC14029l interfaceC14029l, C5835l c5835l) {
        super(2, interfaceC14029l);
        this.f24526l = c5835l;
        this.f24522l = j;
        this.f24523l = i;
        this.f24525l = i2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f24524l;
        if (i != 0) {
            if (i == 1) {
                AbstractC2829l.crashlytics(obj);
                return obj;
            }
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC2829l.crashlytics(obj);
        int i2 = this.f24525l;
        int i3 = this.f24523l;
        long j = this.f24522l;
        C5835l c5835l = this.f24526l;
        C9153l c9153l = new C9153l(i3, i2, j, null, c5835l);
        this.f24524l = 1;
        Object objYandex = C5835l.yandex(c5835l, c9153l, this);
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        return objYandex == enumC9342l ? enumC9342l : objYandex;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C12420l(this.f24523l, this.f24525l, this.f24522l, interfaceC14029l, this.f24526l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C12420l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
