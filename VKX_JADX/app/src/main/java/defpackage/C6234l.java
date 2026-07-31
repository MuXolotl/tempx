package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.isPro;

/* JADX INFO: renamed from: lؙؔ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6234l extends AbstractC0962l {
    public final /* synthetic */ int amazon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6234l(isPro ispro, int i) {
        super(ispro);
        this.amazon = i;
    }

    @Override // defpackage.AbstractC0962l
    public final int admob() {
        switch (this.amazon) {
            case 0:
                return ((isPro) this.loadAd).m145strictfp();
            default:
                return ((isPro) this.loadAd).m143package();
        }
    }

    @Override // defpackage.AbstractC0962l
    public final int amazon(View view) {
        int iPremium;
        int i;
        int i2 = this.amazon;
        Object obj = this.loadAd;
        switch (i2) {
            case 0:
                C13036l c13036l = (C13036l) view.getLayoutParams();
                ((isPro) obj).getClass();
                iPremium = isPro.premium(view) + ((ViewGroup.MarginLayoutParams) c13036l).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c13036l).bottomMargin;
                break;
            default:
                C13036l c13036l2 = (C13036l) view.getLayoutParams();
                ((isPro) obj).getClass();
                iPremium = isPro.applovin(view) + ((ViewGroup.MarginLayoutParams) c13036l2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c13036l2).rightMargin;
                break;
        }
        return iPremium + i;
    }

    @Override // defpackage.AbstractC0962l
    public final int billing() {
        switch (this.amazon) {
            case 0:
                return ((isPro) this.loadAd).vip;
            default:
                return ((isPro) this.loadAd).metrica;
        }
    }

    @Override // defpackage.AbstractC0962l
    public final int crashlytics(View view) {
        int iApplovin;
        int i;
        int i2 = this.amazon;
        Object obj = this.loadAd;
        switch (i2) {
            case 0:
                C13036l c13036l = (C13036l) view.getLayoutParams();
                ((isPro) obj).getClass();
                iApplovin = isPro.applovin(view) + ((ViewGroup.MarginLayoutParams) c13036l).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c13036l).rightMargin;
                break;
            default:
                C13036l c13036l2 = (C13036l) view.getLayoutParams();
                ((isPro) obj).getClass();
                iApplovin = isPro.premium(view) + ((ViewGroup.MarginLayoutParams) c13036l2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c13036l2).bottomMargin;
                break;
        }
        return iApplovin + i;
    }

    @Override // defpackage.AbstractC0962l
    public final int firebase() {
        switch (this.amazon) {
            case 0:
                return ((isPro) this.loadAd).m146synchronized();
            default:
                return ((isPro) this.loadAd).m148volatile();
        }
    }

    @Override // defpackage.AbstractC0962l
    public final int isPro() {
        switch (this.amazon) {
            case 0:
                return ((isPro) this.loadAd).remoteconfig;
            default:
                return ((isPro) this.loadAd).smaato;
        }
    }

    @Override // defpackage.AbstractC0962l
    public final int loadAd(View view) {
        int iAppmetrica;
        int i;
        int i2 = this.amazon;
        Object obj = this.loadAd;
        switch (i2) {
            case 0:
                C13036l c13036l = (C13036l) view.getLayoutParams();
                ((isPro) obj).getClass();
                iAppmetrica = isPro.appmetrica(view);
                i = ((ViewGroup.MarginLayoutParams) c13036l).rightMargin;
                break;
            default:
                C13036l c13036l2 = (C13036l) view.getLayoutParams();
                ((isPro) obj).getClass();
                iAppmetrica = isPro.advert(view);
                i = ((ViewGroup.MarginLayoutParams) c13036l2).bottomMargin;
                break;
        }
        return iAppmetrica + i;
    }

    @Override // defpackage.AbstractC0962l
    public final void metrica(int i) {
        switch (this.amazon) {
            case 0:
                ((isPro) this.loadAd).mo123switch(i);
                break;
            default:
                ((isPro) this.loadAd).mo95continue(i);
                break;
        }
    }

    @Override // defpackage.AbstractC0962l
    public final int mopub() {
        int i;
        int iM145strictfp;
        int i2 = this.amazon;
        Object obj = this.loadAd;
        switch (i2) {
            case 0:
                isPro ispro = (isPro) obj;
                i = ispro.vip;
                iM145strictfp = ispro.m145strictfp();
                break;
            default:
                isPro ispro2 = (isPro) obj;
                i = ispro2.metrica;
                iM145strictfp = ispro2.m143package();
                break;
        }
        return i - iM145strictfp;
    }

    @Override // defpackage.AbstractC0962l
    public final int purchase(View view) {
        int iSignatures;
        int i;
        int i2 = this.amazon;
        Object obj = this.loadAd;
        switch (i2) {
            case 0:
                C13036l c13036l = (C13036l) view.getLayoutParams();
                ((isPro) obj).getClass();
                iSignatures = isPro.signatures(view);
                i = ((ViewGroup.MarginLayoutParams) c13036l).leftMargin;
                break;
            default:
                C13036l c13036l2 = (C13036l) view.getLayoutParams();
                ((isPro) obj).getClass();
                iSignatures = isPro.inmobi(view);
                i = ((ViewGroup.MarginLayoutParams) c13036l2).topMargin;
                break;
        }
        return iSignatures - i;
    }

    @Override // defpackage.AbstractC0962l
    public final int remoteconfig(View view) {
        int i = this.amazon;
        Object obj = this.crashlytics;
        Object obj2 = this.loadAd;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((isPro) obj2).m129for(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((isPro) obj2).m129for(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // defpackage.AbstractC0962l
    public final int smaato() {
        int iM146synchronized;
        int iM145strictfp;
        int i = this.amazon;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                isPro ispro = (isPro) obj;
                iM146synchronized = ispro.vip - ispro.m146synchronized();
                iM145strictfp = ispro.m145strictfp();
                break;
            default:
                isPro ispro2 = (isPro) obj;
                iM146synchronized = ispro2.metrica - ispro2.m148volatile();
                iM145strictfp = ispro2.m143package();
                break;
        }
        return iM146synchronized - iM145strictfp;
    }

    @Override // defpackage.AbstractC0962l
    public final int subs() {
        switch (this.amazon) {
            case 0:
                return ((isPro) this.loadAd).smaato;
            default:
                return ((isPro) this.loadAd).remoteconfig;
        }
    }

    @Override // defpackage.AbstractC0962l
    public final int vip(View view) {
        int i = this.amazon;
        Object obj = this.crashlytics;
        Object obj2 = this.loadAd;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((isPro) obj2).m129for(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((isPro) obj2).m129for(view, rect2);
                return rect2.top;
        }
    }
}
