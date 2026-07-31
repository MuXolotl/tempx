package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lٕؒؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15386l implements InterfaceC13914l {
    public final /* synthetic */ Object amazon;
    public final /* synthetic */ Object crashlytics;
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C15386l(Object obj, Object obj2, Object obj3, int i) {
        this.yandex = i;
        this.loadAd = obj;
        this.crashlytics = obj2;
        this.amazon = obj3;
    }

    @Override // defpackage.InterfaceC13914l
    public final void yandex() {
        int i = this.yandex;
        Object obj = this.amazon;
        Object obj2 = this.crashlytics;
        Object obj3 = this.loadAd;
        switch (i) {
            case 0:
                ((C11362l) obj3).remove(obj2);
                ((C14931l) obj).amazon.smaato(obj2);
                break;
            case 1:
                ((InterfaceC3177l) obj3).loadAd().loadAd((C13505l) obj2);
                C4466l c4466l = (C4466l) ((C10700l) obj).f21708l;
                if (c4466l != null) {
                    c4466l.yandex();
                }
                break;
            default:
                C8874l c8874l = (C8874l) obj3;
                C16691l c16691l = (C16691l) obj;
                if (c8874l.f18241l.smaato(obj2) == c16691l) {
                    Map map = c8874l.f18242l;
                    Map mapAmazon = c16691l.amazon();
                    if (!mapAmazon.isEmpty()) {
                        map.put(obj2, mapAmazon);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
        }
    }
}
