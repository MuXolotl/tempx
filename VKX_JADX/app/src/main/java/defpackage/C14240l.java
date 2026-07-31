package defpackage;

/* JADX INFO: renamed from: lٓٚٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14240l implements InterfaceC0119l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13350l f27838l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27839l;

    public /* synthetic */ C14240l(C13350l c13350l, int i) {
        this.f27839l = i;
        this.f27838l = c13350l;
    }

    @Override // defpackage.InterfaceC0119l
    public final void crashlytics(C6499l c6499l) {
        int i = this.f27839l;
        C13350l c13350l = this.f27838l;
        switch (i) {
            case 0:
                C3726l c3726l = c13350l.admob;
                C18602l c18602l = c3726l.tapsense;
                if (!AbstractC15323l.m3971instanceof(c18602l, c3726l.startapp)) {
                    if (c18602l != null && c18602l.mo2779l(1)) {
                        c18602l.mo2814volatile();
                        break;
                    }
                } else {
                    AbstractC15323l.m3973native(c18602l);
                    break;
                }
                break;
            case 1:
                c13350l.admob.tapsense.mo2749case();
                break;
            case 2:
                c13350l.admob.tapsense.isVip();
                break;
            case 3:
                c13350l.admob.tapsense.mo2785l();
                break;
            case 4:
                c13350l.admob.tapsense.mo2773l();
                break;
            case 5:
                c13350l.admob.smaato(c6499l, true);
                break;
            case 6:
                c13350l.admob.tapsense.yandex();
                break;
            case 7:
                c13350l.admob.tapsense.stop();
                break;
            case 8:
                c13350l.admob.tapsense.mo2760goto();
                break;
            case 9:
                c13350l.admob.tapsense.mo2786l();
                break;
            default:
                C18602l c18602l2 = c13350l.admob.tapsense;
                String str = AbstractC15323l.yandex;
                if (c18602l2 != null && c18602l2.mo2779l(1)) {
                    c18602l2.mo2814volatile();
                    break;
                }
                break;
        }
    }
}
