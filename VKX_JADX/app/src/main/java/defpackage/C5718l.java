package defpackage;

/* JADX INFO: renamed from: lؘُٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5718l extends AbstractC8284l {
    @Override // defpackage.AbstractC2484l
    /* JADX INFO: renamed from: final */
    public final void mo852final() {
        AbstractC14412l abstractC14412l = this.f5279l;
        if (abstractC14412l == null) {
            abstractC14412l = null;
        }
        String strCrashlytics = this.f17178l.crashlytics();
        C5447l c5447l = ((C3497l) abstractC14412l).admob;
        if (c5447l != null) {
            c5447l.setSubtitle(strCrashlytics);
        }
    }
}
