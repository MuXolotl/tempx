package defpackage;

import android.graphics.Matrix;

/* JADX INFO: renamed from: lَٕؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15483l implements InterfaceC11699l {
    public final InterfaceC7299l yandex;

    public C15483l(InterfaceC7299l interfaceC7299l) {
        this.yandex = interfaceC7299l;
    }

    @Override // defpackage.InterfaceC11699l
    public final int amazon() {
        return 0;
    }

    @Override // defpackage.InterfaceC11699l
    public final long crashlytics() {
        return this.yandex.crashlytics();
    }

    @Override // defpackage.InterfaceC11699l
    public final int loadAd() {
        int iInmobi = AbstractC5020l.inmobi(this.yandex.loadAd());
        if (iInmobi == 1) {
            return 2;
        }
        if (iInmobi != 2) {
            return iInmobi != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // defpackage.InterfaceC11699l
    public final Matrix purchase() {
        return new Matrix();
    }

    @Override // defpackage.InterfaceC11699l
    public final C12920l yandex() {
        return this.yandex.yandex();
    }
}
