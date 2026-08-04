package defpackage;

import kotlin.jvm.functions.Function6;

/* JADX INFO: renamed from: lٖۣٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17169l implements Function6 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C0205l f33345l;

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        InterfaceC18212l interfaceC18212l = (InterfaceC18212l) obj2;
        long j = ((C1187l) obj3).yandex;
        C0205l c0205l = this.f33345l;
        long jAmazon = c0205l.amazon(interfaceC18212l, j);
        long jAmazon2 = c0205l.amazon(interfaceC18212l, ((C1187l) obj4).yandex);
        c0205l.vip(zBooleanValue);
        return Boolean.valueOf(c0205l.subscription(jAmazon, jAmazon2, ((Boolean) obj5).booleanValue(), (C11379l) obj6));
    }
}
