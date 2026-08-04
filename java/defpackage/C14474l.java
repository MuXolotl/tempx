package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٓۡٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14474l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10822l f28342l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28343l;

    public /* synthetic */ C14474l(C10822l c10822l, int i) {
        this.f28343l = i;
        this.f28342l = c10822l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f28343l;
        C10822l c10822l = this.f28342l;
        switch (i) {
            case 0:
                AbstractC4946l abstractC4946l = (AbstractC4946l) obj;
                if (abstractC4946l.crashlytics()) {
                    return "*";
                }
                String strM2996interface = c10822l.m2996interface(abstractC4946l.loadAd());
                if (abstractC4946l.yandex() == 1) {
                    return strM2996interface;
                }
                return AbstractC12589l.m3423private(abstractC4946l.yandex()) + ' ' + strM2996interface;
            default:
                return c10822l.m2996interface((AbstractC18041l) obj);
        }
    }
}
