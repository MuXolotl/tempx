package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lٕؕ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3414l extends AbstractC18643l implements InterfaceC6019l {
    public final boolean crashlytics;
    public final C6393l loadAd;
    public final C2391l yandex;

    public C3414l(C2391l c2391l, C6393l c6393l) {
        this.yandex = c2391l;
        this.loadAd = c6393l;
        this.crashlytics = c6393l.yandex.crashlytics.length() == 0;
    }

    @Override // defpackage.AbstractC18643l
    public final C10019l adcel() {
        return new C10019l("vk_audiobook", getYandex(), this.loadAd.yandex.crashlytics);
    }

    @Override // defpackage.AbstractC18643l
    /* JADX INFO: renamed from: ads */
    public final String getLoadAd() {
        return this.loadAd.billing;
    }

    @Override // defpackage.AbstractC18643l
    public final String firebase() {
        String str = this.yandex.tapsense;
        return str == null ? "" : str;
    }

    @Override // defpackage.AbstractC18643l
    /* JADX INFO: renamed from: metrica */
    public final String getYandex() {
        return this.yandex.firebase + '_' + this.loadAd.loadAd;
    }

    @Override // defpackage.AbstractC18643l
    /* JADX INFO: renamed from: remoteconfig */
    public final String getAmazon() {
        Object next;
        Iterator it = this.yandex.mopub.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i = ((C0034l) next).yandex;
                do {
                    Object next2 = it.next();
                    int i2 = ((C0034l) next2).yandex;
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        C0034l c0034l = (C0034l) next;
        String str = c0034l != null ? c0034l.loadAd : null;
        return str == null ? "" : str;
    }

    @Override // defpackage.AbstractC18643l
    /* JADX INFO: renamed from: smaato */
    public final String getYandex() {
        C1358l c1358l = (C1358l) AbstractC16901l.m4217extends(this.yandex.crashlytics);
        String str = c1358l != null ? c1358l.amazon : null;
        return str == null ? "" : str;
    }

    @Override // defpackage.AbstractC18643l
    public final String subscription() {
        return "vk_audiobook";
    }

    @Override // defpackage.AbstractC18643l
    public final String tapsense() {
        return "application/x-mpegURL";
    }

    @Override // defpackage.AbstractC18643l
    public final int vip() {
        return this.loadAd.yandex.yandex;
    }

    @Override // defpackage.InterfaceC6019l
    public final boolean yandex() {
        return this.crashlytics;
    }
}
