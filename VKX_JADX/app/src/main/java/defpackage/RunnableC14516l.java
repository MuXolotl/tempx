package defpackage;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: lٓۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC14516l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f28394l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ IntConsumer f28395l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28396l;

    public /* synthetic */ RunnableC14516l(IntConsumer intConsumer, int i, int i2) {
        this.f28396l = i2;
        this.f28395l = intConsumer;
        this.f28394l = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f28396l;
        int i2 = this.f28394l;
        IntConsumer intConsumer = this.f28395l;
        switch (i) {
            case 0:
                intConsumer.accept(i2);
                break;
            default:
                intConsumer.accept(i2);
                break;
        }
    }
}
