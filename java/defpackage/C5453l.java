package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: renamed from: lؘؖٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5453l {
    public boolean amazon;
    public Object billing;
    public int crashlytics;
    public int loadAd;
    public boolean purchase;
    public final /* synthetic */ int yandex = 1;

    public C5453l(int i) {
        this.loadAd = i;
        byte[] bArr = new byte[131];
        this.billing = bArr;
        bArr[2] = 1;
    }

    public boolean amazon(int i) {
        if (!this.amazon) {
            return false;
        }
        this.crashlytics -= i;
        this.amazon = false;
        this.purchase = true;
        return true;
    }

    public void billing() {
        switch (this.yandex) {
            case 1:
                this.loadAd = -1;
                this.crashlytics = RecyclerView.UNDEFINED_DURATION;
                this.amazon = false;
                this.purchase = false;
                break;
            default:
                this.amazon = false;
                this.purchase = false;
                break;
        }
    }

    public void crashlytics(View view, int i) {
        AbstractC0962l abstractC0962l = (AbstractC0962l) this.billing;
        int iSmaato = Integer.MIN_VALUE == abstractC0962l.yandex ? 0 : abstractC0962l.smaato() - abstractC0962l.yandex;
        if (iSmaato >= 0) {
            boolean z = this.amazon;
            AbstractC0962l abstractC0962l2 = (AbstractC0962l) this.billing;
            if (z) {
                int iLoadAd = abstractC0962l2.loadAd(view);
                AbstractC0962l abstractC0962l3 = (AbstractC0962l) this.billing;
                this.crashlytics = (Integer.MIN_VALUE != abstractC0962l3.yandex ? abstractC0962l3.smaato() - abstractC0962l3.yandex : 0) + iLoadAd;
            } else {
                this.crashlytics = abstractC0962l2.purchase(view);
            }
            this.loadAd = i;
            return;
        }
        this.loadAd = i;
        boolean z2 = this.amazon;
        AbstractC0962l abstractC0962l4 = (AbstractC0962l) this.billing;
        if (!z2) {
            int iPurchase = abstractC0962l4.purchase(view);
            int iFirebase = iPurchase - ((AbstractC0962l) this.billing).firebase();
            this.crashlytics = iPurchase;
            if (iFirebase > 0) {
                int iMopub = (((AbstractC0962l) this.billing).mopub() - Math.min(0, (((AbstractC0962l) this.billing).mopub() - iSmaato) - ((AbstractC0962l) this.billing).loadAd(view))) - (((AbstractC0962l) this.billing).crashlytics(view) + iPurchase);
                if (iMopub < 0) {
                    this.crashlytics -= Math.min(iFirebase, -iMopub);
                    return;
                }
                return;
            }
            return;
        }
        int iMopub2 = (abstractC0962l4.mopub() - iSmaato) - ((AbstractC0962l) this.billing).loadAd(view);
        this.crashlytics = ((AbstractC0962l) this.billing).mopub() - iMopub2;
        if (iMopub2 > 0) {
            int iCrashlytics = this.crashlytics - ((AbstractC0962l) this.billing).crashlytics(view);
            int iFirebase2 = ((AbstractC0962l) this.billing).firebase();
            int iMin = iCrashlytics - (Math.min(((AbstractC0962l) this.billing).purchase(view) - iFirebase2, 0) + iFirebase2);
            if (iMin < 0) {
                this.crashlytics = Math.min(iMopub2, -iMin) + this.crashlytics;
            }
        }
    }

    public void loadAd() {
        boolean z = this.amazon;
        AbstractC0962l abstractC0962l = (AbstractC0962l) this.billing;
        this.crashlytics = z ? abstractC0962l.mopub() : abstractC0962l.firebase();
    }

    public void mopub(int i) {
        AbstractC12442l.subscription(!this.amazon);
        boolean z = i == this.loadAd;
        this.amazon = z;
        if (z) {
            this.crashlytics = 3;
            this.purchase = false;
        }
    }

    public void purchase(int i) {
        this.amazon |= i > 0;
        this.loadAd += i;
    }

    public String toString() {
        switch (this.yandex) {
            case 1:
                StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
                sb.append(this.loadAd);
                sb.append(", mCoordinate=");
                sb.append(this.crashlytics);
                sb.append(", mLayoutFromEnd=");
                sb.append(this.amazon);
                sb.append(", mValid=");
                return AbstractC0653l.tapsense(sb, this.purchase, '}');
            default:
                return super.toString();
        }
    }

    public void yandex(int i, int i2, byte[] bArr) {
        if (this.amazon) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.billing;
            int length = bArr2.length;
            int i4 = this.crashlytics + i3;
            if (length < i4) {
                this.billing = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.billing, this.crashlytics, i3);
            this.crashlytics += i3;
        }
    }

    public C5453l(C10749l c10749l) {
        this.billing = c10749l;
    }

    public C5453l() {
        billing();
    }
}
