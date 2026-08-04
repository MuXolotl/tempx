package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٓۨ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14584l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C9927l f28550l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28551l;

    public /* synthetic */ C14584l(C9927l c9927l, int i) {
        this.f28551l = i;
        this.f28550l = c9927l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f28551l;
        C9927l c9927l = this.f28550l;
        switch (i) {
            case 0:
                C11296l c11296l = c9927l.loadAd;
                return AbstractC14055l.remoteconfig(AbstractC6689l.subs(c11296l), AbstractC6689l.isPro(c11296l));
            default:
                return c9927l.crashlytics ? AbstractC14055l.vip(AbstractC6689l.admob(c9927l.loadAd)) : C2580l.f5619l;
        }
    }
}
