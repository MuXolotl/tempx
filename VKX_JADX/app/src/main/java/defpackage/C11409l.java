package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lُۢؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11409l extends AbstractC10798l {
    public final C0614l loadAd;
    public final C18200l yandex;

    public C11409l(C18200l c18200l, C0614l c0614l) {
        this.yandex = c18200l;
        this.loadAd = c0614l;
    }

    @Override // defpackage.AbstractC10798l
    public final C17032l crashlytics(C17032l c17032l) {
        C6705l c6705l = c17032l.yandex;
        Object value = this.loadAd.crashlytics.f15551l.getValue();
        C17279l c17279l = value instanceof C17279l ? (C17279l) value : null;
        if (c17279l != null) {
            String str = c6705l.amazon;
            List<String> list = c17279l.crashlytics;
            if (list == null || !list.isEmpty()) {
                for (String str2 : list) {
                    if (!AbstractC8576l.yandex(str, str2)) {
                        if (AbstractC16648l.Signature(str, "." + str2, false)) {
                        }
                    }
                    C11644l c11644lYandex = c17032l.yandex();
                    C13170l c13170lBilling = c6705l.billing();
                    String str3 = (String) AbstractC16901l.m4231native(c17279l.yandex);
                    String strLoadAd = AbstractC3623l.loadAd(AbstractC1068l.purchase(0, 0, 7, str3));
                    if (strLoadAd == null) {
                        C8339l.metrica("unexpected host: ".concat(str3));
                        return null;
                    }
                    c13170lBilling.admob = strLoadAd;
                    c11644lYandex.f23358l = c13170lBilling.crashlytics();
                    ((C16543l) c11644lYandex.f23361l).ad("Host");
                    ((C16543l) c11644lYandex.f23361l).loadAd("Host", str);
                    return new C17032l(c11644lYandex);
                }
            }
        }
        return c17032l;
    }

    @Override // defpackage.AbstractC10798l, defpackage.InterfaceC5329l
    public final C18389l yandex(C8795l c8795l) {
        return ((Boolean) this.yandex.get()).booleanValue() ? super.yandex(c8795l) : c8795l.loadAd(c8795l.purchase);
    }
}
