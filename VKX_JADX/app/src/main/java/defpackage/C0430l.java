package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؑٛٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0430l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final AbstractC0601l f1562l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C8975l f1563l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1564l = 0;

    public C0430l(AbstractC0601l abstractC0601l, C8975l c8975l) {
        this.f1562l = abstractC0601l;
        this.f1563l = c8975l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f1564l;
        AbstractC0601l abstractC0601l = this.f1562l;
        C8975l c8975l = this.f1563l;
        switch (i) {
            case 0:
                C5160l c5160l = abstractC0601l instanceof C5160l ? (C5160l) abstractC0601l : null;
                C12843l c12843lCrashlytics = c5160l != null ? ((C16024l) c5160l.f11211l.getValue()).crashlytics() : null;
                C12843l c12843l = C12843l.amazon;
                return AbstractC17828l.crashlytics(c8975l.f18513l.crashlytics, c12843lCrashlytics, c8975l, abstractC0601l.mo1730private().getClassLoader());
            default:
                C4258l c4258l = c8975l.f18513l.admob;
                return AbstractC10392l.metrica(c4258l != null ? c4258l : null, abstractC0601l.mo1730private().getClassLoader(), c8975l.mo2441else(), new C8467l(1, c8975l));
        }
    }

    public C0430l(C8975l c8975l, AbstractC0601l abstractC0601l) {
        this.f1563l = c8975l;
        this.f1562l = abstractC0601l;
    }
}
