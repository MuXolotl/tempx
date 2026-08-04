package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؕۧؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3789l implements InterfaceC13241l {
    public Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C3789l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // defpackage.InterfaceC13241l
    public final void accept(Object obj) {
        switch (this.yandex) {
            case 0:
                ((InterfaceC13241l) this.loadAd).accept(obj);
                return;
            case 1:
                C11253l c11253l = (C11253l) obj;
                if (c11253l == null) {
                    c11253l = new C11253l(-3);
                }
                ((C3797l) this.loadAd).m1426package(c11253l);
                return;
            default:
                C11253l c11253l2 = (C11253l) obj;
                synchronized (AbstractC8202l.crashlytics) {
                    try {
                        C5128l c5128l = AbstractC8202l.amazon;
                        ArrayList arrayList = (ArrayList) c5128l.get((String) this.loadAd);
                        if (arrayList == null) {
                            return;
                        }
                        c5128l.remove((String) this.loadAd);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((InterfaceC13241l) arrayList.get(i)).accept(c11253l2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }

    public /* synthetic */ C3789l() {
        this.yandex = 0;
    }
}
