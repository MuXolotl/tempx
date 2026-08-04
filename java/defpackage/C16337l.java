package defpackage;

import android.os.Build;

/* JADX INFO: renamed from: lِْٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16337l implements InterfaceC0629l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9205l f31952l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C16717l f31953l;

    public /* synthetic */ C16337l(C16717l c16717l, C9205l c9205l) {
        this.f31953l = c16717l;
        this.f31952l = c9205l;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x006b A[FALL_THROUGH] */
    @Override // defpackage.InterfaceC0629l
    public final boolean apply(Object obj) {
        Boolean bool;
        C3582l c3582l;
        C3582l c3582l2;
        C5978l c5978l = (C5978l) obj;
        C16717l c16717l = this.f31953l;
        c16717l.getClass();
        if (this.f31952l.f18941l && ((bool = c16717l.isPro) == null || !bool.booleanValue())) {
            int i = c5978l.f12619package;
            if (i != -1 && i > 2) {
                String str = c5978l.metrica;
                if (str != null) {
                    switch (str) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/ac4":
                        case "audio/eac3":
                            if (Build.VERSION.SDK_INT >= 32 && (c3582l2 = c16717l.admob) != null && c3582l2.loadAd) {
                            }
                        default:
                            if (Build.VERSION.SDK_INT >= 32) {
                                break;
                            }
                            return false;
                    }
                } else if (Build.VERSION.SDK_INT >= 32 || (c3582l = c16717l.admob) == null || !c3582l.loadAd || !c3582l.crashlytics() || !c16717l.admob.amazon() || !c16717l.admob.yandex(c16717l.subs, c5978l)) {
                    return false;
                }
            }
        }
        return true;
    }
}
