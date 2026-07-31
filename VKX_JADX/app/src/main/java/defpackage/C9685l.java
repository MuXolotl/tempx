package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lٍٛۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C9685l implements InterfaceC14978l {
    public final AtomicBoolean crashlytics = new AtomicBoolean(false);
    public final InterfaceC18477l loadAd;
    public final File yandex;

    public C9685l(File file, InterfaceC18477l interfaceC18477l) {
        this.yandex = file;
        this.loadAd = interfaceC18477l;
    }

    @Override // defpackage.InterfaceC1600l
    public final void close() {
        this.crashlytics.set(true);
    }

    @Override // defpackage.InterfaceC14978l
    public final Object purchase(C14570l c14570l) {
        if (this.crashlytics.get()) {
            C8339l.smaato("This scope has already been closed.");
            return null;
        }
        return AbstractC14775l.crashlytics(this.yandex, new C10928l(this, null), c14570l);
    }
}
