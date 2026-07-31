package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؙؓۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6218l {
    public final C17248l admob;
    public final boolean amazon;
    public final InterfaceC9988l billing;
    public final InterfaceC18212l crashlytics;
    public int firebase;
    public int isPro;
    public final long loadAd;
    public final C0323l mopub;
    public final C3242l purchase;
    public int smaato;
    public final ArrayList subs;
    public final long yandex;

    public C6218l(long j, long j2, InterfaceC18212l interfaceC18212l, boolean z, C3242l c3242l, InterfaceC9988l interfaceC9988l, C0323l c0323l) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = interfaceC18212l;
        this.amazon = z;
        this.purchase = c3242l;
        this.billing = interfaceC9988l;
        this.mopub = c0323l;
        int i = AbstractC7401l.yandex;
        this.admob = new C17248l(6);
        this.subs = new ArrayList();
        this.isPro = -1;
        this.firebase = -1;
        this.smaato = -1;
    }

    public final int yandex(int i, int i2, int i3) {
        if (i == -1) {
            int iInmobi = AbstractC5020l.inmobi(AbstractC15450l.amazon(i2, i3));
            if (iInmobi == 0) {
                return this.smaato - 1;
            }
            if (iInmobi == 1) {
                return this.smaato;
            }
            if (iInmobi != 2) {
                C18725l.billing();
                return 0;
            }
        }
        return i;
    }
}
