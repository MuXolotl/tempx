package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًَ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10595l implements InterfaceC17053l, InterfaceC2679l {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C10595l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // defpackage.InterfaceC17053l
    public final InterfaceC0684l crashlytics() {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                return ((C10539l) obj).yandex;
            default:
                return ((C5870l) obj).yandex;
        }
    }

    @Override // defpackage.InterfaceC2679l
    public final Object loadAd(String str, Function1 function1, AbstractC0283l abstractC0283l) {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                return ((C10539l) obj).loadAd(str, function1, abstractC0283l);
            default:
                return ((C5870l) obj).loadAd(str, function1, abstractC0283l);
        }
    }
}
