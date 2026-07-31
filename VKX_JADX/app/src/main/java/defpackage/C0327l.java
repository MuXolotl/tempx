package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٌؑٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0327l {
    public final float amazon;
    public final ArrayList billing;
    public final long crashlytics;
    public final C6222l loadAd;
    public final float purchase;
    public final C17555l yandex;

    public C0327l(C17555l c17555l, C6222l c6222l, long j) {
        this.yandex = c17555l;
        this.loadAd = c6222l;
        this.crashlytics = j;
        ArrayList arrayList = c6222l.admob;
        float fAmazon = 0.0f;
        this.amazon = arrayList.isEmpty() ? 0.0f : ((C18118l) ((C5048l) arrayList.get(0)).yandex.f15549l).amazon(0);
        if (!arrayList.isEmpty()) {
            C5048l c5048l = (C5048l) AbstractC16901l.m4214continue(arrayList);
            C18118l c18118l = (C18118l) c5048l.yandex.f15549l;
            fAmazon = c18118l.amazon(c18118l.mopub - 1) + c5048l.billing;
        }
        this.purchase = fAmazon;
        this.billing = c6222l.mopub;
    }

    public static int billing(C0327l c0327l, int i) {
        return c0327l.loadAd.crashlytics(i, false);
    }

    public final float admob(int i) {
        C6222l c6222l = this.loadAd;
        c6222l.remoteconfig(i);
        ArrayList arrayList = c6222l.admob;
        C5048l c5048l = (C5048l) arrayList.get(AbstractC18323l.subs(i, arrayList));
        C7546l c7546l = c5048l.yandex;
        int i2 = i - c5048l.amazon;
        C18118l c18118l = (C18118l) c7546l.f15549l;
        return c18118l.billing.getLineRight(i2) + (i2 == c18118l.mopub + (-1) ? c18118l.firebase : 0.0f);
    }

    public final boolean amazon() {
        long j = this.crashlytics;
        float f = (int) (j >> 32);
        C6222l c6222l = this.loadAd;
        return f < c6222l.amazon || c6222l.crashlytics || ((float) ((int) (j & 4294967295L))) < c6222l.purchase;
    }

    public final C8896l crashlytics(int i) {
        C6222l c6222l = this.loadAd;
        c6222l.smaato(i);
        int length = ((C3625l) c6222l.yandex.f23358l).f7563l.length();
        ArrayList arrayList = c6222l.admob;
        C5048l c5048l = (C5048l) arrayList.get(i == length ? AbstractC14055l.smaato(arrayList) : AbstractC18323l.admob(i, arrayList));
        C7546l c7546l = c5048l.yandex;
        int iAmazon = c5048l.amazon(i);
        CharSequence charSequence = (CharSequence) c7546l.f15548l;
        C18118l c18118l = (C18118l) c7546l.f15549l;
        if (iAmazon < 0 || iAmazon > charSequence.length()) {
            AbstractC1786l.yandex("offset(" + iAmazon + ") is out of bounds [0," + charSequence.length() + "]");
        }
        float fIsPro = c18118l.isPro(iAmazon, false);
        int iMopub = c18118l.mopub(iAmazon);
        return c5048l.yandex(new C8896l(fIsPro, c18118l.subs(iMopub), fIsPro, c18118l.purchase(iMopub)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0327l) {
            C0327l c0327l = (C0327l) obj;
            if (this.yandex.equals(c0327l.yandex) && this.loadAd == c0327l.loadAd && C4999l.loadAd(this.crashlytics, c0327l.crashlytics) && this.amazon == c0327l.amazon && this.purchase == c0327l.purchase && AbstractC8576l.yandex(this.billing, c0327l.billing)) {
                return true;
            }
        }
        return false;
    }

    public final C9902l firebase(int i, int i2) {
        C6222l c6222l = this.loadAd;
        C11644l c11644l = c6222l.yandex;
        if (i < 0 || i > i2 || i2 > ((C3625l) c11644l.f23358l).f7563l.length()) {
            int length = ((C3625l) c11644l.f23358l).f7563l.length();
            StringBuilder sbSubscription = AbstractC14814l.subscription(i, i2, "Start(", ") or End(", ") is out of range [0..");
            sbSubscription.append(length);
            sbSubscription.append("), or start > end!");
            AbstractC1786l.yandex(sbSubscription.toString());
        }
        if (i == i2) {
            return AbstractC3478l.yandex();
        }
        C9902l c9902lYandex = AbstractC3478l.yandex();
        AbstractC18323l.firebase(c6222l.admob, AbstractC2296l.loadAd(i, i2), new C13678l(c9902lYandex, i, i2, 3));
        return c9902lYandex;
    }

    public final int hashCode() {
        int iHashCode = (this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31;
        long j = this.crashlytics;
        return this.billing.hashCode() + AbstractC9029l.mopub(AbstractC9029l.mopub((((int) (j ^ (j >>> 32))) + iHashCode) * 31, this.amazon, 31), this.purchase, 31);
    }

    public final int isPro(int i) {
        C6222l c6222l = this.loadAd;
        c6222l.smaato(i);
        int length = ((C3625l) c6222l.yandex.f23358l).f7563l.length();
        ArrayList arrayList = c6222l.admob;
        C5048l c5048l = (C5048l) arrayList.get(i == length ? AbstractC14055l.smaato(arrayList) : AbstractC18323l.admob(i, arrayList));
        C7546l c7546l = c5048l.yandex;
        int iAmazon = c5048l.amazon(i);
        C18118l c18118l = (C18118l) c7546l.f15549l;
        return c18118l.billing.getParagraphDirection(c18118l.mopub(iAmazon)) == 1 ? 1 : 2;
    }

    public final C8896l loadAd(int i) {
        float fFirebase;
        float fFirebase2;
        float fIsPro;
        float fIsPro2;
        C6222l c6222l = this.loadAd;
        c6222l.firebase(i);
        ArrayList arrayList = c6222l.admob;
        C5048l c5048l = (C5048l) arrayList.get(AbstractC18323l.admob(i, arrayList));
        C7546l c7546l = c5048l.yandex;
        int iAmazon = c5048l.amazon(i);
        CharSequence charSequence = (CharSequence) c7546l.f15548l;
        if (iAmazon < 0 || iAmazon >= charSequence.length()) {
            AbstractC1786l.yandex("offset(" + iAmazon + ") is out of bounds [0," + charSequence.length() + ")");
        }
        C18118l c18118l = (C18118l) c7546l.f15549l;
        int iMopub = c18118l.mopub(iAmazon);
        float fSubs = c18118l.subs(iMopub);
        float fPurchase = c18118l.purchase(iMopub);
        Layout layout = c18118l.billing;
        boolean z = layout.getParagraphDirection(iMopub) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iAmazon);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fIsPro = c18118l.firebase(iAmazon, false);
                fIsPro2 = c18118l.firebase(iAmazon + 1, true);
            } else if (zIsRtlCharAt) {
                fIsPro = c18118l.isPro(iAmazon, false);
                fIsPro2 = c18118l.isPro(iAmazon + 1, true);
            } else {
                fFirebase = c18118l.firebase(iAmazon, false);
                fFirebase2 = c18118l.firebase(iAmazon + 1, true);
            }
            float f = fIsPro;
            fFirebase = fIsPro2;
            fFirebase2 = f;
        } else {
            fFirebase = c18118l.isPro(iAmazon, false);
            fFirebase2 = c18118l.isPro(iAmazon + 1, true);
        }
        RectF rectF = new RectF(fFirebase, fSubs, fFirebase2, fPurchase);
        return c5048l.yandex(new C8896l(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final float mopub(int i) {
        C6222l c6222l = this.loadAd;
        c6222l.remoteconfig(i);
        ArrayList arrayList = c6222l.admob;
        C5048l c5048l = (C5048l) arrayList.get(AbstractC18323l.subs(i, arrayList));
        C7546l c7546l = c5048l.yandex;
        int i2 = i - c5048l.amazon;
        C18118l c18118l = (C18118l) c7546l.f15549l;
        return c18118l.billing.getLineLeft(i2) + (i2 == c18118l.mopub + (-1) ? c18118l.isPro : 0.0f);
    }

    public final float purchase(int i, boolean z) {
        C6222l c6222l = this.loadAd;
        c6222l.smaato(i);
        int length = ((C3625l) c6222l.yandex.f23358l).f7563l.length();
        ArrayList arrayList = c6222l.admob;
        C5048l c5048l = (C5048l) arrayList.get(i == length ? AbstractC14055l.smaato(arrayList) : AbstractC18323l.admob(i, arrayList));
        C7546l c7546l = c5048l.yandex;
        int iAmazon = c5048l.amazon(i);
        C18118l c18118l = (C18118l) c7546l.f15549l;
        return z ? c18118l.isPro(iAmazon, false) : c18118l.firebase(iAmazon, false);
    }

    public final long smaato(int i) {
        int iM3121static;
        int iM3115native;
        int iM3115native2;
        C6222l c6222l = this.loadAd;
        c6222l.smaato(i);
        int length = ((C3625l) c6222l.yandex.f23358l).f7563l.length();
        ArrayList arrayList = c6222l.admob;
        C5048l c5048l = (C5048l) arrayList.get(i == length ? AbstractC14055l.smaato(arrayList) : AbstractC18323l.admob(i, arrayList));
        C7546l c7546l = c5048l.yandex;
        int iAmazon = c5048l.amazon(i);
        C11522l c11522lSmaato = ((C18118l) c7546l.f15549l).smaato();
        if (c11522lSmaato.m3124synchronized(c11522lSmaato.m3121static(iAmazon))) {
            c11522lSmaato.subs(iAmazon);
            iM3121static = iAmazon;
            while (iM3121static != -1 && (!c11522lSmaato.m3124synchronized(iM3121static) || c11522lSmaato.appmetrica(iM3121static))) {
                iM3121static = c11522lSmaato.m3121static(iM3121static);
            }
        } else {
            c11522lSmaato.subs(iAmazon);
            if (c11522lSmaato.m3117package(iAmazon)) {
                iM3121static = (!c11522lSmaato.inmobi(iAmazon) || c11522lSmaato.applovin(iAmazon)) ? c11522lSmaato.m3121static(iAmazon) : iAmazon;
            } else {
                iM3121static = c11522lSmaato.applovin(iAmazon) ? c11522lSmaato.m3121static(iAmazon) : -1;
            }
        }
        if (iM3121static == -1) {
            iM3121static = iAmazon;
        }
        if (c11522lSmaato.appmetrica(c11522lSmaato.m3115native(iAmazon))) {
            c11522lSmaato.subs(iAmazon);
            iM3115native = iAmazon;
            while (iM3115native != -1 && (c11522lSmaato.m3124synchronized(iM3115native) || !c11522lSmaato.appmetrica(iM3115native))) {
                iM3115native = c11522lSmaato.m3115native(iM3115native);
            }
        } else {
            c11522lSmaato.subs(iAmazon);
            if (c11522lSmaato.applovin(iAmazon)) {
                if (!c11522lSmaato.inmobi(iAmazon) || c11522lSmaato.m3117package(iAmazon)) {
                    iM3115native2 = c11522lSmaato.m3115native(iAmazon);
                    iM3115native = iM3115native2;
                } else {
                    iM3115native = iAmazon;
                }
            } else if (c11522lSmaato.m3117package(iAmazon)) {
                iM3115native2 = c11522lSmaato.m3115native(iAmazon);
                iM3115native = iM3115native2;
            } else {
                iM3115native = -1;
            }
        }
        if (iM3115native != -1) {
            iAmazon = iM3115native;
        }
        return c5048l.loadAd(AbstractC2296l.loadAd(iM3121static, iAmazon), false);
    }

    public final int subs(int i) {
        C6222l c6222l = this.loadAd;
        c6222l.remoteconfig(i);
        ArrayList arrayList = c6222l.admob;
        C5048l c5048l = (C5048l) arrayList.get(AbstractC18323l.subs(i, arrayList));
        C7546l c7546l = c5048l.yandex;
        return ((C18118l) c7546l.f15549l).billing.getLineStart(i - c5048l.amazon) + c5048l.loadAd;
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.yandex + ", multiParagraph=" + this.loadAd + ", size=" + C4999l.crashlytics(this.crashlytics) + ", firstBaseline=" + this.amazon + ", lastBaseline=" + this.purchase + ", placeholderRects=" + this.billing + ")";
    }

    public final int yandex(int i) {
        C6222l c6222l = this.loadAd;
        c6222l.smaato(i);
        int length = ((C3625l) c6222l.yandex.f23358l).f7563l.length();
        ArrayList arrayList = c6222l.admob;
        C5048l c5048l = (C5048l) arrayList.get(i == length ? AbstractC14055l.smaato(arrayList) : AbstractC18323l.admob(i, arrayList));
        return ((C18118l) c5048l.yandex.f15549l).billing.isRtlCharAt(c5048l.amazon(i)) ? 2 : 1;
    }
}
