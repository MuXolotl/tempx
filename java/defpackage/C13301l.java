package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙِْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13301l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17338l f26100l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26101l;

    public /* synthetic */ C13301l(C17338l c17338l, int i) {
        this.f26101l = i;
        this.f26100l = c17338l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f26101l;
        int i2 = 0;
        C17338l c17338l = this.f26100l;
        switch (i) {
            case 0:
                InterfaceC3074l interfaceC3074l = (InterfaceC3074l) c17338l.f33675l.invoke();
                int iYandex = interfaceC3074l.yandex();
                while (i2 < iYandex) {
                    if (interfaceC3074l.loadAd(i2).equals(obj)) {
                        return Integer.valueOf(i2);
                    }
                    i2++;
                }
                i2 = -1;
                return Integer.valueOf(i2);
            default:
                int iIntValue = ((Integer) obj).intValue();
                InterfaceC3074l interfaceC3074l2 = (InterfaceC3074l) c17338l.f33675l.invoke();
                if (iIntValue < 0 || iIntValue >= interfaceC3074l2.yandex()) {
                    AbstractC14825l.yandex("Can't scroll to index " + iIntValue + ", it is out of bounds [0, " + interfaceC3074l2.yandex() + ")");
                }
                AbstractC10999l.mopub(c17338l.m3914l(), null, 0, new C13017l(c17338l, iIntValue, (InterfaceC14029l) null, 2), 3);
                return Boolean.TRUE;
        }
    }
}
