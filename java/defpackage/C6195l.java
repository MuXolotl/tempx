package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؙؒٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6195l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C10056l f13063l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13064l;

    public /* synthetic */ C6195l(C10056l c10056l, int i) {
        this.f13064l = i;
        this.f13063l = c10056l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f13064l;
        C10056l c10056l = this.f13063l;
        switch (i) {
            case 0:
                c10056l.m4125private(new C13797l());
                break;
            case 1:
                c10056l.m2870break(!((Boolean) c10056l.f20512l.getValue()).booleanValue());
                break;
            case 2:
                c10056l.m4125private(new C13157l());
                break;
            case 3:
                C12942l.purchase = false;
                C12942l.crashlytics = false;
                C12942l.loadAd = 0;
                C12942l.amazon = 0;
                c10056l.m2876try(0);
                break;
            case 4:
                C12942l.purchase = false;
                C12942l.crashlytics = false;
                C12942l.loadAd = 0;
                C12942l.amazon = 0;
                c10056l.m2876try(0);
                break;
            default:
                C12942l.crashlytics = true;
                c10056l.m2876try(-1);
                break;
        }
        return Unit.INSTANCE;
    }
}
