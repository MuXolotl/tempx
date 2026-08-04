package defpackage;

/* JADX INFO: renamed from: lؚٗ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16971l extends AbstractC2604l {
    public final void billing(Object... objArr) {
        int length = objArr.length;
        AbstractC13743l.yandex(length, objArr);
        purchase(length);
        System.arraycopy(objArr, 0, this.yandex, this.loadAd, length);
        this.loadAd += length;
    }

    public final C13708l mopub() {
        this.crashlytics = true;
        return AbstractC1186l.vip(this.loadAd, this.yandex);
    }

    @Override // defpackage.AbstractC3594l
    public final AbstractC3594l yandex(Object obj) {
        crashlytics(obj);
        return this;
    }
}
