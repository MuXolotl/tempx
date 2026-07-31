package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lْٕٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC15650l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ List f30592l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C2112l f30593l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30594l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f30595l;

    public /* synthetic */ RunnableC15650l(C2112l c2112l, List list, int i, int i2) {
        this.f30594l = i2;
        this.f30593l = c2112l;
        this.f30592l = list;
        this.f30595l = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 1;
        switch (this.f30594l) {
            case 0:
                C2112l c2112l = this.f30593l;
                c2112l.yandex.execute(new RunnableC15650l(c2112l, this.f30592l, this.f30595l, i));
                break;
            default:
                C2112l c2112l2 = this.f30593l;
                List list = this.f30592l;
                int i2 = this.f30595l;
                if (c2112l2.smaato.get() && c2112l2.firebase.equals(list)) {
                    AbstractC5088l.yandex("CameraPresencePrvdr", "Triggering refresh. Attempts left: " + i2);
                    C15855l c15855l = c2112l2.admob;
                    if (c15855l != null) {
                        c15855l.mopub();
                    }
                    c2112l2.purchase(i2 - 1, list);
                    break;
                }
                break;
        }
    }
}
