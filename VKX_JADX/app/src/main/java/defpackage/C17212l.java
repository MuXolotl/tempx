package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٗٙٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C17212l {
    public static final C1473l loadAd;
    public final C1473l yandex;

    static {
        AbstractC18218l c18209l;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            c18209l = new C1145l();
        } else if (i >= 35) {
            c18209l = new C0157l();
        } else if (i >= 34) {
            c18209l = new C11094l();
        } else if (i >= 31) {
            c18209l = new C13338l();
        } else if (i >= 30) {
            c18209l = new C14430l();
        } else {
            c18209l = i >= 29 ? new C18209l() : new C4132l();
        }
        loadAd = c18209l.loadAd().yandex.yandex().yandex.loadAd().yandex.crashlytics();
    }

    public C17212l(C1473l c1473l) {
        this.yandex = c1473l;
    }

    public boolean Signature(int i) {
        return true;
    }

    public C17518l admob() {
        return null;
    }

    public C1473l ads(int i, int i2, int i3, int i4) {
        return loadAd;
    }

    public List<Rect> billing(int i) {
        return Collections.EMPTY_LIST;
    }

    public C1473l crashlytics() {
        return this.yandex;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17212l)) {
            return false;
        }
        C17212l c17212l = (C17212l) obj;
        return tapsense() == c17212l.tapsense() && subscription() == c17212l.subscription() && Objects.equals(vip(), c17212l.vip()) && Objects.equals(smaato(), c17212l.smaato()) && Objects.equals(admob(), c17212l.admob());
    }

    public C15496l firebase() {
        return vip();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(tapsense()), Boolean.valueOf(subscription()), vip(), smaato(), admob());
    }

    public C15496l isPro(int i) {
        if ((i & 8) == 0) {
            return C15496l.purchase;
        }
        C8339l.metrica("Unable to query the maximum insets for IME");
        return null;
    }

    public C1473l loadAd() {
        return this.yandex;
    }

    public C15496l metrica() {
        return vip();
    }

    public List<Rect> mopub(int i) {
        return Collections.EMPTY_LIST;
    }

    public C15496l remoteconfig() {
        return vip();
    }

    public C15496l smaato() {
        return C15496l.purchase;
    }

    public C15496l subs(int i) {
        return C15496l.purchase;
    }

    public boolean subscription() {
        return false;
    }

    public boolean tapsense() {
        return false;
    }

    public C15496l vip() {
        return C15496l.purchase;
    }

    public C1473l yandex() {
        return this.yandex;
    }

    public void adcel() {
    }

    public void ad(C15496l c15496l) {
    }

    public void advert(C1473l c1473l) {
    }

    public void amazon(View view) {
    }

    public void applovin(Rect[][] rectArr) {
    }

    public void isVip(C15496l c15496l) {
    }

    public void license(C18078l c18078l) {
    }

    public void premium(Rect[][] rectArr) {
    }

    public void pro(C15496l[] c15496lArr) {
    }

    public void purchase(C1473l c1473l) {
    }

    public void signatures(int i) {
    }

    public void startapp(View view) {
    }
}
