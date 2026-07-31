package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lۡٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C18635l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final AbstractC2842l f36419l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C16924l f36420l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f36421l;

    public /* synthetic */ C18635l(C16924l c16924l, AbstractC2842l abstractC2842l, int i) {
        this.f36421l = i;
        this.f36420l = c16924l;
        this.f36419l = abstractC2842l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f36421l;
        AbstractC2842l abstractC2842l = this.f36419l;
        C16924l c16924l = this.f36420l;
        switch (i) {
            case 0:
                return AbstractC9905l.mopub(c16924l.yandex.keySet(), abstractC2842l.metrica());
            default:
                return AbstractC9905l.mopub(c16924l.loadAd.keySet(), abstractC2842l.startapp());
        }
    }
}
