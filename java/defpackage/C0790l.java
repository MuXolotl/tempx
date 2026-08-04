package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؒؒۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0790l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ String f2383l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0790l(String str, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f2383l = str;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        AbstractC2829l.crashlytics(obj);
        VKXApplication.Companion companion = VKXApplication.f36628l;
        C11610l c11610l = AbstractC3629l.yandex;
        if (c11610l == null) {
            c11610l = null;
        }
        C11644l c11644l = new C11644l(28);
        c11644l.m3157l(this.f2383l);
        C8688l c8688l = C10328l.purchase;
        ((C16543l) c11644l.f23361l).signatures("User-Agent", AbstractC10409l.crashlytics().amazon.ads());
        return c11610l.yandex(new C17032l(c11644l)).billing();
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C0790l(this.f2383l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0790l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
