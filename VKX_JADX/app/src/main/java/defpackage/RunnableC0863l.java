package defpackage;

/* JADX INFO: renamed from: lؘؒؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0863l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractActivityC14666l f2516l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2517l;

    public /* synthetic */ RunnableC0863l(AbstractActivityC14666l abstractActivityC14666l, int i) {
        this.f2517l = i;
        this.f2516l = abstractActivityC14666l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2517l;
        AbstractActivityC14666l abstractActivityC14666l = this.f2516l;
        switch (i) {
            case 0:
                abstractActivityC14666l.invalidateOptionsMenu();
                break;
            default:
                AbstractActivityC14666l.mopub(abstractActivityC14666l);
                break;
        }
    }
}
