package defpackage;

import java.util.Enumeration;

/* JADX INFO: renamed from: continue, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class Ccontinue implements Enumeration {
    public final /* synthetic */ Cclass loadAd;
    public int yandex = 0;

    public Ccontinue(Cclass cclass) {
        this.loadAd = cclass;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.yandex < this.loadAd.f504l.length;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        int i = this.yandex;
        applovin[] applovinVarArr = this.loadAd.f504l;
        if (i < applovinVarArr.length) {
            this.yandex = i + 1;
            return applovinVarArr[i];
        }
        C4875l.firebase();
        return null;
    }
}
