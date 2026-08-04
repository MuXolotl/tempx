package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٖٟٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16548l implements InterfaceC14220l {
    public int amazon;
    public final ArrayList crashlytics = new ArrayList();
    public final Object loadAd = new Object();
    public boolean purchase;
    public final C12855l yandex;

    public C16548l(AbstractC14384l abstractC14384l, boolean z) {
        this.yandex = new C12855l(abstractC14384l, z);
    }

    @Override // defpackage.InterfaceC14220l
    public final AbstractC10759l crashlytics() {
        return this.yandex.metrica;
    }

    @Override // defpackage.InterfaceC14220l
    public final Object loadAd() {
        return this.loadAd;
    }
}
