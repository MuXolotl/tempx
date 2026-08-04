package defpackage;

/* JADX INFO: renamed from: lؘۙؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5932l {
    public boolean admob;
    public int amazon;
    public boolean billing;
    public int crashlytics;
    public boolean firebase;
    public boolean isPro;
    public int loadAd;
    public boolean mopub;
    public int purchase;
    public long remoteconfig;
    public int smaato;
    public boolean subs;
    public int vip;
    public int yandex;

    public final int loadAd() {
        return this.mopub ? this.loadAd - this.crashlytics : this.purchase;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State{mTargetPosition=");
        sb.append(this.yandex);
        sb.append(", mData=null, mItemCount=");
        sb.append(this.purchase);
        sb.append(", mIsMeasuring=");
        sb.append(this.subs);
        sb.append(", mPreviousLayoutItemCount=");
        sb.append(this.loadAd);
        sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb.append(this.crashlytics);
        sb.append(", mStructureChanged=");
        sb.append(this.billing);
        sb.append(", mInPreLayout=");
        sb.append(this.mopub);
        sb.append(", mRunSimpleAnimations=");
        sb.append(this.isPro);
        sb.append(", mRunPredictiveAnimations=");
        return AbstractC0653l.tapsense(sb, this.firebase, '}');
    }

    public final void yandex(int i) {
        if ((this.amazon & i) != 0) {
            return;
        }
        C11983l.metrica("Layout state should be one of ", Integer.toBinaryString(i), " but it is ", Integer.toBinaryString(this.amazon));
    }
}
