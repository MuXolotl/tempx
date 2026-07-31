package defpackage;

/* JADX INFO: renamed from: lؚْۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7240l implements InterfaceC13952l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f15065l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public float f15066l;

    @Override // defpackage.InterfaceC13952l
    public float admob() {
        return ((C4529l) this.f15065l).yandex();
    }

    @Override // defpackage.InterfaceC13952l
    public C4529l crashlytics() {
        return (C4529l) this.f15065l;
    }

    @Override // defpackage.InterfaceC13952l
    public boolean isEmpty() {
        return false;
    }

    @Override // defpackage.InterfaceC13952l
    public boolean loadAd(float f) {
        if (this.f15066l == f) {
            return true;
        }
        this.f15066l = f;
        return false;
    }

    @Override // defpackage.InterfaceC13952l
    public boolean mopub(float f) {
        return !((C4529l) this.f15065l).crashlytics();
    }

    @Override // defpackage.InterfaceC13952l
    public float subs() {
        return ((C4529l) this.f15065l).loadAd();
    }
}
