package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lۣؑ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0671l extends AbstractC3940l implements InterfaceC8544l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f2142l;

    public C0671l(C14605l c14605l, C1976l c1976l, Executor executor, C17781l c17781l) {
        super(c1976l, executor);
        boolean zCrashlytics = AbstractC14693l.crashlytics();
        this.f2142l = zCrashlytics;
        C3557l c3557l = new C3557l();
        c3557l.f7479l = AbstractC14693l.yandex(c14605l);
        C3246l c3246l = new C3246l(c3557l);
        C1424l c1424l = new C1424l();
        c1424l.f3601l = zCrashlytics ? EnumC14285l.TYPE_THICK : EnumC14285l.TYPE_THIN;
        c1424l.f3605l = c3246l;
        EnumC1150l.f3126l.execute(new RunnableC16843l(16, c17781l, new C2888l(c1424l, 1), EnumC7663l.ON_DEVICE_BARCODE_CREATE, c17781l.crashlytics(), false));
    }

    @Override // defpackage.AbstractC3940l, java.io.Closeable, java.lang.AutoCloseable, defpackage.InterfaceC8544l
    public final synchronized void close() {
        super.close();
    }

    @Override // defpackage.InterfaceC10959l
    public final C9138l[] yandex() {
        return this.f2142l ? AbstractC11698l.yandex : new C9138l[]{AbstractC11698l.loadAd};
    }
}
