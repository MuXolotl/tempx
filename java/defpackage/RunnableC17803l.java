package defpackage;

/* JADX INFO: renamed from: lٍ٘ؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC17803l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f34668l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18602l f34669l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34670l;

    public /* synthetic */ RunnableC17803l(C18602l c18602l, int i, int i2) {
        this.f34670l = i2;
        this.f34669l = c18602l;
        this.f34668l = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f34670l;
        int i2 = this.f34668l;
        C18602l c18602l = this.f34669l;
        switch (i) {
            case 0:
                if (c18602l.mo2779l(25) || c18602l.mo2779l(33)) {
                    if (!c18602l.mo2779l(33)) {
                        c18602l.mo2772l(i2);
                    } else {
                        c18602l.mo2799package(i2, 1);
                    }
                }
                break;
            default:
                if (c18602l.mo2779l(26) || c18602l.mo2779l(34)) {
                    if (i2 == -100) {
                        if (!c18602l.mo2779l(34)) {
                            c18602l.mo2803return(true);
                        } else {
                            c18602l.appmetrica(1, true);
                        }
                    } else if (i2 == -1) {
                        if (!c18602l.mo2779l(34)) {
                            c18602l.mo2811throws();
                        } else {
                            c18602l.mo2806super(1);
                        }
                    } else if (i2 == 1) {
                        if (!c18602l.mo2779l(34)) {
                            c18602l.mo2787l();
                        } else {
                            c18602l.mo2808synchronized(1);
                        }
                    } else if (i2 == 100) {
                        if (!c18602l.mo2779l(34)) {
                            c18602l.mo2803return(false);
                        } else {
                            c18602l.appmetrica(1, false);
                        }
                    } else if (i2 != 101) {
                        AbstractC12900l.subscription("onAdjustVolume: Ignoring unknown direction: ", i2, "VolumeProviderCompat");
                    } else if (!c18602l.mo2779l(34)) {
                        c18602l.mo2803return(!c18602l.m4571l());
                    } else {
                        c18602l.appmetrica(1, !c18602l.m4571l());
                    }
                }
                break;
        }
    }
}
