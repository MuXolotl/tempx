package defpackage;

/* JADX INFO: renamed from: lٖٕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16399l {
    public Long amazon;
    public int crashlytics;
    public C13568l loadAd;
    public boolean purchase;
    public C13568l yandex;

    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    public final void yandex(C0639l c0639l) {
        C13568l c13568l;
        C0639l c0639l2;
        this.purchase = false;
        C13568l c13568l2 = this.yandex;
        if (AbstractC8576l.yandex(c0639l, c13568l2 != null ? (C0639l) c13568l2.f26580l : null)) {
            return;
        }
        String str = c0639l.yandex.f7563l;
        C13568l c13568l3 = this.yandex;
        boolean zYandex = AbstractC8576l.yandex(str, (c13568l3 == null || (c0639l2 = (C0639l) c13568l3.f26580l) == null) ? null : c0639l2.yandex.f7563l);
        C13568l c13568l4 = this.yandex;
        if (zYandex) {
            if (c13568l4 != null) {
                c13568l4.f26580l = c0639l;
                return;
            }
            return;
        }
        this.yandex = new C13568l(c13568l4, c0639l, 23);
        this.loadAd = null;
        int length = c0639l.yandex.f7563l.length() + this.crashlytics;
        this.crashlytics = length;
        if (length > 100000) {
            C13568l c13568l5 = this.yandex;
            if ((c13568l5 != null ? (C13568l) c13568l5.f26581l : null) == null) {
                return;
            }
            while (true) {
                if (c13568l5 == null) {
                    c13568l = null;
                } else {
                    C13568l c13568l6 = (C13568l) c13568l5.f26581l;
                    if (c13568l6 != null) {
                        c13568l = (C13568l) c13568l6.f26581l;
                    } else {
                        c13568l = null;
                    }
                }
                if (c13568l == null) {
                    break;
                } else {
                    c13568l5 = (C13568l) c13568l5.f26581l;
                }
            }
            if (c13568l5 != null) {
                c13568l5.f26581l = null;
            }
        }
    }
}
